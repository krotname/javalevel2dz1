package бег;

public class cтенка extends препятствие {
    int высота = 10;
    public void прыгать(int x) {
        if (x > высота) {
            System.out.println("Прыгнул");
        }
        else {
            System.out.println("НЕ Прыгнул");
        }
    }
}
