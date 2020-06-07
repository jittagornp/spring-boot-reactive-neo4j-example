# Spring-boot Reactive Neo4j Example

> ตัวอย่าง Spring-boot Reactive Neo4j Graph Database

# Prerequisites 

- [ติดตั้ง Neo4j Graph Database ด้วย Docker บน Ubuntu 18.04](https://www.jittagornp.me/blog/install-docker-neo4j-graph-database-on-ubuntu-18.04/)

# Data 

- `/src/main/resources/data`

# Steps

### 1. แก้ Config 

`/src/main/resources/application.properties`

```properties
org.neo4j.driver.uri=neo4j://<SERVER_IP>:7687
org.neo4j.driver.authentication.username=<DATABASE_USERNAME>
org.neo4j.driver.authentication.password=<DATABASE_PASSWORD>
```

### 2. Build
```sh
$ mvn clean install
```

### 3. Run
```sh
$ mvn spring-boot:run 
```

# เรียนรู้เพิ่มเติมได้ที่ 

- [https://neo4j.com/developer/spring-data-neo4j/](https://neo4j.com/developer/spring-data-neo4j/)
- [https://neo4j.github.io/sdn-rx/current/](https://neo4j.github.io/sdn-rx/current/)
- [https://github.com/neo4j/sdn-rx](https://github.com/neo4j/sdn-rx)
- [https://docs.spring.io/spring-data/neo4j/docs/current/reference/html/#reference](https://docs.spring.io/spring-data/neo4j/docs/current/reference/html/#reference)

