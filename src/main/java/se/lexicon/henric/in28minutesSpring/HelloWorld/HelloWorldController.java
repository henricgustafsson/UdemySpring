package se.lexicon.henric.in28minutesSpring.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello_world")
	public String helloWorld() {
		return "hello world!";
	}
	
	@GetMapping(path="/hello_world_bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello world!");
	}
	
	@GetMapping(path="hello_world/path_variable/{name}")
	public HelloWorldBean HelloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s", name));
	}
}

