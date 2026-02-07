@isTest
private class OASNatureBattleStylePreferenceTest {
    @isTest
    private static void equalsSameInstance() {
        OASNatureBattleStylePreference natureBattleStylePreference1 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference2 = natureBattleStylePreference1;
        OASNatureBattleStylePreference natureBattleStylePreference3 = new OASNatureBattleStylePreference();
        OASNatureBattleStylePreference natureBattleStylePreference4 = natureBattleStylePreference3;

        System.assert(natureBattleStylePreference1.equals(natureBattleStylePreference2));
        System.assert(natureBattleStylePreference2.equals(natureBattleStylePreference1));
        System.assert(natureBattleStylePreference1.equals(natureBattleStylePreference1));
        System.assert(natureBattleStylePreference3.equals(natureBattleStylePreference4));
        System.assert(natureBattleStylePreference4.equals(natureBattleStylePreference3));
        System.assert(natureBattleStylePreference3.equals(natureBattleStylePreference3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNatureBattleStylePreference natureBattleStylePreference1 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference2 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference3 = new OASNatureBattleStylePreference();
        OASNatureBattleStylePreference natureBattleStylePreference4 = new OASNatureBattleStylePreference();

        System.assert(natureBattleStylePreference1.equals(natureBattleStylePreference2));
        System.assert(natureBattleStylePreference2.equals(natureBattleStylePreference1));
        System.assert(natureBattleStylePreference3.equals(natureBattleStylePreference4));
        System.assert(natureBattleStylePreference4.equals(natureBattleStylePreference3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNatureBattleStylePreference natureBattleStylePreference1 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference2 = new OASNatureBattleStylePreference();

        System.assertEquals(false, natureBattleStylePreference1.equals('foo'));
        System.assertEquals(false, natureBattleStylePreference2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNatureBattleStylePreference natureBattleStylePreference1 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference2 = new OASNatureBattleStylePreference();
        OASNatureBattleStylePreference natureBattleStylePreference3;

        System.assertEquals(false, natureBattleStylePreference1.equals(natureBattleStylePreference3));
        System.assertEquals(false, natureBattleStylePreference2.equals(natureBattleStylePreference3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNatureBattleStylePreference natureBattleStylePreference1 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference2 = new OASNatureBattleStylePreference();

        System.assertEquals(natureBattleStylePreference1.hashCode(), natureBattleStylePreference1.hashCode());
        System.assertEquals(natureBattleStylePreference2.hashCode(), natureBattleStylePreference2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNatureBattleStylePreference natureBattleStylePreference1 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference2 = OASNatureBattleStylePreference.getExample();
        OASNatureBattleStylePreference natureBattleStylePreference3 = new OASNatureBattleStylePreference();
        OASNatureBattleStylePreference natureBattleStylePreference4 = new OASNatureBattleStylePreference();

        System.assert(natureBattleStylePreference1.equals(natureBattleStylePreference2));
        System.assert(natureBattleStylePreference3.equals(natureBattleStylePreference4));
        System.assertEquals(natureBattleStylePreference1.hashCode(), natureBattleStylePreference2.hashCode());
        System.assertEquals(natureBattleStylePreference3.hashCode(), natureBattleStylePreference4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASNatureBattleStylePreference natureBattleStylePreference = new OASNatureBattleStylePreference();
        Map<String, String> x-property-mappings = natureBattleStylePreference.getx-property-mappings();
        System.assertEquals('lowHpPreference', x-property-mappings.get('low_hp_preference'));
        System.assertEquals('highHpPreference', x-property-mappings.get('high_hp_preference'));
        System.assertEquals('moveBattleStyle', x-property-mappings.get('move_battle_style'));
    }
}
