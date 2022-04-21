package mate.academy;

public class DailyTask {
    public static String createDailyPlan(String[] plans) {
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < plans.length; i++) {
            list.append(i+1).append(".) ").append(plans[i]).append("\n");
        }
        return list.toString();
    }
}
