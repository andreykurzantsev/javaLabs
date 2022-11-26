import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab3 {
    // 515 mod 3 = 2 (String)
    // 515 mod 17 = 5 (Надрукувати слова без повторень заданого тексту в алфавітному порядку за першою літерою.)

    public static void main(String[] args) {
        String enter = "- . '-' '' A asd 123 weg weg rd wef rge 123 wef! asd, qwe. wef \"rge\" — sdf wer AW fsd. orange, QWDF? ae: 1233";

        if (enter.equals("")) {
            enter = TryScan(enter);
        }

        ArrayList<String> newWords = new ArrayList<>(List.of(enter.split(" ")));
        newWords = CutWord(newWords);
        newWords = CheckUnique(newWords);
        newWords.sort(Comparator.comparing(s -> s.toLowerCase().substring(0, 1)));
        Show(newWords);
    }
    public static String TryScan(String enter){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        enter = in.nextLine();
        return enter;
    }
    public static ArrayList<String> CutWord(ArrayList<String> newWords) {
        char[] symbols = {'.', ',', ':', ';', '!', '?', '\"', '\'', '-', '—'};
        outerLoop:
        for (int i = 0; i < newWords.size(); i++) {
            String current = newWords.get(i);
            for (char symbol : symbols) {
                if (current.equals(Character.toString(symbol)) && current.length() == 1 || current.equals("")) {
                    newWords.remove(i);
                    i--;
                    continue outerLoop;
                }
                int lastWordIndex = current.length() - 1;

                if (current.charAt(lastWordIndex) == symbol) {
                    current = current.substring(0, lastWordIndex);
                    if (current.charAt(0) == symbol) {
                        current = current.substring(1);
                    }
                }
                if (current.equals("")) {
                    newWords.remove(i);
                    i--;
                    continue outerLoop;
                }
                newWords.set(i, current);
            }
        }

        return newWords;
    }
    public static ArrayList<String> CheckUnique(ArrayList<String> newWords){

        ArrayList<String> resultWords = new ArrayList<>();
        for (int i = 0; i < newWords.size(); i++) {

            String current = newWords.get(i);
            boolean repeat = false;

            for (int j = 0; j < newWords.size(); j++) {
                if (j == i) {
                    continue;
                }
                if (current.equals(newWords.get(j))) {
                    repeat = true;
                    break;
                }
            }
            if (repeat == false) {
                resultWords.add(current);
            }
        }
        return resultWords;
    }
    public static void Show(ArrayList<String> newWords){
        for (String element : newWords) {
            System.out.println(element);
        }
    }
}
