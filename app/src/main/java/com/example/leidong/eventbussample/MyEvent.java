package com.example.leidong.eventbussample;

/**
 * Created by Lei Dong on 2018/5/17.
 */
public class MyEvent {
    private String msg;

    public MyEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
