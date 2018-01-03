package models;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


import java.io.IOException;
import java.io.InputStreamReader;

public class FindAndReplace {
    public List<String> findAndReplace(String sentence, String find, String replaceWith) {
        List<String> sentenceArray = new ArrayList<String>();
        System.out.println(sentenceArray);
        sentenceArray.add(sentence);
        for (String word : sentenceArray) {
            System.out.println(word);
//            System.out.println(replaceWith);
            if (word.contains(find)) {
                word = word.replaceAll(find, replaceWith);
                sentenceArray.add(word);
            } else {
                sentenceArray.add(word);
            }
        }
//        Collections.replaceAll(result, input, replaceWith);
//        for (String word : result) {
//            word.replace(input, replaceWith);
//            result.
//        }
        return sentenceArray;
    }
}

