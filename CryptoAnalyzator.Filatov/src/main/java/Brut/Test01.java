package Brut;

public class Test01 {


        private final Character[] alphabet = {'а', 'б', 'в',
                'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
                ':', '!', '?', ' '};
    private final String[] plainText;
        private final java.util.List<Character> alphabetList;

        public Test01(){
            alphabetList = java.util.Arrays.asList(alphabet);
            plainText = new String[alphabet.length];
        }

        public String[] producePlaintext(String cipherText) {
            char[] message = cipherText.toLowerCase().toCharArray();
            for (int key = 0; key < alphabet.length; key++) {
                char[] decodedText = new char[message.length];
                for (int i = 0; i < message.length; i++) {
                    if (message[i] != ' ') {
                        decodedText[i] = alphabet[(alphabetList.indexOf(message[i])+key) % alphabet.length];
                    }else{
                        decodedText[i] = ' ';
                    }
                }
                plainText[key] = String.valueOf(decodedText);
            }
            return plainText;
        }

        public static void main(String[] args) {
            Test01 t = new Test01();
            for(String pt : t.producePlaintext("Кирилл Филатов")) {
                System.out.println(pt);

        }

    }
}
