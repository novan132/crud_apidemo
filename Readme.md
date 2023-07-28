# Spring REST api
simple CRUD with spring boot

# Method provided
endpoint provided is ```/api/employees```
with method GET, POST, PUT, DELETE

# example response
GET: ```api/employees```
response:
```agsl
[
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Smith",
        "email": "john@mail.com"
    },
    {
        "id": 2,
        "firstName": "Alex",
        "lastName": "Smith",
        "email": "alex@mail.com"
    },
    {
        "id": 3,
        "firstName": "David",
        "lastName": "Smith",
        "email": "david@mail.com"
    },
    {
        "id": 4,
        "firstName": "novan",
        "lastName": "ariadi",
        "email": "novan@mail.com"
    }
]
```
GET: ```/api/employees/4```
response:
```agsl
{
    "id": 4,
    "firstName": "novan",
    "lastName": "ariadi",
    "email": "novan@mail.com"
}
```
PUT: ```/api/employees/2``` with body:
```agsl
{
    "firstName": "Johny",
    "lastName": "Johny",
    "email": "johny@mail.com"
}
```
response:
```agsl
{
    "id": 2,
    "firstName": "Johny",
    "lastName": "Johny",
    "email": "johny@mail.com"
}
```
DELETE: ```/api/employees/2```
response:
```agsl
true
```