package Util;

import java.util.Scanner;

public class SystemUI {
    Scanner ms;
    public SystemUI() {
        ms = new Scanner(System.in);
    }

    public String getInputString(String  msg) {
        String retVal = "";
        showMessage(msg);
        retVal = ms.nextLine();
        return retVal;
    }
    public String getInputString() {
        String retVal = "";
        retVal = ms.nextLine();
        return retVal;
    }
    public int getInputInt(String msg) {
        int retVal = 0;
        showMessage(msg);
        retVal = ms.nextInt();
        return retVal;
    }
    public int getInputInt() {
        int retVal = 0;
        retVal = ms.nextInt();
        return retVal;
    }
    
    public void showMessage(String msg) {
        System.out.println(msg);
    }
    
}
