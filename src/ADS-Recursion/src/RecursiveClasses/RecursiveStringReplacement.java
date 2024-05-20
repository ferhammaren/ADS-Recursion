package RecursiveClasses;

public class RecursiveStringReplacement {
    public static int vocals=0;
    public  static int consonants=0;
    public  static String elementFound="";
    public  static String replacedAlpha="";
    public  static String rearrangedString="";
    public RecursiveStringReplacement(){

    }

    public static String getVocalsConsonants(String source, int stringSize){
        if(stringSize!=0&&stringSize<=source.length()){
            if(source.charAt(stringSize)=='a'||source.charAt(stringSize)=='e'||source.charAt(stringSize)=='i'||source.charAt(stringSize)=='o'||source.charAt(stringSize)=='u'){
                vocals++;
            }else if(source.charAt(stringSize)!='0'||source.charAt(stringSize)!='1'||
                    source.charAt(stringSize)!='2'||source.charAt(stringSize)!='3'||
                    source.charAt(stringSize)!='4'||source.charAt(stringSize)!='5'||
                    source.charAt(stringSize)!='6'||source.charAt(stringSize)!='7'||
                    source.charAt(stringSize)!='8'||source.charAt(stringSize)!='9'){
                consonants++;
            }
            return getVocalsConsonants(source, stringSize-1);
        }else{
            return "La cadena "+source+" tiene "+vocals+" vocales y "+consonants+" consonantes";
        }
    }

    public static String searchElement(String source, char search, int stringSize){
        if(stringSize!=0&&stringSize<=source.length()){
            if(source.charAt(stringSize)==search){
                elementFound="El elemento "+search+" esta en la posicion "+stringSize;
                return searchElement(source, search, 0);
            }else{
                return searchElement(source, search, stringSize-1);
            }
        }else{
            return elementFound;
        }
    }

    public static char showCharacters(String source, int stringSize){
        if(stringSize!=0&&stringSize<=source.length()){

        }else{
            return showCharacters(source, stringSize-1);
        }
    }

    public static String modifyString(String source, int stringSize)
    {

    }
    public static String rearrangeString(String source, int stringSize){

    }
}
