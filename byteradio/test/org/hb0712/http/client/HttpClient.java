package org.hb0712.http.client;

import org.hb0712.http.HttpResponse;
import org.hb0712.http.client.methods.HttpUriRequest;

public interface HttpClient {
	/*
	 * HttpResponse �Ǹ��ӿڣ��̳���HttpMessage
	 * HttpUriRequest Ҳ�Ǹ��ӿڣ��̳���HttpRequest����HttpRequestͬ���̳���HttpMessage��
	 */
	HttpResponse execute(HttpUriRequest request);
}
