@isTest
private class OASMoveCombosTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveCombos moveCombos1 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos2 = moveCombos1;
        OASMoveCombos moveCombos3 = new OASMoveCombos();
        OASMoveCombos moveCombos4 = moveCombos3;

        System.assert(moveCombos1.equals(moveCombos2));
        System.assert(moveCombos2.equals(moveCombos1));
        System.assert(moveCombos1.equals(moveCombos1));
        System.assert(moveCombos3.equals(moveCombos4));
        System.assert(moveCombos4.equals(moveCombos3));
        System.assert(moveCombos3.equals(moveCombos3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveCombos moveCombos1 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos2 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos3 = new OASMoveCombos();
        OASMoveCombos moveCombos4 = new OASMoveCombos();

        System.assert(moveCombos1.equals(moveCombos2));
        System.assert(moveCombos2.equals(moveCombos1));
        System.assert(moveCombos3.equals(moveCombos4));
        System.assert(moveCombos4.equals(moveCombos3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveCombos moveCombos1 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos2 = new OASMoveCombos();

        System.assertEquals(false, moveCombos1.equals('foo'));
        System.assertEquals(false, moveCombos2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveCombos moveCombos1 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos2 = new OASMoveCombos();
        OASMoveCombos moveCombos3;

        System.assertEquals(false, moveCombos1.equals(moveCombos3));
        System.assertEquals(false, moveCombos2.equals(moveCombos3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveCombos moveCombos1 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos2 = new OASMoveCombos();

        System.assertEquals(moveCombos1.hashCode(), moveCombos1.hashCode());
        System.assertEquals(moveCombos2.hashCode(), moveCombos2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveCombos moveCombos1 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos2 = OASMoveCombos.getExample();
        OASMoveCombos moveCombos3 = new OASMoveCombos();
        OASMoveCombos moveCombos4 = new OASMoveCombos();

        System.assert(moveCombos1.equals(moveCombos2));
        System.assert(moveCombos3.equals(moveCombos4));
        System.assertEquals(moveCombos1.hashCode(), moveCombos2.hashCode());
        System.assertEquals(moveCombos3.hashCode(), moveCombos4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveCombos moveCombos = new OASMoveCombos();
        Map<String, String> x-property-mappings = moveCombos.getx-property-mappings();
        System.assertEquals('r_super', x-property-mappings.get('super'));
    }
}
