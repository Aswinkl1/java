import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        String str1,str2;
        int len,len1,len2,i,j,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        str1= sc.nextLine();
        System.out.println("Enter second string");
        str2=sc.nextLine();
        len1=str1.length();
        len2=str2.length();
          
        if(len1==len2){
            len=len1;
            for(i=0;i<len;i++){
                 flag=0;

                 for(j=0;j<len;j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        flag=1;
                        break;
                    }
                 }
                
            }
            if(flag==0){
                System.out.println("strings are not anagram");
             }
             else
             {
                System.out.println("string are anagram");
             }
            
        }
        else{
            System.out.println("both strings must have the same no of charects to be an anagram");
        }

    }
    
}
