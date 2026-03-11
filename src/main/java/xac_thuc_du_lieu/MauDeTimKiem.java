package xac_thuc_du_lieu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MauDeTimKiem {
    public static void main(String[] args) {
        //Nhập vào 1 danh sách họ tên
        //Lấy ra những người có đệm là Văn (không phải tên mà cũng không phải họ)

        String[] names;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số người: ");
        n = Integer.parseInt(sc.nextLine());

        names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập họ tên người thứ "+(i+1));
            names[i] = sc.nextLine();
        }

        System.out.println("\nNhững người có đệm là Văn: ");
        Pattern p = Pattern.compile("[\\p{L}\\s]+Văn[\\p{L}\\s]+");
        Matcher m;
        for(String name: names){
            m = p.matcher(name);
            if(m.find()){
                System.out.println(name);
            }
        }
    }
}
