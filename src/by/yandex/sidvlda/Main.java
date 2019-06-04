package by.yandex.sidvlada;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import static java.lang.StringUTF16.charAt;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\sid-v\\Text2.txt");
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sid-v\\Text2.txt"));
        String res = reader.readLine();
        ArrayList<Object> text = new ArrayList<>();
        Pattern pattern = Pattern.compile("[1234567890]");
        int c = 0;
        try {
            reader = new BufferedReader(fileReader);

            while ((res = reader.readLine()) != null) {

                System.out.println(res);

                char[] z = res.toCharArray();

                for (int i = 0; i < z.length; i++) {
                    text.add(z[i]);
                }
                System.out.println();

                int number = 0;
                int result = 0;
                for (int i = 0; i < z.length; i++) {
                    if (Character.isDigit(res.charAt(i))) {
                        number = Integer.valueOf(String.valueOf(i), i + 2);
                        z[i] = (char) number;
                        result += z[i];
                    }
                }
                System.out.println(result);

                Matcher m = Pattern.compile("0123456789").matcher(res);
                HashMap<Object, Object> sum = new HashMap<>();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
/*
                Matcher matcher = pattern.matcher(res);
                while (matcher.find()) {
                    c = c + ;
                }
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(text);
        System.out.println("Чисел в тексте : " + c); */

