import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    File f = new File("11_corona.csv");

    private ArrayList<Covid19Data> covidList;

    public FileHandler() {
        covidList = new ArrayList<>();
    }

    public ArrayList<Covid19Data> getCovidList(){
        return covidList;
    }

    public void tilføjData(int regionskode, String region, String aldersgruppe, int tilfældeIAlt, int døde, int indlagte){
        covidList.add(new Covid19Data(regionskode, region, aldersgruppe, tilfældeIAlt, døde, indlagte));
    }


    public void indlæsFil(){
        /*Scanner sc = null;
        try {
            sc = new Scanner(f, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        Scanner sc = null;
        try {
            sc = new Scanner(f, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while(sc.hasNext()) {
            String linje = sc.next();
            String[] attributter = linje.split(";");
            int regionsKode = Integer.parseInt(attributter[0]);
            int tilfælde = Integer.parseInt(attributter[3]);
            int døde = Integer.parseInt(attributter[4]);
            int indlagt = Integer.parseInt(attributter[5]);
            tilføjData(regionsKode, attributter[1], attributter[2], tilfælde, døde, indlagt);

        }
    }

    public ArrayList<Covid19Data> visData(){
        for (Covid19Data cd: covidList){
            return covidList;
        }
        return null;
    }
}