@isTest
private class OASStatDetailAffectingMovesTest {
    @isTest
    private static void equalsSameInstance() {
        OASStatDetailAffectingMoves statDetailAffectingMoves1 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves2 = statDetailAffectingMoves1;
        OASStatDetailAffectingMoves statDetailAffectingMoves3 = new OASStatDetailAffectingMoves();
        OASStatDetailAffectingMoves statDetailAffectingMoves4 = statDetailAffectingMoves3;

        System.assert(statDetailAffectingMoves1.equals(statDetailAffectingMoves2));
        System.assert(statDetailAffectingMoves2.equals(statDetailAffectingMoves1));
        System.assert(statDetailAffectingMoves1.equals(statDetailAffectingMoves1));
        System.assert(statDetailAffectingMoves3.equals(statDetailAffectingMoves4));
        System.assert(statDetailAffectingMoves4.equals(statDetailAffectingMoves3));
        System.assert(statDetailAffectingMoves3.equals(statDetailAffectingMoves3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatDetailAffectingMoves statDetailAffectingMoves1 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves2 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves3 = new OASStatDetailAffectingMoves();
        OASStatDetailAffectingMoves statDetailAffectingMoves4 = new OASStatDetailAffectingMoves();

        System.assert(statDetailAffectingMoves1.equals(statDetailAffectingMoves2));
        System.assert(statDetailAffectingMoves2.equals(statDetailAffectingMoves1));
        System.assert(statDetailAffectingMoves3.equals(statDetailAffectingMoves4));
        System.assert(statDetailAffectingMoves4.equals(statDetailAffectingMoves3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatDetailAffectingMoves statDetailAffectingMoves1 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves2 = new OASStatDetailAffectingMoves();

        System.assertEquals(false, statDetailAffectingMoves1.equals('foo'));
        System.assertEquals(false, statDetailAffectingMoves2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatDetailAffectingMoves statDetailAffectingMoves1 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves2 = new OASStatDetailAffectingMoves();
        OASStatDetailAffectingMoves statDetailAffectingMoves3;

        System.assertEquals(false, statDetailAffectingMoves1.equals(statDetailAffectingMoves3));
        System.assertEquals(false, statDetailAffectingMoves2.equals(statDetailAffectingMoves3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatDetailAffectingMoves statDetailAffectingMoves1 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves2 = new OASStatDetailAffectingMoves();

        System.assertEquals(statDetailAffectingMoves1.hashCode(), statDetailAffectingMoves1.hashCode());
        System.assertEquals(statDetailAffectingMoves2.hashCode(), statDetailAffectingMoves2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatDetailAffectingMoves statDetailAffectingMoves1 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves2 = OASStatDetailAffectingMoves.getExample();
        OASStatDetailAffectingMoves statDetailAffectingMoves3 = new OASStatDetailAffectingMoves();
        OASStatDetailAffectingMoves statDetailAffectingMoves4 = new OASStatDetailAffectingMoves();

        System.assert(statDetailAffectingMoves1.equals(statDetailAffectingMoves2));
        System.assert(statDetailAffectingMoves3.equals(statDetailAffectingMoves4));
        System.assertEquals(statDetailAffectingMoves1.hashCode(), statDetailAffectingMoves2.hashCode());
        System.assertEquals(statDetailAffectingMoves3.hashCode(), statDetailAffectingMoves4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASStatDetailAffectingMoves statDetailAffectingMoves = new OASStatDetailAffectingMoves();
        System.assertEquals(new List<OASStatDetailAffectingMovesIncreaseI>(), statDetailAffectingMoves.increase);
        System.assertEquals(new List<OASStatDetailAffectingMovesIncreaseI>(), statDetailAffectingMoves.decrease);
    }
}
