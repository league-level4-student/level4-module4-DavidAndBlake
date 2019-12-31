package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 *
 * To encapsulate a member variable, follow these three steps:
 *
 * 1. Make the member variable private (or protected)
 *
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 *
 * 3. Add restrictions to the setter method so the member variable cannot be
 * 	  adversely altered
 *
 * */

public class EncapsulateTheData
{
    //1. Encapsulate the member variables.
    //   Add restrictions to the setters according to the comment.

    //2. Create a new JUnit Test case and write tests to verify that
    //   the member variables' getters and setters are working

    private int itemsReceived; //must not be negative. All negative arguments get set to 0.
    private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
    private String nomenclature; //must not be set to a blank string. Blank Strings get set to a space
    private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();


    void setItemsReceived(int itemsReceived)
    {
        if (itemsReceived < 0)
        {
            this.itemsReceived = 0;
        } else
        {
            this.itemsReceived = itemsReceived;
        }
    }

    public int getItemsReceived()
    {
        return this.itemsReceived;
    }

    void setDegreesTurned(float degreesTurned)
    {
        if (degreesTurned < 0)
        {
            degreesTurned += 360;
        }
        if (degreesTurned > 360)
        {
            degreesTurned -= 360;
        } else
        {
            this.degreesTurned = degreesTurned;
        }
    }

    public float getDegreesTurned()
    {
        return this.degreesTurned;
    }

    void setNomenclature(String nomenclature)
    {
        if (nomenclature.equals(""))
        {
            this.nomenclature = " ";
        } else
        {
            this.nomenclature = nomenclature;
        }
    }

    public String getNomenclature()
    {
        return this.nomenclature;
    }

    void setMemberObj(Object memberObj)
    {
        if (memberObj instanceof String)
        {
            this.memberObj = new Object();
        } else
        {
            this.memberObj = memberObj;
        }
    }

    public Object getMemberObj()
    {
        return this.memberObj;
    }
}
