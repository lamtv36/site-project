package com.ntqsolution.SiteProject.common.util.http;

import java.io.ByteArrayInputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @author LamTV
 *
 */
public class HttpRequestManager {
    public static final String GET_METHOD = "get_method";
    public static final String POST_METHOD = "post_method";
    public static final String MULTIPART_METHOD = "multipart_method";

    public static IHttpRequest getHttpRequest(String url, String methodType) {
        switch (methodType) {
        case GET_METHOD:
            return new HttpGetImpl(url);
        case POST_METHOD:
            return new HttpPostImpl(url);
        case MULTIPART_METHOD:
            return new HttpMultipartPostImpl(url, Charset.forName("UTF-8"));
        }
        return null;
    }

    public static InputStream convertStringToInputStream(String string) {
        return new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
    }

    public static JSONObject paser(String jsonString) throws ParseException {
        JSONParser parser = new JSONParser();
        return (JSONObject) parser.parse(jsonString);
    }

    public static JSONArray parser(String jsonString) throws ParseException {
        JSONParser parser = new JSONParser();
        return (JSONArray) parser.parse(jsonString);
    }
}