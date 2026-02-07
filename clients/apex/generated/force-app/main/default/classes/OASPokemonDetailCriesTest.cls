@isTest
private class OASPokemonDetailCriesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailCries pokemonDetailCries1 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries2 = pokemonDetailCries1;
        OASPokemonDetailCries pokemonDetailCries3 = new OASPokemonDetailCries();
        OASPokemonDetailCries pokemonDetailCries4 = pokemonDetailCries3;

        System.assert(pokemonDetailCries1.equals(pokemonDetailCries2));
        System.assert(pokemonDetailCries2.equals(pokemonDetailCries1));
        System.assert(pokemonDetailCries1.equals(pokemonDetailCries1));
        System.assert(pokemonDetailCries3.equals(pokemonDetailCries4));
        System.assert(pokemonDetailCries4.equals(pokemonDetailCries3));
        System.assert(pokemonDetailCries3.equals(pokemonDetailCries3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailCries pokemonDetailCries1 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries2 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries3 = new OASPokemonDetailCries();
        OASPokemonDetailCries pokemonDetailCries4 = new OASPokemonDetailCries();

        System.assert(pokemonDetailCries1.equals(pokemonDetailCries2));
        System.assert(pokemonDetailCries2.equals(pokemonDetailCries1));
        System.assert(pokemonDetailCries3.equals(pokemonDetailCries4));
        System.assert(pokemonDetailCries4.equals(pokemonDetailCries3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailCries pokemonDetailCries1 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries2 = new OASPokemonDetailCries();

        System.assertEquals(false, pokemonDetailCries1.equals('foo'));
        System.assertEquals(false, pokemonDetailCries2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailCries pokemonDetailCries1 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries2 = new OASPokemonDetailCries();
        OASPokemonDetailCries pokemonDetailCries3;

        System.assertEquals(false, pokemonDetailCries1.equals(pokemonDetailCries3));
        System.assertEquals(false, pokemonDetailCries2.equals(pokemonDetailCries3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailCries pokemonDetailCries1 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries2 = new OASPokemonDetailCries();

        System.assertEquals(pokemonDetailCries1.hashCode(), pokemonDetailCries1.hashCode());
        System.assertEquals(pokemonDetailCries2.hashCode(), pokemonDetailCries2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailCries pokemonDetailCries1 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries2 = OASPokemonDetailCries.getExample();
        OASPokemonDetailCries pokemonDetailCries3 = new OASPokemonDetailCries();
        OASPokemonDetailCries pokemonDetailCries4 = new OASPokemonDetailCries();

        System.assert(pokemonDetailCries1.equals(pokemonDetailCries2));
        System.assert(pokemonDetailCries3.equals(pokemonDetailCries4));
        System.assertEquals(pokemonDetailCries1.hashCode(), pokemonDetailCries2.hashCode());
        System.assertEquals(pokemonDetailCries3.hashCode(), pokemonDetailCries4.hashCode());
    }
}
