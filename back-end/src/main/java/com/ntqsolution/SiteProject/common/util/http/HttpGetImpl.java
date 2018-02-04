package com.ntqsolution.SiteProject.common.util.http;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author LamTV
 *
 */
public class HttpGetImpl implements IHttpRequest {
	private HttpClient client = HttpClientBuilder.create().build();
	private HttpGet request;

	public HttpGetImpl(String url) {
		request = new HttpGet(url);
	}
	
	@Override
	public IHttpRequest setHeader(String name, Object value) {
		request.setHeader(name, (String) value);
		return this;
	}

	@Override
	public IHttpResponse execute() throws IOException {
		HttpResponse response = client.execute(request);
		int statusCode = response.getStatusLine().getStatusCode();
		InputStream content = response.getEntity().getContent();
		IHttpResponse result = new HttpResponseImpl(statusCode, content);
		return result;
	}

	@Override
	public IHttpRequest addTextBody(String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHttpRequest addBinaryBody(String name, File file) {
		// TODO Auto-generated method stub
		return null;
	}
}
