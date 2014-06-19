package com.company;

import java.util.List;

public class ConferenceManager {
    private final List<Talk> talksValidList;

    public ConferenceManager(List<Talk> talksValidList) {
        this.talksValidList = talksValidList;
    }

    public List<List<Talk>> scheduleConferenceWithInformationFromFile() {
        return getScheduleConferenceTrack(talksValidList);

    }

    private List<List<Talk>> getScheduleConferenceTrack(List<Talk> talksValidList) {
        return null;
    }
}
