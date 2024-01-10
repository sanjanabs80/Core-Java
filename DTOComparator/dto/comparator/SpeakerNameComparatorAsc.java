package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerNameComparatorAsc  implements Comparator<SpeakerDTO> {

    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
