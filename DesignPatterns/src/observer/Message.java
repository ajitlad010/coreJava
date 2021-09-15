package observer;

public class Message {
	
	final String messageContent;
	
	Message(String messageContent) {
		this.messageContent = messageContent;
	}
	
	public String getMessageContent() {
		return this.messageContent;
	}

}
