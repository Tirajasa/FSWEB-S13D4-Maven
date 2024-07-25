package org.example;

public enum Weapon {
BLADE(1,10),
     SWORD(5,5),
     AXE(10,4),
     MACE(20,1);

    private int damage;
   private double attackSpeed;


     Weapon(int damage,double attackSpeed){
    this.damage=damage;
    this.attackSpeed=attackSpeed;

    }
    public int getDamage(){
        return damage;
    }
    public double getAttackSpeed(){
        return attackSpeed;
    }

    public static Weapon getSWORD() {
         return SWORD;
    }
    public static Weapon getMace(){
         return MACE;
    }
    public static Weapon getAxe(){
         return AXE;
    }
    public static Weapon getBlade(){
        return BLADE;
    }

}
