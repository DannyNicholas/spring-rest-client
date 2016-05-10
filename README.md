# Spring Microservice
Test Microservice using Spring Boot and Embedded Tomcat

## REST API

This microservice is based on the example described at:
http://www.infoq.com/articles/boot-microservices


## REST API

### Get All Products

```sh
GET http://<host>/products
```

### Get a Product

```sh
GET http://<host>/products/{id}
```

### Create a new Product

```sh
POST http://<host>/products

BODY {
    "productId": "ABC123",
    "productName": "MakerBot",
    "shortDescription": "A product that makes other products",
    "longDescription": "This is an extended description for a makerbot.",
    "inventoryId": "00854321"
}
```

### Update a Product

```sh
PUT http://<host>/products/{id}

BODY {
    "productId": "ABC123",
    "productName": "Modified MakerBot",
    "shortDescription": "New Description",
    "longDescription": "New extended description.",
    "inventoryId": "00123456"
}
```

### Delete a Product

```sh
DELETE http://<host>/products/{id}
```

