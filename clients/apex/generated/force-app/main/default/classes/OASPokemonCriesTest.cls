@isTest
private class OASPokemonCriesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonCries pokemonCries1 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries2 = pokemonCries1;
        OASPokemonCries pokemonCries3 = new OASPokemonCries();
        OASPokemonCries pokemonCries4 = pokemonCries3;

        System.assert(pokemonCries1.equals(pokemonCries2));
        System.assert(pokemonCries2.equals(pokemonCries1));
        System.assert(pokemonCries1.equals(pokemonCries1));
        System.assert(pokemonCries3.equals(pokemonCries4));
        System.assert(pokemonCries4.equals(pokemonCries3));
        System.assert(pokemonCries3.equals(pokemonCries3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonCries pokemonCries1 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries2 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries3 = new OASPokemonCries();
        OASPokemonCries pokemonCries4 = new OASPokemonCries();

        System.assert(pokemonCries1.equals(pokemonCries2));
        System.assert(pokemonCries2.equals(pokemonCries1));
        System.assert(pokemonCries3.equals(pokemonCries4));
        System.assert(pokemonCries4.equals(pokemonCries3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonCries pokemonCries1 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries2 = new OASPokemonCries();

        System.assertEquals(false, pokemonCries1.equals('foo'));
        System.assertEquals(false, pokemonCries2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonCries pokemonCries1 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries2 = new OASPokemonCries();
        OASPokemonCries pokemonCries3;

        System.assertEquals(false, pokemonCries1.equals(pokemonCries3));
        System.assertEquals(false, pokemonCries2.equals(pokemonCries3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonCries pokemonCries1 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries2 = new OASPokemonCries();

        System.assertEquals(pokemonCries1.hashCode(), pokemonCries1.hashCode());
        System.assertEquals(pokemonCries2.hashCode(), pokemonCries2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonCries pokemonCries1 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries2 = OASPokemonCries.getExample();
        OASPokemonCries pokemonCries3 = new OASPokemonCries();
        OASPokemonCries pokemonCries4 = new OASPokemonCries();

        System.assert(pokemonCries1.equals(pokemonCries2));
        System.assert(pokemonCries3.equals(pokemonCries4));
        System.assertEquals(pokemonCries1.hashCode(), pokemonCries2.hashCode());
        System.assertEquals(pokemonCries3.hashCode(), pokemonCries4.hashCode());
    }
}
