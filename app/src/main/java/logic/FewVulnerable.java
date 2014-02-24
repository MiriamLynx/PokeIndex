package logic;

/**
 * Created by Miry on 24/02/14.
 */
public class FewVulnerable {
    public static String[] bug = new String[] {
            "fight",
            "grass",
            "ground"
    };

    public static String[] dark = new String[] {
            "dark",
            "ghost"
    };

    public static String[] dragon = new String[] {
            "fire",
            "water",
            "grass",
            "electric"
    };

    public static String[] electric = new String[] {
            "steel",
            "flying",
            "electric"
    };

    public static String[] fairy = new String[] {
            "bug",
            "fight",
            "dark"
    };

    public static String[] fight = new String[] {
            "dark",
            "bug",
            "rock"
    };

    public static String[] fire = new String[] {
            "bug",
            "steel",
            "fire",
            "ice",
            "fairy"
    };

    public static String[] flying = new String[] {
            "grass",
            "bug",
            "fight"
    };

    public static String[] ghost = new String[] {
            "poison",
            "bug",
    };

    public static String[] grass = new String[] {
            "water",
            "ground",
            "grass",
            "electric"
    };

    public static String[] ice = new String[] {
            "ice"
    };

    public static String[] ground = new String[] {
            "poison",
            "rock"
    };

    public static String[] normal = new String[] {

    };

    public static String[] poison = new String[] {
            "fight",
            "poison",
            "bug",
            "grass",
            "fairy"
    };

    public static String[] psych = new String[] {
            "fight",
            "psych"
    };

    public static String[] steel = new String[] {
            "normal",
            "flying",
            "rock",
            "bug",
            "steel",
            "grass",
            "psych",
            "ice",
            "dragon",
            "fairy"
    };

    public static String[] rock = new String[] {
            "normal",
            "flying",
            "poison",
            "fire"
    };

    public static String[] water = new String[] {
            "fire",
            "steel",
            "water",
            "ice"
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
