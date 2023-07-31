package com.simplilearn.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics = "simplilearn", groupId = "1")
	public void consume(String message) {
	
		System.out.println("Received message : "+ message);
	}
	
	@KafkaListener(topics = "simplilearn", groupId = "2")
	public void consume2(String message) {
	
		System.out.println("Received message ###: "+ message);
	}
	
	@KafkaListener(topics = "simplilearn", groupId = "3")
	public void consume3(String message) {
	
		System.out.println("Received message @@@: "+ message);
	}
	
	
}
