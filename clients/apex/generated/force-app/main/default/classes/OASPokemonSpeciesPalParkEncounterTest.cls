@isTest
private class OASPokemonSpeciesPalParkEncounterTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter1 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter2 = pokemonSpeciesPalParkEncounter1;
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter3 = new OASPokemonSpeciesPalParkEncounter();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter4 = pokemonSpeciesPalParkEncounter3;

        System.assert(pokemonSpeciesPalParkEncounter1.equals(pokemonSpeciesPalParkEncounter2));
        System.assert(pokemonSpeciesPalParkEncounter2.equals(pokemonSpeciesPalParkEncounter1));
        System.assert(pokemonSpeciesPalParkEncounter1.equals(pokemonSpeciesPalParkEncounter1));
        System.assert(pokemonSpeciesPalParkEncounter3.equals(pokemonSpeciesPalParkEncounter4));
        System.assert(pokemonSpeciesPalParkEncounter4.equals(pokemonSpeciesPalParkEncounter3));
        System.assert(pokemonSpeciesPalParkEncounter3.equals(pokemonSpeciesPalParkEncounter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter1 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter2 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter3 = new OASPokemonSpeciesPalParkEncounter();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter4 = new OASPokemonSpeciesPalParkEncounter();

        System.assert(pokemonSpeciesPalParkEncounter1.equals(pokemonSpeciesPalParkEncounter2));
        System.assert(pokemonSpeciesPalParkEncounter2.equals(pokemonSpeciesPalParkEncounter1));
        System.assert(pokemonSpeciesPalParkEncounter3.equals(pokemonSpeciesPalParkEncounter4));
        System.assert(pokemonSpeciesPalParkEncounter4.equals(pokemonSpeciesPalParkEncounter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter1 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter2 = new OASPokemonSpeciesPalParkEncounter();

        System.assertEquals(false, pokemonSpeciesPalParkEncounter1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesPalParkEncounter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter1 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter2 = new OASPokemonSpeciesPalParkEncounter();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter3;

        System.assertEquals(false, pokemonSpeciesPalParkEncounter1.equals(pokemonSpeciesPalParkEncounter3));
        System.assertEquals(false, pokemonSpeciesPalParkEncounter2.equals(pokemonSpeciesPalParkEncounter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter1 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter2 = new OASPokemonSpeciesPalParkEncounter();

        System.assertEquals(pokemonSpeciesPalParkEncounter1.hashCode(), pokemonSpeciesPalParkEncounter1.hashCode());
        System.assertEquals(pokemonSpeciesPalParkEncounter2.hashCode(), pokemonSpeciesPalParkEncounter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter1 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter2 = OASPokemonSpeciesPalParkEncounter.getExample();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter3 = new OASPokemonSpeciesPalParkEncounter();
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter4 = new OASPokemonSpeciesPalParkEncounter();

        System.assert(pokemonSpeciesPalParkEncounter1.equals(pokemonSpeciesPalParkEncounter2));
        System.assert(pokemonSpeciesPalParkEncounter3.equals(pokemonSpeciesPalParkEncounter4));
        System.assertEquals(pokemonSpeciesPalParkEncounter1.hashCode(), pokemonSpeciesPalParkEncounter2.hashCode());
        System.assertEquals(pokemonSpeciesPalParkEncounter3.hashCode(), pokemonSpeciesPalParkEncounter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter = new OASPokemonSpeciesPalParkEncounter();
        Map<String, String> x-property-mappings = pokemonSpeciesPalParkEncounter.getx-property-mappings();
        System.assertEquals('baseScore', x-property-mappings.get('base_score'));
    }
}
