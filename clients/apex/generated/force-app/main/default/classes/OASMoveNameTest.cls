@isTest
private class OASMoveNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveName moveName1 = OASMoveName.getExample();
        OASMoveName moveName2 = moveName1;
        OASMoveName moveName3 = new OASMoveName();
        OASMoveName moveName4 = moveName3;

        System.assert(moveName1.equals(moveName2));
        System.assert(moveName2.equals(moveName1));
        System.assert(moveName1.equals(moveName1));
        System.assert(moveName3.equals(moveName4));
        System.assert(moveName4.equals(moveName3));
        System.assert(moveName3.equals(moveName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveName moveName1 = OASMoveName.getExample();
        OASMoveName moveName2 = OASMoveName.getExample();
        OASMoveName moveName3 = new OASMoveName();
        OASMoveName moveName4 = new OASMoveName();

        System.assert(moveName1.equals(moveName2));
        System.assert(moveName2.equals(moveName1));
        System.assert(moveName3.equals(moveName4));
        System.assert(moveName4.equals(moveName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveName moveName1 = OASMoveName.getExample();
        OASMoveName moveName2 = new OASMoveName();

        System.assertEquals(false, moveName1.equals('foo'));
        System.assertEquals(false, moveName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveName moveName1 = OASMoveName.getExample();
        OASMoveName moveName2 = new OASMoveName();
        OASMoveName moveName3;

        System.assertEquals(false, moveName1.equals(moveName3));
        System.assertEquals(false, moveName2.equals(moveName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveName moveName1 = OASMoveName.getExample();
        OASMoveName moveName2 = new OASMoveName();

        System.assertEquals(moveName1.hashCode(), moveName1.hashCode());
        System.assertEquals(moveName2.hashCode(), moveName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveName moveName1 = OASMoveName.getExample();
        OASMoveName moveName2 = OASMoveName.getExample();
        OASMoveName moveName3 = new OASMoveName();
        OASMoveName moveName4 = new OASMoveName();

        System.assert(moveName1.equals(moveName2));
        System.assert(moveName3.equals(moveName4));
        System.assertEquals(moveName1.hashCode(), moveName2.hashCode());
        System.assertEquals(moveName3.hashCode(), moveName4.hashCode());
    }
}
