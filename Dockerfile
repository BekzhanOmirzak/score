FROM alpine:3.19

RUN apk add openjdk17

COPY build/libs/scoring.jar /scoring.jar

ENV DB_URL=jdbc:postgresql://localhost:9877/auth
ENV DB_USERNAME=username
ENV DB_PASSWORD=password
ENV PORT=4531

#ENTRYPOINT ["java","-jar","sms-push.jar"]

CMD java -Dserver.port=$PORT -Dspring.datasource.url=${DB_URL} -Dspring.datasource.username=${DB_USERNAME} -Dspring.datasource.password=${DB_PASSWORD} -jar sms-verify.jar
