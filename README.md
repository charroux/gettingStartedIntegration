# gettingStartedIntegration

Compatibility: Java 11

Download or clone the project

Import this project as a Gradle project in Eclipse 

or 

Open this project in Intellij

Run the main as a Java project: https://github.com/charroux/gettingStartedIntegration/blob/master/src/main/java/test/Main.java

XML configuration files are into: https://github.com/charroux/gettingStartedIntegration/tree/master/src/main/resources

applicationContext.xml :

	- input file adapter

	- channel
	
	- logging channel

filtering.xml :

	- input file adapter

	- channel
	
	- message filter 
	
	- adding headers

	- logging channel
		
serviceActivator.xml

	- input file adapter

	- file to string transformer

	- channel

	- service activator (java program)

	- output file adapter
	
routing.xml

	- input file adapter
	
	- json to object transformer

	- channel
	
	- router:
	
		- service activator
		
		- channel
	
	- aggregator:
	
	- outbound file adapter
	
	- json conversion

javaScriptService.xml

	- gateway
	
	- javascript
	
	- logger
	
webServiceCalling.xml

Existing Web Service project : https://github.com/charroux/webServiceForSpringIntegration

	-gateway
	
	- web service call
	
	- logger
	
sqlDatabase.xml

	- gateway
	
	- data base (hsqldb, h2...)
	
	- logger
