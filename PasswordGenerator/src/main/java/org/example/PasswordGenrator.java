package org.example;

import java.util.Random;

public class PasswordGenrator {

    public static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "0123456789";
    public static final String SPECIAL_SYMBOLS = "!@#$%^&*()-_=+[]{};:,.<>/?";


    private final Random random;

    public PasswordGenrator() {
        random = new Random();
    }


 //   public String genratePassword(boolean includeLowercase) {
        StringBuilder passwordBuilder = new StringBuilder();

        String validCharacter= "";

//        if(includeLowercase) validCharacter += LOWERCASE_CHARACTERS;
//        if(includeNumbers) validCharacter += NUMBERS;
//        if(includeSpecialSymbols) validCharacter += SPECIAL_SYMBOLS;



//        for(int i=0; i<length; i++){
//            int randomIndex = random.nextInt(validCharacter.length());
//            char randomChar=validCharacter.charAt(randomIndex);
//            passwordBuilder.append(randomChar);



      //  }



       // return passwordBuilder.toString();


   // }






}
