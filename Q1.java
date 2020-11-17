class Q1 {
    
    public static void main (String [] args){
        
        ppap("I have a pen, I have a apple");
        
        ppap("I have a birthday, I have a happy");
        
        ppap("I have a dreamer, I have a strange");
        
        System.out.println (" ");
    }
    
    public static void ppap (String str){
        
        String object1 = "";
        String counter1 = "";
        
        String object2 = "";
        String counter2 = "";
        
        int end1 = str.indexOf(",");
        
        for (int i = 9; i < end1; i++){  
            counter1 = str.substring (i,i+1);
            object1 +=  counter1;
        }
        
        for (int i = 20+object1.length(); i < str.length(); i++){  
            
              counter2 = str.substring (i,i+1);
            
              if (i == 20+object1.length())
              counter2 = counter2.toUpperCase();
            
              object2 +=  counter2;
        }
        
        
        
        System.out.println (str);
        System.out.println ("Uh! "+ object2 +" "+ object1);
        System.out.println (" ");
        
    }
    
}