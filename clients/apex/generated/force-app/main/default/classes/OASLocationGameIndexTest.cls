@isTest
private class OASLocationGameIndexTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationGameIndex locationGameIndex1 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex2 = locationGameIndex1;
        OASLocationGameIndex locationGameIndex3 = new OASLocationGameIndex();
        OASLocationGameIndex locationGameIndex4 = locationGameIndex3;

        System.assert(locationGameIndex1.equals(locationGameIndex2));
        System.assert(locationGameIndex2.equals(locationGameIndex1));
        System.assert(locationGameIndex1.equals(locationGameIndex1));
        System.assert(locationGameIndex3.equals(locationGameIndex4));
        System.assert(locationGameIndex4.equals(locationGameIndex3));
        System.assert(locationGameIndex3.equals(locationGameIndex3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationGameIndex locationGameIndex1 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex2 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex3 = new OASLocationGameIndex();
        OASLocationGameIndex locationGameIndex4 = new OASLocationGameIndex();

        System.assert(locationGameIndex1.equals(locationGameIndex2));
        System.assert(locationGameIndex2.equals(locationGameIndex1));
        System.assert(locationGameIndex3.equals(locationGameIndex4));
        System.assert(locationGameIndex4.equals(locationGameIndex3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationGameIndex locationGameIndex1 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex2 = new OASLocationGameIndex();

        System.assertEquals(false, locationGameIndex1.equals('foo'));
        System.assertEquals(false, locationGameIndex2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationGameIndex locationGameIndex1 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex2 = new OASLocationGameIndex();
        OASLocationGameIndex locationGameIndex3;

        System.assertEquals(false, locationGameIndex1.equals(locationGameIndex3));
        System.assertEquals(false, locationGameIndex2.equals(locationGameIndex3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationGameIndex locationGameIndex1 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex2 = new OASLocationGameIndex();

        System.assertEquals(locationGameIndex1.hashCode(), locationGameIndex1.hashCode());
        System.assertEquals(locationGameIndex2.hashCode(), locationGameIndex2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationGameIndex locationGameIndex1 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex2 = OASLocationGameIndex.getExample();
        OASLocationGameIndex locationGameIndex3 = new OASLocationGameIndex();
        OASLocationGameIndex locationGameIndex4 = new OASLocationGameIndex();

        System.assert(locationGameIndex1.equals(locationGameIndex2));
        System.assert(locationGameIndex3.equals(locationGameIndex4));
        System.assertEquals(locationGameIndex1.hashCode(), locationGameIndex2.hashCode());
        System.assertEquals(locationGameIndex3.hashCode(), locationGameIndex4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationGameIndex locationGameIndex = new OASLocationGameIndex();
        Map<String, String> x-property-mappings = locationGameIndex.getx-property-mappings();
        System.assertEquals('gameIndex', x-property-mappings.get('game_index'));
    }
}
