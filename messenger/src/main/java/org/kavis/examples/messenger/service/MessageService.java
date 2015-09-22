package org.kavis.examples.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kavis.examples.messenger.database.DatabaseClass;
import org.kavis.examples.messenger.exception.DataNotFoundException;
import org.kavis.examples.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "Hello World !!", "kavis"));
		messages.put(223L, new Message(223, "HI there ", "starx"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		Message message = messages.get(id);
		if (message == null) {
			System.out.println("Yes null");
			throw new DataNotFoundException("Message with id " + id
					+ " not found");
		} else {
			return messages.get(id);
		}
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
