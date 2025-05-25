FROM  eclipse-temurin:21-jdk-jammy
EXPOSE 8081
ADD target/spring-jenkins-docker-integration.jar spring-jenkins-docker-integration.jar

ENTRYPOINT ["java","-jar","spring-jenkins-docker-integration.jar"]
