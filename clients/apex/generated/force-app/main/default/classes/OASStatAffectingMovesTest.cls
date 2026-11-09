@isTest
private class OASStatAffectingMovesTest {
    @isTest
    private static void equalsSameInstance() {
        OASStatAffectingMoves statAffectingMoves1 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves2 = statAffectingMoves1;
        OASStatAffectingMoves statAffectingMoves3 = new OASStatAffectingMoves();
        OASStatAffectingMoves statAffectingMoves4 = statAffectingMoves3;

        System.assert(statAffectingMoves1.equals(statAffectingMoves2));
        System.assert(statAffectingMoves2.equals(statAffectingMoves1));
        System.assert(statAffectingMoves1.equals(statAffectingMoves1));
        System.assert(statAffectingMoves3.equals(statAffectingMoves4));
        System.assert(statAffectingMoves4.equals(statAffectingMoves3));
        System.assert(statAffectingMoves3.equals(statAffectingMoves3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatAffectingMoves statAffectingMoves1 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves2 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves3 = new OASStatAffectingMoves();
        OASStatAffectingMoves statAffectingMoves4 = new OASStatAffectingMoves();

        System.assert(statAffectingMoves1.equals(statAffectingMoves2));
        System.assert(statAffectingMoves2.equals(statAffectingMoves1));
        System.assert(statAffectingMoves3.equals(statAffectingMoves4));
        System.assert(statAffectingMoves4.equals(statAffectingMoves3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatAffectingMoves statAffectingMoves1 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves2 = new OASStatAffectingMoves();

        System.assertEquals(false, statAffectingMoves1.equals('foo'));
        System.assertEquals(false, statAffectingMoves2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatAffectingMoves statAffectingMoves1 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves2 = new OASStatAffectingMoves();
        OASStatAffectingMoves statAffectingMoves3;

        System.assertEquals(false, statAffectingMoves1.equals(statAffectingMoves3));
        System.assertEquals(false, statAffectingMoves2.equals(statAffectingMoves3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatAffectingMoves statAffectingMoves1 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves2 = new OASStatAffectingMoves();

        System.assertEquals(statAffectingMoves1.hashCode(), statAffectingMoves1.hashCode());
        System.assertEquals(statAffectingMoves2.hashCode(), statAffectingMoves2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatAffectingMoves statAffectingMoves1 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves2 = OASStatAffectingMoves.getExample();
        OASStatAffectingMoves statAffectingMoves3 = new OASStatAffectingMoves();
        OASStatAffectingMoves statAffectingMoves4 = new OASStatAffectingMoves();

        System.assert(statAffectingMoves1.equals(statAffectingMoves2));
        System.assert(statAffectingMoves3.equals(statAffectingMoves4));
        System.assertEquals(statAffectingMoves1.hashCode(), statAffectingMoves2.hashCode());
        System.assertEquals(statAffectingMoves3.hashCode(), statAffectingMoves4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASStatAffectingMoves statAffectingMoves = new OASStatAffectingMoves();
        System.assertEquals(new List<OASMoveStatChange>(), statAffectingMoves.increase);
        System.assertEquals(new List<OASMoveStatChange>(), statAffectingMoves.decrease);
    }
}
