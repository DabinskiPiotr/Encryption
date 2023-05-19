public class KeyedCaesarCipher extends Cipher {

 /*   public static String uniquify(String word) {
        word = word.toUpperCase().replaceAll(" ","");;
        StringBuilder result = new StringBuilder();
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            String character = word.substring(i, i + 1);
            if (result.indexOf(character) < 0) {
                result.append(character);
            }
        }
        return result.toString();
    }

public String replaceAlphabet(String key){
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                       'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String result;//= new StringBuilder();
    key.toUpperCase();
    char key1[] = uniquify(key).toCharArray();
    for (int i = 0; i<alphabet.length;i++){
      for (int j = 0; j<key1.length; j++){
        if (key1[j] == alphabet[i]);
           alphabet[i] = '0';
        }
    }
    //alphabet = alphabet.toString().toUpperCase();
   // result.append(uniquify(key) + alphabet.toString().replaceAll("0",""));
    //return result;*/


}
