
import animals.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Kotik1", "PSHS", 10, 5);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Kotik2");
        kotik2.setSatiety(25);
        kotik2.setVoice("Miy");
        kotik2.setWeight(12);

        for (String deal : kotik1.liveAnotherDay()) {
            System.out.println(deal);
        }

        System.out.println("Имя: " + kotik1.getName() + "\n" + "Вес: " + kotik1.getWeight());
        System.out.println("Сравнение voice: " + compareVoice(kotik1, kotik2));
        System.out.println("Количество котиков: " + Kotik.getCount());
    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }
}