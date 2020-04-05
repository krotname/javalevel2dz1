package sushestva;


public class chelovek implements sushestva {


    public void dojump() {
        System.out.println("Человек прыгнул");
    }


    public void dorun() {
        System.out.println("Человек пошёл");
    }

    public chelovek() {
    }

    int vysotaprizhka = 1;

    public int getVysotaprizhka(int i) {

        return vysotaprizhka;
    }

    public void setVysotaprizhka(int vysotaprizhka) {

        this.vysotaprizhka = vysotaprizhka;
    }

}
