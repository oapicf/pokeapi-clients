@isTest
private class OASNatureDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASNatureDetail natureDetail1 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail2 = natureDetail1;
        OASNatureDetail natureDetail3 = new OASNatureDetail();
        OASNatureDetail natureDetail4 = natureDetail3;

        System.assert(natureDetail1.equals(natureDetail2));
        System.assert(natureDetail2.equals(natureDetail1));
        System.assert(natureDetail1.equals(natureDetail1));
        System.assert(natureDetail3.equals(natureDetail4));
        System.assert(natureDetail4.equals(natureDetail3));
        System.assert(natureDetail3.equals(natureDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNatureDetail natureDetail1 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail2 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail3 = new OASNatureDetail();
        OASNatureDetail natureDetail4 = new OASNatureDetail();

        System.assert(natureDetail1.equals(natureDetail2));
        System.assert(natureDetail2.equals(natureDetail1));
        System.assert(natureDetail3.equals(natureDetail4));
        System.assert(natureDetail4.equals(natureDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNatureDetail natureDetail1 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail2 = new OASNatureDetail();

        System.assertEquals(false, natureDetail1.equals('foo'));
        System.assertEquals(false, natureDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNatureDetail natureDetail1 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail2 = new OASNatureDetail();
        OASNatureDetail natureDetail3;

        System.assertEquals(false, natureDetail1.equals(natureDetail3));
        System.assertEquals(false, natureDetail2.equals(natureDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNatureDetail natureDetail1 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail2 = new OASNatureDetail();

        System.assertEquals(natureDetail1.hashCode(), natureDetail1.hashCode());
        System.assertEquals(natureDetail2.hashCode(), natureDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNatureDetail natureDetail1 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail2 = OASNatureDetail.getExample();
        OASNatureDetail natureDetail3 = new OASNatureDetail();
        OASNatureDetail natureDetail4 = new OASNatureDetail();

        System.assert(natureDetail1.equals(natureDetail2));
        System.assert(natureDetail3.equals(natureDetail4));
        System.assertEquals(natureDetail1.hashCode(), natureDetail2.hashCode());
        System.assertEquals(natureDetail3.hashCode(), natureDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASNatureDetail natureDetail = new OASNatureDetail();
        Map<String, String> x-property-mappings = natureDetail.getx-property-mappings();
        System.assertEquals('decreasedStat', x-property-mappings.get('decreased_stat'));
        System.assertEquals('increasedStat', x-property-mappings.get('increased_stat'));
        System.assertEquals('likesFlavor', x-property-mappings.get('likes_flavor'));
        System.assertEquals('hatesFlavor', x-property-mappings.get('hates_flavor'));
        System.assertEquals('pokeathlonStatChanges', x-property-mappings.get('pokeathlon_stat_changes'));
        System.assertEquals('moveBattleStylePreferences', x-property-mappings.get('move_battle_style_preferences'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASNatureDetail natureDetail = new OASNatureDetail();
        System.assertEquals(new List<OASBerrySummary>(), natureDetail.berries);
        System.assertEquals(new List<OASNatureDetailPokeathlonStatChanges>(), natureDetail.pokeathlonStatChanges);
        System.assertEquals(new List<OASNatureBattleStylePreference>(), natureDetail.moveBattleStylePreferences);
        System.assertEquals(new List<OASNatureName>(), natureDetail.names);
        System.assertEquals(null, natureDetail.id);
        System.assertEquals(null, natureDetail.name);
        System.assertEquals(null, natureDetail.decreasedStat);
        System.assertEquals(null, natureDetail.increasedStat);
        System.assertEquals(null, natureDetail.likesFlavor);
        System.assertEquals(null, natureDetail.hatesFlavor);
    }
}
