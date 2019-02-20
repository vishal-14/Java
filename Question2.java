//Q2. Write a program to find the number of occurrences of the duplicate words
//in a string and print them ?

import java.util.Scanner;

public class Question2 {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence ");
            String string = sc.nextLine();
            string = string.toLowerCase();
            String[] words = string.split(" ");
            System.out.println("Duplicate words are: ");
            for (int i=0;i<words.length;i++){
                int count = 0;
                for (int j=i+1; j<words.length;j++){
                    if(words[i].equals(words[j])){
                        words[j] = "O";
                        count = count+1;
                    }
                }
                if(count>0 && !words[i].equals("O"))
                    System.out.println(words[i]+"........"+(count+1));
            }
        }

    }
