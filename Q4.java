class Q4 {
       
    public static void main (String [] args){
       
        pigLatinTranslate (" scud ");
        
        pigLatinTranslate ("honey where is my super suit");
        
        pigLatinTranslate ("your a wizard harry");
        
        System.out.println (" ");
    }
    
    
    public static void pigLatinTranslate ( String phrase){
        
        System.out.print(phrase + ": ");
        
        String a = phrase.substring (0,1);
        String b = phrase.substring (phrase.length()-1,phrase.length());        
        if (!(a.equals(" ")))
        phrase = " " + phrase;        
        if (!(b.equals(" ")))
        phrase =  phrase + " " ;
        
        String translatedPhrase = "";
        String word = "";
        String firstLetter = "";
        String rest = "";
        
        String checkBe = "";
        String checkAf = "";
        String current = "";
        
        int sum = 0;
                              
            
        for (int i = 0; i < phrase.length(); i++){
                                                            
            word = "";
            sum = 0;
            current = phrase.substring(i,i+1);
            
            if (i>0)
            checkBe = phrase.substring(i-1,i);
              
            if ( i < phrase.length()-1)
            checkAf = phrase.substring(i+1,i+2);
            
                                                
            if (checkBe.equals(" ") ){                                                
                while ( (!(checkAf.equals(" ")))){
                                                             
                    if ( i < phrase.length()-1)
                    checkAf = phrase.substring(i+1,i+2);
                    
                    current = phrase.substring(i,i+1);
 
                    word += current;
                    
                    if (checkAf.equals(" "))
                    sum += 1;
                    
                    i++;
                        
                }                  
            }
            
            
            if (sum>0){                                         
                if (word.length() > 2){  
                
                    firstLetter = word.substring (0,1);
                    rest = word.substring (1,word.length());
                    word = rest + firstLetter + "ay";
                
                    translatedPhrase += word + " ";
                
                    }else
                    translatedPhrase += word + " ";
            }
            
        
        }
                        
        System.out.println(translatedPhrase); 
        System.out.println (" ");
                    
    }    
    
}
