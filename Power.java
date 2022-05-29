
import java.util.*;

class Number {
    private int iNo;
    private int iPower;

    public void Accept() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        this.iNo = sobj.nextInt();

        System.out.println("enter power");
        iPower = sobj.nextInt();

    }

    public void Display() {
        System.out.println("number  is" + this.iNo);
        System.out.println("power  is" + this.iPower);

    }

    public int Power() {
        int iCnt = 0;
        int iMult = 1;
        for (iCnt = 1; iCnt <= iPower; iCnt++) {

            iMult = iMult * iNo;
        }
        return iMult;
    }
}

public class Power {
    public static void main(String arg[]) {
        Number nobj = new Number();
        int iRet = 0;

        nobj.Accept();
        nobj.Display();
        iRet = nobj.Power();
        System.out.println("Power is" + iRet);

    }
}
