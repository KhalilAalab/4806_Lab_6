#IMPORTANT
In order to start and interact with the application, first, the jar can be run eg. in IntelliJ

The jar is located in the target folder of the project

Then you can use the IntelliJ http client to create and run requests

#Home page
GET http://localhost:8080/
Accept: application/json

#View the initial state
GET http://localhost:8080/viewbuddies

#Creating a new AddressBook
POST http://localhost:8080/AddressBook
Accept: application/json

#Adding a new BuddyInfo Bob
POST http://localhost:8080/BuddyInfo/?name=Bob&phoneNumber=613
Accept: application/json

#View the added Buddy
GET http://localhost:8080/viewbuddies

Note: The above Thymleaf view can be seen when opening a browser and typing
http://localhost:8080/viewbuddies   in order to see the rudimentary listing.

#Add a second BuddyInfo

POST http://localhost:8080/BuddyInfo/?name=Khalil&phoneNumber=610
Accept: application/json

#View the two Buddies
GET http://localhost:8080/viewbuddies

Note: The above Thymleaf view can be seen when opening a browser and typing
http://localhost:8080/viewbuddies   in order to see the rudimentary listing.

#Removing the first BuddyInfo
DELETE http://localhost:8080/BuddyInfo/1
Accept: application/json

#View the addressbook after deletion
GET http://localhost:8080/viewbuddies

Note: The above Thymleaf view can be seen when opening a browser and typing
http://localhost:8080/viewbuddies   in order to see the rudimentary listing.

