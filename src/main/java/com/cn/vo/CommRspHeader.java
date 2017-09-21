package com.cn.vo;

/**报文头信息
 * Created by A on 2017/7/26.
 */
public class CommRspHeader {
    private String _rm;
    private String _rd;

    public String get_rm() {
        return _rm;
    }

    public void set_rm(String _rm) {
        this._rm = _rm;
    }

    public String get_rd() {
        return _rd;
    }

    public void set_rd(String _rd) {
        this._rd = _rd;
    }

    public CommRspHeader() {

    }

    public CommRspHeader(String _rm, String _rd) {

        this._rm = _rm;
        this._rd = _rd;
    }
}
