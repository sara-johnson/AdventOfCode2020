import java.util.List;

public class Day02_PasswordPhilosophy {
    List<String> passwordList = null;

    public Day02_PasswordPhilosophy(List<String> inputList) {
        passwordList = inputList;
    }
    
    public void handlePart01() {
        int validPasswords = 0;

        Character letterToBeFound = null;
        int lowest;
        int highest;
        String pwrd;
        for (String password : passwordList) {
            int counter = 0;
            lowest = lowestNumber(password);
            highest = highestNumber(password);
            letterToBeFound = letterToBeFound(password);
            pwrd = passwordToVerify(password);

            for (int i = 0; i < pwrd.length(); i++) {
                if (letterToBeFound == pwrd.charAt(i)) {
                    counter++;
                }
            }
            if (lowest <= counter && counter <= highest) {
                validPasswords++;
            }
        }
        System.out.println(validPasswords);
    }

    private String passwordToVerify(String input) {
        return input.substring(input.indexOf(":") + 2);
    }

    private Character letterToBeFound(String input) {
        return input.charAt(input.indexOf(" ") + 1);
    }

    private int lowestNumber(String input) {
        StringBuilder lowestNumber = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                lowestNumber.append(input.charAt(i));
            } else {
                break;
            }
        }
        return Integer.parseInt(lowestNumber.toString());
    }

    private int highestNumber(String input) {
        StringBuilder highestNumber = new StringBuilder();

        for (int i = input.indexOf("-"); i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i + 1))) {
                highestNumber.append(input.charAt(i + 1));
            } else {
                break;
            }
        }
        return Integer.parseInt(highestNumber.toString());
    }
}
