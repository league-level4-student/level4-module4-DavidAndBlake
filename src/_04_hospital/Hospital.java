package _04_hospital;

import java.util.ArrayList;

public class Hospital
{
    ArrayList<Doctor> docs = new ArrayList<Doctor>();
    ArrayList<Patient> patients = new ArrayList<Patient>();

    void addDoctor(Doctor doc)
    {
        docs.add(doc);
    }

    ArrayList getDoctors()
    {
        return docs;
    }

    void addPatient(Patient patient)
    {
            patients.add(patient);
    }

    ArrayList getPatients()
    {
        return patients;
    }

    void assignPatientsToDoctors()
    {
        int docCount = 0;
        for (int i = 0; i < patients.size(); i++)
        {
            try
            {
                docs.get(docCount).assignPatient(patients.get(i));
            } catch (DoctorFullException full)
            {
                docCount++;
                i--;
            }
        }
    }

}
