## Retryable kafka example Api
<p align=center>
  <img src="https://www.teahub.io/photos/full/277-2774413_website-under-construction-hd.jpg" />
</p>

## Run kowl to see datailed topics contents
docker container run -d -p 8080:8080 -e KAFKA_BROKERS=10.104.15.5:9093 --add-host kafka-server:10.104.15.5 quay.io/cloudhut/kowl:master

Adress: http://localhost:8080/topics

## Install Kafka Tool 2.0.9 to create producer
Download here: https://www.kafkatool.com/download.html

<p align=center>
  <img src="https://user-images.githubusercontent.com/42948627/146277985-6f795dd8-efe9-4803-a3a5-532cf73513d2.png" />
</p>

## Reference
https://github.com/evgeniy-khist/spring-kafka-non-blocking-retries-and-dlt
