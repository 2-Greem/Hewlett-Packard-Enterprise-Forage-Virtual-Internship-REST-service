The application can be run by using:

./gradlew bootRun.

Alternatively a JAR file can be built using ./gradlew build and then run as follows:

java -jar "build\libs\demo-0.0.1-SNAPSHOT.jar"

Navigate to [http://localhost:8080/employees](http://localhost:8080/employees) when the build is running to see the 
current list of employees.
Employees can be added, removed, and updated with:

http://localhost:8080/employees/add

POST: (JSON) 

{
employee_id: String,
first_name: String,
last_name: String,
email: String,
title: String
}

Adds an employee with the corresponding data

http://localhost:8080/employees/delete

POST: (String) employee_id

Deletes an employee with the corresponding employee_id 
if they exist

http://localhost:8080/employees/update

POST: (JSON)

{
employee_id: String,
first_name: String,
last_name: String,
email: String,
title: String
}

Replaces the existing data for the given employee_id with the new data given