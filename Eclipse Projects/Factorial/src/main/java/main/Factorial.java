package main;

public class Factorial {   

    public String run(int num) {
        double currentResultant;
        double prevResultant = num;
        String result = "NONE";

        for (int i = 2; i <= (num / 2); i++) {

            currentResultant = prevResultant / i;

            System.out.println(prevResultant + " / " + i + " = " + currentResultant);
            if (currentResultant == 1) {
                result = Integer.toString(i) + "!";
                break;
            } 
            else if (Math.floor(currentResultant) != currentResultant) {
                break;
            }
            prevResultant = currentResultant;
        }
        return result;
    }
}