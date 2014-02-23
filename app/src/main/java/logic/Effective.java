package logic;

/**
 * Created by Miry on 23/02/14.
 */
public class Effective {


    public static String[] bug = new String[] {
            "psych",
            "grass",
            "dark"
    };

    public static String[] dark = new String[] {
            "psych",
            "ghost"
    };

    public static String[] dragon = new String[] {
            "dragon"
    };

    public static String[] electric = new String[] {
            "water",
            "flying"
    };

    public static String[] fairy = new String[] {
            "dragon",
            "fight",
            "dark"
    };

    public static String[] fight = new String[] {
            "steel",
            "ice",
            "rock",
            "normal",
            "dark"
    };

    public static String[] fire = new String[] {
            "ice",
            "steel",
            "bug",
            "grass"
    };

    public static String[] flying = new String[] {
            "grass",
            "bug",
            "fight"
    };

    public static String[] ghost = new String[] {
            "ghost",
            "psych",
    };

    public static String[] grass = new String[] {
            "water",
            "ground",
            "rock"
    };

    public static String[] ice = new String[] {
            "dragon",
            "grass",
            "ground",
            "flying"
    };

    public static String[] ground = new String[] {
            "steel",
            "fire",
            "rock",
            "electric",
            "poison"
    };

    public static String[] normal = new String[] {

    };

    public static String[] poison = new String[] {
            "fairy",
            "grass"
    };

    public static String[] psych = new String[] {
            "fight",
            "poison"
    };

    public static String[] steel = new String[] {
            "rock",
            "ice",
            "fairy"
    };

    public static String[] rock = new String[] {
            "flying",
            "bug",
            "fire",
            "ice"
    };

    public static String[] water = new String[] {
            "fire",
            "ground",
            "rock"
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
