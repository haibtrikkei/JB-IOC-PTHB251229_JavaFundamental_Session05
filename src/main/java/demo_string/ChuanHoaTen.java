package demo_string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaTen {
    public static void main(String[] args) {
        //Tên chưa chuẩn hoá:  NGUyễn    VĂn  cƯờng
        //Chuẩn hoá tên: Nguyễn Văn Cường

        //Resole: 1. Chuyển hết về chữ thường (nguyễn văn cường)
        //2. Tách các từ và lưu vào 1 mảng (lưu collection sau)
        //3. Duyệt các phần tử của mảng và thực hiện:
            // 3.1 Sử dụng 1 biến lưu upper của từ đó (NGUYỄN)
            // 3.2 Thay thế kí tự đầu của từ trong mảng thành từ đúng (Nguyễn)
        //4. Ghép các từ đã chuẩn này vào lại biến tên lúc đầu

        String fullName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ tên cần chuẩn hoá: ");
        fullName = sc.nextLine();

        fullName = fullName.toLowerCase();
        StringTokenizer stk = new StringTokenizer(fullName);
        String[] arr = new  String[stk.countTokens()];

        int index = 0;
        while(stk.hasMoreTokens()){
            arr[index++] = stk.nextToken();
        }

        fullName = "";
        for(String word: arr){
            String upper = word.toUpperCase();
            word = word.replaceFirst(word.charAt(0)+"",upper.charAt(0)+"");
            fullName += word+" ";
        }
        fullName = fullName.trim();

        System.out.println("Họ tên sau khi chuẩn hoá: "+fullName);
    }
}
