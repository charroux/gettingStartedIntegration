# gettingStartedIntegration

Download or clone the project

Use the command: gradlew build
Use the command: gradlew eclipse

Import the project into Eclipse

fileContext.xml :

	- input file adapter

	- channel

	- output file adapter
	
fileContextWithServiceAndStringConversion.xml

	- input file adapter

	- file to string transformer

	- channel

	- service activator (java program)

	- output file adapter
	
fileContextWithServiceAndStringAndJSonConversion.xml

	- input file adapter
	
	- file to string transformer

	- channel
	
	- service activator (java program)
	
	- json conversion

javaScriptService.xml

	- gateway
	
	- javascript
	
	- logger
	
webServiceCalling.xml

	-gateway
	
	- web service call
	
	- logger
	
sqlDatabase.xml

	- gateway
	
	- service (java or javascript or web service)
	
	- data base (hsqldb, h2...)
