package ru.netology.radioman.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int numberRadioStations = 10;
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 9;
    private int numberCurrentRadioStation = minNumberRadioStation;

    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    public Radio() {
    }

    public Radio(int numberRadioStations, int minNumberRadioStation, int maxNumberRadioStation, int numberCurrentRadioStation, int minSoundVolume, int maxSoundVolume, int soundVolume) {
        this.numberRadioStations = numberRadioStations;
        this.minNumberRadioStation = minNumberRadioStation;
        this.maxNumberRadioStation = maxNumberRadioStation;
        this.numberCurrentRadioStation = numberCurrentRadioStation;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.soundVolume = soundVolume;
    }

    public int getNumberRadioStations() {
        return numberRadioStations;
    }

    public void setNumberRadioStations(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }
}