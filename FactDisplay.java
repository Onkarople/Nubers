
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

    public void DisFact() {
        int iCnt = 0;
        for (iCnt = 1; iCnt <= iNo / 2; iCnt++) {
            if (iNo % iCnt == 0) {
                System.out.println(iCnt);
            }
        }

    }
}

public class FactDisplay {
    public static void main(String arg[]) {
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();
        nobj.DisFact();

    }
}
