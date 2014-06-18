package com.company;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
	    String fileName = "resources/source.txt";

        ConferenceParser conferenceParser = new ConferenceParser(fileName, printStream);
        conferenceParser.getTalksFromFile(fileName);

//Create an array with each of the talks information which was extracted from source.txt file
        System.out.println(conferenceParser.getTalksFromFile(fileName));

//        ConferenceManager conferenceManager = new ConferenceManager();

    }
}
