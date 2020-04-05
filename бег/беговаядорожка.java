package бег;

public class беговаядорожка extends препятствие {
    int длина = 10;
    public void бежать(int x) {
        if (x > длина) {
            System.out.println("Пробежал");
        }
        else {
            System.out.println("НЕ Пробежал");
        }
    }

    @Override
    public void прыгать(int vysotaprizhka) {

    }
}
