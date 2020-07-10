package _04_hospital;

public class Surgeon extends Doctor
{
    boolean performsSurgery()
    {
        return true;
    }
    boolean makesHouseCalls(){
        return false;
    }
}
