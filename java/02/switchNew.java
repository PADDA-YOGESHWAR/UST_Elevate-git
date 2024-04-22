public class switchNew {
    public static void main(String[] args)
    {
        String day = "Sundayf";
        switch(day) {
            case "Saturday","Sunday" -> System.out.println("Holiday");
            case "Monday" -> System.out.println("Weekday");
            default -> System.out.println("Week");
        }
        String result = "";
        result = switch(day) {
            case "Saturday","Sunday" ->"Holiday";
            case "Monday" -> "Weekday";
            default -> "Week";
        };
        System.out.println(result);
    }
}
