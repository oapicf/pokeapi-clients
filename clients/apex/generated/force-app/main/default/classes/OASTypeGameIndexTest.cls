@isTest
private class OASTypeGameIndexTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeGameIndex typeGameIndex1 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex2 = typeGameIndex1;
        OASTypeGameIndex typeGameIndex3 = new OASTypeGameIndex();
        OASTypeGameIndex typeGameIndex4 = typeGameIndex3;

        System.assert(typeGameIndex1.equals(typeGameIndex2));
        System.assert(typeGameIndex2.equals(typeGameIndex1));
        System.assert(typeGameIndex1.equals(typeGameIndex1));
        System.assert(typeGameIndex3.equals(typeGameIndex4));
        System.assert(typeGameIndex4.equals(typeGameIndex3));
        System.assert(typeGameIndex3.equals(typeGameIndex3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeGameIndex typeGameIndex1 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex2 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex3 = new OASTypeGameIndex();
        OASTypeGameIndex typeGameIndex4 = new OASTypeGameIndex();

        System.assert(typeGameIndex1.equals(typeGameIndex2));
        System.assert(typeGameIndex2.equals(typeGameIndex1));
        System.assert(typeGameIndex3.equals(typeGameIndex4));
        System.assert(typeGameIndex4.equals(typeGameIndex3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeGameIndex typeGameIndex1 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex2 = new OASTypeGameIndex();

        System.assertEquals(false, typeGameIndex1.equals('foo'));
        System.assertEquals(false, typeGameIndex2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeGameIndex typeGameIndex1 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex2 = new OASTypeGameIndex();
        OASTypeGameIndex typeGameIndex3;

        System.assertEquals(false, typeGameIndex1.equals(typeGameIndex3));
        System.assertEquals(false, typeGameIndex2.equals(typeGameIndex3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeGameIndex typeGameIndex1 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex2 = new OASTypeGameIndex();

        System.assertEquals(typeGameIndex1.hashCode(), typeGameIndex1.hashCode());
        System.assertEquals(typeGameIndex2.hashCode(), typeGameIndex2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeGameIndex typeGameIndex1 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex2 = OASTypeGameIndex.getExample();
        OASTypeGameIndex typeGameIndex3 = new OASTypeGameIndex();
        OASTypeGameIndex typeGameIndex4 = new OASTypeGameIndex();

        System.assert(typeGameIndex1.equals(typeGameIndex2));
        System.assert(typeGameIndex3.equals(typeGameIndex4));
        System.assertEquals(typeGameIndex1.hashCode(), typeGameIndex2.hashCode());
        System.assertEquals(typeGameIndex3.hashCode(), typeGameIndex4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypeGameIndex typeGameIndex = new OASTypeGameIndex();
        Map<String, String> x-property-mappings = typeGameIndex.getx-property-mappings();
        System.assertEquals('gameIndex', x-property-mappings.get('game_index'));
    }
}
