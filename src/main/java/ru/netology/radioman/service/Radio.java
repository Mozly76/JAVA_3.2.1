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
}