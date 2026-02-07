@isTest
private class OASPokedexDetailPokemonEntriesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner1 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner2 = pokedexDetailPokemonEntriesInner1;
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner3 = new OASPokedexDetailPokemonEntriesInner();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner4 = pokedexDetailPokemonEntriesInner3;

        System.assert(pokedexDetailPokemonEntriesInner1.equals(pokedexDetailPokemonEntriesInner2));
        System.assert(pokedexDetailPokemonEntriesInner2.equals(pokedexDetailPokemonEntriesInner1));
        System.assert(pokedexDetailPokemonEntriesInner1.equals(pokedexDetailPokemonEntriesInner1));
        System.assert(pokedexDetailPokemonEntriesInner3.equals(pokedexDetailPokemonEntriesInner4));
        System.assert(pokedexDetailPokemonEntriesInner4.equals(pokedexDetailPokemonEntriesInner3));
        System.assert(pokedexDetailPokemonEntriesInner3.equals(pokedexDetailPokemonEntriesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner1 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner2 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner3 = new OASPokedexDetailPokemonEntriesInner();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner4 = new OASPokedexDetailPokemonEntriesInner();

        System.assert(pokedexDetailPokemonEntriesInner1.equals(pokedexDetailPokemonEntriesInner2));
        System.assert(pokedexDetailPokemonEntriesInner2.equals(pokedexDetailPokemonEntriesInner1));
        System.assert(pokedexDetailPokemonEntriesInner3.equals(pokedexDetailPokemonEntriesInner4));
        System.assert(pokedexDetailPokemonEntriesInner4.equals(pokedexDetailPokemonEntriesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner1 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner2 = new OASPokedexDetailPokemonEntriesInner();

        System.assertEquals(false, pokedexDetailPokemonEntriesInner1.equals('foo'));
        System.assertEquals(false, pokedexDetailPokemonEntriesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner1 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner2 = new OASPokedexDetailPokemonEntriesInner();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner3;

        System.assertEquals(false, pokedexDetailPokemonEntriesInner1.equals(pokedexDetailPokemonEntriesInner3));
        System.assertEquals(false, pokedexDetailPokemonEntriesInner2.equals(pokedexDetailPokemonEntriesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner1 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner2 = new OASPokedexDetailPokemonEntriesInner();

        System.assertEquals(pokedexDetailPokemonEntriesInner1.hashCode(), pokedexDetailPokemonEntriesInner1.hashCode());
        System.assertEquals(pokedexDetailPokemonEntriesInner2.hashCode(), pokedexDetailPokemonEntriesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner1 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner2 = OASPokedexDetailPokemonEntriesInner.getExample();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner3 = new OASPokedexDetailPokemonEntriesInner();
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner4 = new OASPokedexDetailPokemonEntriesInner();

        System.assert(pokedexDetailPokemonEntriesInner1.equals(pokedexDetailPokemonEntriesInner2));
        System.assert(pokedexDetailPokemonEntriesInner3.equals(pokedexDetailPokemonEntriesInner4));
        System.assertEquals(pokedexDetailPokemonEntriesInner1.hashCode(), pokedexDetailPokemonEntriesInner2.hashCode());
        System.assertEquals(pokedexDetailPokemonEntriesInner3.hashCode(), pokedexDetailPokemonEntriesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner = new OASPokedexDetailPokemonEntriesInner();
        Map<String, String> x-property-mappings = pokedexDetailPokemonEntriesInner.getx-property-mappings();
        System.assertEquals('entryNumber', x-property-mappings.get('entry_number'));
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }
}
