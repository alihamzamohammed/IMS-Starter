Coverage: 72%
# Inventory Management System

IMS system, to communicate Customer, Item, and Order information with a database
Can create, read, update, and delete from a compatible database

## Getting Started

Download latest release. All dependencies should be included.
To compile from source: `mvn package`
Bypass tests: `mvn package -Dmaven.test.skip=true`

### Prerequisites

Java 1.8
MySQL Server Version 8.0.23

### Installing

Compile program from source using `mvn package`, and use the .jar file with dependencies to run the program
Alternatively, download the latest release, v0.0.3-alpha from the GitHub releases page and use that instead
Ensure your database is correctly set up beforehand. All required queries are in `src/main/resources/sql-schema.sql`

## Running the tests

Unit testing for DAO, Domain and Controller classes included

### Unit Tests 

Tests can be run with `mvn test`, and coverage reports can be generated through `mvn jacoco:report`

```
mvn test
mvn jacoco:report
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* **Jordan Harrison** - *Other Contributions* - [JHarry444](https://github.com/JHarry444)
* **Ed Reynolds** - *Other Contributions* - [Edrz-96](https://github.com/Edrz-96)
