package com.mt.week5.hospital.management;

public class MainDriver {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(1, "Smith", 45, "Cardiology", 200.00);
        Nurse nurse = new Nurse(2, "Johnson", 32, "Pediatrics", "Night");
        Surgeon surgeon = new Surgeon(3, "Patel", 50, "Orthopedics", 350.00, "Knee Replacement", "OR-3");
        EmergencyDoctor erDoctor = new EmergencyDoctor(4, "Lee", 38, "Emergency Medicine", 250.00, 12);

        System.out.println("OBJECT DETAILS");
        doctor.displayDetails();
        System.out.println();
        nurse.displayDetails();
        System.out.println();
        surgeon.displayDetails();
        System.out.println();
        erDoctor.displayDetails();

        System.out.println("\nSPECIALIZED METHODS");
        doctor.diagnosePatient();
        nurse.assistPatient();
        surgeon.performSurgery();
        erDoctor.handleEmergency();

        System.out.println("\nMETHOD OVERRIDING: performDuties");
        doctor.performDuties();
        nurse.performDuties();
        surgeon.performDuties();
        erDoctor.performDuties();

        System.out.println("\nPOLYMORPHISM (Person reference)");
        Person person;

        person = new Doctor(5, "Adams", 41, "Neurology", 220.00);
        person.performDuties();

        person = new Nurse(6, "Brown", 29, "ICU", "Day");
        person.performDuties();

        person = new Surgeon(7, "Garcia", 47, "Cardiac", 400.00, "Bypass Surgery", "OR-1");
        person.performDuties();

        person = new EmergencyDoctor(8, "Kim", 36, "Trauma", 260.00, 5);
        person.performDuties();

        System.out.println("\nINTERFACE METHODS (EmergencyDoctor)");
        erDoctor.prescribeMedication();
        erDoctor.generateBill();

        MedicalProfessional mp = erDoctor;
        Billable b = erDoctor;
        mp.prescribeMedication();
        b.generateBill();
    }
}
