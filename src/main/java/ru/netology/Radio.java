package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    // Геттеры и сеттеры для текущей станции
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation <= 9) {
            this.currentStation = currentStation;
        }
    }

    // Метод для переключения на следующую станцию
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Метод для переключения на предыдущую станцию
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // Геттеры и сеттеры для текущей громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }

    // Метод для увеличения громкости на один
    public void increaseVolume() {
        if (currentVolume < 100) {
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