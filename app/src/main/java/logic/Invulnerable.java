package logic;

/**
 * Created by Miry on 24/02/14.
 */
public class Invulnerable {

    public static String[] bug = new String[] {

    };

    public static String[] dark = new String[] {
            "psych"
    };

    public static String[] dragon = new String[] {

    };

    public static String[] electric = new String[] {

    };

    public static String[] fairy = new String[] {
            "dragon"
    };

    public static String[] fight = new String[] {

    };

    public static String[] fire = new String[] {

    };

    public static String[] flying = new String[] {
            "ground"
    };

    public static String[] ghost = new String[] {
            "poison",
            "bug",
    };

    public static String[] grass = new String[] {
            "normal",
            "fight"
    };

    public static String[] ice = new String[] {

    };

    public static String[] ground = new String[] {
            "electric"
    };

    public static String[] normal = new String[] {
            "ghost"
    };

    public static String[] poison = new String[] {

    };

    public static String[] psych = new String[] {

    };

    public static String[] steel = new String[] {
            "poison"
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
        }else if(type.equals("dragon")){
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
