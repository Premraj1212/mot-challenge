## MOT UI Automation Challenge

UI Automation Week Feb 2021 - Challenge 2 - Clean up messy code (Intermediate)

### Pre-requisites

- [Java 8](https://jdk.java.net/8/)
- [Maven](https://maven.apache.org/download.cgi)



### Project Structure
The main directories / files in the project are as below:
- test: The directory for all tests and assertions
- business_layer: All directories in test are abstracted based on business flows
- resources: Test data in form of YAML files
- helper: Directory that contains helper classes like Helper methods.


### User Journey that is Automated
-Restful Booker platform to manage bookings and enquiry

### Run Test
Tests can be run on locally based on tags hooked in features.

Run tests locally:
```$xslt
# Run a single test class.
$ mvn -Dtest=Challenge2Tests test
```

