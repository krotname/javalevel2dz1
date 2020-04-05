import sushestva.sushestva;
import sushestva.robot;
import sushestva.chelovek;
import sushestva.kot;
import бег.cтенка;
import бег.полосапрепятствий;
import бег.препятствие;


public class Main {
        public static void main(String[] args) {

            sushestva[] an = new sushestva[4];
            an[0] = new kot();
            an[1] = new chelovek();
            an[2] = new kot();
            an[3] = new chelovek();

            an[1].setVysotaprizhka(15);


            cтенка cтенка1 = new cтенка();
            cтенка1.прыгать(11);
            sushestva R2D2 = new robot();
            R2D2.dorun();
            sushestva Ivan = new chelovek();
            Ivan.dojump();

            препятствие[] массив_препятствий = new cтенка[2];
            массив_препятствий[0] = new cтенка();
            массив_препятствий[1] = new cтенка();
            // массив_препятствий[1] = new беговаядорожка();

            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 2; j++) {
                    массив_препятствий[j].прыгать(an[i].getVysotaprizhka(i));
                }
            }
        }



}



