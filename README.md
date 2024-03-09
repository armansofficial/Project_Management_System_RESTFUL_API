# Project_Management_System_RESTFUL_API
Project Instructions:
1] Create a new Spring Boot project using Spring Initializr or STS (Spring tool suite)
2]  add following dependency  Spring Web, Spring Data JPA, H2 Database in pom.xml
3] Create a packages like ((controllers, services, repositories, models, 
etc.) inside src/main/java
4]  Database Configuration:  Configure the H2 in-memory database
Set configuration inside application.properties 
spring.datasource.url=jdbc:h2:mem:projectmanagementsystem
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

Endpoints and Usage:
URL remains same but our method is different 
Retrieve all projects: GET /all-project-details
Retrieve specific project: GET /all-project-details/{id}
Create new project: POST /all-project-details
Update existing project: PUT /all-project-details/{id}
Delete project: DELETE /all-project-details/{id}

Exception Handling:  Implemented global exception handling using @ControllerAdvice to manage exceptions and provide meaningful error messages.
ExceptionHandler and ProjectNotFoundException these two class are used in this api


Swagger Documentation:
For these we need to add dependency inside pom.xml
Access Swagger UI: Navigate http://localhost:7722/swagger-ui/index.html in your web browser.

Explore Endpoints: Swagger UI provides a user-friendly interface to explore and interact with the API endpoints.
