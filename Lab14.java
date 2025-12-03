import java.util.Scanner;
public class Lab14
{
    public static boolean allUniqueLetters(String word)
    {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if (!Character.isLetter(c)) continue;
            for (int j = i + 1; j < word.length(); j++)
            {
                if (c == word.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = in.nextLine();
        String[] words = text.split("[\\s\\p{Punct}]+");
        System.out.println("Words without same letters: ");
        for (String word : words) {
            if (!word.isEmpty() && allUniqueLetters(word))
            {
                System.out.println(word);
            }
        }
        in.close();
    }
}