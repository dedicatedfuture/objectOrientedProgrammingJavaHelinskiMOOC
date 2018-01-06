import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = "";
        int j;
        while( i < this.length){
            j = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(j);
            password += symbol;
            i++;
        }
        return password;
    }
}
