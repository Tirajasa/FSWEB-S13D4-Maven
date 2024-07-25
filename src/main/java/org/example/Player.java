package org.example;

public class Player {
   private String name;
   private int healthPercentage;
   private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage =healthPercentage;
        this.weapon=weapon;
        checkAndSetPercentage(this.healthPercentage);

    }
    public Weapon getWeapon(){
        return this.weapon;
    }
    private void checkAndSetPercentage(int healthPercentage){
        if(this.healthPercentage>100){
            this.healthPercentage=100;
        }else if(healthPercentage<0){
            System.out.println(name + " player has been knocked out of game");
            this.healthPercentage=0;
        }else{
            this.healthPercentage=healthPercentage;
        }
    }
    public int healthRemaining(){
        return this.healthPercentage;
    }
    public  int loseHealth(int damage){
        int lost =this.healthPercentage-damage;
        this.healthPercentage=lost;
        checkAndSetPercentage(this.healthPercentage);

        return lost;
    }
   public int restoreHealth(int healthPotion){
        int gained=this.healthPercentage+healthPotion;
       this.healthPercentage=gained;
       checkAndSetPercentage(this.healthPercentage);

        return gained;
   }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
