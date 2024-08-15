# POC spring cloud utilizando modulos do java 9

### Módulos
- gateway
- product-service
  - database
    - pgsql 
- customer-service
  - database
    - mongo

### Build na raiz
```shell
mvn clean install
```

### Execução
- gateway
```shell
cd gateway
mvn spring-boot:run
```

- product-service
```shell
cd product-service
mvn spring-boot:run
```

- customer-service
```shell
cd customer-service
mvn spring-boot:run
```

### Executando via `mvn` a partir da raiz
```shell
mvn -pl gateway spring-boot:run
mvn -pl product-service spring-boot:run
mvn -pl customer-service spring-boot:run
```
