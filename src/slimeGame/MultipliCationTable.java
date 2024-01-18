package slimeGame;

import static javax.swing.JOptionPane.*;

public class MultipliCationTable {

    public static void main(String[] args) {

        try {    /// 에러가 날 가능성이 있는 코드면 try 안에


            int iDan;
            String sDan = showInputDialog("출력할 단");
            iDan = Integer.valueOf(sDan); // 스트링의 값이 들어있어 정수로 변환

            if (sDan != null) {
                iDan = Integer.valueOf(sDan);


                for (int i = 1; i <= 9; i++) {
                    System.out.println(iDan * i);

                }

            }

        } catch (Exception e) { // exception 에러낫을때 수행할 코드
                                // "예외"라는 뜻 , e 는 에러를 담고있는 변수
                                // e 대신 메세지 넣어도됨
            showInputDialog(null, "정수를입력하세요");


        }


     }
}
