
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HiddenWord {

    String input;
    String output = "";
    public HiddenWord(String in) {
        input = in;
    }

    public String getHint(String wordInput) {
        for (int i = 0; i < wordInput.length(); i++) {
            char a = wordInput.charAt(i);
            char b = input.charAt(i);
            if (a == b) {
                output = output + a;
            }
            if (a != b) {
                if (input.indexOf(a) >= 0) {
                    output = output + "+";
                }
                else {
                    output = output + "*";
                }
            }
        }
        return output;
    }

    
    public void main() {
        HiddenWord puzzle = new HiddenWord("HARPS");
        String output = puzzle.getHint("HARMS");
        System.out.println(output);

    }

}
