package item05ClassAsMember;

//游戏中的武器
public class Weapon {

    private String code; //武器代号

    public Weapon() {
    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
