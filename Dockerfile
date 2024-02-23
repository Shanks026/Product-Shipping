# Use a base image that contains Java 17
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /var/www/java

# Copy Java source files into the container
COPY . /var/www/java

# Compile Java source files
RUN javac Product.java PhysicalProduct.java DigitalProduct.java ServiceProduct.java

# Define the entry point for the Docker container
CMD ["java", "Main"]
