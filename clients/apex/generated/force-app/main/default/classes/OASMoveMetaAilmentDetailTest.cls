@isTest
private class OASMoveMetaAilmentDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMetaAilmentDetail moveMetaAilmentDetail1 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail2 = moveMetaAilmentDetail1;
        OASMoveMetaAilmentDetail moveMetaAilmentDetail3 = new OASMoveMetaAilmentDetail();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail4 = moveMetaAilmentDetail3;

        System.assert(moveMetaAilmentDetail1.equals(moveMetaAilmentDetail2));
        System.assert(moveMetaAilmentDetail2.equals(moveMetaAilmentDetail1));
        System.assert(moveMetaAilmentDetail1.equals(moveMetaAilmentDetail1));
        System.assert(moveMetaAilmentDetail3.equals(moveMetaAilmentDetail4));
        System.assert(moveMetaAilmentDetail4.equals(moveMetaAilmentDetail3));
        System.assert(moveMetaAilmentDetail3.equals(moveMetaAilmentDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMetaAilmentDetail moveMetaAilmentDetail1 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail2 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail3 = new OASMoveMetaAilmentDetail();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail4 = new OASMoveMetaAilmentDetail();

        System.assert(moveMetaAilmentDetail1.equals(moveMetaAilmentDetail2));
        System.assert(moveMetaAilmentDetail2.equals(moveMetaAilmentDetail1));
        System.assert(moveMetaAilmentDetail3.equals(moveMetaAilmentDetail4));
        System.assert(moveMetaAilmentDetail4.equals(moveMetaAilmentDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMetaAilmentDetail moveMetaAilmentDetail1 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail2 = new OASMoveMetaAilmentDetail();

        System.assertEquals(false, moveMetaAilmentDetail1.equals('foo'));
        System.assertEquals(false, moveMetaAilmentDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMetaAilmentDetail moveMetaAilmentDetail1 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail2 = new OASMoveMetaAilmentDetail();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail3;

        System.assertEquals(false, moveMetaAilmentDetail1.equals(moveMetaAilmentDetail3));
        System.assertEquals(false, moveMetaAilmentDetail2.equals(moveMetaAilmentDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMetaAilmentDetail moveMetaAilmentDetail1 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail2 = new OASMoveMetaAilmentDetail();

        System.assertEquals(moveMetaAilmentDetail1.hashCode(), moveMetaAilmentDetail1.hashCode());
        System.assertEquals(moveMetaAilmentDetail2.hashCode(), moveMetaAilmentDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMetaAilmentDetail moveMetaAilmentDetail1 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail2 = OASMoveMetaAilmentDetail.getExample();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail3 = new OASMoveMetaAilmentDetail();
        OASMoveMetaAilmentDetail moveMetaAilmentDetail4 = new OASMoveMetaAilmentDetail();

        System.assert(moveMetaAilmentDetail1.equals(moveMetaAilmentDetail2));
        System.assert(moveMetaAilmentDetail3.equals(moveMetaAilmentDetail4));
        System.assertEquals(moveMetaAilmentDetail1.hashCode(), moveMetaAilmentDetail2.hashCode());
        System.assertEquals(moveMetaAilmentDetail3.hashCode(), moveMetaAilmentDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveMetaAilmentDetail moveMetaAilmentDetail = new OASMoveMetaAilmentDetail();
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), moveMetaAilmentDetail.moves);
        System.assertEquals(new List<OASMoveMetaAilmentName>(), moveMetaAilmentDetail.names);
        System.assertEquals(null, moveMetaAilmentDetail.id);
        System.assertEquals(null, moveMetaAilmentDetail.name);
    }
}
