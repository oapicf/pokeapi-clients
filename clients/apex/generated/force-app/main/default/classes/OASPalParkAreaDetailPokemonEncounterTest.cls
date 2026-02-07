@isTest
private class OASPalParkAreaDetailPokemonEncounterTest {
    @isTest
    private static void equalsSameInstance() {
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner1 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner2 = palParkAreaDetailPokemonEncountersInner1;
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner3 = new OASPalParkAreaDetailPokemonEncounter();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner4 = palParkAreaDetailPokemonEncountersInner3;

        System.assert(palParkAreaDetailPokemonEncountersInner1.equals(palParkAreaDetailPokemonEncountersInner2));
        System.assert(palParkAreaDetailPokemonEncountersInner2.equals(palParkAreaDetailPokemonEncountersInner1));
        System.assert(palParkAreaDetailPokemonEncountersInner1.equals(palParkAreaDetailPokemonEncountersInner1));
        System.assert(palParkAreaDetailPokemonEncountersInner3.equals(palParkAreaDetailPokemonEncountersInner4));
        System.assert(palParkAreaDetailPokemonEncountersInner4.equals(palParkAreaDetailPokemonEncountersInner3));
        System.assert(palParkAreaDetailPokemonEncountersInner3.equals(palParkAreaDetailPokemonEncountersInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner1 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner2 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner3 = new OASPalParkAreaDetailPokemonEncounter();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner4 = new OASPalParkAreaDetailPokemonEncounter();

        System.assert(palParkAreaDetailPokemonEncountersInner1.equals(palParkAreaDetailPokemonEncountersInner2));
        System.assert(palParkAreaDetailPokemonEncountersInner2.equals(palParkAreaDetailPokemonEncountersInner1));
        System.assert(palParkAreaDetailPokemonEncountersInner3.equals(palParkAreaDetailPokemonEncountersInner4));
        System.assert(palParkAreaDetailPokemonEncountersInner4.equals(palParkAreaDetailPokemonEncountersInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner1 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner2 = new OASPalParkAreaDetailPokemonEncounter();

        System.assertEquals(false, palParkAreaDetailPokemonEncountersInner1.equals('foo'));
        System.assertEquals(false, palParkAreaDetailPokemonEncountersInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner1 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner2 = new OASPalParkAreaDetailPokemonEncounter();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner3;

        System.assertEquals(false, palParkAreaDetailPokemonEncountersInner1.equals(palParkAreaDetailPokemonEncountersInner3));
        System.assertEquals(false, palParkAreaDetailPokemonEncountersInner2.equals(palParkAreaDetailPokemonEncountersInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner1 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner2 = new OASPalParkAreaDetailPokemonEncounter();

        System.assertEquals(palParkAreaDetailPokemonEncountersInner1.hashCode(), palParkAreaDetailPokemonEncountersInner1.hashCode());
        System.assertEquals(palParkAreaDetailPokemonEncountersInner2.hashCode(), palParkAreaDetailPokemonEncountersInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner1 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner2 = OASPalParkAreaDetailPokemonEncounter.getExample();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner3 = new OASPalParkAreaDetailPokemonEncounter();
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner4 = new OASPalParkAreaDetailPokemonEncounter();

        System.assert(palParkAreaDetailPokemonEncountersInner1.equals(palParkAreaDetailPokemonEncountersInner2));
        System.assert(palParkAreaDetailPokemonEncountersInner3.equals(palParkAreaDetailPokemonEncountersInner4));
        System.assertEquals(palParkAreaDetailPokemonEncountersInner1.hashCode(), palParkAreaDetailPokemonEncountersInner2.hashCode());
        System.assertEquals(palParkAreaDetailPokemonEncountersInner3.hashCode(), palParkAreaDetailPokemonEncountersInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPalParkAreaDetailPokemonEncounter palParkAreaDetailPokemonEncountersInner = new OASPalParkAreaDetailPokemonEncounter();
        Map<String, String> x-property-mappings = palParkAreaDetailPokemonEncountersInner.getx-property-mappings();
        System.assertEquals('baseScore', x-property-mappings.get('base_score'));
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon-species'));
    }
}
