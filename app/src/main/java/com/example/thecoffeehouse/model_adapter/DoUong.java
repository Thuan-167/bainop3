package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong implements Serializable {
    private int hinh_244;
    private String ten_244;
    private String gia_244;

    public int getHinh() {
        return hinh_244;
    }

    public ImageView setHinh(int hinh) {
        this.hinh_244 = hinh;
        return null;
    }

    public String getTen() {
        return ten_244;
    }

    public void setTen(String ten) {
        this.ten_244 = ten;
    }

    public String getGia() {
        return gia_244;
    }

    public void setGia(String gia) {
        this.gia_244 = gia;
    }

    public DoUong(int hinh, String ten, String gia) {
        this.hinh_244 = hinh;
        this.ten_244 = ten;
        this.gia_244 = gia;
    }

    public DoUong() {
    }
}
