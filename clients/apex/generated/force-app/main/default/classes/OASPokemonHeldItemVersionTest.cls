@isTest
private class OASPokemonHeldItemVersionTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonHeldItemVersion pokemonHeldItemVersion1 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion2 = pokemonHeldItemVersion1;
        OASPokemonHeldItemVersion pokemonHeldItemVersion3 = new OASPokemonHeldItemVersion();
        OASPokemonHeldItemVersion pokemonHeldItemVersion4 = pokemonHeldItemVersion3;

        System.assert(pokemonHeldItemVersion1.equals(pokemonHeldItemVersion2));
        System.assert(pokemonHeldItemVersion2.equals(pokemonHeldItemVersion1));
        System.assert(pokemonHeldItemVersion1.equals(pokemonHeldItemVersion1));
        System.assert(pokemonHeldItemVersion3.equals(pokemonHeldItemVersion4));
        System.assert(pokemonHeldItemVersion4.equals(pokemonHeldItemVersion3));
        System.assert(pokemonHeldItemVersion3.equals(pokemonHeldItemVersion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonHeldItemVersion pokemonHeldItemVersion1 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion2 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion3 = new OASPokemonHeldItemVersion();
        OASPokemonHeldItemVersion pokemonHeldItemVersion4 = new OASPokemonHeldItemVersion();

        System.assert(pokemonHeldItemVersion1.equals(pokemonHeldItemVersion2));
        System.assert(pokemonHeldItemVersion2.equals(pokemonHeldItemVersion1));
        System.assert(pokemonHeldItemVersion3.equals(pokemonHeldItemVersion4));
        System.assert(pokemonHeldItemVersion4.equals(pokemonHeldItemVersion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonHeldItemVersion pokemonHeldItemVersion1 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion2 = new OASPokemonHeldItemVersion();

        System.assertEquals(false, pokemonHeldItemVersion1.equals('foo'));
        System.assertEquals(false, pokemonHeldItemVersion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonHeldItemVersion pokemonHeldItemVersion1 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion2 = new OASPokemonHeldItemVersion();
        OASPokemonHeldItemVersion pokemonHeldItemVersion3;

        System.assertEquals(false, pokemonHeldItemVersion1.equals(pokemonHeldItemVersion3));
        System.assertEquals(false, pokemonHeldItemVersion2.equals(pokemonHeldItemVersion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonHeldItemVersion pokemonHeldItemVersion1 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion2 = new OASPokemonHeldItemVersion();

        System.assertEquals(pokemonHeldItemVersion1.hashCode(), pokemonHeldItemVersion1.hashCode());
        System.assertEquals(pokemonHeldItemVersion2.hashCode(), pokemonHeldItemVersion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonHeldItemVersion pokemonHeldItemVersion1 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion2 = OASPokemonHeldItemVersion.getExample();
        OASPokemonHeldItemVersion pokemonHeldItemVersion3 = new OASPokemonHeldItemVersion();
        OASPokemonHeldItemVersion pokemonHeldItemVersion4 = new OASPokemonHeldItemVersion();

        System.assert(pokemonHeldItemVersion1.equals(pokemonHeldItemVersion2));
        System.assert(pokemonHeldItemVersion3.equals(pokemonHeldItemVersion4));
        System.assertEquals(pokemonHeldItemVersion1.hashCode(), pokemonHeldItemVersion2.hashCode());
        System.assertEquals(pokemonHeldItemVersion3.hashCode(), pokemonHeldItemVersion4.hashCode());
    }
}
