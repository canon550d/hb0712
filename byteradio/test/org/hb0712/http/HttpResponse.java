package org.hb0712.http;

public interface HttpResponse extends HttpMessage {
	void setStatusCode(int code);
	StatusLine getStatusLine();
	
	/**
	 * Obtains the message entity of this response, if any. The entity is
	 * provided by calling {@link #setEntity setEntity}.
	 * 
	 * @return the response entity, or <code>null</code> if there is none
	 */
	HttpEntity getEntity();
}
