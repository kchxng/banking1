## Spring boot core banking
## Run App in dev tool or cmd

```bash
./mvnw spring-boot:run
```

### Deploy the Spring Boot App to a Server or Cloud

- Configure in pom.xml file before building

```yml
<groupId>com.example</groupId>
<artifactId>my-spring-app</artifactId>
<version>0.0.1-SNAPSHOT</version>
<packaging>jar</packaging>
```

- Command to deploy

```bash
./mvnw clean package

# Optional: Skip Tests on Build
./mvnw clean package -DskipTests
# It's will generate .JAR to desired target:
target/my-spring-app-0.0.1-SNAPSHOT.jar
```

### Build and run in container

```bash
docker build -t myapp .
docker run -p 8080:8080 myapp
```