@isTest
private class OASPokemonTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonType pokemonType1 = OASPokemonType.getExample();
        OASPokemonType pokemonType2 = pokemonType1;
        OASPokemonType pokemonType3 = new OASPokemonType();
        OASPokemonType pokemonType4 = pokemonType3;

        System.assert(pokemonType1.equals(pokemonType2));
        System.assert(pokemonType2.equals(pokemonType1));
        System.assert(pokemonType1.equals(pokemonType1));
        System.assert(pokemonType3.equals(pokemonType4));
        System.assert(pokemonType4.equals(pokemonType3));
        System.assert(pokemonType3.equals(pokemonType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonType pokemonType1 = OASPokemonType.getExample();
        OASPokemonType pokemonType2 = OASPokemonType.getExample();
        OASPokemonType pokemonType3 = new OASPokemonType();
        OASPokemonType pokemonType4 = new OASPokemonType();

        System.assert(pokemonType1.equals(pokemonType2));
        System.assert(pokemonType2.equals(pokemonType1));
        System.assert(pokemonType3.equals(pokemonType4));
        System.assert(pokemonType4.equals(pokemonType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonType pokemonType1 = OASPokemonType.getExample();
        OASPokemonType pokemonType2 = new OASPokemonType();

        System.assertEquals(false, pokemonType1.equals('foo'));
        System.assertEquals(false, pokemonType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonType pokemonType1 = OASPokemonType.getExample();
        OASPokemonType pokemonType2 = new OASPokemonType();
        OASPokemonType pokemonType3;

        System.assertEquals(false, pokemonType1.equals(pokemonType3));
        System.assertEquals(false, pokemonType2.equals(pokemonType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonType pokemonType1 = OASPokemonType.getExample();
        OASPokemonType pokemonType2 = new OASPokemonType();

        System.assertEquals(pokemonType1.hashCode(), pokemonType1.hashCode());
        System.assertEquals(pokemonType2.hashCode(), pokemonType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonType pokemonType1 = OASPokemonType.getExample();
        OASPokemonType pokemonType2 = OASPokemonType.getExample();
        OASPokemonType pokemonType3 = new OASPokemonType();
        OASPokemonType pokemonType4 = new OASPokemonType();

        System.assert(pokemonType1.equals(pokemonType2));
        System.assert(pokemonType3.equals(pokemonType4));
        System.assertEquals(pokemonType1.hashCode(), pokemonType2.hashCode());
        System.assertEquals(pokemonType3.hashCode(), pokemonType4.hashCode());
    }
}
