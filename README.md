# **shopping-api**

Shopping-api. MVP en sprint boot

* * *

## **Collection PostMan**

Archivo para importar en postman `shopping-api.postman_collection.json`

Estructura del proyecto (separation of concerns,)

```
├── ShoppingApplication.java
├── controller
│   └── v1
│       ├── CustomerController.java
│       ├── ProductController.java
│       └── ShoppingController.java
├── entity
│   ├── CustomerEntity.java
│   ├── ProductEntity.java
│   ├── ShoppingCartHeaderEntity.java
│   └── ShoppingCartItemsEntity.java
├── repository
│   ├── ICustomerRepository.java
│   ├── IProductRepository.java
│   ├── IShoppingCartHeaderRepository.java
│   └── IShoppingCartItemsRepository.java
└── service
    ├── customer
    │   ├── CustomerService.java
    │   └── ICustomerService.java
    ├── order
    │   ├── IShoppingCartItemsService.java
    │   └── ShoppingCartItemsService.java
    └── product
        ├── IProductService.java
        └── ProductService.java

