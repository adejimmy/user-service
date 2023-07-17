# user-service

Spring Boot User app
This is a basic application using Spring framework. It has only forms for list of users


Instructions
You will need to have JAVA, Spring Boot on your computer.


Open a terminal, navigate into the project directory(cd my_project/), and run the following commands:

1) Mvn Install:

2) Edit your run configuration using maven configuration (clean compile spring-boot:run)

3) Start a local server (access the browser with the address you entered, for example: 127.0.0.1:5000/users):


Tested On Windows
Java 8
Intellij IDEA 2022.1 Ultimate Edition
AWS

The application flow os as follows

1) A gitub repository is created to post the application
2) We need to build the code using AWS codebuild but the code build does not know what to do as per steps to take
so a build.yml file(which explains steps and things to install) is created to help the codebuild to understand the steps and what to install
3) The code build will build and deploy to the elastic bean stalk, this process is called codepipeline which works like Jenkins