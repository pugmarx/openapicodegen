### OpenAPI Springboot Sample App

#### Running
1. Start local DDB (use ```-sharedDb``` option)
2. Start the Springboot app
3. Access the app at localhost:8080/person

#### DDB
```shell script
java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
```

#### Curl
```shell script
curl -X POST "http://localhost:8080/person" -H "accept: */*" -H "Content-Type: application/json" -d "{\"id\":121212,\"firstName\":\"Foo1\",\"lastName\":\"Bar1\",\"email\":\"ab@def.com\",\"age\":20,\"creditCardNumber\":\"4111111111111111\"}"
```

#### Generate client

```shell script
  java -jar openapi-generator-cli.jar generate \
  -i http://localhost:8080/v3/api-docs \
  --api-package org.pgmc.simpleapi.client \
  --model-package org.pgmc.simpleapi.client.model \
  --invoker-package org.pgmc.simpleapi.client.invoker \
  --group-id org.pgmc \
  --artifact-id sample-api-client \
  --artifact-version 0.0.1 \
  -g java \
  -p java8=true \
  --library resttemplate \
  -o simple-api-client
```
Note:<br> 
The ```resttemplate``` in above example can be replaced, acc to the requirements.

