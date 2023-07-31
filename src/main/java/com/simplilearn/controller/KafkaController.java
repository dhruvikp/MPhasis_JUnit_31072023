package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.services.KafkaProducer;

@RestController
public class KafkaController {

	@Autowired
	KafkaProducer kafkaProducer;

	@GetMapping("/produce")
	public String producer(@RequestParam("message") String message) {
		kafkaProducer.send(message);
		return "Message published successfully!";
	}
}
