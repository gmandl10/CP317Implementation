# CP317Implementation

This application was built using Spring Boot. The key dependencies of the project are JDK 1.8 or later, and Maven 3.2. See the installation instructions for Maven here. 
To run the application, clone the repository onto your local system. In a terminal window, change your directory to /demo. Enter the following command,

For Windows:
``
mvn spring-boot:run
``

For Linux or Mac:
``
./mvnw spring-boot:run
``

The website will be running on local system at localhost:8080.

H2 Database 
We have created an H2 Database component for our project to store the different objects of the sports environment. The entities that have been implemented are all of our core classes: user, league, team, game, and player, and we have implemented one of the user’s child classes: Admin. We implemented the Admin class to show we know how to use inheritance. If we had more time, we would implement the other subclasses of User: Spectator, TeamManager, and TeamMember. 
For each of our core classes we have implemented Service, Controller, and Repository classes. These give the spring web component the ability to access the database and manipulate or retrieve data. The methods of our Controller and Service classes are very simple for two reasons. With no experience using Java in a database environment, there was a learning curve to create these methods. Furthermore, there was little time for incorporating more methods once we finally understood the concepts of Java in H2.
Due to time constraints, very little testing has been done on the functionality of the database as a whole. This prototype also only shows functionality of the league and team homepage so the entire database isn’t getting utilized by this prototype. 
