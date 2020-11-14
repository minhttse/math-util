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
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //ko xai else, co else tru diem
        long result = 1;
        //doan nay n=2..20
        for (int i = 2; i <= n; i++) {
            result *= i; //nhan doi vao result
        }
        return result;
    }
}
