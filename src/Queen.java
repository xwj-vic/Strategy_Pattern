/**
 * Created by xuweijie on 2016/10/22.
 */
public class Queen extends Character {
    private String name;

    public Queen(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("------> 我是皇后:"+name);
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }


}
