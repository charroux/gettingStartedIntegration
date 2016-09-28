# gettingStartedIntegration

Download the project

Use the command: gradle build
Use the command: gradle eclipse

Import the project into Eclipse

fileContext.xml :

	- input file adapter

	- channel

	- output file adapter
	
fileContextWithService.xml

	- input file adapter

	- channel

	- service activator (java program)

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
	
	- output file adapter
	

	