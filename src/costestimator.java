
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramakrishna
 */

public class costestimator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        String b=s.nextLine();
        if(" use std".equals(b))
            System.out.println(a*1500);
        else if("high std".equals(b))
            System.out.println(a*1800);
        else if("high and autmtd".equals(b))
            System.out.println(a*2500);
        else
            System.out.println(a*1200);
            
    }
    
}
