# spring-crud-h2

## Tool: Postman

### Get Car List
Endpoints: localhost:8080/api/car
Method: GET
Body: none

### Create Car
Endpoints: localhost:8080/api/car
Method: POST
Body: 
{
    "brand": "Chevrolet",
    "model": "Blazer",
    "maximum_speed": 250,
    "engine": 2.8,
    "features": "4 doors, folding seats, control",
    "launch_date": "05/01/2019"
}

### Update Car
Endpoints: localhost:8080/api/car/1
Method: PUT
Body: 
{
    "brand": "Chevrolet",
    "model": "Camaro",
    "maximum_speed": 250,
    "engine": 2.8,
    "features": "2 doors, folding seats, control",
    "launch_date": "05/01/2019"
}

### Delete Car
Endpoints: localhost:8080/api/car/1
Method: PUT
Body: None


