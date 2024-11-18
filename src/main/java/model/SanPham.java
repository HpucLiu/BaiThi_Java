/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int maSP;
    private String tenSP;
    private double donGia;
    private String hinh;
    private int maLoai;
    private boolean khuyenMai;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, double donGia, String hinh, int maLoai, boolean khuyenMai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hinh = hinh;
        this.maLoai = maLoai;
        this.khuyenMai = khuyenMai;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public boolean isKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(boolean khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", hinh=" + hinh + ", maLoai=" + maLoai + ", khuyenMai=" + khuyenMai + '}';
    }
    
    
}
