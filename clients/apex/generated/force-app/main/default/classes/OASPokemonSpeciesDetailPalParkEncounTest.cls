@isTest
private class OASPokemonSpeciesDetailPalParkEncounTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner1 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner2 = pokemonSpeciesDetailPalParkEncountersInner1;
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner3 = new OASPokemonSpeciesDetailPalParkEncoun();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner4 = pokemonSpeciesDetailPalParkEncountersInner3;

        System.assert(pokemonSpeciesDetailPalParkEncountersInner1.equals(pokemonSpeciesDetailPalParkEncountersInner2));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner2.equals(pokemonSpeciesDetailPalParkEncountersInner1));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner1.equals(pokemonSpeciesDetailPalParkEncountersInner1));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner3.equals(pokemonSpeciesDetailPalParkEncountersInner4));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner4.equals(pokemonSpeciesDetailPalParkEncountersInner3));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner3.equals(pokemonSpeciesDetailPalParkEncountersInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner1 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner2 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner3 = new OASPokemonSpeciesDetailPalParkEncoun();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner4 = new OASPokemonSpeciesDetailPalParkEncoun();

        System.assert(pokemonSpeciesDetailPalParkEncountersInner1.equals(pokemonSpeciesDetailPalParkEncountersInner2));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner2.equals(pokemonSpeciesDetailPalParkEncountersInner1));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner3.equals(pokemonSpeciesDetailPalParkEncountersInner4));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner4.equals(pokemonSpeciesDetailPalParkEncountersInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner1 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner2 = new OASPokemonSpeciesDetailPalParkEncoun();

        System.assertEquals(false, pokemonSpeciesDetailPalParkEncountersInner1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesDetailPalParkEncountersInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner1 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner2 = new OASPokemonSpeciesDetailPalParkEncoun();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner3;

        System.assertEquals(false, pokemonSpeciesDetailPalParkEncountersInner1.equals(pokemonSpeciesDetailPalParkEncountersInner3));
        System.assertEquals(false, pokemonSpeciesDetailPalParkEncountersInner2.equals(pokemonSpeciesDetailPalParkEncountersInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner1 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner2 = new OASPokemonSpeciesDetailPalParkEncoun();

        System.assertEquals(pokemonSpeciesDetailPalParkEncountersInner1.hashCode(), pokemonSpeciesDetailPalParkEncountersInner1.hashCode());
        System.assertEquals(pokemonSpeciesDetailPalParkEncountersInner2.hashCode(), pokemonSpeciesDetailPalParkEncountersInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner1 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner2 = OASPokemonSpeciesDetailPalParkEncoun.getExample();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner3 = new OASPokemonSpeciesDetailPalParkEncoun();
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner4 = new OASPokemonSpeciesDetailPalParkEncoun();

        System.assert(pokemonSpeciesDetailPalParkEncountersInner1.equals(pokemonSpeciesDetailPalParkEncountersInner2));
        System.assert(pokemonSpeciesDetailPalParkEncountersInner3.equals(pokemonSpeciesDetailPalParkEncountersInner4));
        System.assertEquals(pokemonSpeciesDetailPalParkEncountersInner1.hashCode(), pokemonSpeciesDetailPalParkEncountersInner2.hashCode());
        System.assertEquals(pokemonSpeciesDetailPalParkEncountersInner3.hashCode(), pokemonSpeciesDetailPalParkEncountersInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpeciesDetailPalParkEncoun pokemonSpeciesDetailPalParkEncountersInner = new OASPokemonSpeciesDetailPalParkEncoun();
        Map<String, String> x-property-mappings = pokemonSpeciesDetailPalParkEncountersInner.getx-property-mappings();
        System.assertEquals('baseScore', x-property-mappings.get('base_score'));
    }
}
