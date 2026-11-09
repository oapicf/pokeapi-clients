@isTest
private class OASTypeNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeName typeName1 = OASTypeName.getExample();
        OASTypeName typeName2 = typeName1;
        OASTypeName typeName3 = new OASTypeName();
        OASTypeName typeName4 = typeName3;

        System.assert(typeName1.equals(typeName2));
        System.assert(typeName2.equals(typeName1));
        System.assert(typeName1.equals(typeName1));
        System.assert(typeName3.equals(typeName4));
        System.assert(typeName4.equals(typeName3));
        System.assert(typeName3.equals(typeName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeName typeName1 = OASTypeName.getExample();
        OASTypeName typeName2 = OASTypeName.getExample();
        OASTypeName typeName3 = new OASTypeName();
        OASTypeName typeName4 = new OASTypeName();

        System.assert(typeName1.equals(typeName2));
        System.assert(typeName2.equals(typeName1));
        System.assert(typeName3.equals(typeName4));
        System.assert(typeName4.equals(typeName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeName typeName1 = OASTypeName.getExample();
        OASTypeName typeName2 = new OASTypeName();

        System.assertEquals(false, typeName1.equals('foo'));
        System.assertEquals(false, typeName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeName typeName1 = OASTypeName.getExample();
        OASTypeName typeName2 = new OASTypeName();
        OASTypeName typeName3;

        System.assertEquals(false, typeName1.equals(typeName3));
        System.assertEquals(false, typeName2.equals(typeName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeName typeName1 = OASTypeName.getExample();
        OASTypeName typeName2 = new OASTypeName();

        System.assertEquals(typeName1.hashCode(), typeName1.hashCode());
        System.assertEquals(typeName2.hashCode(), typeName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeName typeName1 = OASTypeName.getExample();
        OASTypeName typeName2 = OASTypeName.getExample();
        OASTypeName typeName3 = new OASTypeName();
        OASTypeName typeName4 = new OASTypeName();

        System.assert(typeName1.equals(typeName2));
        System.assert(typeName3.equals(typeName4));
        System.assertEquals(typeName1.hashCode(), typeName2.hashCode());
        System.assertEquals(typeName3.hashCode(), typeName4.hashCode());
    }
}
