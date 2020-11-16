/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import static fu.util.MathUtility.*;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author minhv
 */
public class MathUtilityTest {
    @Test // @Test bien ham nay thanh public static void main()
    //Cach dat ten ham se noi len muc tieu test ham. Co nhieu quy tac dat ten
    //ham test 
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
    }
    
    //Can test xem co nem ve ngoai le hay khong ?
    //neu dung la nem ve ngoai le IllegalArgumentException trong tinh huong giai thua -5 thi tao co may xanh
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        getFactorial(-5);
    }
    // ngoai le khong phai la 1 value de dem ra so sanh, chi co the kiem tra coi no co xuat hien hay khong
    
}
