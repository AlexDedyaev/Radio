package ru.netology;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }


    // Геттеры и сеттеры для текущей станции
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    // Метод для переключения на следующую станцию
    public void nextStation() {
        if (maxStation <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    // Метод для переключения на предыдущую станцию
    public void previousStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    // Геттеры и сеттеры для текущей громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Метод для увеличения громкости на один
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }


    // Метод для уменьшения громкости на один
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}