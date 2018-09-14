
package lab_6;

public class Bao extends ThongTin {
    private String ngayPH;

    public Bao(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    public Bao() {
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Ngày phát hành: ");
        this.setNgayPH(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\nNgày phát hành: "+this.getNgayPH(); 
        
    }
    
    
}
