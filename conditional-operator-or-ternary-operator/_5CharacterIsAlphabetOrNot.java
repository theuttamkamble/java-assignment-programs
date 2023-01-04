// Write a program to check whether character is an alphabet or not using conditional operator

public class _5CharacterIsAlphabetOrNot {
    public static void main(String[] args) {
        char ch = 'Y';
        String result;

        result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? ch+" is Alphabet." : ch+" is not Alphabet!";
        System.out.println(result);
    }
}
