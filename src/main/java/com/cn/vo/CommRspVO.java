package com.cn.vo;

/**
 * Created by A on 2017/7/26.
 */
public class CommRspVO {
    private CommRspHeader head;
    private Object object;

    public CommRspHeader getHead() {
        return head;
    }

    public void setHead(CommRspHeader head) {
        this.head = head;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public CommRspVO() {

    }

    public CommRspVO(CommRspHeader head, Object object) {

        this.head = head;
        this.object = object;
    }
}
