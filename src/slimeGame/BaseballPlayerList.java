package slimeGame;

import static javax.swing.JOptionPane.*;
public class BaseballPlayerList {

    public static void main(String[] args) {

        try {
            for (int h = 1; h <= 9; h++) {
                String taja = showInputDialog(h + "번 타자의 이름");
                if (taja == null) {

                    break;
                }

                showMessageDialog(null, taja + "을 입력했습니다.");
                System.out.println(h + taja);
            }

            showMessageDialog(null, "감사합니다");

        } catch (Exception e) {
            showMessageDialog(null, e);


        }


    }
}
