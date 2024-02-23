FROM openjdk:17-jdk-slim
WORKDIR /var/www/java
COPY . /var/www/java
RUN javac Product.java PhysicalProduct.java DigitalProduct.java ServiceProduct.java Main.java
CMD ["java", "Main"]
