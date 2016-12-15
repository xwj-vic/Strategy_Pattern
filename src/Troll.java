/**
 * Created by xuweijie on 2016/10/22.
 */
public class Troll extends Character {
    private String name;

    public Troll(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("------> 我是妖怪:"+name);
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }


}
