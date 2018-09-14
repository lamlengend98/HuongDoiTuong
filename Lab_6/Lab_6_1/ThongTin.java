package lab_6;

import java.util.Scanner;

public class ThongTin {
    private String maTL;
    private String tenNXB;
    private int soLuong;
    Scanner sc = new Scanner(System.in);

    public ThongTin(String maTL, String tenNXB, int soLuong) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soLuong = soLuong;
        
    }

    public ThongTin() {
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void input(){
        System.out.print("Ma tai lieu: ");
        this.setMaTL(sc.nextLine());
        System.out.print("Ten nha xuat ban: ");
        this.setTenNXB(sc.nextLine());
        System.out.print("So ban phat hanh: ");
        this.setSoLuong(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String toString() {
        return "Ma tai lieu: "+this.getMaTL() + "\nTen nha xuat ban: "+this.getTenNXB()+"\nSo ban phat hanh: "+this.getSoLuong();
    }
    
}
