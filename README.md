# Getting Started

Sample application based on clean architecture using Spring Cloud, MongoDB and Kafka.

## Run and start application

```
docker compose up
```

```
java -jar ~/wiremock/wiremock-standalone-3.6.0.jar --port 8082
```

```
// check consumer
~/kafka/bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic tp-cpf-validation --from-beginning
~/kafka/bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic tp-cpf-validated --from-beginning
```

## API

```
curl --request GET \
  --url http://localhost:8081/api/v1/customers/6672c045f20c7d4544f30fc7
```

```
curl --request POST \
  --url http://localhost:8081/api/v1/customers \
  --header 'Content-Type: application/json' \
  --data '{
	"name": "Mary",
	"zipCode": "38400000",
	"cpf": "11111111111"
}
'
```

```
curl --request PUT \
  --url http://localhost:8081/api/v1/customers/6672c045f20c7d4544f30fc7 \
  --header 'Content-Type: application/json' \
  --data '{
	"name": "John",
	"zipCode": "38400001",
	"cpf": "11111111111"
}
'
```

```
curl --request DELETE \
  --url http://localhost:8081/api/v1/customers/6672c045f20c7d4544f30fc7
```

## Stack

- Java, Spring Boot 3, Spring Cloud, Kafka, MongoDB, Clean architecture

## Difficulties

- compatibility of spring cloud with spring boot 3
- running local kafka environment
- running wiremock to mock get address by zip code request for the second time
