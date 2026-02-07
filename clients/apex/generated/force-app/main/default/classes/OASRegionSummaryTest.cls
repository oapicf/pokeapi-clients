@isTest
private class OASRegionSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASRegionSummary regionSummary1 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary2 = regionSummary1;
        OASRegionSummary regionSummary3 = new OASRegionSummary();
        OASRegionSummary regionSummary4 = regionSummary3;

        System.assert(regionSummary1.equals(regionSummary2));
        System.assert(regionSummary2.equals(regionSummary1));
        System.assert(regionSummary1.equals(regionSummary1));
        System.assert(regionSummary3.equals(regionSummary4));
        System.assert(regionSummary4.equals(regionSummary3));
        System.assert(regionSummary3.equals(regionSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRegionSummary regionSummary1 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary2 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary3 = new OASRegionSummary();
        OASRegionSummary regionSummary4 = new OASRegionSummary();

        System.assert(regionSummary1.equals(regionSummary2));
        System.assert(regionSummary2.equals(regionSummary1));
        System.assert(regionSummary3.equals(regionSummary4));
        System.assert(regionSummary4.equals(regionSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRegionSummary regionSummary1 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary2 = new OASRegionSummary();

        System.assertEquals(false, regionSummary1.equals('foo'));
        System.assertEquals(false, regionSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRegionSummary regionSummary1 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary2 = new OASRegionSummary();
        OASRegionSummary regionSummary3;

        System.assertEquals(false, regionSummary1.equals(regionSummary3));
        System.assertEquals(false, regionSummary2.equals(regionSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRegionSummary regionSummary1 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary2 = new OASRegionSummary();

        System.assertEquals(regionSummary1.hashCode(), regionSummary1.hashCode());
        System.assertEquals(regionSummary2.hashCode(), regionSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRegionSummary regionSummary1 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary2 = OASRegionSummary.getExample();
        OASRegionSummary regionSummary3 = new OASRegionSummary();
        OASRegionSummary regionSummary4 = new OASRegionSummary();

        System.assert(regionSummary1.equals(regionSummary2));
        System.assert(regionSummary3.equals(regionSummary4));
        System.assertEquals(regionSummary1.hashCode(), regionSummary2.hashCode());
        System.assertEquals(regionSummary3.hashCode(), regionSummary4.hashCode());
    }
}
