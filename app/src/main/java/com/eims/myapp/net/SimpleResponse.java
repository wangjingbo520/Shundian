package com.eims.myapp.net;

import java.io.Serializable;

/**
 * @author bobo
 * @date 2018/9/1
 * describe
 */
public class SimpleResponse implements Serializable {

    private static final long serialVersionUID = -1477609349345966116L;

    public int code;
    public String msg;

    public LzyResponse toLzyResponse() {
        LzyResponse lzyResponse = new LzyResponse();
        lzyResponse.code = code;
        lzyResponse.msg = msg;
        return lzyResponse;
    }
}