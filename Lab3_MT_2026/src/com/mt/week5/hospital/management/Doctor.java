package com.mt.week5.hospital.management;

public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int personId, String name, int age, String specialization, double consultationFee) {
        super(personId, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() { return specialization; }
    public double getConsultationFee() { return consultationFee; }

    public void diagnosePatient() {
        System.out.println("Dr. " + getName() + " is diagnosing a patient (" + specialization + ").");
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Dr. " + getName() + " is examining patients and prescribing treatment.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization + " Consultation Fee: $" + consultationFee);
    }
}
