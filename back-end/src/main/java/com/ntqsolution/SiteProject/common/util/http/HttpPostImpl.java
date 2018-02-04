package com.ntqsolution.SiteProject.common.util.http;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;

/**
 * 
 * @author LamTV
 *
 */
public class HttpPostImpl implements IHttpRequest {
	protected CloseableHttpClient client = HttpClients.createDefault();
	protected HttpPost httpPost;
	private final JSONObject params = new JSONObject();

	public HttpPostImpl(String url) {
		httpPost = new HttpPost(url);
	}
	
	public HttpPostImpl(String url, String json) {
		this(url);
		StringEntity entity;
		try {
			entity = new StringEntity(json);
			httpPost.setEntity(entity);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	    
	}

	@Override
	public IHttpResponse execute() throws IOException {
	    StringEntity entity = new StringEntity(params.toJSONString());
	    httpPost.setEntity(entity);
		CloseableHttpResponse response = client.execute(httpPost);
		int statusCode = response.getStatusLine().getStatusCode();
		InputStream content = response.getEntity().getContent();
		IHttpResponse result = new HttpResponseImpl(statusCode, content);
		return result;
	}

	@Override
	public IHttpRequest setHeader(String name, Object value) {
		httpPost.setHeader(name, (String) value);
		return this;
	}

	@SuppressWarnings("unchecked")
    @Override
	public IHttpRequest addTextBody(String key, Object value) {
		params.put(key, value);
		return this;
	}

	@Override
	public IHttpRequest addBinaryBody(String name, File file) {
		// TODO Auto-generated method stub
		return null;
	}
}
