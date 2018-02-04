package com.ntqsolution.SiteProject.common.util.http;

import java.io.InputStream;

/**
 * 
 * @author LamTV
 *
 */
public interface IHttpResponse {

	public int getStatusCode();

	public void setStatusCode(int statusCode);

	public InputStream getContent();

	public void setContent(InputStream content);

    public String getContentAsString();

}
