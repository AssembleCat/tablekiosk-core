# image pulling
FROM openjdk:21-jdk

USER root

# docker build시 --build-arg에 들어오는 인수를 정의
ARG JAR_FILE=build/libs/*.jar

# 컨테이너 내부로 복사
COPY ${JAR_FILE} app/application.jar

EXPOSE 8080

# 실행! 해당 명령어로 실행된 프로세스가 종료되면 컨테이너도 내려감
ENTRYPOINT ["java","-jar","/app/application.jar"]