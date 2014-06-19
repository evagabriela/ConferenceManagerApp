package com.company;

import org.junit.Before;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class ConferenceManagerTest {
    private PrintStream printStream;
    private String filename;
    private Talk task;
    private ConferenceManager conferenceManager;
    private ConferenceParser conferenceParser;

    @Before
    public void setUp() throws Exception {
        filename = "string";
        printStream = mock(PrintStream.class);
        task = mock(Talk.class);
        conferenceParser = new ConferenceParser(filename,printStream);

    }

//    @Test
//    public void shouldReturnConferenceTalksTrack() throws Exception {
//        List<String> listTalks = conferenceParser.getTalksFromFile(filename);
//        List<Talk> validListTalks = conferenceParser.createValidTalks(listTalks);
//        conferenceManager = new ConferenceManager(validListTalks);
//        assertTrue(conferenceManager.scheduleConferenceWithInformationFromFile().contains(validListTalks));
//    }

}