package logic;

/**
 * Created by Miry on 23/02/14.
 */
public class Ineffective {

    public static String[] bug = new String[] {
            "steel",
            "ghost",
            "fire",
            "fight",
            "poison",
            "flying"
    };

    public static String[] dark = new String[] {
            "fight",
            "steel",
            "dark"
    };

    public static String[] dragon = new String[] {
            "steel"
    };

    public static String[] electric = new String[] {
            "dragon",
            "electric",
            "grass"
    };

    public static String[] fairy = new String[] {
            "fire",
            "poison",
            "steel"
    };

    public static String[] fight = new String[] {
            "bug",
            "psych",
            "poison",
            "flying"
    };

    public static String[] fire = new String[] {
            "water",
            "dragon",
            "fire",
            "rock"
    };

    public static String[] flying = new String[] {
            "steel",
            "electric",
            "rock"
    };

    public static String[] ghost = new String[] {
            "steel",
            "dark",
    };

    public static String[] grass = new String[] {
            "steel",
            "bug",
            "dragon",
            "fire",
            "grass",
            "poison",
            "flying"
    };

    public static String[] ice = new String[] {
            "ice",
            "fire",
            "water",
            "steel"
    };

    public static String[] ground = new String[] {
            "bug",
            "grass"
    };

    public static String[] normal = new String[] {
            "steel",
            "rock"
    };

    public static String[] poison = new String[] {
            "ghost",
            "rock",
            "poison",
            "ground"
    };

    public static String[] psych = new String[] {
            "steel",
            "psych"
    };

    public static String[] steel = new String[] {
            "steel",
            "water",
            "electric",
            "fire"
    };

    public static String[] rock = new String[] {
            "ground",
            "steel",
            "fight"
    };

    public static String[] water = new String[] {
            "water",
            "dragon",
            "grass"
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
