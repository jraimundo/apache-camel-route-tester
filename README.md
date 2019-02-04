# apache-camel-route-tester
A perfomance test for an Apache Camel Route.
This example is meant to show that Apache Camel has very low throughput when server requests take some time, like 1s.

Apache Camel application can be start with the following command:
```console
$ cd apache-camel
$ mvn spring-boot:run
```

Soapui mock service is located in soapui folder.

Tests where created using Jmeter 5. They can be run using the following command:
```console
$ jmeter -n -t jmeter/hello-service-request.jmx
```
