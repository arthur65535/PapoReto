package talkei2;
import javax.jms.*;
import javax.naming.*;
import java.util.Scanner;
import java.lang.*;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Chat implements MessageListener {
	
	private TopicSession pubSession;
	private TopicPublisher publisher;
	private TopicConnection connection;
	private String username;
	
	//Construtor que inicializa o JMS 
	public Chat(String topicFactory, String topicName, String username) throws Exception {
		
		//Obtem dados da conexao JINDI atraves do arquivo jindi.properties
		InitialContext ctx = new InitialContext();
		
		TopicConnectionFactory conFactory = (TopicConnectionFactory) ctx.lookup(topicFactory);
		TopicConnection connection = conFactory.createTopicConnection();
		TopicSession pubSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicSession subSession = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		Topic chatTopic = (Topic) ctx.lookup(topicName);
		TopicPublisher publisher = pubSession.createPublisher(chatTopic);
		TopicSubscriber subscriber = subSession.createSubscriber(chatTopic);
		subscriber.setMessageListener(this);
		
		//Inicializa as variaveis do chat
		this.connection = connection;
		this.pubSession = pubSession;
		this.publisher = publisher;
		this.username = username;
		
		//Inicia a conexao JMS
		connection.start();
	}
	
	//Recebe mensagens do topico assinado
	public void onMessage(Message message) {
		try {
			//mensagens sao criadas e recebidas como TextMessage
			TextMessage textMessage = (TextMessage) message;
			System.out.println(textMessage.getText());
		} catch (JMSException jmse){
			jmse.printStackTrace();
		}
	}
	
	//Cria a msg de texto e publica no topico. Referente ao produtor
	public void writeMessage(String text) throws JMSException {
		TextMessage message = pubSession.createTextMessage();
		message.setText(username + ": " + text);
		publisher.publish(message);
	}
	
	//Fecha a conexao JMS
	public void close() throws JMSException {
		connection.close();
	}

	public static void main(String[] args) {
		try {
			//Habilita o envio de mensagens por linha de comando
			Scanner commandLine = new Scanner(System.in);
			
			System.out.print("Digite seu nome: ");
			String name = commandLine.nextLine();
			
			//Chama o construtor da classe pra iniciar o chat
			Chat chat = new Chat ("TopicCF", "TopicChat", name);
			
			
			//Loop para envio de mensagens
			while (true) {
				//Captura a msg digitada no console
				String s = commandLine.nextLine();
				
				//pra sair digite sair
				if (s.equalsIgnoreCase("sair")) {
					chat.close();
					commandLine.close();
					System.exit(0);
				} else {
					//envia a mensagem no console pro metodo writeMessage que vai publicar ela
					chat.writeMessage(s);
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
