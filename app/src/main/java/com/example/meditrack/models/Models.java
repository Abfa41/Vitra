package com.example.meditrack.models;

import java.util.Date;

public class UserProfile {
    public int id;
    public String name = "";
    public int age = 0;
    public String bloodGroup = "";
    public String conditions = "";
    public String allergies = "";
    public String emergencyName = "";
    public String emergencyPhone = "";
}

class VitalsRecord {
    public int id;
    public Date date;
    public int systolic;
    public int diastolic;
    public int bloodSugar;
    public boolean isFasting;
    public float temperature;
    public float weight;
    public int spo2;
    public String notes = "";
}

class Medicine {
    public int id;
    public String name = "";
    public String dose = "";
    public String frequency = "";
    public int intervalHours = 0;
    public Date startDate;
    public Date endDate;
    public Date nextDoseTime;
    public boolean isActive = true;
    public int doseCount = 0;
}

class Symptom {
    public int id;
    public Date date;
    public String symptomName = "";
    public int severity = 1;
    public String notes = "";
}

class DoctorVisit {
    public int id;
    public Date date;
    public String doctorName = "";
    public String prescription = "";
    public Date followUpDate;
    public String notes = "";
}

class Prescription {
    public int id;
    public Date date;
    public String doctorName = "";
    public String filePath = "";
    public String notes = "";
}