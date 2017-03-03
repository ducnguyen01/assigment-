package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoanghuynh
 */
public class Category {
    private String maLoai;
    private String loaiSP;

    public Category() {
    }

    public Category(String maLoai, String loaiSP) {
        this.maLoai = maLoai;
        this.loaiSP = loaiSP;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

}
