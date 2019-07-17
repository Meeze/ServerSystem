package de.udg.template;

public enum Message {

	NO_PERMISSION("Keine rechte");

	private String message;

	Message(String message) {

		this.message = message;

	}

	public String getMessage() {
		return message;
	}
}
