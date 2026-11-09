@isTest
private class OASBerryFlavorBerryMapTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFlavorBerryMap berryFlavorBerryMap1 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap2 = berryFlavorBerryMap1;
        OASBerryFlavorBerryMap berryFlavorBerryMap3 = new OASBerryFlavorBerryMap();
        OASBerryFlavorBerryMap berryFlavorBerryMap4 = berryFlavorBerryMap3;

        System.assert(berryFlavorBerryMap1.equals(berryFlavorBerryMap2));
        System.assert(berryFlavorBerryMap2.equals(berryFlavorBerryMap1));
        System.assert(berryFlavorBerryMap1.equals(berryFlavorBerryMap1));
        System.assert(berryFlavorBerryMap3.equals(berryFlavorBerryMap4));
        System.assert(berryFlavorBerryMap4.equals(berryFlavorBerryMap3));
        System.assert(berryFlavorBerryMap3.equals(berryFlavorBerryMap3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFlavorBerryMap berryFlavorBerryMap1 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap2 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap3 = new OASBerryFlavorBerryMap();
        OASBerryFlavorBerryMap berryFlavorBerryMap4 = new OASBerryFlavorBerryMap();

        System.assert(berryFlavorBerryMap1.equals(berryFlavorBerryMap2));
        System.assert(berryFlavorBerryMap2.equals(berryFlavorBerryMap1));
        System.assert(berryFlavorBerryMap3.equals(berryFlavorBerryMap4));
        System.assert(berryFlavorBerryMap4.equals(berryFlavorBerryMap3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFlavorBerryMap berryFlavorBerryMap1 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap2 = new OASBerryFlavorBerryMap();

        System.assertEquals(false, berryFlavorBerryMap1.equals('foo'));
        System.assertEquals(false, berryFlavorBerryMap2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFlavorBerryMap berryFlavorBerryMap1 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap2 = new OASBerryFlavorBerryMap();
        OASBerryFlavorBerryMap berryFlavorBerryMap3;

        System.assertEquals(false, berryFlavorBerryMap1.equals(berryFlavorBerryMap3));
        System.assertEquals(false, berryFlavorBerryMap2.equals(berryFlavorBerryMap3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFlavorBerryMap berryFlavorBerryMap1 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap2 = new OASBerryFlavorBerryMap();

        System.assertEquals(berryFlavorBerryMap1.hashCode(), berryFlavorBerryMap1.hashCode());
        System.assertEquals(berryFlavorBerryMap2.hashCode(), berryFlavorBerryMap2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFlavorBerryMap berryFlavorBerryMap1 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap2 = OASBerryFlavorBerryMap.getExample();
        OASBerryFlavorBerryMap berryFlavorBerryMap3 = new OASBerryFlavorBerryMap();
        OASBerryFlavorBerryMap berryFlavorBerryMap4 = new OASBerryFlavorBerryMap();

        System.assert(berryFlavorBerryMap1.equals(berryFlavorBerryMap2));
        System.assert(berryFlavorBerryMap3.equals(berryFlavorBerryMap4));
        System.assertEquals(berryFlavorBerryMap1.hashCode(), berryFlavorBerryMap2.hashCode());
        System.assertEquals(berryFlavorBerryMap3.hashCode(), berryFlavorBerryMap4.hashCode());
    }
}
