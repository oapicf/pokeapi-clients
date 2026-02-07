@isTest
private class OASRegionNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASRegionName regionName1 = OASRegionName.getExample();
        OASRegionName regionName2 = regionName1;
        OASRegionName regionName3 = new OASRegionName();
        OASRegionName regionName4 = regionName3;

        System.assert(regionName1.equals(regionName2));
        System.assert(regionName2.equals(regionName1));
        System.assert(regionName1.equals(regionName1));
        System.assert(regionName3.equals(regionName4));
        System.assert(regionName4.equals(regionName3));
        System.assert(regionName3.equals(regionName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRegionName regionName1 = OASRegionName.getExample();
        OASRegionName regionName2 = OASRegionName.getExample();
        OASRegionName regionName3 = new OASRegionName();
        OASRegionName regionName4 = new OASRegionName();

        System.assert(regionName1.equals(regionName2));
        System.assert(regionName2.equals(regionName1));
        System.assert(regionName3.equals(regionName4));
        System.assert(regionName4.equals(regionName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRegionName regionName1 = OASRegionName.getExample();
        OASRegionName regionName2 = new OASRegionName();

        System.assertEquals(false, regionName1.equals('foo'));
        System.assertEquals(false, regionName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRegionName regionName1 = OASRegionName.getExample();
        OASRegionName regionName2 = new OASRegionName();
        OASRegionName regionName3;

        System.assertEquals(false, regionName1.equals(regionName3));
        System.assertEquals(false, regionName2.equals(regionName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRegionName regionName1 = OASRegionName.getExample();
        OASRegionName regionName2 = new OASRegionName();

        System.assertEquals(regionName1.hashCode(), regionName1.hashCode());
        System.assertEquals(regionName2.hashCode(), regionName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRegionName regionName1 = OASRegionName.getExample();
        OASRegionName regionName2 = OASRegionName.getExample();
        OASRegionName regionName3 = new OASRegionName();
        OASRegionName regionName4 = new OASRegionName();

        System.assert(regionName1.equals(regionName2));
        System.assert(regionName3.equals(regionName4));
        System.assertEquals(regionName1.hashCode(), regionName2.hashCode());
        System.assertEquals(regionName3.hashCode(), regionName4.hashCode());
    }
}
