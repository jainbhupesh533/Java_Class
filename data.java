/*import static java.lang.System.*;
import java.util.*;
import java.util.Map.Entry;


class Restaurant {

    int opt_dish_price[] = {};
    int main_dish_price[] = {};
    int dish_type;
    int type;
    static String Resto_name = "ChopaChops";

    void dish_config() {
        out.println("\t\t\t\t Welcome to the" + Resto_name + "Restaurant ");
        out.println("\t\t Sorry, for not having non-veg menu due to some reasons but we have a lot in veg menu");
        out.println("\t\t Hope U will enjoy!!!");

        Scanner obj = new Scanner(System.in);
        try {
            out.println("Choose the type of dish: ");
            out.println("Enter 1 for Healthy Meals \nEnter 2 for regular meals");
            dish_type = obj.nextInt();
        } finally {
            obj.close();
        }
        type = (dish_type == 2) ? main_dish() : healthy_dish();
    }

    int main_dish() {
        Hashtable<String, String> main_dish_type = new Hashtable<String, String>();
        {
            main_dish_type.put("1", "all_time_favorite");
            main_dish_type.put("2", "Sandwich");
            main_dish_type.put("3", "main_course");
        }

        Hashtable<String,Integer>  all_time_favorite =new Hashtable<String, Integer>();
             /* List<String> all_time_favorite = Arrays.asList("French Fries", "Chilli Cheese Toast",
                "Chilli Cheese Gralic Toast", "Garlic Bread", "Garlic Bread with Cheese");
        List<String> Sandwich = Arrays.asList("Plain Sandwich", "Grilled Sandwich", "Club Sandwich");
        List<String> main_course = Arrays.asList("Veg Chopsouey", "Chilly Paneer Gravy", "Manchurian Gravy",
                "Sweet & Sour Veg", "Mix. Veg. in Hot Garlic Sauce", "Shreded Potatoes in Hot Garlic");*/

    /*    List<Integer> all_time_favorite_pr = Arrays.asList(106, 115, 98, 119);
        List<Integer> sandwich_pr = Arrays.asList(175, 175, 175);
        List<Integer> main_course_pr = Arrays.asList(195, 205, 175, 175, 185);

        int dish_no;
        out.println("Welcome to the main Course!!");
        out.println("Choose the type by entering its number: ");
        out.println("dish_no\tMain_Course");
        for(Entry<String, String> m : main_dish_type.entrySet()){

            out.println(m.getKey()+m.getValue());
        }
        Scanner obj = new Scanner(System.in);
        try {
            dish_no = obj.nextInt();
            switch (dish_no) {
            case 1:

                break;

            default:
                break;
            }
        } finally {
            obj.close();
        }
        return 0;
    }

    int healthy_dish() {
        out.println("hey");
        return 1;
    }

    public static void main(String[] args) {
        Restaurant r1 = new Restaurant();
        r1.dish_config();
    }
}
*/