package HomeWork2;

public class task2 {
    public static void start() throws Exception {
        String [] arrayInfo =  read.ReadLineFromFile("info2.txt");
        for(int i = 0; i < arrayInfo.length; i++) {
            System.out.println(PrintLine(arrayInfo[i]));
        }
    }
    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}
