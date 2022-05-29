
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

    public int CountFact() {
        int iCnt = 0;
        int iCount = 0;
        for (iCnt = 1; iCnt <= iNo / 2; iCnt++) {
            if (iNo % iCnt == 0) {
                iCount++;
            }
        }
        return iCount;
    }
}

public class CountFact {
    public static void main(String arg[]) {
        Number nobj = new Number();
        int iRet = 0;

        nobj.Accept();
        nobj.Display();
        iRet = nobj.CountFact();
        System.out.println("Count is" + iRet);
    }
}
