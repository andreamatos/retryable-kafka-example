## Retryable kafka example Api
<p align=center>
  <img src="https://www.teahub.io/photos/full/277-2774413_website-under-construction-hd.jpg" />
</p>

## Run kowl to see datailed topics contents
docker container run -d -p 8080:8080 -e KAFKA_BROKERS=10.104.15.5:9093 --add-host kafka-server:10.104.15.5 quay.io/cloudhut/kowl:master

Adress: http://localhost:8080/topics

## Install Kafka Tool 2.0 to create producer
Download: https://www.kafkatool.com/download.html

## Testing producer and consumer

Run springboot application and automatically create 4 tpoics,

<img src="https://user-images.githubusercontent.com/42948627/146279065-79b10fdb-66e8-4d99-90e0-28565be006d2.png" />

To send(create a fake producer) you can create a mensage on kafkatool.

This code is prepared to throw error in send attempts and send it to dlt;

<img src="https://user-images.githubusercontent.com/42948627/146279480-2cfffb75-3c4b-49a0-ace3-154889eb252a.png" />
          
## Reference
https://github.com/evgeniy-khist/spring-kafka-non-blocking-retries-and-dlt
