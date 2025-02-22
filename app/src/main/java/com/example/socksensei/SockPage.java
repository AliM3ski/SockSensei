package com.example.socksensei;

public class SockPage {

    private String SockName;
    private String SockDescription;

    public SockPage(String sockName, String sockDescription) {
        SockName = sockName;
        SockDescription = sockDescription;
    }

    public String getSockName() {
        return SockName;
    }

    public void setSockName(String sockName) {
        SockName = sockName;
    }

    public String getSockDescription() {
        return SockDescription;
    }

    public void setSockDescription(String sockDescription) {
        SockDescription = sockDescription;
    }
}
