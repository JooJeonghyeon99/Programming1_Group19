import java.io.*;
import java.util.*;


class storeCsvData {
    private String iso_code;
    private String continent;
    private String location;
    private String month;
    private String day;
    private String year;
    private String new_cases;
    private String new_deaths;
    private String people_vaccinated;
    private String population;



    public storeCsvData(String iso_code, String continent, String location, String month, String new_cases, String new_deaths, String people_vaccinated, String population){
        this.iso_code = iso_code;
        this.continent = continent;
        this.location = location;
        this.month = month;
        this.new_cases = new_cases;
        this.new_deaths = new_deaths;
        this.people_vaccinated = people_vaccinated;
        this.population = population;


        //split date into three parts: month, day, year.
        String[] date = month.split("/");
        this.month = date[0];
        this.day = date[1];
        this.year = date[2];

    }
        //create print method
    public String print(){
        return "month : ["+month+"]"+"  day : ["+day+"]"+"  year : ["+year+"]"; //return's format should be string
    }
}
public class Summary {


    public void displaySummary() {
        ArrayList<storeCsvData> covidData = new ArrayList<storeCsvData>();

        String[][] indata = new String[101135][8];
        int count = 0;
        String countDays="12/34/5678"; //temporary value for counting days

        try {
            // csv data file
            File csv = new File("covid-data.csv");
            BufferedReader br = new BufferedReader(new FileReader(csv));
            br.readLine();  // read first line beforehand and ignore
            String line = "";
            line = br.readLine();
            int row = 1;

            while ((line = br.readLine()) != null) {

                String[] token = line.split(",", -1);   // -1 means helping reading contents even blank after "," marks.

                for (int i = 0; i < 8; i++) {
                    indata[row][i] = token[i];
                    System.out.print("["+indata[row-1][i]+"] ");

                }


                covidData.add(new storeCsvData(indata[row][0], indata[row][1], indata[row][2], indata[row][3], indata[row][4], indata[row][5], indata[row][6], indata[row][7])); // datatype

                // output for checking out document from csv file to 2D array
                /*for(int i=0;i<8;i++){
                    System.out.print(indata[row][i] + ","); //has err with 1st column print (display as null)
                }*/

                // count whole period of data
                System.out.println("");
                /*System.out.println(indata[row][3]);*/

                if(!indata[row][3].equals(countDays)) {
                    count += 1;
                    if (count == 111){
                        System.out.println("row is "+ row);
                        System.out.println("1 to "+count+" day");
                        break;
                    }

                }
                countDays = indata[row][3];

                String[] date = indata[row][3].split("/");
                for (int i = 1; i < date.length; i++) {
                  /*  System.out.print("This is i "+i+"   "+date[i]+"   ");
                    System.out.println(""); */
                    //System.out.print(y[i]+" ["+i+"] ");
                    //System.out.println("");
                }
                // ★ counts the period when the month is Jul
                 /*       if (date[0].contains("7")){
                            for (int i = 0; i < date.length; i++) {
                                System.out.print(date[i]);
                            }
                            System.out.println("");

                        }*/
                row++;
            }
            while ((line = br.readLine()) != null) {

                String[] token = line.split(",", -1);   // -1 means helping reading contents even blank after "," marks.

                for (int i = 0; i < 8; i++) {
                    indata[row][i] = token[i];
                    System.out.print("["+indata[row-1][i]+"] ");

                }

                System.out.println("");

                if(!indata[row][3].equals(countDays)) {
                    count += 1;
                    if (count == 222){
                        System.out.println("row is "+ row);
                        System.out.println("1 to "+count+" day");
                        break;
                    }

                }
                countDays = indata[row][3];

                String[] date = indata[row][3].split("/");
                for (int i = 1; i < date.length; i++) {
                }
                row++;
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

       for (storeCsvData i : covidData) {
            System.out.println(i.print());


        System.out.println(count);
    }
}
}







