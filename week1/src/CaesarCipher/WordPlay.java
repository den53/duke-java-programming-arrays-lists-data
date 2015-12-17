
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    private boolean isVowel(char chIn){
        //Standardize to lowercases
        char ch = Character.toLowerCase(chIn);
        String vowels = "aeiou";
        return vowels.contains(Character.toString(ch));
    }
    
    public void testIsVowel(){
        char ch = 'A';
        System.out.println("The character "+ch+" is a vowel? "+isVowel(ch));
        char ch1 = 'f';
        System.out.println("The character "+ch1+" is a vowel? "+isVowel(ch1));
    }
    
    private String replaceVowels(String phrase, char chIn){
        StringBuilder newPhrase = new StringBuilder(phrase);
        //iterate over the phrase
        for (int i = 0; i < phrase.length(); i +=1){
            if(isVowel(newPhrase.charAt(i))){
                newPhrase.setCharAt(i,chIn);
            }
        }
        return newPhrase.toString();
    }
    
    public void testReplaceVowels(){
        System.out.println(replaceVowels("Hello World", '*'));
    }
    
    private String emphasize(String phrase, char chIn){
        StringBuilder newPhrase = new StringBuilder(phrase);
        
        for(int i = 0; i < phrase.length(); i += 1){
            if(Character.toLowerCase(newPhrase.charAt(i))==chIn){
                if(i%2==0){
                    newPhrase.setCharAt(i,'*');
                }else{
                    newPhrase.setCharAt(i,'+');
                }
            }
        }
        return newPhrase.toString();
    }
    
    public void testEmphasize(){
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
        
    }
    
}
