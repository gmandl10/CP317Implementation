# CP317Implementation

This application was built using Spring Boot. The key dependencies of the project are JDK 1.8 or later, and Maven 3.2. See the installation instructions for Maven here.\ 
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

**H2 Database**

We have created an H2 Database component for our project to store the different objects of the sports environment. The entities that have been implemented are all of our core classes: user, league, team, game, and player, and we have implemented one of the user’s child classes: Admin. We implemented the Admin class to demonstrate the use of  inheritance. If we had more time, we would have implemented the other subclasses of User: Spectator, TeamManager, and TeamMember. 
For each of our core classes we have implemented Service, Controller, and Repository classes. These give the spring web component the ability to access the database and manipulate or retrieve data. The methods of our Controller and Service classes are very simple for two reasons. With no experience using Java in a database environment, there was a learning curve to create these methods. Furthermore, there was little time for incorporating more methods once we finally understood the concepts of Java in H2.\
Due to time constraints, very little testing has been done on the functionality of the database as a whole. This prototype also only shows functionality of the league and team homepage, so the entire database is not being utilized.


**Implemented**\
For this project we have the following pages created:\
*A Site homepage:* which shows the different leagues being offered and an “about” the website section.\
*A League Homepage:* which includes the standings for the league. The standings include the team ranking, the team name and the record of wins to losses.\
*A Team Homepage:* which includes the Player roster and the previous game statistics.


**Not Implemented**\
For this project we did not create the following pages:\
*Sign- In / Sign-Up page:* certain users to be given different views i.e. create leagues, add points.\
*Player Statistics page:* when you select the player from the team homepage you would see their specific statistics in more detail.\
*League schedule:* in the league homepage we also want to have a tab so we can see the schedule for all games.\
*League search:* a page where users can search for specific leagues.\
*Page to upload statistics:* a page accessible only by authorized users that would allow them to update game and team information.
