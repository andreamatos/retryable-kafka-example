package com.example.kafka.nonblockingretries;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

import java.net.ConnectException;

@Component
@Slf4j
public class RetryableKafkaListener {

  @RetryableTopic(
      attempts = "4",
      backoff = @Backoff(delay = 60000),
      autoCreateTopics = "false",
      topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE,
      exclude = ConnectException.class)
  @KafkaListener(topics = "orders")
  public void listen(String in, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
    log.info("retry " + in + " from " + topic);
    throw new NullPointerException("test");
  }

  @DltHandler
  public void dlt(String in, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
    log.info("dlt " + in + " from " + topic);
  }
}
