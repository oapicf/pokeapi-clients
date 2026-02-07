@isTest
private class OASItemAttributeDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemAttributeDetail itemAttributeDetail1 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail2 = itemAttributeDetail1;
        OASItemAttributeDetail itemAttributeDetail3 = new OASItemAttributeDetail();
        OASItemAttributeDetail itemAttributeDetail4 = itemAttributeDetail3;

        System.assert(itemAttributeDetail1.equals(itemAttributeDetail2));
        System.assert(itemAttributeDetail2.equals(itemAttributeDetail1));
        System.assert(itemAttributeDetail1.equals(itemAttributeDetail1));
        System.assert(itemAttributeDetail3.equals(itemAttributeDetail4));
        System.assert(itemAttributeDetail4.equals(itemAttributeDetail3));
        System.assert(itemAttributeDetail3.equals(itemAttributeDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemAttributeDetail itemAttributeDetail1 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail2 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail3 = new OASItemAttributeDetail();
        OASItemAttributeDetail itemAttributeDetail4 = new OASItemAttributeDetail();

        System.assert(itemAttributeDetail1.equals(itemAttributeDetail2));
        System.assert(itemAttributeDetail2.equals(itemAttributeDetail1));
        System.assert(itemAttributeDetail3.equals(itemAttributeDetail4));
        System.assert(itemAttributeDetail4.equals(itemAttributeDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemAttributeDetail itemAttributeDetail1 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail2 = new OASItemAttributeDetail();

        System.assertEquals(false, itemAttributeDetail1.equals('foo'));
        System.assertEquals(false, itemAttributeDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemAttributeDetail itemAttributeDetail1 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail2 = new OASItemAttributeDetail();
        OASItemAttributeDetail itemAttributeDetail3;

        System.assertEquals(false, itemAttributeDetail1.equals(itemAttributeDetail3));
        System.assertEquals(false, itemAttributeDetail2.equals(itemAttributeDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemAttributeDetail itemAttributeDetail1 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail2 = new OASItemAttributeDetail();

        System.assertEquals(itemAttributeDetail1.hashCode(), itemAttributeDetail1.hashCode());
        System.assertEquals(itemAttributeDetail2.hashCode(), itemAttributeDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemAttributeDetail itemAttributeDetail1 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail2 = OASItemAttributeDetail.getExample();
        OASItemAttributeDetail itemAttributeDetail3 = new OASItemAttributeDetail();
        OASItemAttributeDetail itemAttributeDetail4 = new OASItemAttributeDetail();

        System.assert(itemAttributeDetail1.equals(itemAttributeDetail2));
        System.assert(itemAttributeDetail3.equals(itemAttributeDetail4));
        System.assertEquals(itemAttributeDetail1.hashCode(), itemAttributeDetail2.hashCode());
        System.assertEquals(itemAttributeDetail3.hashCode(), itemAttributeDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemAttributeDetail itemAttributeDetail = new OASItemAttributeDetail();
        System.assertEquals(new List<OASItemAttributeDescription>(), itemAttributeDetail.descriptions);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), itemAttributeDetail.items);
        System.assertEquals(new List<OASItemAttributeName>(), itemAttributeDetail.names);
        System.assertEquals(null, itemAttributeDetail.id);
        System.assertEquals(null, itemAttributeDetail.name);
    }
}
