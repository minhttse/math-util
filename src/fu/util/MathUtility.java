/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author minhv
 */
public class MathUtility {

    //classs nay fake class Math cua JDK
    //Math cua JDK co .abs() .sqrt() .sin() .PI
    // chung toan la static, vi la thu vien dung chung
    public static final double PI = 3.1415;

    //ham tinh giai thua : n!=1.2.3.4.5...n
    //0!=1!=1
    //minh khong tinh duoc giai thua am
    //21! cuc lon, tran kieu long, khong chua noi
    //int: toi da 2 ty 1
    //ham tinh giai thua trong gioi han dau vao tu 0..20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        //ko xai else, co else tru diem
//        long result = 1;
//        //doan nay n=2..20
//        for (int i = 2; i <= n; i++) {
//            result *= i; //nhan doi vao result
//        }
//        return result;
//    }
    
    //viet de quy cho hoanh trang
    //goi lai chinh minh voi 1 quy mo khac
    //5! =5 x 4! , di tinh 4!
    //4! =4 x 3! , di tinh 3!
    //3! =3 x 2! , di tinh 2!
    //2! =2 x 1! , di tinh 1!
    //phai co diem dung
    //rat de lap vo tan neu khong co diem dung
    //1!=1, hoi nguoc lai len tren ra 5!
    // ket luan n!=n*(n-1)!
    public static long getFactorial(int n) {
        if(n<0 || n> 20){
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if(n==0 || n==1){
            return 1; // dieu kien dung lai
            //n >1 & n<=20 roi, rap cong thuc de quy
        }
        return n*getFactorial(n-1);
    
    }
    //minh hoa khai niem Refactoring- toi uu, chinh sua lai code cho tot hon 
    //va minh hoa khai niem Regression Test, test hoi quy, test lai nhung gi da tung test XANH, de check xem code con XANH nhu truoc khong
    //sau khi da sua code
    
}
