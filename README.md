# spring-boot-rest-crud-jpa-mysql
spring boot rest services crud operations using jpa and mysql

====================================

spring boot - rest services crud operations - live coding
=========================================================

source code: https://github.com/TechPrudent/spring-boot-rest-crud-jpa-mysql

Requests sample: https://github.com/TechPrudent/spring-boot-rest-crud-jpa-mysql/blob/master/data.json

- crud - create, read, update, delete
- mysql
- jpa
- jdbc
- hibernate
- rest controller
- customer service

dependencies:
- web, lombok, jpa, mysql connector

<maven.test.skip>true</maven.test.skip>

yml:
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/customer?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false
    username: root
    password: admin
    
  jpa:
    hibernate:
      ddl-auto: update
    generate-ddl: true
    show-sql: true
    database-platform: org.hibernate.dialect.MySQL57Dialect
