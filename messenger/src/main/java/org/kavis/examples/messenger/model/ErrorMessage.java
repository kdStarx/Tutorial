package org.kavis.examples.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String errorMessage;
	private String errorCode;
	private String description;

	public ErrorMessage() {

	}

	public ErrorMessage(String errorMessage, String errorCode,
			String description) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.description = description;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
