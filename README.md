# SpringBoot Rest API

This application consists of a simple CRUD to review the concepts of REST and Spring Boot. This API has functions to create, delete, and update users in a database, 
receiving as data inputs the person's first and last name, their address, and their gender.

## Technologies used

* Java
* Maven
* Spring
* Mysql
* Postman

## How to run the application

Make sure Maven and JDK are installed on your machine.

This project uses: 
* JDK 21.0.2
* Maven 3.6.3

### DB Config

1. Create a new database on Mysql (Use the file Script.sql to help you);
2. Add its dependencies in the fields url, username, and password in the file application.yml.
   
### Endpoints
`/person`: This endpoint shows a list of all registered people; <br>
`/person/{id}`: Search for a specific user by their id;

### How to test the application

To test this API you can use Postman.
<br> Json: <br> { <br>
          "firstName": "", <br>
          "lastName": "", <br>
          "addres": "", <br>
          "gender": "", <br>
      }

* Adding a new user

  Method: Post <br>
  URL: http://localhost:8080/person 


* Updating the user
  
  Method: Put <br>
  URL: http://localhost:8080/person <br>

* Deleting the user

  Method: Delete <br>
  URL: http://localhost:8080/person/id <br>


