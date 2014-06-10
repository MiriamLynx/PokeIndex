package logic;

/**
 * Created by Miry on 23/02/14.
 */
public class DoNotAffect {

    public static String[] bug = new String[] {

    };

    public static String[] dark = new String[] {

    };

    public static String[] dragon = new String[] {
            "fairy"
    };

    public static String[] electric = new String[] {
            "ground"
    };

    public static String[] fairy = new String[] {

    };

    public static String[] fight = new String[] {
            "ghost"
    };

    public static String[] fire = new String[] {

    };

    public static String[] flying = new String[] {

    };

    public static String[] ghost = new String[] {
            "normal"
    };

    public static String[] grass = new String[] {

    };

    public static String[] ice = new String[] {

    };

    public static String[] ground = new String[] {
            "flying"
    };

    public static String[] normal = new String[] {
            "ghost"
    };

    public static String[] poison = new String[] {
            "steel"
    };

    public static String[] psych = new String[] {
            "dark"
    };

    public static String[] steel = new String[] {

    };

    public static String[] rock = new String[] {

    };

    public static String[] water = new String[] {

    };

    public static String[] getArray(String type){
        if(type.equals("bug")){
            return bug;
        }else if(type.equals("dark")){
            return dark;
        }else if(type.equals("dragontt")){
            return dragon;
        } else if(type.equals("electric")){
            return electric;
        }else if(type.equals("fairy")){
            return fairy;
        }else if(type.equals("fight")){
            return fight;
        }else if(type.equals("fire")){
            return fire;
        }else if(type.equals("flying")){
            return flying;
        }else if(type.equals("ghost")){
            return ghost;
        }else if(type.equals("grass")){
            return grass;
        }else if(type.equals("ground")){
            return ground;
        }else if(type.equals("ice")){
            return ice;
        }else if(type.equals("poison")){
            return poison;
        }else if(type.equals("psych")){
            return psych;
        }else if(type.equals("steel")){
            return steel;
        }else if(type.equals("rock")){
            return rock;
        }else if(type.equals("normal")){
            return normal;
        }else if(type.equals("water")){
            return water;
        }
        return null;
    }
}
