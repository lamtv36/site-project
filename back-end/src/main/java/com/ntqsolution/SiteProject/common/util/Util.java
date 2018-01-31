package com.ntqsolution.SiteProject.common.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.ntqsolution.SiteProject.common.exception.BusinessException;

public class Util {
	public static String convertInputStreamToString(InputStream inputStream) {	//ITS#27467
        try {																								//ITS#27467
            ByteArrayOutputStream result = new ByteArrayOutputStream();										//ITS#27467
            byte[] buffer = new byte[1024];																  	//ITS#27467
            int length;																						//ITS#27467
            while ((length = inputStream.read(buffer)) != -1) {												//ITS#27467
                result.write(buffer, 0, length);														    //ITS#27467
            }											  													//ITS#27467
            return result.toString("UTF-8");															    //ITS#27467
        } catch (UnsupportedEncodingException exception) {												    //ITS#27467
            throw new BusinessException(exception);													    //ITS#27467
        } catch (IOException exception) {															        //ITS#27467
            throw new BusinessException(exception);												        //ITS#27467
        }																					       		    //ITS#27467
    }			
}
