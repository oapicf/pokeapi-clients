@isTest
private class OASNatureNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASNatureName natureName1 = OASNatureName.getExample();
        OASNatureName natureName2 = natureName1;
        OASNatureName natureName3 = new OASNatureName();
        OASNatureName natureName4 = natureName3;

        System.assert(natureName1.equals(natureName2));
        System.assert(natureName2.equals(natureName1));
        System.assert(natureName1.equals(natureName1));
        System.assert(natureName3.equals(natureName4));
        System.assert(natureName4.equals(natureName3));
        System.assert(natureName3.equals(natureName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNatureName natureName1 = OASNatureName.getExample();
        OASNatureName natureName2 = OASNatureName.getExample();
        OASNatureName natureName3 = new OASNatureName();
        OASNatureName natureName4 = new OASNatureName();

        System.assert(natureName1.equals(natureName2));
        System.assert(natureName2.equals(natureName1));
        System.assert(natureName3.equals(natureName4));
        System.assert(natureName4.equals(natureName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNatureName natureName1 = OASNatureName.getExample();
        OASNatureName natureName2 = new OASNatureName();

        System.assertEquals(false, natureName1.equals('foo'));
        System.assertEquals(false, natureName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNatureName natureName1 = OASNatureName.getExample();
        OASNatureName natureName2 = new OASNatureName();
        OASNatureName natureName3;

        System.assertEquals(false, natureName1.equals(natureName3));
        System.assertEquals(false, natureName2.equals(natureName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNatureName natureName1 = OASNatureName.getExample();
        OASNatureName natureName2 = new OASNatureName();

        System.assertEquals(natureName1.hashCode(), natureName1.hashCode());
        System.assertEquals(natureName2.hashCode(), natureName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNatureName natureName1 = OASNatureName.getExample();
        OASNatureName natureName2 = OASNatureName.getExample();
        OASNatureName natureName3 = new OASNatureName();
        OASNatureName natureName4 = new OASNatureName();

        System.assert(natureName1.equals(natureName2));
        System.assert(natureName3.equals(natureName4));
        System.assertEquals(natureName1.hashCode(), natureName2.hashCode());
        System.assertEquals(natureName3.hashCode(), natureName4.hashCode());
    }
}
