import java.util.*;

class Number {
    private int iNo;
    public boolean bFlag;

    Number() {
        bFlag = false;
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        this.iNo = sobj.nextInt();
    }

    public void Display() {
        System.out.println("Value is" + this.iNo);
    }

    public boolean Even() {
        if (iNo % 2 == 0) {
            bFlag = true;

        }

        return bFlag;
    }
}

public class Chkeven {
    public static void main(String arg[]) {
        Number nobj = new Number();
        boolean bRet = false;

        nobj.Accept();
        nobj.Display();

        bRet = nobj.Even();
        if (bRet == true) {
            System.out.println("number is even");

        } else {
            System.out.println("Not even");
        }

    }
}
