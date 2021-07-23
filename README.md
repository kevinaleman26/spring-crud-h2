# spring-crud-h2

<p> A API Rest CRUD that use H2 Database </p>

## Tool: Postman

### Get Car List
Endpoints: localhost:8080/api/car <br>
Method: GET <br>
Body: none <br>

### Create Car
Endpoints: localhost:8080/api/car<br>
Method: POST <br>
Body: <br>
{
    "brand": "Chevrolet",
    "model": "Blazer",
    "maximum_speed": 250,
    "engine": 2.8,
    "features": "4 doors, folding seats, control",
    "launch_date": "05/01/2019"
}

### Update Car
Endpoints: localhost:8080/api/car/1 <br>
Method: PUT <br>
Body: <br>
{
    "brand": "Chevrolet",
    "model": "Camaro",
    "maximum_speed": 250,
    "engine": 2.8,
    "features": "2 doors, folding seats, control",
    "launch_date": "05/01/2019"
}

### Delete Car
Endpoints: localhost:8080/api/car/1 <br>
Method: PUT <br>
Body: None <br>


