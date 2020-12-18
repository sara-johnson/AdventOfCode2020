import java.util.List;

public class App {
    public static void main(String[] args) {

        final String FILE_LOCATION = "C:\\Users\\sajohn84\\Documents\\GitHub\\" +
                "AdventOfCode2020\\src\\main\\java\\AOC_SourceFiles\\";

        System.out.println("--Day01--------------------------");
        //Day01 Result
        Day01_ReportRepair day01 = new Day01_ReportRepair();
        System.out.println(day01.handlePart01());
        System.out.println(day01.handlePart02());

        System.out.println("--Day02--------------------------");
        //Day02 Result
        List<String> day02Input = util.AOC_FileIO.getFileAsList(FILE_LOCATION + "12_02_2020.txt");
        Day02_PasswordPhilosophy day02 = new Day02_PasswordPhilosophy(day02Input);
        day02.handlePart01();
        day02.handlePart02();

        System.out.println("--Day03--------------------------");
        //Day03 Result
        List<String> day03Input = util.AOC_FileIO.getFileAsList(FILE_LOCATION + "12_03_2020.txt");
        for (String line : day03Input) {
            System.out.println(line);
        }
    }
}
