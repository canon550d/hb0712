package org.hb0712.http.parser;

import java.io.IOException;
import java.io.InputStream;

public interface HttpClient {
	public InputStream read(String url) throws IOException;
}
