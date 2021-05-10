# Micronaut Cassandra Graal

Test application for Micronaut Cassandra and GraalVM.

To run Cassandra in Docker:

```
docker run -it --rm -p 9042:9042 cassandra:3.11
```

To test the application:
```
curl localhost:8080/cassandra/info
```
