import java.util.List;

public class App {
    public static void main(String[] args) {


        //Day01 Result
        Day01_ReportRepair day01 = new Day01_ReportRepair();
        System.out.println(day01.handlePart01());
        System.out.println(day01.handlePart02());

        //Day02 Result
        List<String> day02Input = util.AOC_FileIO.getFileAsList("C:\\Users\\sajohn84\\Documents\\GitHub\\" +
                "AdventOfCode2020\\src\\main\\java\\AOC_SourceFiles\\12_02_2020.txt");
        Day02_PasswordPhilosophy day02 = new Day02_PasswordPhilosophy(day02Input);
        day02.handlePart01();


    }
}
