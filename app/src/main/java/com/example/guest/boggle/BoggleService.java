package com.example.guest.boggle;


import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class BoggleService {


    private String userInput;
    private String randomString;

    private String[] consonants = {"b", "c", "d", "f", "g","h","i","j","k","l","m","n", "p", "q", "r", "s", "t", "v", "w", "x","z"};
    private String[] vowels = {"a", "e", "i", "o","u"};

    public BoggleService(String userInput, String randomString){
        this.userInput = userInput;
        this.randomString = randomString;
    }

    public String getUserInput(){
        return userInput;
    }

    public String getRandomString(){
        return randomString;
    }

    public void setUserInput(String a){
        this.userInput = a;
    }

    public void setRandomString(String a){
        this.randomString = a;
    }


    public String textGenerator(){
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

        return output;
    }


    public Boolean validator(String input){
        char[] userInputChar = input.toCharArray();
        char[] randomTextChar = this.randomString.toCharArray();
        int counter = 0;


        for (int i = 0; i < userInputChar.length; i++) {
            for (int k = 0; k < randomTextChar.length; k++) {
                if (userInputChar[i] == randomTextChar[k]) {
                    counter++;
                } else {
                    continue;
                }
            }
        }


        if (counter >= 3) {
            return true;
        } else {
            return false;
        }


    }
}
