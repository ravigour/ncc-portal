# TYV portal backend

### Prerequisite
Java, Maven, Spring boot, mysql, 


### How to Run
- Open code in any IDE.
- To run this project,  mvn spring-boot:run -s settings.xml
- Run below statements to insert data
 ```
//    INSERT INTO roles(name) VALUES('ROLE_STUDENT');
//    INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```
- Refer postman collection in the repo.
- To run swagger UI :http://localhost:8080/portal/swagger-ui.html#/
- Swagger UI in heroku http://tyv-portal.herokuapp.com/portal/swagger-ui.html#/

### MySQL properties
```
spring.datasource.url= jdbc:mysql://localhost:3306/testdb?useSSL=false
spring.datasource.username= root
spring.datasource.password= 123456

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto= update

# App Properties
tyv.app.jwtSecret= tyvSecretKey
tyv.app.jwtExpirationMs= 86400000
```
