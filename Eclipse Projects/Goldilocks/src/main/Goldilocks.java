package main;

import java.util.Scanner;

public class Goldilocks {

    public static void main(String[] args) {
        Goldilocks gold = new Goldilocks();
        Table table = gold.createChairs();
        table.listChairs();
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getIdealTemp() {
        return idealTemp;
    }

    public void setIdealTemp(int idealTemp) {
        this.idealTemp = idealTemp;
    }

    private int idealTemp;

    Scanner sc = new Scanner(System.in);

    public Goldilocks() {
        getPreferences();
    }

    public void getPreferences() {
        System.out.print("Enter Goldilocks weight and ideal porridge temperature separated by a space: ");
        String input = sc.nextLine();    // get the entire line after the prompt
        String[] prefs = input.split(" "); // split by spaces
        setPreferences(Integer.parseInt(prefs[0]), Integer.parseInt(prefs[1]));
    }

    public void setPreferences(int weight, int idealTemp) {
        this.weight = weight;
        this.idealTemp = idealTemp;
    }

    public Table createChairs() {
        Table table = new Table();
        System.out.println("Enter the weight and porridge temp of a chair separated by a space (keep entering as many as you want, entering \"No\" when you want to stop): ");
        while(true){
            String input = sc.nextLine();    // get the entire line after the prompt
            String[] chairDetails = input.split(" "); // split by spaces
            if(input.equals("No") || input.equals("no") || input.equals("n") || input.equals("N")) {
                break;
            }
            table.addChair(new Chair(Integer.parseInt(chairDetails[0]), Integer.parseInt(chairDetails[1])));
        }
        return table;
    }

    public String bestChairs() {

        return "";
    }
}