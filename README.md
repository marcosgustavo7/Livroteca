# Livroteca
## Sistema de Gerenciamento de Livros
No mundo existe bibliotecas IMENSAS que suportam em média de 200 MILHÕES de Livros, recebendo cerca de 8 mil livros por dia. Bibliotecas como: Biblioteca Nacional no Brasil ou a Biblioteca Nacional Marciana na Itália são uma dessas bibliotecas no qual não alugam e nem vende nenhum desses livros apenas os armazenam por fator cultural e histórico. A questão é que imagine a dificuldade em catalogar todos esses 8 mil livros diários, principalmente, em papeis físicos!
Seguindo essa demanda com propósito de facilitar o gerenciamento nessas bibliotecas foi feito um software modelo Desktop para realizar essa função.

## Como utilizar o sistema? ##
O sistema é bastante leve e deve funcionar em computadores e sistemas operacionais antigos, contudo, por ser em Java, é essencial instalá-lo [aqui](https://www.oracle.com/br/java/technologies/downloads/) junto do JDK [aqui.](https://www.java.com/pt-BR/download/manual.jsp) Além de um aplicativo como o [Xampp](https://www.apachefriends.org/pt_br/index.html) para fazer o banco de dados local.


## Ferramentas utilizadas ##
Este projeto foi feito a base de JAVA utilizando uma biblioteca de Java Swing no qual permite interfaces gráficas de usuário (GUI) em Java. O código foi feito usando o padrão arquitetura CRUD MVC! Esse padrão se baseia em reutilização de código aonde se divide o código em três (3) camadas: Model, Views e Control.

Além disso, o projeto ainda teve a utilização de Banco de Dados MySQL para gerar a tabela Livros aonde serão armazenados os dados dos livros do projeto. Na tabela Livro foram colocados os atributos: ID, Nome, Categoria, Autor, Editora, Sinopse e Data de Publicação, sendo o primeiro um atributo __chave__ conforme imagem abaixo do Modelo Conceitual.

  ><img src="Imagens_Git/modeloconceitual.png" alt="Modelo Conceitual" width="400" height="400"/>

E o Modelo Lógico abaixo: 
<br>
<br>
  ><img src="Imagens_Git/TrabalhoA3Lógico.png" alt="Modelo Conceitual" width="200" height="300"/>
