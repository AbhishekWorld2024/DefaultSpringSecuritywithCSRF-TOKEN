# DefaultSpringSecuritywithCSRF-TOKEN

<h1>Spring Boot Security Example with CSRF Protection</h1>
This project showcases a Spring Boot application that implements a basic REST API for managing student records while incorporating security features, including CSRF protection and autogenerated passwords.<br><br>

Features<br>
Student Management:<br>

Provides endpoints to get and add student records.<br>
Maintains an in-memory list of students, allowing easy data manipulation.<br><br>
**CSRF Protection**:<br>

Includes an endpoint to fetch CSRF tokens required for making POST requests, ensuring secure interactions with the API.<br><br>
**Security Configuration:**<br>

Utilizes Spring Security for securing endpoints and automatically generates a security password for development purposes.<br><br>
How It Works<br>
**API Endpoints:**<br>

**GET /Student:** Retrieves the list of students.<br>
**POST /Student:** Adds a new student to the list. Requires a valid CSRF token in the request headers for security.<br>
**GET /csrf-token:** Fetches the CSRF token needed for secure POST requests.<br><br>
**CSRF Token Management**:<br>

CSRF tokens are automatically generated and can be accessed by making a GET request to /csrf-token. This token must be included in the headers of POST requests to validate the request and prevent CSRF attacks.<br><br>
**Security Password:**<br>

On startup, Spring Security generates a temporary password for development use, which can be viewed in the console output. It is important to configure your security settings properly before deploying to production.<br><br>
**Project Structure**<br>
**Controller Class (StudentController):**<br>
Handles HTTP requests related to student records, including methods for retrieving and adding students, as well as providing CSRF tokens.<br><br>

**Student Details Class (Student):**<br>
Represents the student entity with properties for id and name, including getter and setter methods.<br><br>

**Configuration**<br>
**application.properties:**<br>
Configures the application name and server port (8100).<br><br>
**Testing the Application**<br>
**Run the Application:** Start the Spring Boot application.<br>
**Fetch Students:** Use Postman to make a GET request to localhost:8100/Student to retrieve the list of students.<br>
**Get CSRF Token: **Make a GET request to localhost:8100/csrf-token to obtain the CSRF token for POST requests.<br>
**Add Student:** Use the fetched CSRF token in the headers to make a POST request to localhost:8100/Student with a JSON body containing the student details:<br><br>

{<br>
    "id": 3,<br>
    "name": "new_student"<br>
}<br><br>

**Technologies Used**<br>
Spring Boot<br>
Spring Security<br>
RESTful API principles<br>
CSRF protection<br><br>
**Important Notes**<br>
The autogenerated security password is for development use only. Ensure to configure the application security settings appropriately before deploying in a production environment.