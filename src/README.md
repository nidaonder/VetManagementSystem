# Veterinary Management System
## Endpoints
| Endpoint                      | HTTP Code | Description                                     |
|-------------------------------|-----------|-------------------------------------------------|
| /api/v1/animals               | GET       | List of all animals                             |
| /api/v1/animals/{id}          | GET       | Animal by id number                             |
| /api/v1/animals/customer/{id} | GET       | All animals belonging to a customer are listed. |
| /api/v1/animals/name/{name}   | GET       | Animals are listed by name.                     |
| /api/v1/animals               | POST      | Add new animal.                                 |
| /api/v1/animals/{id}          | PUT       | The animal of a specific id is updated.         |
| /api/v1/animals/{id}          | DELETE    | The animal of a specific id is deleted.         |


