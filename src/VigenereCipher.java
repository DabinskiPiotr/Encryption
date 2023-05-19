public class VigenereCipher extends Cipher {

     String encrypt(String text, String key)
    {
        String result = "";
        text = text.toUpperCase().replaceAll(" ","");;
        key = key.toUpperCase().replaceAll(" ","");
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            result += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return result;
    }
     String decrypt(String text, String key)
    {
        String result = "";
        text = text.toUpperCase();
        key = key.toUpperCase().replaceAll(" ","");
        for (int i = 0, j = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            result += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return result;
    }
}
