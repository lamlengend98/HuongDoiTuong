package lab_6;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        DanhSach ds = new DanhSach();
        do{
            System.out.println("========================");
            System.out.println("1. Thêm.");
            System.out.println("2. In.");
            System.out.println("3. Tìm.");
            System.out.println("4. Thoát.");
            System.out.print("Choice: ");
            int choice  = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("========================");
            
            switch(choice){
                case 1: 
                    ds.input();
                    break;
                case 2: 
                    ds.show();
                    break;
                case 3:
                    ds.search();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi ban chon lai!!");
            }
        }while(true);
    }
    
}
