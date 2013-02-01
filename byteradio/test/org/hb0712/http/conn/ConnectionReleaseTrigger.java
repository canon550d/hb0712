package org.hb0712.http.conn;

import java.io.IOException;

public interface ConnectionReleaseTrigger {
	void abortConnection() throws IOException;
}
