# Use Amazon's Corretto distribution of OpenJDK
FROM public.ecr.aws/amazoncorretto/amazoncorretto:17
# Set working directory inside the container
WORKDIR /app
# Copy the compiled Java application JAR file into the container
COPY ./target/app-image.jar /app
# Expose the port the Spring Boot application will run on
EXPOSE 8080
# Command to run the application
CMD ["java", "-jar", "app-image.jar"]

