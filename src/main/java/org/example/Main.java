package org.example;

public class Main {
    public static void main(String[] args) {
        boolean ans = isCatPlaying(false,36);

        System.out.println(ans);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        // Initiate the min and max temperature cat playing
        int minTemp = 25;
        int maxTemp = 35;

        // if its summer change the max temp to 45
        if(summer)
            maxTemp = 45;

        // Check if cat playing or not
        return (temperature >= minTemp) && (temperature <= maxTemp);
    }
}