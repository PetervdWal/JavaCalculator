# Calculator
This repo is to showcase a simple Java application: A calculator.
The focus for this project is the Model and Controller part, hence the view looks minimalistic.

## How to run
This project was build using Java in combination with Maven.
It requires Maven to be installed,

1. First build to project using `mvn clean package`
2. Run the generated JAR with `java -jar target/JavaCalculator-1.0-SNAPSHOT.jar`

## Functionalities implemented
- [x] Numbers can be clicked and added to the display area
- [ ] Two numbers can be added
- [ ] Two numbers can be subtracted
- [ ] Two numbers can be subtracted
- [ ] Two numbers can be multiplied
- [ ] Two numbers can be divided
- [ ] A number can be square rooted
- [ ] A number can be squared
- [ ] Parentheses can be used to create complex operations


## Directory structure.
As this app is basically one feature, the packages are as follows:
 -  Controller
 -  Model
 -  UI

### Controller
The controller folder only contains the ButtonClick Handler at the time of writing, as there is no need to extends this yet.
It handles the input of the client, and updates the view based on the models latest state.

### Model
The model contains the business logic and holds the state of this application.

### UI
As mentioned earlier, the UI was not the focus of this project. Javax swing was used to enable basic functionality.



