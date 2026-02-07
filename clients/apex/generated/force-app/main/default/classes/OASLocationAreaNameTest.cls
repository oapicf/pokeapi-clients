@isTest
private class OASLocationAreaNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaName locationAreaName1 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName2 = locationAreaName1;
        OASLocationAreaName locationAreaName3 = new OASLocationAreaName();
        OASLocationAreaName locationAreaName4 = locationAreaName3;

        System.assert(locationAreaName1.equals(locationAreaName2));
        System.assert(locationAreaName2.equals(locationAreaName1));
        System.assert(locationAreaName1.equals(locationAreaName1));
        System.assert(locationAreaName3.equals(locationAreaName4));
        System.assert(locationAreaName4.equals(locationAreaName3));
        System.assert(locationAreaName3.equals(locationAreaName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaName locationAreaName1 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName2 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName3 = new OASLocationAreaName();
        OASLocationAreaName locationAreaName4 = new OASLocationAreaName();

        System.assert(locationAreaName1.equals(locationAreaName2));
        System.assert(locationAreaName2.equals(locationAreaName1));
        System.assert(locationAreaName3.equals(locationAreaName4));
        System.assert(locationAreaName4.equals(locationAreaName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaName locationAreaName1 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName2 = new OASLocationAreaName();

        System.assertEquals(false, locationAreaName1.equals('foo'));
        System.assertEquals(false, locationAreaName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaName locationAreaName1 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName2 = new OASLocationAreaName();
        OASLocationAreaName locationAreaName3;

        System.assertEquals(false, locationAreaName1.equals(locationAreaName3));
        System.assertEquals(false, locationAreaName2.equals(locationAreaName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaName locationAreaName1 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName2 = new OASLocationAreaName();

        System.assertEquals(locationAreaName1.hashCode(), locationAreaName1.hashCode());
        System.assertEquals(locationAreaName2.hashCode(), locationAreaName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaName locationAreaName1 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName2 = OASLocationAreaName.getExample();
        OASLocationAreaName locationAreaName3 = new OASLocationAreaName();
        OASLocationAreaName locationAreaName4 = new OASLocationAreaName();

        System.assert(locationAreaName1.equals(locationAreaName2));
        System.assert(locationAreaName3.equals(locationAreaName4));
        System.assertEquals(locationAreaName1.hashCode(), locationAreaName2.hashCode());
        System.assertEquals(locationAreaName3.hashCode(), locationAreaName4.hashCode());
    }
}
