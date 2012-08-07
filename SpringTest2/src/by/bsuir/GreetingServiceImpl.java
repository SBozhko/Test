package by.bsuir;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;

	public GreetingServiceImpl() {
	}

	public GreetingServiceImpl(String greeting) {
		this.greeting = greeting;
	}

	public void sayGreeting() {
		System.out.println(greeting);
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void calc(int number) {
		System.out.println("Your number is " + number);		
	}
}
