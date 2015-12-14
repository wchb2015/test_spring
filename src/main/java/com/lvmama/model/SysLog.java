package com.lvmama.model;

import java.util.Date;

/**
 * Created by wangchongbei on 15-12-14.
 */
public class SysLog {
    private Date date;
    private String content;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
