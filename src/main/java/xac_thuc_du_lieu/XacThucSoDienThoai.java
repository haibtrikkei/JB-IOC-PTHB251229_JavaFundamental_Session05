package xac_thuc_du_lieu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XacThucSoDienThoai {
    public static void main(String[] args) {
        Pattern pVT,pVN,pMB,pVNMB,pGMB;
        Matcher mVT,mVN,mMB,mVNMB,mGMB;

        pVT = Pattern.compile("^0(3[2-9]|86|98)\\d{7}$");
        pVN = Pattern.compile("^08[123458]\\d{7}$");
        pMB = Pattern.compile("^07[06789]\\d{7}$");
        pVNMB = Pattern.compile("^05[68]\\d{7}$");
        pGMB = Pattern.compile("^0(59|99)\\d{7}$");

        String phone;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần xác thực: ");
        phone = sc.nextLine();

        mVT = pVT.matcher(phone);
        mVN = pVN.matcher(phone);
        mMB = pMB.matcher(phone);
        mVNMB = pVNMB.matcher(phone);
        mGMB = pGMB.matcher(phone);

        if(mVT.matches()){
            System.out.println("Đây là số điện thoại nhà mạng Viettel!!!");
        }else if(mVN.matches()){
            System.out.println("Đây là số điện thoại nhà mạng Vinaphone!!!");
        }else if(mMB.matches()){
            System.out.println("Đây là số điện thoại nhà mạng Mobiphone!!!");
        }else if(mGMB.matches()){
            System.out.println("Đây là số điện thoại nhà mạng GMobile!!!");
        }else if(mVNMB.matches()){
            System.out.println("Đây là số điện thoại nhà mạng VietnamMobile!!!");
        }else{
            System.out.println("Số điện thoại này không hợp lệ!!!");
        }
    }
}
