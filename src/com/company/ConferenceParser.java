package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConferenceParser {
    private String fileName;
    private PrintStream printStream;

    public ConferenceParser(String fileName, PrintStream printStream) {

        this.fileName = fileName;
        this.printStream = printStream;
    }

    public List<String> getTalksFromFile(String fileName) {
        List<String> talkList = new ArrayList<String>();
        try {
            FileReader inputFile = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(inputFile);
            String strLine = bufferedReader.readLine();

//            Read File line by line
            while (strLine !=null){
                talkList.add(strLine);
                strLine = bufferedReader.readLine();
            }

            bufferedReader.close();


        } catch (FileNotFoundException e) {
            printStream.println("Error on the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return talkList;
    }

}



