/**
 * Created by xuweijie on 2016/10/22.
 */
public class Knight extends Character {

    private String name;

    public Knight(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("------> 我是骑士:"+name);
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }


}
