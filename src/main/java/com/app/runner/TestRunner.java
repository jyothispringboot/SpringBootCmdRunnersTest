package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test runner");
		System.out.println("Option arguments printing "+Arrays.asList(args));
	}

}
