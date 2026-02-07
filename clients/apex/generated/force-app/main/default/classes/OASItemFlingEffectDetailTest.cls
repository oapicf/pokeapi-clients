@isTest
private class OASItemFlingEffectDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemFlingEffectDetail itemFlingEffectDetail1 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail2 = itemFlingEffectDetail1;
        OASItemFlingEffectDetail itemFlingEffectDetail3 = new OASItemFlingEffectDetail();
        OASItemFlingEffectDetail itemFlingEffectDetail4 = itemFlingEffectDetail3;

        System.assert(itemFlingEffectDetail1.equals(itemFlingEffectDetail2));
        System.assert(itemFlingEffectDetail2.equals(itemFlingEffectDetail1));
        System.assert(itemFlingEffectDetail1.equals(itemFlingEffectDetail1));
        System.assert(itemFlingEffectDetail3.equals(itemFlingEffectDetail4));
        System.assert(itemFlingEffectDetail4.equals(itemFlingEffectDetail3));
        System.assert(itemFlingEffectDetail3.equals(itemFlingEffectDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemFlingEffectDetail itemFlingEffectDetail1 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail2 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail3 = new OASItemFlingEffectDetail();
        OASItemFlingEffectDetail itemFlingEffectDetail4 = new OASItemFlingEffectDetail();

        System.assert(itemFlingEffectDetail1.equals(itemFlingEffectDetail2));
        System.assert(itemFlingEffectDetail2.equals(itemFlingEffectDetail1));
        System.assert(itemFlingEffectDetail3.equals(itemFlingEffectDetail4));
        System.assert(itemFlingEffectDetail4.equals(itemFlingEffectDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemFlingEffectDetail itemFlingEffectDetail1 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail2 = new OASItemFlingEffectDetail();

        System.assertEquals(false, itemFlingEffectDetail1.equals('foo'));
        System.assertEquals(false, itemFlingEffectDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemFlingEffectDetail itemFlingEffectDetail1 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail2 = new OASItemFlingEffectDetail();
        OASItemFlingEffectDetail itemFlingEffectDetail3;

        System.assertEquals(false, itemFlingEffectDetail1.equals(itemFlingEffectDetail3));
        System.assertEquals(false, itemFlingEffectDetail2.equals(itemFlingEffectDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemFlingEffectDetail itemFlingEffectDetail1 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail2 = new OASItemFlingEffectDetail();

        System.assertEquals(itemFlingEffectDetail1.hashCode(), itemFlingEffectDetail1.hashCode());
        System.assertEquals(itemFlingEffectDetail2.hashCode(), itemFlingEffectDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemFlingEffectDetail itemFlingEffectDetail1 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail2 = OASItemFlingEffectDetail.getExample();
        OASItemFlingEffectDetail itemFlingEffectDetail3 = new OASItemFlingEffectDetail();
        OASItemFlingEffectDetail itemFlingEffectDetail4 = new OASItemFlingEffectDetail();

        System.assert(itemFlingEffectDetail1.equals(itemFlingEffectDetail2));
        System.assert(itemFlingEffectDetail3.equals(itemFlingEffectDetail4));
        System.assertEquals(itemFlingEffectDetail1.hashCode(), itemFlingEffectDetail2.hashCode());
        System.assertEquals(itemFlingEffectDetail3.hashCode(), itemFlingEffectDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemFlingEffectDetail itemFlingEffectDetail = new OASItemFlingEffectDetail();
        Map<String, String> x-property-mappings = itemFlingEffectDetail.getx-property-mappings();
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemFlingEffectDetail itemFlingEffectDetail = new OASItemFlingEffectDetail();
        System.assertEquals(new List<OASItemFlingEffectEffectText>(), itemFlingEffectDetail.effectEntries);
        System.assertEquals(new List<OASItemSummary>(), itemFlingEffectDetail.items);
        System.assertEquals(null, itemFlingEffectDetail.id);
        System.assertEquals(null, itemFlingEffectDetail.name);
    }
}
