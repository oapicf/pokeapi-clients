@isTest
private class OASMoveLearnMethodDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveLearnMethodDetail moveLearnMethodDetail1 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail2 = moveLearnMethodDetail1;
        OASMoveLearnMethodDetail moveLearnMethodDetail3 = new OASMoveLearnMethodDetail();
        OASMoveLearnMethodDetail moveLearnMethodDetail4 = moveLearnMethodDetail3;

        System.assert(moveLearnMethodDetail1.equals(moveLearnMethodDetail2));
        System.assert(moveLearnMethodDetail2.equals(moveLearnMethodDetail1));
        System.assert(moveLearnMethodDetail1.equals(moveLearnMethodDetail1));
        System.assert(moveLearnMethodDetail3.equals(moveLearnMethodDetail4));
        System.assert(moveLearnMethodDetail4.equals(moveLearnMethodDetail3));
        System.assert(moveLearnMethodDetail3.equals(moveLearnMethodDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveLearnMethodDetail moveLearnMethodDetail1 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail2 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail3 = new OASMoveLearnMethodDetail();
        OASMoveLearnMethodDetail moveLearnMethodDetail4 = new OASMoveLearnMethodDetail();

        System.assert(moveLearnMethodDetail1.equals(moveLearnMethodDetail2));
        System.assert(moveLearnMethodDetail2.equals(moveLearnMethodDetail1));
        System.assert(moveLearnMethodDetail3.equals(moveLearnMethodDetail4));
        System.assert(moveLearnMethodDetail4.equals(moveLearnMethodDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveLearnMethodDetail moveLearnMethodDetail1 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail2 = new OASMoveLearnMethodDetail();

        System.assertEquals(false, moveLearnMethodDetail1.equals('foo'));
        System.assertEquals(false, moveLearnMethodDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveLearnMethodDetail moveLearnMethodDetail1 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail2 = new OASMoveLearnMethodDetail();
        OASMoveLearnMethodDetail moveLearnMethodDetail3;

        System.assertEquals(false, moveLearnMethodDetail1.equals(moveLearnMethodDetail3));
        System.assertEquals(false, moveLearnMethodDetail2.equals(moveLearnMethodDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveLearnMethodDetail moveLearnMethodDetail1 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail2 = new OASMoveLearnMethodDetail();

        System.assertEquals(moveLearnMethodDetail1.hashCode(), moveLearnMethodDetail1.hashCode());
        System.assertEquals(moveLearnMethodDetail2.hashCode(), moveLearnMethodDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveLearnMethodDetail moveLearnMethodDetail1 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail2 = OASMoveLearnMethodDetail.getExample();
        OASMoveLearnMethodDetail moveLearnMethodDetail3 = new OASMoveLearnMethodDetail();
        OASMoveLearnMethodDetail moveLearnMethodDetail4 = new OASMoveLearnMethodDetail();

        System.assert(moveLearnMethodDetail1.equals(moveLearnMethodDetail2));
        System.assert(moveLearnMethodDetail3.equals(moveLearnMethodDetail4));
        System.assertEquals(moveLearnMethodDetail1.hashCode(), moveLearnMethodDetail2.hashCode());
        System.assertEquals(moveLearnMethodDetail3.hashCode(), moveLearnMethodDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveLearnMethodDetail moveLearnMethodDetail = new OASMoveLearnMethodDetail();
        Map<String, String> x-property-mappings = moveLearnMethodDetail.getx-property-mappings();
        System.assertEquals('versionGroups', x-property-mappings.get('version_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveLearnMethodDetail moveLearnMethodDetail = new OASMoveLearnMethodDetail();
        System.assertEquals(new List<OASMoveLearnMethodName>(), moveLearnMethodDetail.names);
        System.assertEquals(new List<OASMoveLearnMethodDescription>(), moveLearnMethodDetail.descriptions);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), moveLearnMethodDetail.versionGroups);
        System.assertEquals(null, moveLearnMethodDetail.id);
        System.assertEquals(null, moveLearnMethodDetail.name);
    }
}
