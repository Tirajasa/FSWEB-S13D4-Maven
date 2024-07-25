package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Point emrah =new Point(5,5);
        Point pointI =new Point(10,9);
        System.out.println(emrah.distance(pointI));

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("+++++++++++++++++");


        Weapon weapon1=Weapon.SWORD;
        System.out.println(weapon1);
        System.out.println(Weapon.SWORD.getDamage());

        Weapon weapon2=Weapon.BLADE;
        System.out.println(weapon2);
        System.out.println(Weapon.BLADE.getAttackSpeed());

        Weapon weapon3=Weapon.MACE;
        System.out.println(weapon3);
        System.out.println(Weapon.MACE.getAttackSpeed());

        Weapon weapon4=Weapon.AXE;
        System.out.println(weapon4);
        System.out.println(Weapon.AXE.getDamage());

        Player player1=new Player("Ekin",100,Weapon.AXE);
        System.out.println(player1.healthRemaining());

        Player player2=new Player("Emrah",90,Weapon.MACE);
        System.out.println(player2.restoreHealth(5));

        Player player3=new Player("Yigit",20,Weapon.BLADE);
        System.out.println(player3.loseHealth(19));

        player1.loseHealth((int) (player3.getWeapon().getDamage()*player3.getWeapon().getAttackSpeed()));
        System.out.println("After damage: "+ player1.healthRemaining());

        player1.restoreHealth(30);
        player1.restoreHealth(30);
        System.out.println("After restoration: " + player1.healthRemaining());

    }
}