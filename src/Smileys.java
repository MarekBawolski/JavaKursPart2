
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
    
        int len = characterString.length();
        int le;
        if(len%2==1){
        
            le = len+1;
        }else{
        
            le=len;
        }
        for(int i = 0; i<(le/2)+3 ; i++){
        
            System.out.print(":)");
        }
        System.out.println("");
        if(len%2==1){
        
            System.out.println(":) " + characterString + "  :)");
        }else {
        
            System.out.println(":) " + characterString + " :)");
        }
        
         for(int i = 0; i<(le/2)+3 ; i++){
        
            System.out.print(":)");
        }
         System.out.println("");
    }

}
