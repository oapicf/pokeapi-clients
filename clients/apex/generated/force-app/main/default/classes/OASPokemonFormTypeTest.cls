@isTest
private class OASPokemonFormTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormType pokemonFormType1 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType2 = pokemonFormType1;
        OASPokemonFormType pokemonFormType3 = new OASPokemonFormType();
        OASPokemonFormType pokemonFormType4 = pokemonFormType3;

        System.assert(pokemonFormType1.equals(pokemonFormType2));
        System.assert(pokemonFormType2.equals(pokemonFormType1));
        System.assert(pokemonFormType1.equals(pokemonFormType1));
        System.assert(pokemonFormType3.equals(pokemonFormType4));
        System.assert(pokemonFormType4.equals(pokemonFormType3));
        System.assert(pokemonFormType3.equals(pokemonFormType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormType pokemonFormType1 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType2 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType3 = new OASPokemonFormType();
        OASPokemonFormType pokemonFormType4 = new OASPokemonFormType();

        System.assert(pokemonFormType1.equals(pokemonFormType2));
        System.assert(pokemonFormType2.equals(pokemonFormType1));
        System.assert(pokemonFormType3.equals(pokemonFormType4));
        System.assert(pokemonFormType4.equals(pokemonFormType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormType pokemonFormType1 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType2 = new OASPokemonFormType();

        System.assertEquals(false, pokemonFormType1.equals('foo'));
        System.assertEquals(false, pokemonFormType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormType pokemonFormType1 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType2 = new OASPokemonFormType();
        OASPokemonFormType pokemonFormType3;

        System.assertEquals(false, pokemonFormType1.equals(pokemonFormType3));
        System.assertEquals(false, pokemonFormType2.equals(pokemonFormType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormType pokemonFormType1 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType2 = new OASPokemonFormType();

        System.assertEquals(pokemonFormType1.hashCode(), pokemonFormType1.hashCode());
        System.assertEquals(pokemonFormType2.hashCode(), pokemonFormType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormType pokemonFormType1 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType2 = OASPokemonFormType.getExample();
        OASPokemonFormType pokemonFormType3 = new OASPokemonFormType();
        OASPokemonFormType pokemonFormType4 = new OASPokemonFormType();

        System.assert(pokemonFormType1.equals(pokemonFormType2));
        System.assert(pokemonFormType3.equals(pokemonFormType4));
        System.assertEquals(pokemonFormType1.hashCode(), pokemonFormType2.hashCode());
        System.assertEquals(pokemonFormType3.hashCode(), pokemonFormType4.hashCode());
    }
}
