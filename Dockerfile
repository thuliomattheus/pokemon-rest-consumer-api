# Imagem usada
FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

# Muda o diretório atual para o home
#WORKDIR ~

# Executa o comando
#RUN pwd

ENTRYPOINT ["java","-jar","/app.jar"]
