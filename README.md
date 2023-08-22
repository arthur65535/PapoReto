
![TALKEI](https://github.com/arthur65535/Talkei/assets/29666978/6f2779fa-9e2a-492e-9310-15f1fe127f99)

# Talkei
Aplicativo de arquitetura distribuída para troca de mensagens instantâneas. Trabalho final em grupo da disciplina de Software Concorrente e Distribuído.

#

<p><i>Arthur de Camargo Alves</i></p>
<p><i>Arthur Faria Peixoto</i></p>
<p><i>Felipe Galvão Lagares</i></p>
<p><i>João Victor Rosa Couto e Silva</i></p>
<p><i>Mikhael Machado Fernandes Maia</i></p>

# Como executar
<b> Instrução considerando o VScode e o Java JDK 17 instalado:</b>

<p>1: Clone o repositório na sua máquina.</p>
<p>2: Montando o server:</p>

  - Descompacte o arquivo "apache-activemq-5.15.2-bin" em algum lugar fora do repositório.
  - Na pasta onde ele foi extraído, acesse bin/win64 e execute o "activemq.bat" e mantenha este terminal aberto, pois o server já está rodando nesta instância.
  - Agora abra seu browser e entre em localhost:8161/admin. Login = admin, senha = admin. Mantenha esta aba aberta também.

<p>3: Abrindo o projeto e importando bibliotecas:</p>

  - Abra o VScode, clique em File->Open Folder e selecione a pasta do projeto clonado.
  - Agora, na aba Extensions, pesquise e instale o Extesion Pack for Java - de autoria da Microsoft.
  - Após isso, volte na aba Explorer, clique em Java Projects, o projeto estará aberto lá.
  - Expanda o projeto Talkei, passe o mouse em Referenced Libraries, clique em + e navegue até o diretório deste repositório na sua máquina, e entre em bibliotecas aqui/javax.jms-api/62 e selecione o javax.jms-api-62.jar, dê OK.
  - Ainda em Referenced Libraries, cliquem em + de novo, navegue até o diretório deste repositório na sua máquina, e entre em bibliotecas aqui e selecione activemq-all-5.15.2.jar e dê OK.

<p>4: Rodando o código:</p>

  - Abra o JFrameChat.java da pasta src->gui na IDE, e dê Run no JFrameChat.java. Uma janela de chat se abrirá.
  - Dê Run outras 3 vezes e posicione todas as 4 janelas na tela para simular uma conversa em grupo.
  - Divirta-se.

<b> Instrução considerando o uso do Intellij IDEA Community, e o java JDK 17 instalado: </b>

<p>1: Clone o repositório na sua máquina.</p>
<p>2: Montando o server:</p>

  - Descompacte o arquivo "apache-activemq-5.15.2-bin" em algum lugar fora do repositório.
  - Na pasta onde ele foi extraído, acesse bin/win64 e execute o "activemq.bat" e mantenha este terminal aberto, pois o server já está rodando nesta instância.
  - Agora abra seu browser e entre em localhost:8161/admin. Login = admin, senha = admin. Mantenha esta aba aberta também.

<p>3: Abrindo o projeto e importando bibliotecas:</p>

  - Abra o Intellij IDEA, vá em File->Open..., ponha o diretório deste repositório na sua máquina e clique OK.
  - O projeto se abrirá. Agora vá em File->Project Structure, e vá na aba Project e verifique se em SDK está setado o Java 17. Se não estiver, coloque.
  - Ainda em Project Structure, vá na aba Libraries, clique em + e selecione Java. Agora navegue até o diretório deste repositório na sua máquina, e entre em bibliotecas aqui/javax.jms-api/62 e selecione o javax.jms-api-62.jar, dê OK.
  - Ainda em Libraries, clique em + de novo, navegue até o diretório deste repositório na sua máquina, e entre em bibliotecas aqui e selecione activemq-all-5.15.2.jar e dê OK.
  - Clique em Apply, depois em OK.

<p>4: Rodando o código:</p>

  - Abra todos os .java das pastas chat, gui e util na IDE, e dê Run no JFrameChat.java. Uma janela de chat se abrirá.
  - Para abrir outra instância Alt+Shift+F10.
  - Posicione as janelas e boa prosa.
