# Siamese
Product service for DangoMango skin care app

## Dev Dependencies
- [OpenJDK 11](https://openjdk.java.net/install/)
- [Maven](https://maven.apache.org/install.html)
- [Docker](https://www.docker.com/products/docker-desktop)

## Building the project
Run `mvn` with one of the following arguments:
* `clean`: Clears previously compiled classes
* `compile`: Compile code
* `test`: Run unit test suite
* `verify`: Generate and check coverage
* `spring-boot:run`: Run server locally
* `spring-boot:build-image`: Build docker image
* `spotless:check`: Check code format
* `spotless:apply`: Apply code formatting

## Testing Connectivity
Once server is running locally, go to [http://localhost:8080/health](http://localhost:8080/health).
You should see the following:
```json
{"status":"OK"}
```