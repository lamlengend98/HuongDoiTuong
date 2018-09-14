package lab_6;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    private ArrayList <ThongTin> list = new ArrayList <ThongTin>();
    private int size = 10;
    private int index;
    private int num;
    Scanner sc = new Scanner(System.in);

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void input(){
        System.out.print("Moi ban nhap loai: ");
        String type = new Scanner(System.in).nextLine();
        do{
            switch(type){
                case "Sach":
                    Sach s = new Sach();
                    System.out.print("Nhap so luong: ");
                    this.setNum(Integer.parseInt(new Scanner(System.in).nextLine()));
                    for (int i = 0; i < this.getNum(); i++) {
                        System.out.println("Sach thu "+(i+1)+": ");
                        s.input();
                        list.add(i, s);
                    }
                    break;
                case "Tap chi":
                    TapChi tc = new TapChi();
                    System.out.print("Nhap so luong: ");
                    num = Integer.parseInt(new Scanner(System.in).nextLine());
                    for (int i = 0; i < num; i++) {
                        System.out.println("Tap chi thu "+(i+1)+": ");
                        tc.input();
                        list.add(i, tc);
                    }
                    break;
                case "Bao":
                    Bao b = new Bao();
                    System.out.print("Nhap so luong: ");
                    num = Integer.parseInt(new Scanner(System.in).nextLine());
                    for (int i = 0; i < num; i++) {
                        System.out.println("Bao thu "+(i+1)+": ");
                        b.input();
                        list.add(i, b);
                    }
                    break;
                default:
                    System.out.println("Loi!!");
            }
            break;
        }while(true);
    }
    
    public void show(){
        
        System.out.println("======Sach======");
        for (int i = 0; i < this.getNum(); i++) {
            if(list.get(i) instanceof Sach)
                System.out.println(list.get(i));
        }
        System.out.println("======Tap chi======");
        for (int i = 0; i < this.getNum(); i++) {
            if(list.get(i) instanceof TapChi)
                System.out.println(list.get(i));
        }
        System.out.println("======Bao======");
        for (int i = 0; i < this.getNum(); i++) {
            if(list.get(i) instanceof Bao)
                System.out.println(list.get(i));
        }
    }
    
    public void search(){
        boolean flag = false;
        for (int i = 0; i < this.getNum(); i++) {
            System.out.print("Moi ban nhap loai: ");
            String chon = sc.nextLine();
            System.out.print("Nhap ma "+chon+" ban can tim: ");
            String name = sc.nextLine();
            switch(chon){
            case "Sach":
                if(list.get(i) instanceof Sach && list.get(i).getMaTL().equalsIgnoreCase(name)){
                System.out.println("------Sach------");
                System.out.println(list.get(i));
                flag = true;
                break;
                }
            case "Tap chi":
                if(list.get(i) instanceof TapChi && list.get(i).getMaTL().equalsIgnoreCase(name)){
                System.out.println("------Tap Chi------");
                System.out.println(list.get(i));
                flag = true;
                break;
                }
            case "Bao":
                if(list.get(i) instanceof Bao && list.get(i).getMaTL().equalsIgnoreCase(name)){
                System.out.println("------Bao------");    
                System.out.println(list.get(i));
                flag = true;
                break;
                }                        
             }
          if(!flag)
             System.out.println("Khong tim thay ma "+name+" ban muon tim");
        }
    }   
}
