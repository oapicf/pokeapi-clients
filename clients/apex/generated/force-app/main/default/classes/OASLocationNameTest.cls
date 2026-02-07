@isTest
private class OASLocationNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationName locationName1 = OASLocationName.getExample();
        OASLocationName locationName2 = locationName1;
        OASLocationName locationName3 = new OASLocationName();
        OASLocationName locationName4 = locationName3;

        System.assert(locationName1.equals(locationName2));
        System.assert(locationName2.equals(locationName1));
        System.assert(locationName1.equals(locationName1));
        System.assert(locationName3.equals(locationName4));
        System.assert(locationName4.equals(locationName3));
        System.assert(locationName3.equals(locationName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationName locationName1 = OASLocationName.getExample();
        OASLocationName locationName2 = OASLocationName.getExample();
        OASLocationName locationName3 = new OASLocationName();
        OASLocationName locationName4 = new OASLocationName();

        System.assert(locationName1.equals(locationName2));
        System.assert(locationName2.equals(locationName1));
        System.assert(locationName3.equals(locationName4));
        System.assert(locationName4.equals(locationName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationName locationName1 = OASLocationName.getExample();
        OASLocationName locationName2 = new OASLocationName();

        System.assertEquals(false, locationName1.equals('foo'));
        System.assertEquals(false, locationName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationName locationName1 = OASLocationName.getExample();
        OASLocationName locationName2 = new OASLocationName();
        OASLocationName locationName3;

        System.assertEquals(false, locationName1.equals(locationName3));
        System.assertEquals(false, locationName2.equals(locationName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationName locationName1 = OASLocationName.getExample();
        OASLocationName locationName2 = new OASLocationName();

        System.assertEquals(locationName1.hashCode(), locationName1.hashCode());
        System.assertEquals(locationName2.hashCode(), locationName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationName locationName1 = OASLocationName.getExample();
        OASLocationName locationName2 = OASLocationName.getExample();
        OASLocationName locationName3 = new OASLocationName();
        OASLocationName locationName4 = new OASLocationName();

        System.assert(locationName1.equals(locationName2));
        System.assert(locationName3.equals(locationName4));
        System.assertEquals(locationName1.hashCode(), locationName2.hashCode());
        System.assertEquals(locationName3.hashCode(), locationName4.hashCode());
    }
}
