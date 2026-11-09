@isTest
private class OASPokemonPastTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonPastType pokemonPastType1 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType2 = pokemonPastType1;
        OASPokemonPastType pokemonPastType3 = new OASPokemonPastType();
        OASPokemonPastType pokemonPastType4 = pokemonPastType3;

        System.assert(pokemonPastType1.equals(pokemonPastType2));
        System.assert(pokemonPastType2.equals(pokemonPastType1));
        System.assert(pokemonPastType1.equals(pokemonPastType1));
        System.assert(pokemonPastType3.equals(pokemonPastType4));
        System.assert(pokemonPastType4.equals(pokemonPastType3));
        System.assert(pokemonPastType3.equals(pokemonPastType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonPastType pokemonPastType1 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType2 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType3 = new OASPokemonPastType();
        OASPokemonPastType pokemonPastType4 = new OASPokemonPastType();

        System.assert(pokemonPastType1.equals(pokemonPastType2));
        System.assert(pokemonPastType2.equals(pokemonPastType1));
        System.assert(pokemonPastType3.equals(pokemonPastType4));
        System.assert(pokemonPastType4.equals(pokemonPastType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonPastType pokemonPastType1 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType2 = new OASPokemonPastType();

        System.assertEquals(false, pokemonPastType1.equals('foo'));
        System.assertEquals(false, pokemonPastType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonPastType pokemonPastType1 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType2 = new OASPokemonPastType();
        OASPokemonPastType pokemonPastType3;

        System.assertEquals(false, pokemonPastType1.equals(pokemonPastType3));
        System.assertEquals(false, pokemonPastType2.equals(pokemonPastType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonPastType pokemonPastType1 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType2 = new OASPokemonPastType();

        System.assertEquals(pokemonPastType1.hashCode(), pokemonPastType1.hashCode());
        System.assertEquals(pokemonPastType2.hashCode(), pokemonPastType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonPastType pokemonPastType1 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType2 = OASPokemonPastType.getExample();
        OASPokemonPastType pokemonPastType3 = new OASPokemonPastType();
        OASPokemonPastType pokemonPastType4 = new OASPokemonPastType();

        System.assert(pokemonPastType1.equals(pokemonPastType2));
        System.assert(pokemonPastType3.equals(pokemonPastType4));
        System.assertEquals(pokemonPastType1.hashCode(), pokemonPastType2.hashCode());
        System.assertEquals(pokemonPastType3.hashCode(), pokemonPastType4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonPastType pokemonPastType = new OASPokemonPastType();
        System.assertEquals(new List<OASPokemonType>(), pokemonPastType.types);
        System.assertEquals(null, pokemonPastType.generation);
    }
}
