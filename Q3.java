
class Q3 {    
    
    public static void main (String [] args){
        
        base10ToBianary (1000);
        
        System.out.println (" ");
    }

    public static void base10ToBianary (int base10Num){
    
        int b = 0;
        int c = 0;
        
        String b10 = "";
        
        System.out.print (base10Num + ": ");
        
        while ( base10Num >= 1){
            
            c = base10Num%2;
            base10Num = base10Num/2;
            
            b10 = c + b10;
            
        }
        
        System.out.println (b10);
        System.out.println (" ");    
    }

}