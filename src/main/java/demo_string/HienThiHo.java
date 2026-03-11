package demo_string;

import java.util.Scanner;

public class HienThiHo {
    public static void main(String[] args) {
        String[] list;

        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập số người: ");
            n = Integer.parseInt(sc.nextLine());
            if(n<1){
                System.out.println("Phải nhập n>0");
            }
        }while(n<1);

        list = new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Nhập họ tên người thứ "+(i+1));
            list[i]=sc.nextLine();
        }

        System.out.println("\nDanh sách họ tên vừa nhập: ");
        for(String name: list){
            System.out.println(name);
        }

        String[] listSurnames = new  String[list.length];
        int index = 0;

        //Duyệt qua danh sách họ tên, lấy ra họ
        //Kiểm tra họ này đã có trong listSurnames hay chưa
        //Nếu chưa có thì thêm vào listSurenames, có rồi thì thôi

        for(String name: list){
            //Lấy ra vị trí xuất hiện đầu tiên của khoảng trắng trong họ tên
            int pos = name.indexOf(" ");
            //Lấy họ ra
            String surname = name.substring(0, pos);

            //check xem họ này đã có trong listSurnames hay chưa?
            boolean existed =  false;
            for(String temp: listSurnames){
                if(temp!=null && temp.equals(surname)){
                    existed = true;
                    break;
                }
            }

            if(!existed){
                listSurnames[index++]=surname;
            }
        }

        System.out.println("\nDanh sách họ là: ");
        for(int i=0;i<index;i++){
            System.out.println(listSurnames[i]);
        }

        System.out.println("\nNhững người họ Nguyễn trong danh sách: ");
        for(String name: list){
            if(name.startsWith("Nguyễn")){
                System.out.println(name);
            }
        }
    }
}
