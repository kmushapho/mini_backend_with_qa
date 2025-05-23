import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String word1 = getWord(1);
        System.out.println(Fibonacci.FibonacciList(0));

    }
    static  public String getWord(int num){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter word number" + num + ':');
            String word = scanner.nextLine().toLowerCase().strip();
            int count = 0;
            for (char letter : word.toCharArray()){
                if (Character.isLetter(letter)){
                    count +=1;
                }
            }
            if (count == word.length()){
                return word;
            }
        }

    }
}
