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

    public int SumFact() {
        int iCnt = 0;
        int iSum = 0;
        for (iCnt = 1; iCnt <= iNo / 2; iCnt++) {
            if (iNo % iCnt == 0) {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

}

public class SumFact {
    public static void main(String arg[]) {
        Number nobj = new Number();
        int iRet = 0;

        nobj.Accept();
        nobj.Display();
        iRet = nobj.SumFact();
        System.out.println("Sum is" + iRet);

    }
}
