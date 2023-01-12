package com.kstatharas.essentials.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString() {
        switch (this){
            case CONCIERGE:
                return "Concierge";
            case HOUSEKEEPING:
                return "Housekeeping";
            case FRONT_DESK:
                return "Front_Desk";
            case SECURITY:
                return "Security";
        }
        return "";
    }
}
