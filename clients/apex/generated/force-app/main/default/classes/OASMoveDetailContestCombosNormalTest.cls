@isTest
private class OASMoveDetailContestCombosNormalTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal1 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal2 = moveDetailContestCombosNormal1;
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal3 = new OASMoveDetailContestCombosNormal();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal4 = moveDetailContestCombosNormal3;

        System.assert(moveDetailContestCombosNormal1.equals(moveDetailContestCombosNormal2));
        System.assert(moveDetailContestCombosNormal2.equals(moveDetailContestCombosNormal1));
        System.assert(moveDetailContestCombosNormal1.equals(moveDetailContestCombosNormal1));
        System.assert(moveDetailContestCombosNormal3.equals(moveDetailContestCombosNormal4));
        System.assert(moveDetailContestCombosNormal4.equals(moveDetailContestCombosNormal3));
        System.assert(moveDetailContestCombosNormal3.equals(moveDetailContestCombosNormal3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal1 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal2 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal3 = new OASMoveDetailContestCombosNormal();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal4 = new OASMoveDetailContestCombosNormal();

        System.assert(moveDetailContestCombosNormal1.equals(moveDetailContestCombosNormal2));
        System.assert(moveDetailContestCombosNormal2.equals(moveDetailContestCombosNormal1));
        System.assert(moveDetailContestCombosNormal3.equals(moveDetailContestCombosNormal4));
        System.assert(moveDetailContestCombosNormal4.equals(moveDetailContestCombosNormal3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal1 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal2 = new OASMoveDetailContestCombosNormal();

        System.assertEquals(false, moveDetailContestCombosNormal1.equals('foo'));
        System.assertEquals(false, moveDetailContestCombosNormal2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal1 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal2 = new OASMoveDetailContestCombosNormal();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal3;

        System.assertEquals(false, moveDetailContestCombosNormal1.equals(moveDetailContestCombosNormal3));
        System.assertEquals(false, moveDetailContestCombosNormal2.equals(moveDetailContestCombosNormal3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal1 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal2 = new OASMoveDetailContestCombosNormal();

        System.assertEquals(moveDetailContestCombosNormal1.hashCode(), moveDetailContestCombosNormal1.hashCode());
        System.assertEquals(moveDetailContestCombosNormal2.hashCode(), moveDetailContestCombosNormal2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal1 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal2 = OASMoveDetailContestCombosNormal.getExample();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal3 = new OASMoveDetailContestCombosNormal();
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal4 = new OASMoveDetailContestCombosNormal();

        System.assert(moveDetailContestCombosNormal1.equals(moveDetailContestCombosNormal2));
        System.assert(moveDetailContestCombosNormal3.equals(moveDetailContestCombosNormal4));
        System.assertEquals(moveDetailContestCombosNormal1.hashCode(), moveDetailContestCombosNormal2.hashCode());
        System.assertEquals(moveDetailContestCombosNormal3.hashCode(), moveDetailContestCombosNormal4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal = new OASMoveDetailContestCombosNormal();
        Map<String, String> x-property-mappings = moveDetailContestCombosNormal.getx-property-mappings();
        System.assertEquals('useBefore', x-property-mappings.get('use_before'));
        System.assertEquals('useAfter', x-property-mappings.get('use_after'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveDetailContestCombosNormal moveDetailContestCombosNormal = new OASMoveDetailContestCombosNormal();
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), moveDetailContestCombosNormal.useBefore);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), moveDetailContestCombosNormal.useAfter);
    }
}
