package org.hb0712.http.conn;

public interface ClientConnectionRequest {
    /**
     * Aborts the call to {@link #getConnection(long, TimeUnit)},
     * causing it to throw an {@link InterruptedException}.
     */
    void abortRequest();
}
