/** ACS-3913 */

public class Director{
    public static void main(String[] args)    {
        SectionBuilder sb = new ClassSectionBuilder()
            .forSection("ACS", "3913", "001")
            .inRoom("3D04")
            .onDays("TuTh")
            .startingAt("10:00am")
            .endingAt("11:15am")
            .taughtBy("Bautista")
            .examOn("December 13, 2021");
        System.out.println("Section: "+sb.getResult());
    }
}
