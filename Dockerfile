FROM openjdk:17-jdk-alpine
MAINTAINER GARY
COPY out/artifacts/DeployJavaK8s_jar/DeployJavaK8s.jar DeployJavaK8s.jar
ENTRYPOINT ["java", "-jar", "/DeployJavaK8s.jar"]
