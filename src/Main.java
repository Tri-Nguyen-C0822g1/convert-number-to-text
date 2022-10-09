

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scanner.nextInt();
        String[] arr1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] arr2 = {"", "", "", "third", "four", "fif", "six", "seven", "eight", "nine"};
        int numDonVi;
        int numChuc;
        int numTram;
        String answer = "";
        numTram = number / 100;
        numChuc = (number - numTram * 100) / 10;
        numDonVi = number - numTram * 100 - numChuc * 10;

        if (number == 0) {
            answer += "Zero";
        } else {
            if (numTram > 0) {
                answer += arr1[numTram] + "hundred";
            }
            if (numChuc == 0) {
                answer += arr1[numDonVi];
            } else {
                switch (numChuc * 10 + numDonVi) {
                    case 10:
                        answer += "ten";
                        break;
                    case 11:
                        answer += "eleven";
                        break;
                    case 12:
                        answer += "twelve";
                        break;
                    default:
                        if (numChuc == 1) {
                            answer += arr2[numDonVi] + "teen";
                        } else if (numChuc == 2) {
                            answer += "twenty" + arr1[numDonVi];
                        } else {
                            answer += arr2[numChuc] + "ty" + arr1[numDonVi];
                        }
                }
            }
        }
        System.out.printf("%d Convert to text is: %s", number, answer);
    }

}