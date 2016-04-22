package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicMarkupLanguage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        int inputs = 1;

        while (!(input = sc.nextLine()).equals("<stop/>")){

            String regex = "<\\s*(inverse|reverse|repeat)\\s*(value\\s*=\\s*\"\\s*(\\d+)\\s*\"\\s*)?content\\s*=\\s*\"(.*|\\s+)\"\\s*\\/\\s*>";
            Pattern pattern = Pattern.compile(regex);
            input = input.trim();
            Matcher match = pattern.matcher(input);

            if (match.find()) {

                String action = match.group(1);

                if (!match.group(4).equals("")) {


                    switch (action) {

                        case "inverse":
                            char[] content = match.group(4).toCharArray();

                            for (int i = 0; i < content.length; i++) {

                                char c = content[i];
                                if (Character.isUpperCase(c)) {
                                    content[i] = Character.toLowerCase(c);
                                } else if (Character.isLowerCase(c)) {
                                    content[i] = Character.toUpperCase(c);
                                }

                            }

                            System.out.println(inputs + ". " + new String(content));
                            inputs++;

                            break;
                        case "reverse":
                            System.out.println(inputs + ". " + new StringBuilder(match.group(4)).reverse().toString());
                            inputs++;
                            break;
                        case "repeat":

                            int repeatTimes = Integer.parseInt(match.group(3));

                            for (int i = 0; i < repeatTimes; i++) {
                                System.out.println(inputs + ". " + match.group(4));
                                inputs++;
                            }
                            break;
                    }
                }
            }
        }
    }
}
