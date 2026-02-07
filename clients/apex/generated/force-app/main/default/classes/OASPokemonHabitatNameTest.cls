@isTest
private class OASPokemonHabitatNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonHabitatName pokemonHabitatName1 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName2 = pokemonHabitatName1;
        OASPokemonHabitatName pokemonHabitatName3 = new OASPokemonHabitatName();
        OASPokemonHabitatName pokemonHabitatName4 = pokemonHabitatName3;

        System.assert(pokemonHabitatName1.equals(pokemonHabitatName2));
        System.assert(pokemonHabitatName2.equals(pokemonHabitatName1));
        System.assert(pokemonHabitatName1.equals(pokemonHabitatName1));
        System.assert(pokemonHabitatName3.equals(pokemonHabitatName4));
        System.assert(pokemonHabitatName4.equals(pokemonHabitatName3));
        System.assert(pokemonHabitatName3.equals(pokemonHabitatName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonHabitatName pokemonHabitatName1 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName2 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName3 = new OASPokemonHabitatName();
        OASPokemonHabitatName pokemonHabitatName4 = new OASPokemonHabitatName();

        System.assert(pokemonHabitatName1.equals(pokemonHabitatName2));
        System.assert(pokemonHabitatName2.equals(pokemonHabitatName1));
        System.assert(pokemonHabitatName3.equals(pokemonHabitatName4));
        System.assert(pokemonHabitatName4.equals(pokemonHabitatName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonHabitatName pokemonHabitatName1 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName2 = new OASPokemonHabitatName();

        System.assertEquals(false, pokemonHabitatName1.equals('foo'));
        System.assertEquals(false, pokemonHabitatName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonHabitatName pokemonHabitatName1 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName2 = new OASPokemonHabitatName();
        OASPokemonHabitatName pokemonHabitatName3;

        System.assertEquals(false, pokemonHabitatName1.equals(pokemonHabitatName3));
        System.assertEquals(false, pokemonHabitatName2.equals(pokemonHabitatName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonHabitatName pokemonHabitatName1 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName2 = new OASPokemonHabitatName();

        System.assertEquals(pokemonHabitatName1.hashCode(), pokemonHabitatName1.hashCode());
        System.assertEquals(pokemonHabitatName2.hashCode(), pokemonHabitatName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonHabitatName pokemonHabitatName1 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName2 = OASPokemonHabitatName.getExample();
        OASPokemonHabitatName pokemonHabitatName3 = new OASPokemonHabitatName();
        OASPokemonHabitatName pokemonHabitatName4 = new OASPokemonHabitatName();

        System.assert(pokemonHabitatName1.equals(pokemonHabitatName2));
        System.assert(pokemonHabitatName3.equals(pokemonHabitatName4));
        System.assertEquals(pokemonHabitatName1.hashCode(), pokemonHabitatName2.hashCode());
        System.assertEquals(pokemonHabitatName3.hashCode(), pokemonHabitatName4.hashCode());
    }
}
