package _01_introduction_to_encapsulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncapsulateTheDataTests
{
    EncapsulateTheData ed = new EncapsulateTheData();
    @Test
    public void test(){
        ed.setItemsReceived(-43);
        assertEquals(0,ed.getItemsReceived());

        ed.setDegreesTurned(-30);
        assertEquals(330.0, ed.getDegreesTurned(),.1);

        ed.setNomenclature("");
        assertEquals(" ",ed.getNomenclature());

        ed.setMemberObj("ds");
        assertFalse(ed.getMemberObj() instanceof String);
    }
}
