import java.util.*;

public class song {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // Get keywords from user
        System.out.println("Enter 2-3 keywords (space-separated):");
        String input = s.nextLine();
        String[] keywords = input.split(" ");
        
        // List of possible verses
        String[][] verses = {
            {"Life is fun, let's play all day", "With " + keywords[0] + " we find our way", "Abhinay Kalva sings along", "Happiness shines, just like a song!"},
            {"Walking around with " + keywords[0], "Smiling bright, feeling the flow", "Abhinay Kalva loves the beat", "Tap your feet, feel the heat!"},
            {"Every morning, rise and shine", "" + keywords[0] + " and " + keywords[1] + " make it fine", "Abhinay Kalva starts to groove", "Let’s all dance, let’s all move!"},
            {"They said I could not, but I will try", "With " + keywords[0] + " and " + keywords[1] + ", I will touch the sky", "Abhinay Kalva leads the way", "Sing out loud, enjoy the day!"},
        };
        Random random = new Random();
        String[] selectedVerse = verses[random.nextInt(verses.length)];

        for (String line : selectedVerse) {
            System.out.println(line);
        }
    }
}
