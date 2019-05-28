FROM maven:3.6.1-jdk-8

RUN apt-get update \
    && apt-get install -y git \
    && apt-get install -y unzip

RUN wget "https://github.com/eclipsesource/graphical-lsp/archive/master.zip"
RUN unzip master.zip -d /glsp_framework

WORKDIR /glsp_framework/graphical-lsp-master/server
RUN ls
RUN mvn clean install

WORKDIR stl
ADD pom.xml pom.xml
ADD src src
RUN mvn clean install -Pfatjar


EXPOSE 5007
ENTRYPOINT java -jar target/stl-example-1.2.0-SNAPSHOT-glsp.jar com.eclipsesource.glsp.example.stl.ExampleServerLauncher
