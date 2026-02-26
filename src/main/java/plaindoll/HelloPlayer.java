package plaindoll;

public class HelloPlayer{
	public static void main(String[] args) {
		Welcomer welcomer = new Welcomer();
		System.out.println(welcomer.sayWelcome());
		System.out.println(welcomer.sayFarewell());
	}
}
@Test
public void welcomerSaysHunter() {
    String reply = welcomer.getHunterReply();
    assertTrue(reply.contains("hunter"));
}