/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.Scanner;



/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("---ABC---");
        String a = "abcdifghijklmnopqrstuvwxyz";
        char[] abc = a.toCharArray();
        char[] notabc = new char[26];
        boolean isAllletters = true;
        
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите строку слово: ");
        String str = scanner.nextLine();
        for (int i = 0; i < abc.length; i++) {
            int index = str.indexOf(abc[i]);
            if (index == -1) { notabc[i]= abc[i]; isAllletters = false; }
        }
        if (!isAllletters){
            System.out.println("В строке не все букв: " + new String(notabc));
        }else{
            System.out.println("В строке все буквы");
        }     
    }    
}
