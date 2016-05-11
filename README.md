# Spring Microservice
Test Microservice using Spring Boot and Embedded Tomcat

## REST API

This microservice is based on the example described at:
http://www.infoq.com/articles/boot-microservices


## REST API

### Get All Products

```sh
GET http://<host>/products

Results are paginated. Optional query parameters:
page - wanted page number - starts numbering at page 0 (default 0)
count - products returned per page (default 10)
order - sort direction ASC or DESC (default ASC)
sort - field to be sorted (default productName)
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

### Search for a Product

```sh
GET http://<host>/search?q=<keyword>
```
