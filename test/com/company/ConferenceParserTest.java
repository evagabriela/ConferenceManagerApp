package com.company;

import org.junit.Before;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class ConferenceParserTest {
    private ConferenceParser conferenceParser;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    @Before
    public void setUp(){
        String fileName = "asasa";
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        conferenceParser = new ConferenceParser(fileName, printStream);
    }




}