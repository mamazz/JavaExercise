package basic;

import java.util.Scanner;

/**
 * Created by jyheo on 2016-03-10.
 */
public class KawiBawiBo_Sol {
    public static int getKawiBawiBoSwitch(String str) {
        switch (str) {
            case "가위":
                return 3;
            case "바위":
                return 2;
            case "보":
                return 1;
            default:
                return 0;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bob >> ");
        String bob = scanner.next();
        int iBob = getKawiBawiBoSwitch(bob);
        if (iBob == 0) {
            System.out.println("Input allowed only : 가위, 바위, 보");
            return;
        }
        System.out.print("Alice >> ");
        String alice = scanner.next();
        int iAlice = getKawiBawiBoSwitch(alice);
        if (iAlice == 0) {
            System.out.println("Input allowed only : 가위, 바위, 보");
            return;
        }

        // TODO: determine who win using if/else
        /*if(bob.equals("가위")){
if(alice.equals("가위")){
System.out.println("Tie");}

else if(alice.equals("바위")){
System.out.println("Alice win");}

else{
System.out.println("bob win");}

}else if(bob.equals("바위")){
if(alice.equals("가위")){
System.out.println("bob win");}
else if(alice.equals("바위")){
System.out.println("Tie");}
else{
System.out.println("Alice win");
}}}}*/
        
        int iDet = iBob - iAlice;
        if (iDet == 0) {
            System.out.println("Tie!");
        } else if (iDet == -1 || iDet == 2) {
            System.out.println("Bob win!");
        } else { // -2 or 1
            // output will be one of :
            System.out.println("Alice win!");
        }
    }
}
