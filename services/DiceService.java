package services;

import java.util.Random;

// As it can be seen that this class is just for providing dice rolling functionality.
// This class function is static so memory will be assigned to it once ,and roll() can be called without creating an object of it.
public class DiceService {
    public static int roll() {
        return new Random().nextInt(6) + 1; 
    }
}
