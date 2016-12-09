"#Tap-And-Eat-MicroServices" 

<h2>ConfigService</h2>
</br>
The ConfigService handles the centralized configuration for the micro services. It also loads the centralized discovery service from a git repository. Discovery service is using Netflix Eureka which automatically discover micro-services.
<h2>AccountService</h2>
</br>
The AccountService holds all accounts information. It has the CRUD functionality in /accounts endpoint. It is a HATEOAS api. Discovery client is also enabled.
