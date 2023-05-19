public class CaesarCipher extends Cipher {
    int shift;

    String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();
        message.toLowerCase();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int alphabetPlace = character - 'a';
                int newAlphabetPlace = (alphabetPlace + shift) % 26;
                char newCharacter = (char) ('a' + newAlphabetPlace);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    String decrypt(String message, int shift){
        message.toLowerCase();
        return encrypt(message, 26 - (shift % 26));
    }
}
