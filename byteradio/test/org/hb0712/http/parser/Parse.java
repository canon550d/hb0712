package org.hb0712.http.parser;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface Parse {
	public List<Map<String, String>> action(InputStream is);
}
