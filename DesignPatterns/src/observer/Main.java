package observer;

public class Main {

	public static void main(String[] args) {
		
		MessageSubscriberOne s1 = new MessageSubscriberOne();
		
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		
		MessagePublisher p = new MessagePublisher();
		
		p.attach(s1); p.attach(s2); p.attach(s3);
		
		p.notifyUpdate(new Message("First Message"));		//s1 s2 and s3 wil receive update
		
		System.out.println("===============");
		p.detach(s1);										//remove s1
		
		System.out.println("=======after s1 detach========");
		p.display();
		
		System.out.println("===============");
		
		p.notifyUpdate(new Message("Second Message"));	//s2 and s3 will receive update
		System.out.println("=================");
	}

}
