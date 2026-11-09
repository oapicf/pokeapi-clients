@isTest
private class OASEncounterPokemonDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterPokemonDetail encounterPokemonDetail1 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail2 = encounterPokemonDetail1;
        OASEncounterPokemonDetail encounterPokemonDetail3 = new OASEncounterPokemonDetail();
        OASEncounterPokemonDetail encounterPokemonDetail4 = encounterPokemonDetail3;

        System.assert(encounterPokemonDetail1.equals(encounterPokemonDetail2));
        System.assert(encounterPokemonDetail2.equals(encounterPokemonDetail1));
        System.assert(encounterPokemonDetail1.equals(encounterPokemonDetail1));
        System.assert(encounterPokemonDetail3.equals(encounterPokemonDetail4));
        System.assert(encounterPokemonDetail4.equals(encounterPokemonDetail3));
        System.assert(encounterPokemonDetail3.equals(encounterPokemonDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterPokemonDetail encounterPokemonDetail1 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail2 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail3 = new OASEncounterPokemonDetail();
        OASEncounterPokemonDetail encounterPokemonDetail4 = new OASEncounterPokemonDetail();

        System.assert(encounterPokemonDetail1.equals(encounterPokemonDetail2));
        System.assert(encounterPokemonDetail2.equals(encounterPokemonDetail1));
        System.assert(encounterPokemonDetail3.equals(encounterPokemonDetail4));
        System.assert(encounterPokemonDetail4.equals(encounterPokemonDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterPokemonDetail encounterPokemonDetail1 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail2 = new OASEncounterPokemonDetail();

        System.assertEquals(false, encounterPokemonDetail1.equals('foo'));
        System.assertEquals(false, encounterPokemonDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterPokemonDetail encounterPokemonDetail1 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail2 = new OASEncounterPokemonDetail();
        OASEncounterPokemonDetail encounterPokemonDetail3;

        System.assertEquals(false, encounterPokemonDetail1.equals(encounterPokemonDetail3));
        System.assertEquals(false, encounterPokemonDetail2.equals(encounterPokemonDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterPokemonDetail encounterPokemonDetail1 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail2 = new OASEncounterPokemonDetail();

        System.assertEquals(encounterPokemonDetail1.hashCode(), encounterPokemonDetail1.hashCode());
        System.assertEquals(encounterPokemonDetail2.hashCode(), encounterPokemonDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterPokemonDetail encounterPokemonDetail1 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail2 = OASEncounterPokemonDetail.getExample();
        OASEncounterPokemonDetail encounterPokemonDetail3 = new OASEncounterPokemonDetail();
        OASEncounterPokemonDetail encounterPokemonDetail4 = new OASEncounterPokemonDetail();

        System.assert(encounterPokemonDetail1.equals(encounterPokemonDetail2));
        System.assert(encounterPokemonDetail3.equals(encounterPokemonDetail4));
        System.assertEquals(encounterPokemonDetail1.hashCode(), encounterPokemonDetail2.hashCode());
        System.assertEquals(encounterPokemonDetail3.hashCode(), encounterPokemonDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEncounterPokemonDetail encounterPokemonDetail = new OASEncounterPokemonDetail();
        Map<String, String> x-property-mappings = encounterPokemonDetail.getx-property-mappings();
        System.assertEquals('minPerfectIvs', x-property-mappings.get('min_perfect_ivs'));
        System.assertEquals('alwaysShiny', x-property-mappings.get('always_shiny'));
        System.assertEquals('neverShiny', x-property-mappings.get('never_shiny'));
        System.assertEquals('isAlpha', x-property-mappings.get('is_alpha'));
    }
}
