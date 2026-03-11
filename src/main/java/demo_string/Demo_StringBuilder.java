package demo_string;

public class Demo_StringBuilder {
    public static void main(String[] args) {
        //Demo immutable
        String name = "Nguyễn Văn Cường";

        name.toUpperCase();
        System.out.println("Họ tên: "+name);

        //Demo mutable
        StringBuilder sb = new StringBuilder(name);
        sb.append(" đến từ Hà Nội");
        System.out.println("Chào bạn: "+sb.toString());

        StringBuffer sb1 = new StringBuffer(name);
        sb1.reverse();
        System.out.println("Đảo ngược chuỗi: "+sb1.toString());
    }
}
