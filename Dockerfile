FROM java:8-jdk-alpine
ADD target/com.com.bkukowski.com.bkukowski.newsmediator-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "com.com.bkukowski.com.bkukowski.newsmediator-0.0.1-SNAPSHOT.war"]