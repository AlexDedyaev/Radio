package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radio radio = new Radio ();


    @Test
    public void shouldGetCurrentStation() {
        radio.setCurrentStation(0);
        radio.setCurrentStation(-1);
        radio.setCurrentStation(10
        );
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPressNextStation() {
        radio.setCurrentStation(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldPressPrevStation() {
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.previousStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldGetToMaxStation() {
        assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxRadioStation(-1);
        radio.setMaxRadioStation(0);
        radio.setMaxRadioStation(10);
        assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void shouldGetToMinStation() {
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldSetMinStation() {
        radio.setMinRadioStation(-1);
        radio.setMinRadioStation(0);
        radio.setMinRadioStation(9);
        assertEquals(9, radio.getMinRadioStation());
    }

    @Test
    public void testIncreaseVolumeAtMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeNotAtMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeAtMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeNotAtMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        assertEquals(70, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeOutOfRangeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeOutOfRangeAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    //тестируем конструктор с возможностью задавать количество радиостанций при создании объекта
    @Test
    public void shouldCreateStationsWithLimits() {
        Radio radio  = new Radio();
        assertEquals(9, radio.getMaxRadioStation());

        Radio radio1= new Radio();
        assertEquals(0, radio1.getMinRadioStation());
    }
}
