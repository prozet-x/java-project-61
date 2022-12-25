package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Progression {
    public static void run(String userName, int questionsCount) {
        Map<String, String> qAndA = new HashMap<>();
        Random random = new Random();
        for (int i = 1; i <= questionsCount; i++) {
            int progressionLength = random.nextInt(6) + 5;
            int start = random.nextInt(10) + 1;
            int step = random.nextInt(10) + 1;
            int[] progression = new int[progressionLength];
            for (int j = 0; j < progressionLength; j++) {
                progression[j] = start + j * step;
            }

            int hiddenElementPosition = random.nextInt(progressionLength);
            String[] progressionString = new String[progressionLength];
            for (int j = 0; j < progressionLength; j++) {
                if (j == hiddenElementPosition) {
                    progressionString[j] = "..";
                } else {
                    progressionString[j] = Integer.toString(progression[j]);
                }
            }
            qAndA.put(String.join(" ", progressionString), String.valueOf(progression[hiddenElementPosition]));
        }
        Engine.playGame(userName, "What number is missing in the progression?", qAndA);
    }
}
