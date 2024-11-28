# Simple REST API with dropwizard

Starting the application
---

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/DW-simple-1.0-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

Reference
---

To learn how we can create this starter kind of project structure of dropwizard, refer this awesome blog `https://www.0xkishan.com/blogs/learn-dropwizard`