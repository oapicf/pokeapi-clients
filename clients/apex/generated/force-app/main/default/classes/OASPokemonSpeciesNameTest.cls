@isTest
private class OASPokemonSpeciesNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesName pokemonSpeciesName1 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName2 = pokemonSpeciesName1;
        OASPokemonSpeciesName pokemonSpeciesName3 = new OASPokemonSpeciesName();
        OASPokemonSpeciesName pokemonSpeciesName4 = pokemonSpeciesName3;

        System.assert(pokemonSpeciesName1.equals(pokemonSpeciesName2));
        System.assert(pokemonSpeciesName2.equals(pokemonSpeciesName1));
        System.assert(pokemonSpeciesName1.equals(pokemonSpeciesName1));
        System.assert(pokemonSpeciesName3.equals(pokemonSpeciesName4));
        System.assert(pokemonSpeciesName4.equals(pokemonSpeciesName3));
        System.assert(pokemonSpeciesName3.equals(pokemonSpeciesName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesName pokemonSpeciesName1 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName2 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName3 = new OASPokemonSpeciesName();
        OASPokemonSpeciesName pokemonSpeciesName4 = new OASPokemonSpeciesName();

        System.assert(pokemonSpeciesName1.equals(pokemonSpeciesName2));
        System.assert(pokemonSpeciesName2.equals(pokemonSpeciesName1));
        System.assert(pokemonSpeciesName3.equals(pokemonSpeciesName4));
        System.assert(pokemonSpeciesName4.equals(pokemonSpeciesName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesName pokemonSpeciesName1 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName2 = new OASPokemonSpeciesName();

        System.assertEquals(false, pokemonSpeciesName1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesName pokemonSpeciesName1 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName2 = new OASPokemonSpeciesName();
        OASPokemonSpeciesName pokemonSpeciesName3;

        System.assertEquals(false, pokemonSpeciesName1.equals(pokemonSpeciesName3));
        System.assertEquals(false, pokemonSpeciesName2.equals(pokemonSpeciesName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesName pokemonSpeciesName1 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName2 = new OASPokemonSpeciesName();

        System.assertEquals(pokemonSpeciesName1.hashCode(), pokemonSpeciesName1.hashCode());
        System.assertEquals(pokemonSpeciesName2.hashCode(), pokemonSpeciesName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesName pokemonSpeciesName1 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName2 = OASPokemonSpeciesName.getExample();
        OASPokemonSpeciesName pokemonSpeciesName3 = new OASPokemonSpeciesName();
        OASPokemonSpeciesName pokemonSpeciesName4 = new OASPokemonSpeciesName();

        System.assert(pokemonSpeciesName1.equals(pokemonSpeciesName2));
        System.assert(pokemonSpeciesName3.equals(pokemonSpeciesName4));
        System.assertEquals(pokemonSpeciesName1.hashCode(), pokemonSpeciesName2.hashCode());
        System.assertEquals(pokemonSpeciesName3.hashCode(), pokemonSpeciesName4.hashCode());
    }
}
