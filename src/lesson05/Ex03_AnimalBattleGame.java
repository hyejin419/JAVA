package lesson05;

import java.util.Scanner;

abstract class Animal {
    String name;
    int maxHp;
    int hp;
    int power;
    int maxSkillCount;
    int skillCount;

    public Animal(String name, int maxHp, int power, int maxSkillCount) {
        this.name = name;
        this.maxHp = maxHp;
        this.power = power;
        this.maxSkillCount = maxSkillCount;
        this.hp = maxHp;
        this.skillCount = maxSkillCount;

    }
    abstract void attack();
    abstract void attackpower();
    abstract String getSkillName();
    abstract void useSkill(Animal enemy);

    boolean isAlive() {
        return hp > 0;
    }

    boolean canUseSkill() {
        return skillCount > 0;
    }

    void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }  //데미지를 현재 체력에서 차감.

    void printStatus() {
        System.out.println(name + " 체력: " + hp + "/" + maxHp + " | 스킬 남은 횟수: " + skillCount + "/" + maxSkillCount);
    }  //현재 남은 체력을 출력
}




public class Ex03_AnimalBattleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
