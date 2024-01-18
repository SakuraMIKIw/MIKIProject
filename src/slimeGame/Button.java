package slimeGame;

import javax.swing.*;
import java.awt.*;

public class Button {

    public static void main(String[] args) {

        javax.swing.UIManager.put("Button.font" ,    //UI 관련 속성을 설정하기 위해 UIManager를 사용
        new java.awt.Font("굴림", Font.PLAIN, 14)); //버튼의 폰트를 "굴림" 폰트로 설정하고 크기를 14로 지정

        JFrame frm = new JFrame("블루슬라임 퇴치하기"); //프레임 객체 생성
        FlowLayout layout = new FlowLayout(); // 레이아웃 객체 생성

        frm.setLayout(layout);

        JButton btn1 = new JButton("블루슬라임1");
        JButton btn2 = new JButton("블루슬라임2");

        frm.add(btn1);
        frm.add(btn2);   //프레임에 버튼추가

        frm.setSize(250, 100); // 프레임 크기 설정
        frm.setResizable(false); // 프레임 크기조정 못하게
        frm.setVisible(true); // 프레임이 보이도록 설정
        frm.setLocationRelativeTo(null); // 프레임을 화면 가운대로
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임을 닫았을때 메모리에서 제거
    }
}
