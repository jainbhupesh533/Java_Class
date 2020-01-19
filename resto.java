import static java.lang.System.*;
import java.util.*;

class Restaurant {

    int opt_dish_price[] = {};
    int main_dish_price[] = {};
    int dish_type;
    int type;
    int dish_no;
    static String Resto_name = "ChopaChops";

    void dish_config() {
        out.println("\t\t\t\t Welcome to the" + Resto_name + "Restaurant ");
        out.println("\t\t Sorry, for not having non-veg menu due to some reasons but we have a lot in veg menu");
        out.println("\t\t Hope U will enjoy!!!");

        Scanner obj = new Scanner(System.in);
        out.println("Choose the type of dish: ");
        out.println("Enter 1 for Healthy Meals \nEnter 2 for regular meals");
        dish_type = obj.nextInt();

        type = (dish_type == 2) ? main_dish() : healthy_dish();
    }

    int main_dish() {
        Hashtable<String, List<String>> main_dish_type = new Hashtable<String, List<String>>();
        List<String> all_time_favorite = Arrays.asList("French Fries", "Chilli Cheese Toast",
                "Chilli Cheese Gralic Toast", "Garlic Bread", "Garlic Bread with Cheese");
        List<String> sandwich = Arrays.asList("Plain Sandwich", "Grilled Sandwich", "Club Sandwich");
        List<String> main_course = Arrays.asList("Veg Chopsouey", "Chilly Paneer Gravy", "Manchurian Gravy",
                "Sweet & Sour Veg", "Mix. Veg. in Hot Garlic Sauce", "Shreded Potatoes in Hot Garlic");
        {
            main_dish_type.put("All Time Favorite", all_time_favorite);
            main_dish_type.put("Sandwich", sandwich);
            main_dish_type.put("main menu", main_course);
        }
        List<Integer> all_time_favorite_pr = Arrays.asList(106, 115, 115, 98, 119);
        List<Integer> sandwich_pr = Arrays.asList(175, 175, 175);
        List<Integer> main_course_pr = Arrays.asList(195, 205, 175, 175, 185, 120);
        out.println("Welcome to the main Course!!");
        out.println("Choose the type by entering its number: ");
        out.println("dish_no\tMain_Course");
        String[] keys = new String[main_dish_type.size()];
        int index = 0;
        for (Map.Entry<String, List<String>> mapEntry : main_dish_type.entrySet()) {
            keys[index] = mapEntry.getKey();
            index++;
        }
        for (int i = 0; i < keys.length; i++) {
            out.println((i + 1) + "\t" + keys[i]);
        }
        Scanner obj1 = new Scanner(System.in);
        dish_no = obj1.nextInt();
        out.println("Item \t\t Price");
        switch (dish_no) {
        case 1:
            for (int i = 0; i <= main_course.size(); i++) {
                out.println(main_course.get(i) + "\t" + main_course_pr.get(i));
            }
            break;
        case 2:
            for (int i = 0; i <= sandwich.size(); i++) {
                out.println(sandwich.get(i) + "\t" + sandwich_pr.get(i));
            }
            break;
        case 3:
            for (int i = 1; i < all_time_favorite_pr.size() + 1; i++) {
                out.println(all_time_favorite.get(i) + "\t" + all_time_favorite_pr.get(i));
            }
            break;
        default:
            break;
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
