package com.ntqsolution.SiteProject.common.util.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;


/**
 * @author LamTV
 *
 */
public class HttpMultipartPostImpl extends HttpPostImpl {
	protected MultipartEntityBuilder builder;
	public HttpMultipartPostImpl(String url, Charset charset) {
		super(url);
		builder = MultipartEntityBuilder.create();
		builder.setCharset(charset);
	}

	@Override
	public IHttpRequest addTextBody(String key, Object value) {
		builder.addTextBody(key, (String) value, ContentType.APPLICATION_JSON);
		return this;
	}
	
	@Override
	public IHttpRequest addBinaryBody(String name, File file){
	    try {
            InputStream inputStream = new FileInputStream(file);
            builder.addBinaryBody(name, inputStream, ContentType.APPLICATION_OCTET_STREAM, file.getName());
        } catch (FileNotFoundException ex) {

        }
	    
		
		return this;
	}
	
	@Override
	public IHttpResponse execute() throws IOException {
		HttpEntity multipart = builder.build();
		httpPost.setEntity(multipart);
		CloseableHttpResponse response = client.execute(httpPost);
		int statusCode = response.getStatusLine().getStatusCode();
		InputStream content = response.getEntity().getContent();
		IHttpResponse result = new HttpResponseImpl(statusCode, content);
		return result;
	}
}