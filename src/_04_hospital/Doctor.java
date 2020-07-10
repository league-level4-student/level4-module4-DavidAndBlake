package _04_hospital;

import java.util.ArrayList;

public class Doctor
{
    boolean feelsCaredFor = false;
    ArrayList<Patient> patients = new ArrayList<Patient>();
    boolean performsSurgery()
    {
        return false;
    }
    boolean makesHouseCalls(){
        return false;
    }
    void doMedicine(){
        for (int i = 0; i < patients.size(); i++)
        {
            patients.get(i).feelsCaredFor = true;
        }
    }
    void assignPatient(Patient p) throws DoctorFullException{
        if(patients.size()>=3){
            throw new DoctorFullException();
        }
        else
        {
            patients.add(p);
        }
    }

    public ArrayList<Patient> getPatients()
    {
        return patients;
    }
}
