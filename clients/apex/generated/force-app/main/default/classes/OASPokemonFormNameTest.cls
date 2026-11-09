@isTest
private class OASPokemonFormNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormName pokemonFormName1 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName2 = pokemonFormName1;
        OASPokemonFormName pokemonFormName3 = new OASPokemonFormName();
        OASPokemonFormName pokemonFormName4 = pokemonFormName3;

        System.assert(pokemonFormName1.equals(pokemonFormName2));
        System.assert(pokemonFormName2.equals(pokemonFormName1));
        System.assert(pokemonFormName1.equals(pokemonFormName1));
        System.assert(pokemonFormName3.equals(pokemonFormName4));
        System.assert(pokemonFormName4.equals(pokemonFormName3));
        System.assert(pokemonFormName3.equals(pokemonFormName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormName pokemonFormName1 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName2 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName3 = new OASPokemonFormName();
        OASPokemonFormName pokemonFormName4 = new OASPokemonFormName();

        System.assert(pokemonFormName1.equals(pokemonFormName2));
        System.assert(pokemonFormName2.equals(pokemonFormName1));
        System.assert(pokemonFormName3.equals(pokemonFormName4));
        System.assert(pokemonFormName4.equals(pokemonFormName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormName pokemonFormName1 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName2 = new OASPokemonFormName();

        System.assertEquals(false, pokemonFormName1.equals('foo'));
        System.assertEquals(false, pokemonFormName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormName pokemonFormName1 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName2 = new OASPokemonFormName();
        OASPokemonFormName pokemonFormName3;

        System.assertEquals(false, pokemonFormName1.equals(pokemonFormName3));
        System.assertEquals(false, pokemonFormName2.equals(pokemonFormName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormName pokemonFormName1 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName2 = new OASPokemonFormName();

        System.assertEquals(pokemonFormName1.hashCode(), pokemonFormName1.hashCode());
        System.assertEquals(pokemonFormName2.hashCode(), pokemonFormName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormName pokemonFormName1 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName2 = OASPokemonFormName.getExample();
        OASPokemonFormName pokemonFormName3 = new OASPokemonFormName();
        OASPokemonFormName pokemonFormName4 = new OASPokemonFormName();

        System.assert(pokemonFormName1.equals(pokemonFormName2));
        System.assert(pokemonFormName3.equals(pokemonFormName4));
        System.assertEquals(pokemonFormName1.hashCode(), pokemonFormName2.hashCode());
        System.assertEquals(pokemonFormName3.hashCode(), pokemonFormName4.hashCode());
    }
}
