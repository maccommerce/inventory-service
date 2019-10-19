FROM openjdk:8-jre
MAINTAINER Wellington Costa <wellington.costa128@gmail.com>
ADD target/inventory-service.jar inventory-service.jar
ENTRYPOINT ["java", "-jar", "/product-service.jar"]
EXPOSE 7010