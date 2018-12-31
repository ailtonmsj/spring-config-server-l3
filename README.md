### l3-server

##### Just a _spring config server_ that gets some data from [github](https://github.com/) and provides that data for other application by restful api  
  
#### to run use:
##### mvn spring-boot:run  

#### to send a command to the clients update the configuration:
##### http://localhost:8001/actuator/bus-refresh

### to start/stop the rabbitmq server locally:
#### invoke-rc.d rabbitmq-server start/stop
