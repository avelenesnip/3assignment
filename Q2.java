class Q2 {
    
    public static void main (String [] args){
        
        palindromeCheck ("racecar");
        
        palindromeCheck ("car");
        
        palindromeCheck("A man, a plan, a canal: Panama.");
        
        System.out.println (" ");
    }
    
    public static void palindromeCheck (String palindrome){
        
        String a = "";
        String b = "";
        String c = "";
        
        System.out.print(palindrome + ": " );

        palindrome = palindrome.toLowerCase();
        palindrome = palindrome.replaceAll("[^a-zA-Z0-9]", "");
               
        
        for (int i = palindrome.length(); i > 0; i--){

            a = palindrome.substring(i-1,i);
            
            if (!(a.equals(",") ))
            b += a;

           }
           
        if (palindrome.equals(b))
        System.out.println("is a palindrome");
        else
        System.out.println("is not a palindrome");

        System.out.println (" ");
    }
    
}