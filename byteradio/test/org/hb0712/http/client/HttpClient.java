package org.hb0712.http.client;

import org.hb0712.http.HttpResponse;
import org.hb0712.http.client.methods.HttpUriRequest;

public interface HttpClient {
	/*
	 * HttpResponse 是个接口，继承于HttpMessage
	 * HttpUriRequest 也是个接口，继承于HttpRequest，而HttpRequest同样继承于HttpMessage。
	 */
	HttpResponse execute(HttpUriRequest request);
}
