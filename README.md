# Vehicle Charging Station Simulation
## Overview
This project simulates an electric vehicle charging station system, designed to manage the charging process of electric cars in a simulated environment. It incorporates various components such as car queue management, energy source management based on weather conditions, a graphical user interface for monitoring the charging process, and handling potential exceptions related to charging.

## Components
- **Car.java:** Defines the Car class, representing the electric vehicles that will be charged at the station.
- **CarQueue.java:** Manages a queue of cars waiting to be charged, encapsulating the logic for adding and removing cars from the queue.
- **ChargingExceptions.java:** Contains custom exceptions that might occur during the charging process, such as errors related to energy source or queue management.
- **ChargingStation.java:** The core class that simulates the charging station, managing charging slots, and coordinating the charging process of cars in the queue.
- **ChargingStationGUI.java:** Provides a graphical user interface to visualize the charging station's operation, showing the status of each charging slot and the cars being charged.
- **EnergyManagement.java:** Manages the energy source for the charging station, which could vary based on external factors like weather conditions.
- **Main.java:** The entry point of the simulation, setting up the charging station, initializing the components, and starting the simulation.
- **Weather.java:** Simulates weather conditions that might affect the energy management for the charging station.


## Car.java
- **Constructor(s):** Initializes a new instance of a Car, likely with attributes such as license plate number, battery status, or owner details.
- **Getters/Setters:** Methods to access and modify the car's attributes, such as getting the license plate or battery level.
## CarQueue.java
- **addCar(Car car):** Adds a car to the queue, preparing it for charging.
- **getNextCar():** Retrieves and removes the next car in the queue to be charged.
- **getQueueSize():** Returns the current number of cars waiting in the queue.
## ChargingExceptions.java
- Defines various exceptions like QueueFullException, ChargingFailureException, etc., to handle specific error scenarios related to the charging process.
## ChargingStation.java
- **startChargingProcess():** Initiates the charging process for cars. It may loop through the available charging slots and assign cars from the queue to each slot for charging.
- **chargeCar(int slot):** Handles the charging logic for a single car at a given charging slot. This includes updating the GUI, managing the energy source, simulating the charging duration, and logging the charging completion.
## ChargingStationGUI.java
- **updateChargingSlot(int slot, String status):** Updates the GUI component representing a charging slot with the current status, such as occupied, charging, or available.
- **displayQueueStatus(List<Car> queue):** Optionally, shows the status of the queue, including cars waiting to be charged.
## EnergyManagement.java
- **getCurrentEnergySource():** Determines and returns the current energy source for charging, which could be influenced by external factors like the weather.
- **adjustEnergySource(Weather weather):** Adjusts the energy source based on the current weather conditions, optimizing for efficiency and sustainability.
## Main.java
- **main(String[] args):** The main method that sets up the simulation environment, initializes all components, and starts the charging station simulation.
## Weather.java
- **getCurrentWeather():** Returns the current weather conditions, which may affect the energy management in the charging station.

## Development Environment
- JDK Version: 21
- Build Tool: Maven 3.6
