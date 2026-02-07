@isTest
private class OASMoveDetailContestCombosTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetailContestCombos moveDetailContestCombos1 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos2 = moveDetailContestCombos1;
        OASMoveDetailContestCombos moveDetailContestCombos3 = new OASMoveDetailContestCombos();
        OASMoveDetailContestCombos moveDetailContestCombos4 = moveDetailContestCombos3;

        System.assert(moveDetailContestCombos1.equals(moveDetailContestCombos2));
        System.assert(moveDetailContestCombos2.equals(moveDetailContestCombos1));
        System.assert(moveDetailContestCombos1.equals(moveDetailContestCombos1));
        System.assert(moveDetailContestCombos3.equals(moveDetailContestCombos4));
        System.assert(moveDetailContestCombos4.equals(moveDetailContestCombos3));
        System.assert(moveDetailContestCombos3.equals(moveDetailContestCombos3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetailContestCombos moveDetailContestCombos1 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos2 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos3 = new OASMoveDetailContestCombos();
        OASMoveDetailContestCombos moveDetailContestCombos4 = new OASMoveDetailContestCombos();

        System.assert(moveDetailContestCombos1.equals(moveDetailContestCombos2));
        System.assert(moveDetailContestCombos2.equals(moveDetailContestCombos1));
        System.assert(moveDetailContestCombos3.equals(moveDetailContestCombos4));
        System.assert(moveDetailContestCombos4.equals(moveDetailContestCombos3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetailContestCombos moveDetailContestCombos1 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos2 = new OASMoveDetailContestCombos();

        System.assertEquals(false, moveDetailContestCombos1.equals('foo'));
        System.assertEquals(false, moveDetailContestCombos2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetailContestCombos moveDetailContestCombos1 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos2 = new OASMoveDetailContestCombos();
        OASMoveDetailContestCombos moveDetailContestCombos3;

        System.assertEquals(false, moveDetailContestCombos1.equals(moveDetailContestCombos3));
        System.assertEquals(false, moveDetailContestCombos2.equals(moveDetailContestCombos3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetailContestCombos moveDetailContestCombos1 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos2 = new OASMoveDetailContestCombos();

        System.assertEquals(moveDetailContestCombos1.hashCode(), moveDetailContestCombos1.hashCode());
        System.assertEquals(moveDetailContestCombos2.hashCode(), moveDetailContestCombos2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetailContestCombos moveDetailContestCombos1 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos2 = OASMoveDetailContestCombos.getExample();
        OASMoveDetailContestCombos moveDetailContestCombos3 = new OASMoveDetailContestCombos();
        OASMoveDetailContestCombos moveDetailContestCombos4 = new OASMoveDetailContestCombos();

        System.assert(moveDetailContestCombos1.equals(moveDetailContestCombos2));
        System.assert(moveDetailContestCombos3.equals(moveDetailContestCombos4));
        System.assertEquals(moveDetailContestCombos1.hashCode(), moveDetailContestCombos2.hashCode());
        System.assertEquals(moveDetailContestCombos3.hashCode(), moveDetailContestCombos4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveDetailContestCombos moveDetailContestCombos = new OASMoveDetailContestCombos();
        Map<String, String> x-property-mappings = moveDetailContestCombos.getx-property-mappings();
        System.assertEquals('r_super', x-property-mappings.get('super'));
    }
}
