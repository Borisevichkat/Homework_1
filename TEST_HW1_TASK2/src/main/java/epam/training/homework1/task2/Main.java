package epam.training.homework1.task2;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int year = Solution_2.readInt("Введите год:");
        int month = Solution_2.readInt("Введите месяц:");
        int numberOfDays = Solution_2.calculateDays(year, month);
        Solution_2.printNumberOfDays(numberOfDays);
    }
}
