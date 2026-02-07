@isTest
private class OASItemGameIndexTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemGameIndex itemGameIndex1 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex2 = itemGameIndex1;
        OASItemGameIndex itemGameIndex3 = new OASItemGameIndex();
        OASItemGameIndex itemGameIndex4 = itemGameIndex3;

        System.assert(itemGameIndex1.equals(itemGameIndex2));
        System.assert(itemGameIndex2.equals(itemGameIndex1));
        System.assert(itemGameIndex1.equals(itemGameIndex1));
        System.assert(itemGameIndex3.equals(itemGameIndex4));
        System.assert(itemGameIndex4.equals(itemGameIndex3));
        System.assert(itemGameIndex3.equals(itemGameIndex3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemGameIndex itemGameIndex1 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex2 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex3 = new OASItemGameIndex();
        OASItemGameIndex itemGameIndex4 = new OASItemGameIndex();

        System.assert(itemGameIndex1.equals(itemGameIndex2));
        System.assert(itemGameIndex2.equals(itemGameIndex1));
        System.assert(itemGameIndex3.equals(itemGameIndex4));
        System.assert(itemGameIndex4.equals(itemGameIndex3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemGameIndex itemGameIndex1 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex2 = new OASItemGameIndex();

        System.assertEquals(false, itemGameIndex1.equals('foo'));
        System.assertEquals(false, itemGameIndex2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemGameIndex itemGameIndex1 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex2 = new OASItemGameIndex();
        OASItemGameIndex itemGameIndex3;

        System.assertEquals(false, itemGameIndex1.equals(itemGameIndex3));
        System.assertEquals(false, itemGameIndex2.equals(itemGameIndex3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemGameIndex itemGameIndex1 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex2 = new OASItemGameIndex();

        System.assertEquals(itemGameIndex1.hashCode(), itemGameIndex1.hashCode());
        System.assertEquals(itemGameIndex2.hashCode(), itemGameIndex2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemGameIndex itemGameIndex1 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex2 = OASItemGameIndex.getExample();
        OASItemGameIndex itemGameIndex3 = new OASItemGameIndex();
        OASItemGameIndex itemGameIndex4 = new OASItemGameIndex();

        System.assert(itemGameIndex1.equals(itemGameIndex2));
        System.assert(itemGameIndex3.equals(itemGameIndex4));
        System.assertEquals(itemGameIndex1.hashCode(), itemGameIndex2.hashCode());
        System.assertEquals(itemGameIndex3.hashCode(), itemGameIndex4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemGameIndex itemGameIndex = new OASItemGameIndex();
        Map<String, String> x-property-mappings = itemGameIndex.getx-property-mappings();
        System.assertEquals('gameIndex', x-property-mappings.get('game_index'));
    }
}
