package org.hb0712.noble.working;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class URLResourceTest {

	@Test
	public void test() throws IOException {
		Resource resource = new UrlResource("http://www.newegg.com.cn/Product/92-C04-022.htm");
		
		System.out.println(resource.isOpen());
		System.out.println(resource.getURL());
		System.out.println(resource.getURI());
		System.out.println(resource.isReadable());
		System.out.println(resource.contentLength());
	}

}
