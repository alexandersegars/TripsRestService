## greetings-rest-service

This is a simple RESTful service that returns greetings.

## Requirements

- Java 1.8
- Maven 4.0.0
- Spring Boot 2.1.6

## Build

Executing

> mvn package

from the command prompt in the project root directory will generate target/greetings-rest-service-0.1.0.jar

## Running the service

To run from the command line execute

> java -jar greetings-rest-service-0.1.0.jar

The default port for the service is 8080. A different port can be specified by providing the port option when executing from the command line:

> java -jar greetings-rest-service-0.1.0.jar port=<portNum>

To run the service on port 8099, execute

> java -jar greetings-rest-service-0.1.0.jar port=8099

## Available Endpoints

/greeting - GETs a greeting. Optional request parameters are firstName and lastName.

/endpoints - GETs a listing of the service's available endpoints.

## NOT IMPLEMENTED

Store information (in a database? File?) that a future request can then retrieve and make decisions on.
Expose an endpoint that allows the retrieval of statistics about visits to the greeting endpoint.
