
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

    public boolean CheckPrime() {
        int iCnt = 0;

        for (iCnt = 2; iCnt <= iNo / 2; iCnt++) {
            if (iNo % iCnt == 0) {
                break;
            }
        }

        if (iCnt > iNo / 2) // if(icnt==(ino/2)+1)
        {
            return true;
        } else {
            return false;
        }

    }

}

public class ChkPrime {
    public static void main(String arg[]) {
        Number nobj = new Number();
        boolean bRet = false;

        nobj.Accept();
        nobj.Display();

        bRet = nobj.CheckPrime();
        if (bRet == true) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }
}
