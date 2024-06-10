import java.util.Random;

public class Words {
    private String[] randomWords= {"Butterfly", "Blueband", "ClubKiboko", "Porsche", "Happiness", "Animals", "Gecko", "Procrastination",
    "Culture", "inhuman", "Susceptible", "Preparedness", "Boarder", "Reef", "Shore"};

    private String selectedWord;
    private Random random= new Random();
    private char[] letters;

    public Words() {
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];

    }
    public String toString() {

    StringBuilder text= new StringBuilder();

        for (char letter : letters) {
            if (letter == '\u0000') {
                text.append('-');
            }
            else {
              text.append(letter);
            }
            text.append(' ');

        }

        return text.toString();
    }
}
