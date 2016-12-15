"#Tap-And-Eat-MicroServices" 
</br>
Note: Documentation is not yet complete. All micro services will be documented. 

<h1>Tap-And-Eat-MicroServices</h1>
</br>

<h2>Testing the microservices in Ubuntu 16.04 VM</h2>

<h3>Required dependency></h3>
   - java 8
   - maven 3.0
   - docker engine
   - docker compose
</br>
<h3>Installing Maven:</h3>
    apt-get install maven

<h3>Installing java 8:</h3> 
 http://tipsonubuntu.com/2016/07/31/install-oracle-java-8-9-ubuntu-16-04-linux-mint-18/
</br>
<h3>Installing docker engine:</h3>
 https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-16-04
</br>
<h3>Installing docker-compose:<h3> 
 https://www.digitalocean.com/community/tutorials/how-to-install-docker-compose-on-ubuntu-16-04
 </br>

<h2>Testing the microservices with Docker:</h2>
 1. $ git clone https://github.com/jferrater/Tap-And-Eat-MicroServices.git
 2. $ cd Tap-And-Eat-MicroServices
 3. $ mvn clean install  or mvn package -Dmaven.test.skip=true --> if you want to skip the unit test
 4. $ cd docker
 5. $ docker-compose up *Note: This consumes resources and your VM may hang up sometimes. Wait for the docker to complete processing. I am using Ubuntu 16.04 VM with 4Gb RAM.
 6. Open Firefox and check discovered microservices at http://localhost:8888
 </br>
 </br>
This is a microservice architecture project for a restaurant or stores. Microservices are discovered automatically by a discovery service. Configurations are also centralized.
<ul>
<li>ConfigService</li>
<li>AccountService</li>
<li>PriceService</li>
<li>CustomerService</li>
<li>StoreService</li>
<li>ItemService</li>
<li>FoodTrayService</li>
</ul>
<h2>ConfigService</h2>
</br>
The ConfigService provides centralized configuration and discovery service for micro services.
<h2>AccountService</h2>
</br>
The AccountService provides API for managing accounts. It has the CRUD API in /accounts endpoint.
<h2>PriceService</h2>
</br>
The PriceService provides API for managing prices. It has the CRUD api at /prices endpoint.
<h2>StoreService</h2>
</br>
The StoreService provides API for managing stores.
<h2>CustomerService</h2>
</br>
The CustomerService provides API for managing customers.
