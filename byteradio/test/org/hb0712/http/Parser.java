package org.hb0712.http;

import java.io.InputStream;
import java.util.Map;

public interface Parser {
	public Map<String, String> execute(InputStream is) ;

}
