package prac_13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task6 {

    public static StringBuilder getLine(String line) {
        String[] words = line.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for (String word: words) {
            list.add(word);
        }
        System.out.println(list.toString());
        StringBuilder ans = new StringBuilder("");
        String temp;

        temp = list.get(0);
        System.out.println(temp);
        list.remove(0);

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 0; j < list.size(); j++) {
                if (temp.charAt(temp.length() - 1) == list.get(j).charAt(0)) {
                    ans.append(temp+" ");
                    temp = list.get(j);
                    list.remove(j);
                    flag = true;
                }
            }
            if (!flag)
                ans.append(temp);
        }

        System.out.println(list.toString());
        return ans;
    }



    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        FileReader text = new FileReader("task6.txt");
        in.close();
        Scanner file = new Scanner(text);
        String line = file.nextLine();
        System.out.println(getLine(line));
    }
}
