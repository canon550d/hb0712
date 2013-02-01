package org.hb0712.http;

import java.io.IOException;
import java.io.InputStream;

public interface HttpEntity {
	/**
	 * Tells whether this entity depends on an underlying stream. Streamed
	 * entities that read data directly from the socket should return
	 * <code>true</code>. Self-contained entities should return
	 * <code>false</code>. Wrapping entities should delegate this call to the
	 * wrapped entity.
	 * 
	 * @return <code>true</code> if the entity content is streamed,
	 *         <code>false</code> otherwise
	 */
	boolean isStreaming(); // don't expect an exception here

	/**
	 * Returns a content stream of the entity. {@link #isRepeatable Repeatable}
	 * entities are expected to create a new instance of {@link InputStream} for
	 * each invocation of this method and therefore can be consumed multiple
	 * times. Entities that are not {@link #isRepeatable repeatable} are
	 * expected to return the same {@link InputStream} instance and therefore
	 * may not be consumed more than once.
	 * <p>
	 * IMPORTANT: Please note all entity implementations must ensure that all
	 * allocated resources are properly deallocated after the
	 * {@link InputStream#close()} method is invoked.
	 * 
	 * @return content stream of the entity.
	 * 
	 * @throws IOException
	 *             if the stream could not be created
	 * @throws IllegalStateException
	 *             if content stream cannot be created.
	 * 
	 * @see #isRepeatable()
	 */
	InputStream getContent() throws IOException, IllegalStateException;
}
