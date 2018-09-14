
package lab_6;


public class TapChi extends ThongTin{
    private int soPH;
    private int thangPH;

    public TapChi(int soPH, int thangPH) {
        this.soPH = soPH;
        this.thangPH = thangPH;
    }
    
    public TapChi(){
        
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSo phat hanh: "+this.getSoPH()+"\nThang phat hanh: "+this.getThangPH(); 
        
    }

    @Override
    public void input() {
        super.input(); 
        System.out.print("So phat hanh: ");
        this.setSoPH(Integer.parseInt(sc.nextLine()));
        System.out.print("Thang phat hanh: ");
        this.setThangPH(Integer.parseInt(sc.nextLine()));
    }
    
}
