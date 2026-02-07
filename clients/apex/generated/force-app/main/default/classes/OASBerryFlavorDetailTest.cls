@isTest
private class OASBerryFlavorDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFlavorDetail berryFlavorDetail1 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail2 = berryFlavorDetail1;
        OASBerryFlavorDetail berryFlavorDetail3 = new OASBerryFlavorDetail();
        OASBerryFlavorDetail berryFlavorDetail4 = berryFlavorDetail3;

        System.assert(berryFlavorDetail1.equals(berryFlavorDetail2));
        System.assert(berryFlavorDetail2.equals(berryFlavorDetail1));
        System.assert(berryFlavorDetail1.equals(berryFlavorDetail1));
        System.assert(berryFlavorDetail3.equals(berryFlavorDetail4));
        System.assert(berryFlavorDetail4.equals(berryFlavorDetail3));
        System.assert(berryFlavorDetail3.equals(berryFlavorDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFlavorDetail berryFlavorDetail1 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail2 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail3 = new OASBerryFlavorDetail();
        OASBerryFlavorDetail berryFlavorDetail4 = new OASBerryFlavorDetail();

        System.assert(berryFlavorDetail1.equals(berryFlavorDetail2));
        System.assert(berryFlavorDetail2.equals(berryFlavorDetail1));
        System.assert(berryFlavorDetail3.equals(berryFlavorDetail4));
        System.assert(berryFlavorDetail4.equals(berryFlavorDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFlavorDetail berryFlavorDetail1 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail2 = new OASBerryFlavorDetail();

        System.assertEquals(false, berryFlavorDetail1.equals('foo'));
        System.assertEquals(false, berryFlavorDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFlavorDetail berryFlavorDetail1 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail2 = new OASBerryFlavorDetail();
        OASBerryFlavorDetail berryFlavorDetail3;

        System.assertEquals(false, berryFlavorDetail1.equals(berryFlavorDetail3));
        System.assertEquals(false, berryFlavorDetail2.equals(berryFlavorDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFlavorDetail berryFlavorDetail1 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail2 = new OASBerryFlavorDetail();

        System.assertEquals(berryFlavorDetail1.hashCode(), berryFlavorDetail1.hashCode());
        System.assertEquals(berryFlavorDetail2.hashCode(), berryFlavorDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFlavorDetail berryFlavorDetail1 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail2 = OASBerryFlavorDetail.getExample();
        OASBerryFlavorDetail berryFlavorDetail3 = new OASBerryFlavorDetail();
        OASBerryFlavorDetail berryFlavorDetail4 = new OASBerryFlavorDetail();

        System.assert(berryFlavorDetail1.equals(berryFlavorDetail2));
        System.assert(berryFlavorDetail3.equals(berryFlavorDetail4));
        System.assertEquals(berryFlavorDetail1.hashCode(), berryFlavorDetail2.hashCode());
        System.assertEquals(berryFlavorDetail3.hashCode(), berryFlavorDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBerryFlavorDetail berryFlavorDetail = new OASBerryFlavorDetail();
        Map<String, String> x-property-mappings = berryFlavorDetail.getx-property-mappings();
        System.assertEquals('contestType', x-property-mappings.get('contest_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBerryFlavorDetail berryFlavorDetail = new OASBerryFlavorDetail();
        System.assertEquals(new List<OASBerryFlavorDetailBerriesInner>(), berryFlavorDetail.berries);
        System.assertEquals(new List<OASBerryFlavorName>(), berryFlavorDetail.names);
        System.assertEquals(null, berryFlavorDetail.id);
        System.assertEquals(null, berryFlavorDetail.name);
        System.assertEquals(null, berryFlavorDetail.contestType);
    }
}
