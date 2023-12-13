# Veterinary Management System
## Endpoints
### Animals
| Endpoint                      | HTTP Code | Description                                     |
|-------------------------------|-----------|-------------------------------------------------|
| /api/v1/animals               | GET       | List of all animals                             |
| /api/v1/animals/{id}          | GET       | Animal by id number                             |
| /api/v1/animals/customer/{id} | GET       | All animals belonging to a customer are listed. |
| /api/v1/animals/name/{name}   | GET       | Animals are listed by name.                     |
| /api/v1/animals               | POST      | Add new animal.                                 |
| /api/v1/animals/{id}          | PUT       | The animal of a specific id is updated.         |
| /api/v1/animals/{id}          | DELETE    | The animal of a specific id is deleted.         |

### Appointments
| Endpoint                               | HTTP Code | Description                                                                        |
|----------------------------------------|-----------|------------------------------------------------------------------------------------|
| /api/v1/appointments                   | GET       | List of all appointments.                                                          |
| /api/v1/appointments/{id}              | GET       | Appointment by id number.                                                          |
| /api/v1/appointments/animal/date-range | GET       | The appointments for a specified animal within a designated date range are listed. |
| /api/v1/appointments/doctor/date-range | GET       | The appointments for a specified doctor within a designated date range are listed. |
| /api/v1/appointments                   | POST      | Add new appointment.                                                               |
| /api/v1/appointments/{id}              | PUT       | The appointment of a specific id is updated.                                       |
| /api/v1/appointments/{id}              | DELETE    | The appointment of a specific id is deleted.                                       |

### AvailableDates
| Endpoint                          | HTTP Code | Description                                                              |
|-----------------------------------|-----------|--------------------------------------------------------------------------|
| /api/v1/available-date            | GET       | List of all available dates.                                             |
| /api/v1/available-date/{id}       | GET       | Available date by id number.                                             |
| /api/v1/available-date/date-range | GET       | The available dates of a specific doctor on a requested date are listed. |
| /api/v1/available-date            | POST      | Add new AvailableDate.                                                   |
| /api/v1/available-date/{id}       | PUT       | The available date of a specific id is updated.                          |
| /api/v1/available-date/{id}       | DELETE    | The available date of a specific id is deleted.                          |

### Customers
| Endpoint                      | HTTP Code | Description                               |
|-------------------------------|-----------|-------------------------------------------|
| /api/v1/customers             | GET       | List of all customers.                    |
| /api/v1/customers/{id}        | GET       | Customer by id number.                    |
| /api/v1/customers/name/{name} | GET       | List of customers with a specific name.   |
| /api/v1/customers             | POST      | Add new Customer.                         |
| /api/v1/customers/{id}        | PUT       | The customer of a specific id is updated. |
| /api/v1/customers/{id}        | DELETE    | The customer of a specific id is deleted. |

