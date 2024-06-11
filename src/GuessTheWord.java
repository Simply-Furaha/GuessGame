public class GuessTheWord {

    private boolean play = false;

    private Words randomWords = new Words();

    public void start() {

        do {
            showWord();
            getInput();
            checkInput();
        } while (play);
    }

    void showWord() {
        System.out.println(randomWords);
    }

    void getInput() {
        System.out.println("getInput");
    }

    void checkInput() {
        System.out.println("checkInput");
    }

}
