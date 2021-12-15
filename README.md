## Retryable kafka example Api
![image](https://user-images.githubusercontent.com/42948627/146280445-2d75ff8f-b2f7-43e3-9786-bea3ae005b52.png)

## Run kowl to see datailed topics contents
docker container run -d -p 8080:8080 -e KAFKA_BROKERS=10.104.15.5:9093 --add-host kafka-server:10.104.15.5 quay.io/cloudhut/kowl:master

Adress: http://localhost:8080/topics

## Install Kafka Tool 2.0 to create producer
Download: https://www.kafkatool.com/download.html

## Testing producer and consumer

Run springboot application and automatically create 4 topics,

![image](https://user-images.githubusercontent.com/42948627/146279065-79b10fdb-66e8-4d99-90e0-28565be006d2.png)

To send(create a fake producer) you can create a mensage on kafkatool

![image](https://user-images.githubusercontent.com/42948627/146279890-ea7c2af4-b22c-4fe4-92ea-f0795fad3657.png)

Find listener and see messages with detail 

![image](https://user-images.githubusercontent.com/42948627/146279825-6bdb8b26-74c1-4424-acc3-e54dc16f7017.png)

This code is prepared to throw error in send attempts and send it to dlt;


![image](https://user-images.githubusercontent.com/42948627/146279480-2cfffb75-3c4b-49a0-ace3-154889eb252a.png)

## Reference
https://github.com/evgeniy-khist/spring-kafka-non-blocking-retries-and-dlt
