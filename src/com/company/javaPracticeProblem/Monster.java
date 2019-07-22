package com.company.javaPracticeProblem;

class MonsterTest {
    boolean frighter(int degree) {
        System.out.println(" aggree");
        return true;
    }
}

class Vampire extends MonsterTest {
    boolean frighter(int d) {
        System.out.println(" a bite");
        return false;
    }

}

class Dragon extends MonsterTest {
    boolean frighter(int degree) {
        System.out.println(" breath fire");
        return false;
    }

}
public class Monster{
    public static void main(String[] args) {
        MonsterTest [] ma=new MonsterTest[3];
        ma[0] = new Vampire();
        ma[1]=new Dragon();
        ma[2]=new MonsterTest();
        for (int i = 0; i < 3; i++) {
            ma[i].frighter(i);
        }
    }
}