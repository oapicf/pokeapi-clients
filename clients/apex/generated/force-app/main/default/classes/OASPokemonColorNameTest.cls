@isTest
private class OASPokemonColorNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonColorName pokemonColorName1 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName2 = pokemonColorName1;
        OASPokemonColorName pokemonColorName3 = new OASPokemonColorName();
        OASPokemonColorName pokemonColorName4 = pokemonColorName3;

        System.assert(pokemonColorName1.equals(pokemonColorName2));
        System.assert(pokemonColorName2.equals(pokemonColorName1));
        System.assert(pokemonColorName1.equals(pokemonColorName1));
        System.assert(pokemonColorName3.equals(pokemonColorName4));
        System.assert(pokemonColorName4.equals(pokemonColorName3));
        System.assert(pokemonColorName3.equals(pokemonColorName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonColorName pokemonColorName1 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName2 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName3 = new OASPokemonColorName();
        OASPokemonColorName pokemonColorName4 = new OASPokemonColorName();

        System.assert(pokemonColorName1.equals(pokemonColorName2));
        System.assert(pokemonColorName2.equals(pokemonColorName1));
        System.assert(pokemonColorName3.equals(pokemonColorName4));
        System.assert(pokemonColorName4.equals(pokemonColorName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonColorName pokemonColorName1 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName2 = new OASPokemonColorName();

        System.assertEquals(false, pokemonColorName1.equals('foo'));
        System.assertEquals(false, pokemonColorName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonColorName pokemonColorName1 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName2 = new OASPokemonColorName();
        OASPokemonColorName pokemonColorName3;

        System.assertEquals(false, pokemonColorName1.equals(pokemonColorName3));
        System.assertEquals(false, pokemonColorName2.equals(pokemonColorName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonColorName pokemonColorName1 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName2 = new OASPokemonColorName();

        System.assertEquals(pokemonColorName1.hashCode(), pokemonColorName1.hashCode());
        System.assertEquals(pokemonColorName2.hashCode(), pokemonColorName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonColorName pokemonColorName1 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName2 = OASPokemonColorName.getExample();
        OASPokemonColorName pokemonColorName3 = new OASPokemonColorName();
        OASPokemonColorName pokemonColorName4 = new OASPokemonColorName();

        System.assert(pokemonColorName1.equals(pokemonColorName2));
        System.assert(pokemonColorName3.equals(pokemonColorName4));
        System.assertEquals(pokemonColorName1.hashCode(), pokemonColorName2.hashCode());
        System.assertEquals(pokemonColorName3.hashCode(), pokemonColorName4.hashCode());
    }
}
