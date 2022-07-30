package ru.netology.radioman.service;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {

    private int numberRadioStations = 10;
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 9;
    private int numberCurrentRadioStation = minNumberRadioStation;

    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    public Radio(int numberRadioStations) {
        maxNumberRadioStation = numberRadioStations - 1;
    }

    // Радиостанции
    public void setToMaxNumberRadioStation() {
        numberCurrentRadioStation = maxNumberRadioStation;
    }

    public void setToMinNumberRadioStation() {
        numberCurrentRadioStation = minNumberRadioStation;
    }

    public void nextNumberCurrentRadioStation() {
        if (numberCurrentRadioStation < maxNumberRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        } else {
            numberCurrentRadioStation = minNumberRadioStation;
        }
    }

    public void prevNumberCurrentRadioStation() {
        if (numberCurrentRadioStation > minNumberRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        } else {
            numberCurrentRadioStation = maxNumberRadioStation;
        }
    }

    // Громкость
    public void setToMaxSoundVolume() {
        soundVolume = maxSoundVolume;
    }

    public void setToMinSoundVolume() {
        soundVolume = minSoundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = maxSoundVolume;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = minSoundVolume;
        }
    }
}