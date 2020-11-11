package com.cardflight.mobilebowling.model;

import java.util.HashMap;
import java.util.Map;

public class Roll {
    private int numPins = 0;
    private String rollValue = "";

    public enum RollType
    {
        STRIKE("X"), SPARE("/"), GUTTER("-");

        private String rollType;

        RollType(String rollString)
        {
            this.setRollValue(rollString);
        }

        public String getRollValue()
        {
            return rollType;
        }

        public void setRollValue(String rollString)
        {
            this.rollType = rollType;
        }

        private static final Map<String, RollType> lookup = new HashMap<>();

        static
        {
            for(RollType type: RollType.values()) {
                lookup.put(type.getRollValue(), type);
            }
        }

        public static RollType get(String type)
        {
            return lookup.get(type);
        }
    }


    public void setRollValue(String rollValue) {
        this.rollValue = rollValue;
    }

    public String getRollValue() {
        return this.rollValue;
    }


    // this class is used to sanitize the input...
    public Roll(String input) {

        RollType type = RollType.get(input);
        if (type != null) {
            setRollValue(input);
        }
    }

}
