# Siamese
[![Build Status](https://circleci.com/gh/dango-mango/siamese.svg?style=svg)](https://app.circleci.com/pipelines/github/dango-mango/siamese)
[![Docker Version](https://img.shields.io/docker/v/dangomango2/siamese)](https://hub.docker.com/repository/docker/dangomango2/siamese)

Product service for DangoMango skin care app

## Dev Dependencies
- [OpenJDK 11](https://openjdk.java.net/install/)
- [Gradle](https://gradle.org/install/)
- [Docker](https://www.docker.com/products/docker-desktop)

## Building the project
Run `gradlew` with one of the following arguments:
* `clean`: Clears cache
* `compileJava`: Compile java main code
* `compileTestJava`: Compile java test code
* `test`: Run unit test suite
* `jacocoTestReport`: Generate coverage report
* `jacocoTestCoverageVerification`: Verify coverage
* `bootRun`: Run server locally
* `bootBuildImage`: Build docker image
* `spotlessCheck`: Check code format
* `spotlessApply`: Apply code formatting

## Testing Connectivity
Once server is running locally, go to [http://localhost:8080/health](http://localhost:8080/health).
You should see the following:
```json
{"status":"OK"}
```