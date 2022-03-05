#Manually Using the Application
In order to start and interact with the application, first, the jar can be run eg. in IntelliJ

The jar is located in the target folder of the project

Then you can use the IntelliJ http client to create and run requests

#Home page
GET http://localhost:8080/
Accept: application/json

#View all AddressBooks (currently empty)
GET http://localhost:8080/viewAllAddressBooks

# Add a new AddressBook
POST http://localhost:8080/NewAddressBook
Accept: application/json

#Adding a new BuddyInfo Bob
POST http://localhost:8080/AddBuddyInfo?addressBookID=1&buddyInfoName=Bob&buddyInfoPhoneNumber=613
Accept: application/json

#View the added Buddy
GET http://localhost:8080/viewAllAddressBooks

Note: The above Thymeleaf view can be seen when opening a browser and typing
http://localhost:8080/viewAllAddressBooks   in order to see the rudimentary listing.

#Add a second BuddyInfo Khalil

POST http://localhost:8080/AddBuddyInfo?addressBookID=1&buddyInfoName=Khalil&buddyInfoPhoneNumber=819
Accept: application/json

#View the two Buddies
GET http://localhost:8080/viewAllAddressBooks

Note: The above Thymeleaf view can be seen when opening a browser and typing
http://localhost:8080/viewAllAddressBooks   in order to see the rudimentary listing.

#Removing the first BuddyInfo

DELETE http://localhost:8080/DeleteBuddyInfo?addressBookID=1&index=0
Accept: application/json

#View the addressbook after deletion
GET http://localhost:8080/viewAllAddressBooks

Note: The above Thymleaf view can be seen when opening a browser and typing
http://localhost:8080/viewAllAddressBooks   in order to see the rudimentary listing.

