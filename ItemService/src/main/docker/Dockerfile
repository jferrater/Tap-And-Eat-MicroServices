FROM java:8
VOLUME /tmp
ADD item-service-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8004
ENTRYPOINT ["java","-jar","/app.jar"]