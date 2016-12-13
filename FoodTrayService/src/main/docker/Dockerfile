FROM java:8
VOLUME /tmp
ADD foodtray-service-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8005
ENTRYPOINT ["java","-jar","/app.jar"]