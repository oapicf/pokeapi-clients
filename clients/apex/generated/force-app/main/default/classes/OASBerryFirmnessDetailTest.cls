@isTest
private class OASBerryFirmnessDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFirmnessDetail berryFirmnessDetail1 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail2 = berryFirmnessDetail1;
        OASBerryFirmnessDetail berryFirmnessDetail3 = new OASBerryFirmnessDetail();
        OASBerryFirmnessDetail berryFirmnessDetail4 = berryFirmnessDetail3;

        System.assert(berryFirmnessDetail1.equals(berryFirmnessDetail2));
        System.assert(berryFirmnessDetail2.equals(berryFirmnessDetail1));
        System.assert(berryFirmnessDetail1.equals(berryFirmnessDetail1));
        System.assert(berryFirmnessDetail3.equals(berryFirmnessDetail4));
        System.assert(berryFirmnessDetail4.equals(berryFirmnessDetail3));
        System.assert(berryFirmnessDetail3.equals(berryFirmnessDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFirmnessDetail berryFirmnessDetail1 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail2 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail3 = new OASBerryFirmnessDetail();
        OASBerryFirmnessDetail berryFirmnessDetail4 = new OASBerryFirmnessDetail();

        System.assert(berryFirmnessDetail1.equals(berryFirmnessDetail2));
        System.assert(berryFirmnessDetail2.equals(berryFirmnessDetail1));
        System.assert(berryFirmnessDetail3.equals(berryFirmnessDetail4));
        System.assert(berryFirmnessDetail4.equals(berryFirmnessDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFirmnessDetail berryFirmnessDetail1 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail2 = new OASBerryFirmnessDetail();

        System.assertEquals(false, berryFirmnessDetail1.equals('foo'));
        System.assertEquals(false, berryFirmnessDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFirmnessDetail berryFirmnessDetail1 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail2 = new OASBerryFirmnessDetail();
        OASBerryFirmnessDetail berryFirmnessDetail3;

        System.assertEquals(false, berryFirmnessDetail1.equals(berryFirmnessDetail3));
        System.assertEquals(false, berryFirmnessDetail2.equals(berryFirmnessDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFirmnessDetail berryFirmnessDetail1 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail2 = new OASBerryFirmnessDetail();

        System.assertEquals(berryFirmnessDetail1.hashCode(), berryFirmnessDetail1.hashCode());
        System.assertEquals(berryFirmnessDetail2.hashCode(), berryFirmnessDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFirmnessDetail berryFirmnessDetail1 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail2 = OASBerryFirmnessDetail.getExample();
        OASBerryFirmnessDetail berryFirmnessDetail3 = new OASBerryFirmnessDetail();
        OASBerryFirmnessDetail berryFirmnessDetail4 = new OASBerryFirmnessDetail();

        System.assert(berryFirmnessDetail1.equals(berryFirmnessDetail2));
        System.assert(berryFirmnessDetail3.equals(berryFirmnessDetail4));
        System.assertEquals(berryFirmnessDetail1.hashCode(), berryFirmnessDetail2.hashCode());
        System.assertEquals(berryFirmnessDetail3.hashCode(), berryFirmnessDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBerryFirmnessDetail berryFirmnessDetail = new OASBerryFirmnessDetail();
        System.assertEquals(new List<OASBerrySummary>(), berryFirmnessDetail.berries);
        System.assertEquals(new List<OASBerryFirmnessName>(), berryFirmnessDetail.names);
        System.assertEquals(null, berryFirmnessDetail.id);
        System.assertEquals(null, berryFirmnessDetail.name);
    }
}
