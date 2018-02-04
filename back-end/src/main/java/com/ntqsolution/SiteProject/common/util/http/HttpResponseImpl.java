package com.ntqsolution.SiteProject.common.util.http;

import java.io.InputStream;

import com.ntqsolution.SiteProject.common.util.converter.DataConverter;

/**
 * 
 * @author LamTV
 *
 */
public class HttpResponseImpl implements IHttpResponse{
	private int statusCode;
	private InputStream content;
	
	HttpResponseImpl(int statusCode, InputStream content){
		this.statusCode = statusCode;
		this.content = content;
	}
	
	@Override
	public int getStatusCode() {
		return statusCode;
	}
	
	@Override
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	@Override
	public InputStream getContent() {
		return content;
	}
	
	@Override
	public void setContent(InputStream content) {
		this.content = content;
	}

    @Override
    public String getContentAsString() {
        String result = "{}";
        if(null != content) {
            result = DataConverter.InputStreamToString(content);
        }
        return result;
    }
}
