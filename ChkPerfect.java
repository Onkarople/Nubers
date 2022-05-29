
//import java.lang.*;
import java.util.*;

class Number {
    private int iNo;

    public void Accept() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        this.iNo = sobj.nextInt();
    }

    public void Display() {
        System.out.println("Value is" + this.iNo);
    }

    public boolean perfect() {
        int iCnt = 0;
        int iSum = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = iNo / 2; ((iCnt >= 1) && (iSum <= iNo)); iCnt--) {
            if ((iNo % iCnt) == 0) {
                iSum = iSum + iCnt;
            }

        }

        if (iSum == iNo) {
            return true;
        }

        else {
            return false;
        }

    }
}

public class ChkPerfect {
    public static void main(String arg[]) {
        Number nobj = new Number();
        boolean bRet = false;

        nobj.Accept();
        nobj.Display();

        bRet = nobj.perfect();
        if (bRet == true) {
            System.out.println("number is perfect");

        } else {
            System.out.println("Not perfect");
        }

    }
}
