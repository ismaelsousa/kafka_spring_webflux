# [kafka spring webflux](https://kafka.apache.org/intro)

![image](https://user-images.githubusercontent.com/28990749/105781681-cc3f5d00-5f27-11eb-833d-87b0f9bfd6f7.png)

# running

- Docker setup
  - `docker network create kafka-net --driver bridge`
  - `docker run -d --name zookeeper-server -p 2181:2181 --network kafka-net -e ALLOW_ANONYMOUS_LOGIN=yes bitnami/zookeeper:latest`
  - `docker run -d --name kafka-server2 --network kafka-net -e ALLOW_PLAINTEXT_LISTENER=yes -e KAFKA_CFG_ZOOKEEPER_CONNECT=zookeeper-server:2181 -e KAFKA_CFG_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 -p 9092:9092 bitnami/kafka:latest`

- Spring deps
  - spring reactive 
  - kafka publisher
  - `run install in maven` 
 
# testing 

- send a post request to `http://localhost:8080/message`
  - body JSON `"My first message"`

# Output

![image](https://user-images.githubusercontent.com/28990749/105782116-b8e0c180-5f28-11eb-8411-9f19343cdb28.png)
