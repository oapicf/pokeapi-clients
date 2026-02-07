@isTest
private class OASMoveMetaCategoryDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMetaCategoryDetail moveMetaCategoryDetail1 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail2 = moveMetaCategoryDetail1;
        OASMoveMetaCategoryDetail moveMetaCategoryDetail3 = new OASMoveMetaCategoryDetail();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail4 = moveMetaCategoryDetail3;

        System.assert(moveMetaCategoryDetail1.equals(moveMetaCategoryDetail2));
        System.assert(moveMetaCategoryDetail2.equals(moveMetaCategoryDetail1));
        System.assert(moveMetaCategoryDetail1.equals(moveMetaCategoryDetail1));
        System.assert(moveMetaCategoryDetail3.equals(moveMetaCategoryDetail4));
        System.assert(moveMetaCategoryDetail4.equals(moveMetaCategoryDetail3));
        System.assert(moveMetaCategoryDetail3.equals(moveMetaCategoryDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMetaCategoryDetail moveMetaCategoryDetail1 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail2 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail3 = new OASMoveMetaCategoryDetail();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail4 = new OASMoveMetaCategoryDetail();

        System.assert(moveMetaCategoryDetail1.equals(moveMetaCategoryDetail2));
        System.assert(moveMetaCategoryDetail2.equals(moveMetaCategoryDetail1));
        System.assert(moveMetaCategoryDetail3.equals(moveMetaCategoryDetail4));
        System.assert(moveMetaCategoryDetail4.equals(moveMetaCategoryDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMetaCategoryDetail moveMetaCategoryDetail1 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail2 = new OASMoveMetaCategoryDetail();

        System.assertEquals(false, moveMetaCategoryDetail1.equals('foo'));
        System.assertEquals(false, moveMetaCategoryDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMetaCategoryDetail moveMetaCategoryDetail1 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail2 = new OASMoveMetaCategoryDetail();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail3;

        System.assertEquals(false, moveMetaCategoryDetail1.equals(moveMetaCategoryDetail3));
        System.assertEquals(false, moveMetaCategoryDetail2.equals(moveMetaCategoryDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMetaCategoryDetail moveMetaCategoryDetail1 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail2 = new OASMoveMetaCategoryDetail();

        System.assertEquals(moveMetaCategoryDetail1.hashCode(), moveMetaCategoryDetail1.hashCode());
        System.assertEquals(moveMetaCategoryDetail2.hashCode(), moveMetaCategoryDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMetaCategoryDetail moveMetaCategoryDetail1 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail2 = OASMoveMetaCategoryDetail.getExample();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail3 = new OASMoveMetaCategoryDetail();
        OASMoveMetaCategoryDetail moveMetaCategoryDetail4 = new OASMoveMetaCategoryDetail();

        System.assert(moveMetaCategoryDetail1.equals(moveMetaCategoryDetail2));
        System.assert(moveMetaCategoryDetail3.equals(moveMetaCategoryDetail4));
        System.assertEquals(moveMetaCategoryDetail1.hashCode(), moveMetaCategoryDetail2.hashCode());
        System.assertEquals(moveMetaCategoryDetail3.hashCode(), moveMetaCategoryDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveMetaCategoryDetail moveMetaCategoryDetail = new OASMoveMetaCategoryDetail();
        System.assertEquals(new List<OASMoveMetaCategoryDescription>(), moveMetaCategoryDetail.descriptions);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), moveMetaCategoryDetail.moves);
        System.assertEquals(null, moveMetaCategoryDetail.id);
        System.assertEquals(null, moveMetaCategoryDetail.name);
    }
}
