package sushestva;

public class kot implements sushestva {

    int vysotaprizhka = 1;

    public int getVysotaprizhka(int i) {

        return vysotaprizhka;
    }

    public void setVysotaprizhka(int vysotaprizhka) {

        this.vysotaprizhka = vysotaprizhka;
    }


    public void dojump() {
        System.out.println("Кот прыгнул");
    }
    public void dojump(int x) {
        System.out.println("Кот прыгнул" + x);
    }


    public void dorun() {
        System.out.println("Кот побежал");
    }


    public kot() {

    }
}
