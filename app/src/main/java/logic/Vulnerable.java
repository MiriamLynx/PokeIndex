package logic;

/**
 * Created by Miry on 24/02/14.
 */
public class Vulnerable {

    public static String[] bug = new String[] {
            "flying",
            "fire",
            "rock"
    };

    public static String[] dark = new String[] {
            "fight",
            "bug",
            "fairy"
    };

    public static String[] dragon = new String[] {
            "dragon",
            "ice",
            "fairy"
    };

    public static String[] electric = new String[] {
            "ground"
    };

    public static String[] fairy = new String[] {
            "poison",
            "steel"
    };

    public static String[] fight = new String[] {
            "flying",
            "psych",
            "fairy"
    };

    public static String[] fire = new String[] {
            "ground",
            "rock",
            "water"
    };

    public static String[] flying = new String[] {
            "rock",
            "ice",
            "electric"
    };

    public static String[] ghost = new String[] {
            "ghost",
            "dark",
    };

    public static String[] grass = new String[] {
            "flying",
            "poison",
            "bug",
            "fire",
            "ice"
    };

    public static String[] ice = new String[] {
            "fight",
            "rock",
            "steel",
            "fire"
    };

    public static String[] ground = new String[] {
            "water",
            "grass",
            "ice"
    };

    public static String[] normal = new String[] {
            "fight"
    };

    public static String[] poison = new String[] {
            "ground",
            "psych"
    };

    public static String[] psych = new String[] {
            "fight",
            "poison"
    };

    public static String[] steel = new String[] {
            "bug",
            "ghost",
            "dark"
    };

    public static String[] rock = new String[] {
            "fight",
            "ground",
            "steel",
            "water",
            "grass"
    };

    public static String[] water = new String[] {
            "grass",
            "electric"
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
