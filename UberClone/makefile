# Ndou Londolani

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ../junit/junit-4.12.jar -sourcepath ./src ./src/$*.java

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: Person.class Car.class Driver.class Database.class UberApp.class Passenger.java Ride.java UberRide.java Vehicle.java

default: $(CLASSES)
	
Person.class: Person.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Car.class: Car.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Driver.class: Driver.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Database.class: Database.java 
	javac -d $(BINDIR) -cp $(JUNIT)
UberApp.class: UberApp.java 
	javac -d $(BINDIR) -cp $(JUNIT)
UberRide.class: UberRide.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Ride.class: Ride.java 
	javac -d $(BINDIR) -cp $(JUNIT)		
Passenger.class: Passenger.java 
	javac -d $(BINDIR) -cp $(JUNIT)	
Vehicle.class: Vehicle.java 
	javac -d $(BINDIR) -cp $(JUNIT)


clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc