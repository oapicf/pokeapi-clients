@isTest
private class OASGenderSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenderSummary genderSummary1 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary2 = genderSummary1;
        OASGenderSummary genderSummary3 = new OASGenderSummary();
        OASGenderSummary genderSummary4 = genderSummary3;

        System.assert(genderSummary1.equals(genderSummary2));
        System.assert(genderSummary2.equals(genderSummary1));
        System.assert(genderSummary1.equals(genderSummary1));
        System.assert(genderSummary3.equals(genderSummary4));
        System.assert(genderSummary4.equals(genderSummary3));
        System.assert(genderSummary3.equals(genderSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenderSummary genderSummary1 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary2 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary3 = new OASGenderSummary();
        OASGenderSummary genderSummary4 = new OASGenderSummary();

        System.assert(genderSummary1.equals(genderSummary2));
        System.assert(genderSummary2.equals(genderSummary1));
        System.assert(genderSummary3.equals(genderSummary4));
        System.assert(genderSummary4.equals(genderSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenderSummary genderSummary1 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary2 = new OASGenderSummary();

        System.assertEquals(false, genderSummary1.equals('foo'));
        System.assertEquals(false, genderSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenderSummary genderSummary1 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary2 = new OASGenderSummary();
        OASGenderSummary genderSummary3;

        System.assertEquals(false, genderSummary1.equals(genderSummary3));
        System.assertEquals(false, genderSummary2.equals(genderSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenderSummary genderSummary1 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary2 = new OASGenderSummary();

        System.assertEquals(genderSummary1.hashCode(), genderSummary1.hashCode());
        System.assertEquals(genderSummary2.hashCode(), genderSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenderSummary genderSummary1 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary2 = OASGenderSummary.getExample();
        OASGenderSummary genderSummary3 = new OASGenderSummary();
        OASGenderSummary genderSummary4 = new OASGenderSummary();

        System.assert(genderSummary1.equals(genderSummary2));
        System.assert(genderSummary3.equals(genderSummary4));
        System.assertEquals(genderSummary1.hashCode(), genderSummary2.hashCode());
        System.assertEquals(genderSummary3.hashCode(), genderSummary4.hashCode());
    }
}
