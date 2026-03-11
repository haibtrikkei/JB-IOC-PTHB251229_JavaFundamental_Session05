package xac_thuc_du_lieu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XacThucEmail {
    public static void main(String[] args) {
        Pattern p;
        Matcher m;
        //Mẫu xác thực email:
        // 1. Bắt đầu bằng 1 kí tự chữ hoa hoặc chữ thường
        // 2. Có thể có dấu ., dấu _ , số và các kí tự khác
        // 3. Không có ký tự đặc biệt

        //ví dụ: binh@gmail.com  hoặc binh123@gmail.com.vn
        p = Pattern.compile("^[a-zA-Z][._\\w]*@\\w{3,}.\\w{2,5}(.\\w{2,5})?$");

        String email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào email cần kiểm tra: ");
        email = sc.nextLine();

        m = p.matcher(email);
        if(m.find()){
            System.out.println("Email này hợp lệ");
        }else{
            System.out.println("Email này không hợp lệ");
        }
    }
}
