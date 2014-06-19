package com.company;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
	    String fileName = "resources/source.txt";

        ConferenceParser conferenceParser = new ConferenceParser(fileName, printStream);
        ConferenceManager conferenceManager = conferenceParser.buildScheduledSetUp();

        conferenceManager.scheduleConferenceWithInformationFromFile();

    }
}
