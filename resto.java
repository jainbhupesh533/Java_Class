import static java.lang.System.*;
import java.util.*;

class Restaurant {
    static Hashtable<String, Integer> cart = new Hashtable<String, Integer>();
    static List<Integer> quantities = new ArrayList<Integer>();
    int dish_type, type, dish_no, item_no, another_ord, quantity, total_item, total_price;

    static String Resto_name = "ChopaChops";

    void dish_config() {
        out.println("\t\t\t\t Welcome to the" + Resto_name + "Restaurant ");
        out.println("\t\t Sorry, for not having non-veg menu due to some reasons but we have a lot in veg menu");
        out.println("\t\t Hope U will enjoy!!!");

        Scanner obj = new Scanner(System.in);
        out.println("\nChoose the type of dish: ");
        out.println("Enter 1 for Healthy Meals \nEnter 2 for regular meals");
        dish_type = obj.nextInt();

        type = (dish_type == 2) ? main_dish() : healthy_dish();
    }

    int main_dish() {
        Hashtable<String, List<String>> main_dish_type = new Hashtable<String, List<String>>();
        List<String> all_time_favorite = Arrays.asList("Cheese French Fries", "Cheese Garlic Bread",
                "Chilli Cheese Toast", "Chilli Garlic Toast", "Cheese Garlic Bread");
        List<String> sandwich = Arrays.asList("Plain Sandwich", "Grill Sandwich", "Club Sandwich");
        List<String> main_course = Arrays.asList("Mix. Veg.in garlic", "Veg Chopsouey sauce", "Shreded Potatoes",
                "Manchurian Gravy", "Sweet & Sour Veg", "Chilly Paneer Gravy");
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
        int index = 1;
        for (Map.Entry<String, List<String>> mapEntry : main_dish_type.entrySet()) {
            out.println(index++ + "\t" + mapEntry.getKey());
        }
        Scanner obj1 = new Scanner(System.in);
        dish_no = obj1.nextInt();
        out.println("Item \t\t\t Price");
        int j = 1;
        switch (dish_no) {
        case 1:
            for (int i = 0; i <= main_course.size() - 1; i++) {
                out.println(j + "\t" + main_course.get(i) + "\t" + main_course_pr.get(i));
                j++;
            }
            break;
        case 2:
            for (int i = 0; i <= sandwich.size() - 1; i++) {
                out.println(j + "\t" + sandwich.get(i) + "\t\t\t" + sandwich_pr.get(i));
                j++;
            }
            break;
        case 3:
            for (int i = 0; i <= all_time_favorite.size() - 1; i++) {
                out.println(j + "\t" + all_time_favorite.get(i) + "\t" + all_time_favorite_pr.get(i));
                j++;
            }
            break;
        default:
            break;
        }
        out.println("Please Choose Your Food by pressing item no: ");
        item_no = obj1.nextInt();
        out.println("Enter Quantity: ");
        quantity = obj1.nextInt();
        if (dish_no == 1) {
            cart.put(main_course.get(item_no - 1), (main_course_pr.get(item_no - 1) * quantity));
            quantities.add(quantity);
        } else if (dish_no == 2) {
            cart.put(sandwich.get(item_no - 1), (sandwich_pr.get(item_no - 1) * quantity));
            quantities.add(quantity);
        } else if (dish_no == 3) {
            cart.put(all_time_favorite.get(item_no - 1), (all_time_favorite_pr.get(item_no - 1) * quantity));
            quantities.add(quantity);
        } else {
            out.println("Press 1 for this menu");
            out.println("Press 2 for this healthy menu like salad");
            out.println("Press 3 for Checkout");
            another_ord = obj1.nextInt();
            type = (another_ord == 1) ? main_dish() : (another_ord == 2) ? healthy_dish() : final_out();
        }
        out.println("\nSelected item: ");
        out.println("Item \t\t\t Quantity \t\t\t Price");
        int q = 0;
        for (Map.Entry<String, Integer> m : cart.entrySet()) {
            out.println(m.getKey() + "\t\t\t" + quantities.get(q++) + "\t\t\t" + m.getValue());
        }

        out.println("\nWould You like to Anything more: ");
        out.println("Press 1 for this menu");
        out.println("Press 2 for this healthy menu like salad");
        out.println("Press 3 for Checkout");
        another_ord = obj1.nextInt();
        type = (another_ord == 1) ? main_dish() : (another_ord == 2) ? healthy_dish() : final_out();
        return 0;
    }

    int healthy_dish() {

        return 1;
    }

    int final_out() {
        out.println("\nItem \t\t\t Quantity \t\t\t Price");
        int k = 0;
        for (Map.Entry<String, Integer> m : cart.entrySet()) {
            out.println(m.getKey() + "\t\t\t" + quantities.get(k++) + "\t\t\t" + m.getValue());
            total_price = total_price + m.getValue();
            total_item = total_item + 1;
        }
        out.println("\nTotal Item:" + total_item + " " + "\nTotal Price: " + total_price);
        return 2;
    }

    public static void main(String[] args) {
        Restaurant r1 = new Restaurant();
        r1.dish_config();
        cart.clear();
        out.println(
                "\n\t\t\tThank You! Visit us again. Sorry,we are trying to serve at the best price as much as possible.");

    }
}
