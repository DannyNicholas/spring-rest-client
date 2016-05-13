package com.scottlogic.spring.rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SpringBootApplication
public class RestClient implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(RestClient.class);

	public static void main(String args[]) {
		SpringApplication.run(RestClient.class);
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class Quote {

		private String type;
		private Value value;

		public Quote() {
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Value getValue() {
			return value;
		}

		public void setValue(Value value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Quote{" + "type='" + type + '\'' + ", value=" + value + '}';
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class Value {

		private Long id;
		private String quote;

		public Value() {
		}

		public Long getId() {
			return this.id;
		}

		public String getQuote() {
			return this.quote;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setQuote(String quote) {
			this.quote = quote;
		}

		@Override
		public String toString() {
			return "Value{" + "id=" + id + ", quote='" + quote + '\'' + '}';
		}
	}
}
