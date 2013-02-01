package org.hb0712.http.client.methods;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;

import org.hb0712.http.conn.ClientConnectionRequest;
import org.hb0712.http.conn.ConnectionReleaseTrigger;
import org.hb0712.http.message.AbstractHttpMessage;

public abstract class HttpRequestBase extends AbstractHttpMessage
		implements HttpUriRequest, Cloneable{	//, AbortableHttpRequest, Cloneable {
	private Lock abortLock;	//lock 做什么用的？
	private volatile boolean aborted;
	
	private URI uri;
	private ClientConnectionRequest connRequest;
	private ConnectionReleaseTrigger releaseTrigger;

	public URI getURI() {
		return this.uri;
	}

	public void setURI(final URI uri) {
		this.uri = uri;
	}

	public abstract String getMethod();
	
	public void releaseConnection() {
        reset();
    }
	
    public void reset() {
        this.abortLock.lock();
        try {
            cleanup();
            this.aborted = false;
        } finally {
            this.abortLock.unlock();
        }
    }
    
    private void cleanup() {
        if (this.connRequest != null) {
            this.connRequest.abortRequest();
            this.connRequest = null;
        }
        if (this.releaseTrigger != null) {
            try {
                this.releaseTrigger.abortConnection();
            } catch (IOException ex) {
            }
            this.releaseTrigger = null;
        }
    }
}
