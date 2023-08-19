
![TALKEI](https://github.com/arthur65535/Talkei/assets/29666978/6f2779fa-9e2a-492e-9310-15f1fe127f99)

# Talkei
Aplicativo de arquitetura distribuída para troca de mensagens instantâneas. Trabalho final da disciplina de Software Concorrente e Distribuído.

# Como executar
Instrução considerando o uso do Intellij IDEA Community, e o java JDK 17 instalado.

1: Clone o repositório na sua máquina.
2: Montando o server:
  - Descompacte o arquivo "apache-activemq-5.15.2-bin" em algum lugar fora do repositório.
  - Na pasta onde ele foi extraído, acesse bin/win64 e execute o "activemq.bat" e mantenha este terminal aberto, pois o server já está rodando nesta instância.
  - Agora abra seu browser e entre em localhost:8161/admin. Login = admin, senha = admin. Mantenha esta aba aberta também.
3: Abrindo o projeto e importando bibliotecas:
  - Abra o Intellij IDEA, vá em File->Open..., ponha o diretório deste repositório na sua máquina e clique OK.
  - O projeto se abrirá. Agora vá em File->Project Structure, e vá na aba Project e verifique se em SDK está setado o Java 17. Se não estiver, coloque.
  - Ainda em Project Structure, vá na aba Libraries, clique em + e selecione Java. Agora navegue até o diretório deste repositório na sua máquina, e entre em bibliotecas aqui/javax.jms-api/62 e selecione o javax.jms-api-62.jar, dê OK.
  - Ainda em Libraries, clique em + de novo, navegue até o diretório deste repositório na sua máquina, e entre em bibliotecas aqui e selecione activemq-all-5.15.2.jar e dê OK.
  - Clique em Apply, depois em OK.
4: Rodando o código:
  - Abra todos os .java das pastas chat, gui e util na IDE, e dê Run no JFrameChat.java. Uma janela de chat se abrirá.
  - Para abrir outra instância Alt+Shift+F10.
  - Posicione as janelas e boa prosa.
