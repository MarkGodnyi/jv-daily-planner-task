package mate.academy;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = "task";
        }
        System.out.println(DailyTask.createDailyPlan(strings));
    }
}
