package com.xworkz.practice.dto.comparator;

import com.xworkz.practice.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerWarrantyComparatorDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o2.getWarranty(),o1.getWarranty());
    }


}
