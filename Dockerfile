FROM openjdk:17-alpine
LABEL authors="Ameya Mahankala"
#Export port 8088
EXPOSE 8088
#Set a docker volume if you want
VOLUME /backend_volume
#Add the jar file
ADD /target/*.jar containers-example-0.0.1-SNAPSHOT.jar
#Start the application

ENTRYPOINT ["java", "-jar", "/containers-example-0.0.1-SNAPSHOT.jar"]