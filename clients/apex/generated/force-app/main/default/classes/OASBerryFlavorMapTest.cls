@isTest
private class OASBerryFlavorMapTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFlavorMap berryFlavorMap1 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap2 = berryFlavorMap1;
        OASBerryFlavorMap berryFlavorMap3 = new OASBerryFlavorMap();
        OASBerryFlavorMap berryFlavorMap4 = berryFlavorMap3;

        System.assert(berryFlavorMap1.equals(berryFlavorMap2));
        System.assert(berryFlavorMap2.equals(berryFlavorMap1));
        System.assert(berryFlavorMap1.equals(berryFlavorMap1));
        System.assert(berryFlavorMap3.equals(berryFlavorMap4));
        System.assert(berryFlavorMap4.equals(berryFlavorMap3));
        System.assert(berryFlavorMap3.equals(berryFlavorMap3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFlavorMap berryFlavorMap1 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap2 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap3 = new OASBerryFlavorMap();
        OASBerryFlavorMap berryFlavorMap4 = new OASBerryFlavorMap();

        System.assert(berryFlavorMap1.equals(berryFlavorMap2));
        System.assert(berryFlavorMap2.equals(berryFlavorMap1));
        System.assert(berryFlavorMap3.equals(berryFlavorMap4));
        System.assert(berryFlavorMap4.equals(berryFlavorMap3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFlavorMap berryFlavorMap1 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap2 = new OASBerryFlavorMap();

        System.assertEquals(false, berryFlavorMap1.equals('foo'));
        System.assertEquals(false, berryFlavorMap2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFlavorMap berryFlavorMap1 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap2 = new OASBerryFlavorMap();
        OASBerryFlavorMap berryFlavorMap3;

        System.assertEquals(false, berryFlavorMap1.equals(berryFlavorMap3));
        System.assertEquals(false, berryFlavorMap2.equals(berryFlavorMap3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFlavorMap berryFlavorMap1 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap2 = new OASBerryFlavorMap();

        System.assertEquals(berryFlavorMap1.hashCode(), berryFlavorMap1.hashCode());
        System.assertEquals(berryFlavorMap2.hashCode(), berryFlavorMap2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFlavorMap berryFlavorMap1 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap2 = OASBerryFlavorMap.getExample();
        OASBerryFlavorMap berryFlavorMap3 = new OASBerryFlavorMap();
        OASBerryFlavorMap berryFlavorMap4 = new OASBerryFlavorMap();

        System.assert(berryFlavorMap1.equals(berryFlavorMap2));
        System.assert(berryFlavorMap3.equals(berryFlavorMap4));
        System.assertEquals(berryFlavorMap1.hashCode(), berryFlavorMap2.hashCode());
        System.assertEquals(berryFlavorMap3.hashCode(), berryFlavorMap4.hashCode());
    }
}
