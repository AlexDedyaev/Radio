package ru.netology;

public class Radio {


    private int currentVolume;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentRadioStation;
    private int maxCurrentRadioStation = 9;
    private int minCurrentRadioStation = 0;

    public Radio() {

    }

    public Radio(int numberOfStations) {
        this.maxCurrentRadioStation = minCurrentRadioStation + numberOfStations - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxCurrentRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minCurrentRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
//        if (newCurrentVolume > 100) {
//            return;
//        }
//        if (newCurrentVolume < 0) {
//            return;
//        }
        currentVolume = newCurrentVolume;
    }


    public void volumeUp() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > minCurrentVolume) {
            currentVolume--;
        }
    }


    public void next() {
        if (currentRadioStation < maxCurrentRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minCurrentRadioStation;
        }
    }

    public void prev() {
        if (currentRadioStation > minCurrentRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxCurrentRadioStation;
        }
    }

}
