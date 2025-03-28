import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class removevovels {
    public static void main(String[] args) {
        removevovels obj = new removevovels();
        String str , removedstr=" ";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        str= sc.nextLine();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(!obj.isvovel(str.charAt(i))){
                removedstr = removedstr+str.charAt(i);

            }
        }
        System.out.println("string after removed ");
        System.out.println(removedstr);
    }
    public boolean isvovel(char c){
        String vovels ="aeiou";
        for(int i =0;i<5;i++){
            if(c==vovels.charAt(i)){
                return true;
            }
        
        }
        return false;
    }
    
}
