package sushestva;

public interface sushestva {
    default void dorun() {
        System.out.println("* прыгнул");
    }

    default void dojump() {
        System.out.println("* прыгнул");
    }

    int getVysotaprizhka(int i);

    void setVysotaprizhka(int i);

}

