@isTest
private class OASPalParkEncounterTest {
    @isTest
    private static void equalsSameInstance() {
        OASPalParkEncounter palParkEncounter1 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter2 = palParkEncounter1;
        OASPalParkEncounter palParkEncounter3 = new OASPalParkEncounter();
        OASPalParkEncounter palParkEncounter4 = palParkEncounter3;

        System.assert(palParkEncounter1.equals(palParkEncounter2));
        System.assert(palParkEncounter2.equals(palParkEncounter1));
        System.assert(palParkEncounter1.equals(palParkEncounter1));
        System.assert(palParkEncounter3.equals(palParkEncounter4));
        System.assert(palParkEncounter4.equals(palParkEncounter3));
        System.assert(palParkEncounter3.equals(palParkEncounter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPalParkEncounter palParkEncounter1 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter2 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter3 = new OASPalParkEncounter();
        OASPalParkEncounter palParkEncounter4 = new OASPalParkEncounter();

        System.assert(palParkEncounter1.equals(palParkEncounter2));
        System.assert(palParkEncounter2.equals(palParkEncounter1));
        System.assert(palParkEncounter3.equals(palParkEncounter4));
        System.assert(palParkEncounter4.equals(palParkEncounter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPalParkEncounter palParkEncounter1 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter2 = new OASPalParkEncounter();

        System.assertEquals(false, palParkEncounter1.equals('foo'));
        System.assertEquals(false, palParkEncounter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPalParkEncounter palParkEncounter1 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter2 = new OASPalParkEncounter();
        OASPalParkEncounter palParkEncounter3;

        System.assertEquals(false, palParkEncounter1.equals(palParkEncounter3));
        System.assertEquals(false, palParkEncounter2.equals(palParkEncounter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPalParkEncounter palParkEncounter1 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter2 = new OASPalParkEncounter();

        System.assertEquals(palParkEncounter1.hashCode(), palParkEncounter1.hashCode());
        System.assertEquals(palParkEncounter2.hashCode(), palParkEncounter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPalParkEncounter palParkEncounter1 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter2 = OASPalParkEncounter.getExample();
        OASPalParkEncounter palParkEncounter3 = new OASPalParkEncounter();
        OASPalParkEncounter palParkEncounter4 = new OASPalParkEncounter();

        System.assert(palParkEncounter1.equals(palParkEncounter2));
        System.assert(palParkEncounter3.equals(palParkEncounter4));
        System.assertEquals(palParkEncounter1.hashCode(), palParkEncounter2.hashCode());
        System.assertEquals(palParkEncounter3.hashCode(), palParkEncounter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPalParkEncounter palParkEncounter = new OASPalParkEncounter();
        Map<String, String> x-property-mappings = palParkEncounter.getx-property-mappings();
        System.assertEquals('baseScore', x-property-mappings.get('base_score'));
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }
}
