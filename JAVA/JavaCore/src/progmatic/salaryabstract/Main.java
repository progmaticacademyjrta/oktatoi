package progmatic.salaryabstract;

public class Main {
    public static void main(String[] args) {
        HungarianSalary hunSalary = new HungarianSalary(37, 40000, 18);
        System.out.println(hunSalary);
        char[][] table = {{'X', '.', '.', '.'}, {'.', '.', '.', '.'}, {'.', 'X', '.', '.'}, {'.', '.', '.', '.'}};
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {

                if (table[i][j] == '.')
                    continue;
                if ((i > 0) && (table[i - 1][j] == 'X'))
                    continue;
                if ((j > 0) && (table[i][j - 1] == 'X'))
                    continue;
                count++;

            }
        }
        System.out.println(count);
    }
}
