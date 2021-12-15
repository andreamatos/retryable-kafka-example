<p align=center>
  <strong>retryable-kafka-example is under construction</strong> <br>
  <img src="https://www.teahub.io/photos/full/277-2774413_website-under-construction-hd.jpg" />
</p>

## Run kowl to send message.

docker container run -d -p 8080:8080 -e KAFKA_BROKERS=10.104.15.5:9093 --add-host kafka-server:10.104.15.5 quay.io/cloudhut/kowl:master

Adress: http://localhost:8080/topics

## Reference.

https://github.com/evgeniy-khist/spring-kafka-non-blocking-retries-and-dlt
