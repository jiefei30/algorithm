package interview.daying;

import acm.day0516.S;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Wangmingcan
 * @date 2021/11/24 16:43
 * @description
 *
 * 54张牌分别以数字1~54代表，53为小王，54为大王，1~52为52张基础牌
 * 如果数值为1~52，对其取模13，余数为0~12，其中1~10代表牌1~10，11代表J，12代表Q，0代表13
 * 如果数值为1~52，减一后对其除以13，0为红桃，1为梅花，2为方块，3为黑桃
 */
public class A {

    public static void main(String[] args) {
        new doudizhu().washCard();
    }

    static class doudizhu {
        private int[] card = new int[54];
        private List<Integer> playerA = new ArrayList<>();
        private List<Integer> playerB = new ArrayList<>();
        private List<Integer> playerC = new ArrayList<>();

        private void initCard() {
            playerA.clear();
            playerB.clear();
            playerC.clear();
            washCard();
        }

        //洗牌策略
        public void washCard() {
            for (int i = 0; i < 54; i++) {
                card[i] = i+1;
            }
            for (int i = 53; i > 0; i--) {
                int rand = new Random().nextInt(i+1);
                int temp = card[i];
                card[i] = card[rand];
                card[rand] = temp;
            }
            for (int i = 0; i < 54; i++) {
                System.out.print(card[i] + " ");
            }
        }

        private void start() {
            List<Integer> list = new ArrayList<>();
            Collections.synchronizedList(list);

        }
    }

}
