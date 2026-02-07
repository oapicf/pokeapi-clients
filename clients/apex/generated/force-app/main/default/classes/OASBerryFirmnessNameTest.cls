@isTest
private class OASBerryFirmnessNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFirmnessName berryFirmnessName1 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName2 = berryFirmnessName1;
        OASBerryFirmnessName berryFirmnessName3 = new OASBerryFirmnessName();
        OASBerryFirmnessName berryFirmnessName4 = berryFirmnessName3;

        System.assert(berryFirmnessName1.equals(berryFirmnessName2));
        System.assert(berryFirmnessName2.equals(berryFirmnessName1));
        System.assert(berryFirmnessName1.equals(berryFirmnessName1));
        System.assert(berryFirmnessName3.equals(berryFirmnessName4));
        System.assert(berryFirmnessName4.equals(berryFirmnessName3));
        System.assert(berryFirmnessName3.equals(berryFirmnessName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFirmnessName berryFirmnessName1 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName2 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName3 = new OASBerryFirmnessName();
        OASBerryFirmnessName berryFirmnessName4 = new OASBerryFirmnessName();

        System.assert(berryFirmnessName1.equals(berryFirmnessName2));
        System.assert(berryFirmnessName2.equals(berryFirmnessName1));
        System.assert(berryFirmnessName3.equals(berryFirmnessName4));
        System.assert(berryFirmnessName4.equals(berryFirmnessName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFirmnessName berryFirmnessName1 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName2 = new OASBerryFirmnessName();

        System.assertEquals(false, berryFirmnessName1.equals('foo'));
        System.assertEquals(false, berryFirmnessName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFirmnessName berryFirmnessName1 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName2 = new OASBerryFirmnessName();
        OASBerryFirmnessName berryFirmnessName3;

        System.assertEquals(false, berryFirmnessName1.equals(berryFirmnessName3));
        System.assertEquals(false, berryFirmnessName2.equals(berryFirmnessName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFirmnessName berryFirmnessName1 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName2 = new OASBerryFirmnessName();

        System.assertEquals(berryFirmnessName1.hashCode(), berryFirmnessName1.hashCode());
        System.assertEquals(berryFirmnessName2.hashCode(), berryFirmnessName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFirmnessName berryFirmnessName1 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName2 = OASBerryFirmnessName.getExample();
        OASBerryFirmnessName berryFirmnessName3 = new OASBerryFirmnessName();
        OASBerryFirmnessName berryFirmnessName4 = new OASBerryFirmnessName();

        System.assert(berryFirmnessName1.equals(berryFirmnessName2));
        System.assert(berryFirmnessName3.equals(berryFirmnessName4));
        System.assertEquals(berryFirmnessName1.hashCode(), berryFirmnessName2.hashCode());
        System.assertEquals(berryFirmnessName3.hashCode(), berryFirmnessName4.hashCode());
    }
}
