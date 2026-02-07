@isTest
private class OASStatDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASStatDetail statDetail1 = OASStatDetail.getExample();
        OASStatDetail statDetail2 = statDetail1;
        OASStatDetail statDetail3 = new OASStatDetail();
        OASStatDetail statDetail4 = statDetail3;

        System.assert(statDetail1.equals(statDetail2));
        System.assert(statDetail2.equals(statDetail1));
        System.assert(statDetail1.equals(statDetail1));
        System.assert(statDetail3.equals(statDetail4));
        System.assert(statDetail4.equals(statDetail3));
        System.assert(statDetail3.equals(statDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatDetail statDetail1 = OASStatDetail.getExample();
        OASStatDetail statDetail2 = OASStatDetail.getExample();
        OASStatDetail statDetail3 = new OASStatDetail();
        OASStatDetail statDetail4 = new OASStatDetail();

        System.assert(statDetail1.equals(statDetail2));
        System.assert(statDetail2.equals(statDetail1));
        System.assert(statDetail3.equals(statDetail4));
        System.assert(statDetail4.equals(statDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatDetail statDetail1 = OASStatDetail.getExample();
        OASStatDetail statDetail2 = new OASStatDetail();

        System.assertEquals(false, statDetail1.equals('foo'));
        System.assertEquals(false, statDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatDetail statDetail1 = OASStatDetail.getExample();
        OASStatDetail statDetail2 = new OASStatDetail();
        OASStatDetail statDetail3;

        System.assertEquals(false, statDetail1.equals(statDetail3));
        System.assertEquals(false, statDetail2.equals(statDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatDetail statDetail1 = OASStatDetail.getExample();
        OASStatDetail statDetail2 = new OASStatDetail();

        System.assertEquals(statDetail1.hashCode(), statDetail1.hashCode());
        System.assertEquals(statDetail2.hashCode(), statDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatDetail statDetail1 = OASStatDetail.getExample();
        OASStatDetail statDetail2 = OASStatDetail.getExample();
        OASStatDetail statDetail3 = new OASStatDetail();
        OASStatDetail statDetail4 = new OASStatDetail();

        System.assert(statDetail1.equals(statDetail2));
        System.assert(statDetail3.equals(statDetail4));
        System.assertEquals(statDetail1.hashCode(), statDetail2.hashCode());
        System.assertEquals(statDetail3.hashCode(), statDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASStatDetail statDetail = new OASStatDetail();
        Map<String, String> x-property-mappings = statDetail.getx-property-mappings();
        System.assertEquals('gameIndex', x-property-mappings.get('game_index'));
        System.assertEquals('isBattleOnly', x-property-mappings.get('is_battle_only'));
        System.assertEquals('affectingMoves', x-property-mappings.get('affecting_moves'));
        System.assertEquals('affectingNatures', x-property-mappings.get('affecting_natures'));
        System.assertEquals('moveDamageClass', x-property-mappings.get('move_damage_class'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASStatDetail statDetail = new OASStatDetail();
        System.assertEquals(new List<OASCharacteristicSummary>(), statDetail.characteristics);
        System.assertEquals(new List<OASStatName>(), statDetail.names);
        System.assertEquals(null, statDetail.id);
        System.assertEquals(null, statDetail.name);
        System.assertEquals(null, statDetail.gameIndex);
        System.assertEquals(null, statDetail.isBattleOnly);
        System.assertEquals(null, statDetail.affectingMoves);
        System.assertEquals(null, statDetail.affectingNatures);
        System.assertEquals(null, statDetail.moveDamageClass);
    }
}
