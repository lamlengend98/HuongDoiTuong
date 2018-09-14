
package lab_6;

public class Sach extends ThongTin{
    private String tenTG;
    private int soTrang;

    public Sach(String tenTG, int soTrang, String maTL, String tenNXB, int soLuong) {
        super(maTL, tenNXB, soLuong);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach() {
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.print("Ten tac gia: ");
        this.setTenTG(sc.nextLine());
        System.out.print("So trang: ");
        this.setSoTrang(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString() + "\nTen tac gia: "+this.getTenTG() +"\nSo trang: "+this.getSoTrang(); 
    }
    
    
    
}
