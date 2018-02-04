package com.ntqsolution.SiteProject.common.util.http;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author LamTV
 *
 */
public interface IHttpRequest {
	public IHttpResponse execute() throws IOException;

	public IHttpRequest setHeader(String name, Object value);

	public IHttpRequest addTextBody(String key, Object value);

	public IHttpRequest addBinaryBody(String name, File file);
}
