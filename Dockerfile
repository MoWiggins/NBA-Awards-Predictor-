FROM openjdk:14-alpine
COPY build/libs/NBA-Awards-Predictor-*-all.jar NBA-Awards-Predictor.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "NBA-Awards-Predictor.jar"]