package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private final static int METHODS = 5;

    Random random = new Random();

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public Kotik() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(int ccal) {
        System.out.println("Котик ест");
        satiety = satiety + ccal;
    }

    public void eat(int ccal, String food) {
        System.out.println("Котик ест " + food);
        satiety = satiety + ccal;
    }

    public void eat() {
        eat(1, "icecream");
    }

    public boolean play() {
        String deal = "играет";
        return checkSatiety(deal);
    }

    public boolean sleep() {
        String deal = "спит";
        return checkSatiety(deal);
    }

    public boolean wash() {
        String deal = "умывается";
        return checkSatiety(deal);
    }

    public boolean walk() {
        String deal = "гуляет";
        return checkSatiety(deal);
    }

    public boolean hunt() {
        String deal = "охотится";
        return checkSatiety(deal);
    }

    private boolean checkSatiety(String deal) {
        if (satiety > 0) {
            System.out.println("Котик " + deal);
            satiety--;
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public String [] liveAnotherDay() {
        List<String> day = new ArrayList<>();

        for (int i = 0; i <= 23; i++) {

            switch (random.nextInt(METHODS)) {
                case (0):
                    day.add(i + " - играл");
                    if (!play()) {
                        eat();
                    }
                    break;
                case (1):
                    day.add(i + " - спал");
                    if (!sleep()) {
                        eat();
                    }
                    break;
                case (2):
                    day.add(i + " - умывался");
                    if (!wash()) {
                        eat();
                    }
                    break;
                case (3):
                    day.add(i + " - гулял");
                    if (!walk()) {
                        eat();
                    }
                    break;
                case (4):
                    day.add(i + " - охотился");
                    if (!hunt()) {
                        eat();
                    }
                    break;
            }
        }
        return day.stream().toArray(String[]::new);
    }
}