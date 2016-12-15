/**
 * Created by xuweijie on 2016/10/22.
 */
public class King extends Character {

    private String name;

    public King(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("------> 我是国王:"+name);
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }


}
