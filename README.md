# CoursePlanner
This project is a Course Planner application developed using Spring Boot. It helps students plan their courses by providing information about past course offerings at SFU, which can help predict future offerings. The application uses a REST interface to support a web-based UI provided by the instructor.
# Features
The Course Planner application is divided into two phases, each with its own set of features:
## Phase 1:
Model reads in data from a provided CSV file.
A simple Spring Boot controller triggers the model to print out the model in a well-structured way to the local terminal (server's terminal).
## Phase 2:
Support REST API required by the web front-end (provided by the instructor).
Generate data on how many students took classes in a given department each semester.
Provide a REST API interface to add more class offerings and track changes made to specific courses.
# Getting Started
To run the Course Planner application, follow these steps:
Clone the repository to your local machine.
Ensure you have Java and Maven installed.
Open the project in your preferred IDE.
Create a folder named "data" at the same level as the "src" folder.
Copy the provided "course_data_2018.csv" file into the "data" folder.
Build the project using Maven.
Run the application.
# API Documentation
The Course Planner application provides the following REST API endpoints:
GET /api/dump-model: Triggers the application to dump out a summary of the model to the server's terminal. This output is not returned via HTTP, but printed to the server's terminal.
For detailed information on how to use the REST API, please refer to the API documentation provided by the instructor.
# Technology Stack
The Course Planner application is built using the following technologies:
#### Java
#### Spring Boot
#### REST API
# Contributors
This project was developed as part of the CMPT 213 course with Dr. Brian. The contributors to this project are Gaurav Gupta and Saqib Hasib.
# License
This project is licensed under the MIT License.
# Acknowledgments
We would like to thank Dr. Brian and the CMPT 213 teaching team for providing guidance and support throughout the development of this project.
