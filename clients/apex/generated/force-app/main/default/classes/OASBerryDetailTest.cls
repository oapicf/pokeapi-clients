@isTest
private class OASBerryDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryDetail berryDetail1 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail2 = berryDetail1;
        OASBerryDetail berryDetail3 = new OASBerryDetail();
        OASBerryDetail berryDetail4 = berryDetail3;

        System.assert(berryDetail1.equals(berryDetail2));
        System.assert(berryDetail2.equals(berryDetail1));
        System.assert(berryDetail1.equals(berryDetail1));
        System.assert(berryDetail3.equals(berryDetail4));
        System.assert(berryDetail4.equals(berryDetail3));
        System.assert(berryDetail3.equals(berryDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryDetail berryDetail1 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail2 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail3 = new OASBerryDetail();
        OASBerryDetail berryDetail4 = new OASBerryDetail();

        System.assert(berryDetail1.equals(berryDetail2));
        System.assert(berryDetail2.equals(berryDetail1));
        System.assert(berryDetail3.equals(berryDetail4));
        System.assert(berryDetail4.equals(berryDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryDetail berryDetail1 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail2 = new OASBerryDetail();

        System.assertEquals(false, berryDetail1.equals('foo'));
        System.assertEquals(false, berryDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryDetail berryDetail1 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail2 = new OASBerryDetail();
        OASBerryDetail berryDetail3;

        System.assertEquals(false, berryDetail1.equals(berryDetail3));
        System.assertEquals(false, berryDetail2.equals(berryDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryDetail berryDetail1 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail2 = new OASBerryDetail();

        System.assertEquals(berryDetail1.hashCode(), berryDetail1.hashCode());
        System.assertEquals(berryDetail2.hashCode(), berryDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryDetail berryDetail1 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail2 = OASBerryDetail.getExample();
        OASBerryDetail berryDetail3 = new OASBerryDetail();
        OASBerryDetail berryDetail4 = new OASBerryDetail();

        System.assert(berryDetail1.equals(berryDetail2));
        System.assert(berryDetail3.equals(berryDetail4));
        System.assertEquals(berryDetail1.hashCode(), berryDetail2.hashCode());
        System.assertEquals(berryDetail3.hashCode(), berryDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBerryDetail berryDetail = new OASBerryDetail();
        Map<String, String> x-property-mappings = berryDetail.getx-property-mappings();
        System.assertEquals('growthTime', x-property-mappings.get('growth_time'));
        System.assertEquals('maxHarvest', x-property-mappings.get('max_harvest'));
        System.assertEquals('naturalGiftPower', x-property-mappings.get('natural_gift_power'));
        System.assertEquals('soilDryness', x-property-mappings.get('soil_dryness'));
        System.assertEquals('naturalGiftType', x-property-mappings.get('natural_gift_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBerryDetail berryDetail = new OASBerryDetail();
        System.assertEquals(new List<OASBerryDetailFlavorsInner>(), berryDetail.flavors);
        System.assertEquals(null, berryDetail.id);
        System.assertEquals(null, berryDetail.name);
        System.assertEquals(null, berryDetail.growthTime);
        System.assertEquals(null, berryDetail.maxHarvest);
        System.assertEquals(null, berryDetail.naturalGiftPower);
        System.assertEquals(null, berryDetail.size);
        System.assertEquals(null, berryDetail.smoothness);
        System.assertEquals(null, berryDetail.soilDryness);
        System.assertEquals(null, berryDetail.firmness);
        System.assertEquals(null, berryDetail.item);
        System.assertEquals(null, berryDetail.naturalGiftType);
    }
}
