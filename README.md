# Location Update System with Kafka in Spring Boot

## This repository houses a sophisticated messaging system built on Apache Kafka and Spring Boot, facilitating real-time communication between services within a delivery tracking ecosystem. The system comprises two primary services, DeliveryBoy and endUser, which collaborate to transmit and receive location updates through Kafka topics, ensuring timely and efficient data flow for tracking deliveries.

### Overview
The project simulates a delivery service where:

**DeliveryBoy Service (Producer):** Acts as the message producer, sending real-time location updates of deliveries to a Kafka topic. This service represents the delivery personnel updating the system with their current location as they progress towards the delivery destination.

**endUser Service (Consumer):** Functions as the message consumer, listening to the Kafka topic for new location updates from the DeliveryBoy service. This service could represent customers or a delivery tracking system eager to receive updates about their delivery's whereabouts.

### System Architecture

**[DeliveryBoy Service]** --(publishes location updates to)--> **[Kafka Topic]** --(location updates consumed by)--> **[endUser Service]**

## Prerequisites
- Java JDK 11 or later
- Apache Kafka and Zookeeper
- Spring Boot 2.3.4.RELEASE or later
- Maven 3.6.3 or later (for building the project)
