package sushestva;

public class robot implements sushestva {

    public void dojump() {
        System.out.println("Робот прыгнул");
    }
    @Override
    public void dorun() {
        System.out.println("Робот пошёл");
    }
    public robot() {
    }
    int vysotaprizhka = 1;

    public int getVysotaprizhka(int i) {

        return vysotaprizhka;
    }

    public void setVysotaprizhka(int vysotaprizhka) {

        this.vysotaprizhka = vysotaprizhka;
    }
}
