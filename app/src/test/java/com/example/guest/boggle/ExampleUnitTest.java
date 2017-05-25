package com.example.guest.boggle;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    private String[] consonants = {"b", "c", "d", "f", "g","h","i","j","k","l","m","n", "p", "q", "r", "s", "t", "v", "w", "x","z"};
    private String[] vowels = {"a", "e", "i", "o","u"};

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testRandomNumber() throws Exception{
        Random randomNumber = new Random();
        int test = randomNumber.nextInt(20);
        assertEquals(3, test);
    }

    @Test
    public void testTextGenerator() throws Exception{
        String output= "";

        //Consontants for loop
        for (int i = 0; i < 6; i++){
            Random randomNumber = new Random();
            int number = randomNumber.nextInt(21);
            output += consonants[number];
        }

        //Vowel for loop
        for (int i = 0; i < 2; i++){
            Random randomNumber = new Random();
            int number = randomNumber.nextInt(5);
            output += vowels[number];
        }

        assertEquals("asdasdasd", output);
    }


    @Test
    public void test222() throws Exception{
        System.out.println("test");
        String test = "abpohsi";
//        String[] userInput = test.split(",");
        char [] userInput = test.toCharArray();
        for (int i =0; i< userInput.length; i++)
            System.out.println(userInput[i]);
        assertEquals("b",userInput[0]);
    }

    @Test
    public void test111() throws Exception{
        String input = "pois";
        String randomString = "pgaoxids";
        char[] userInputChar = input.toCharArray();
        char[] randomTextChar = randomString.toCharArray();
        int counter = 0;


        for (int i=0; i < userInputChar.length; i++){
            for(int k=0; k < randomTextChar.length; k++){
                if (i == k){
                    counter++;
                }else{
                    continue;
                }
            }
        }

    assertEquals(4, counter);
    }

    @Test
    public void dataOutputTest() throws Exception{
        FileInputStream fis = new FileInputStream("/Users/doomcat/boggle/app/src/main/assets/words.txt");

        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);


        try
        {
            fis.getChannel().position(0);
        }
        catch (IOException e) {e.printStackTrace();}

        String[] array = new String[number];

        String line;
        int i = 0;
        try
        {
            while((line=br.readLine())!=null)
            {
                array[i] = line;
                i++;
            }
        }
        catch (IOException e) {e.printStackTrace();}
        assertEquals(array.length, "asdas");
    }
}