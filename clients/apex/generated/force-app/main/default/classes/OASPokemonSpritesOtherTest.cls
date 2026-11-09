@isTest
private class OASPokemonSpritesOtherTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpritesOther pokemonSpritesOther1 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther2 = pokemonSpritesOther1;
        OASPokemonSpritesOther pokemonSpritesOther3 = new OASPokemonSpritesOther();
        OASPokemonSpritesOther pokemonSpritesOther4 = pokemonSpritesOther3;

        System.assert(pokemonSpritesOther1.equals(pokemonSpritesOther2));
        System.assert(pokemonSpritesOther2.equals(pokemonSpritesOther1));
        System.assert(pokemonSpritesOther1.equals(pokemonSpritesOther1));
        System.assert(pokemonSpritesOther3.equals(pokemonSpritesOther4));
        System.assert(pokemonSpritesOther4.equals(pokemonSpritesOther3));
        System.assert(pokemonSpritesOther3.equals(pokemonSpritesOther3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpritesOther pokemonSpritesOther1 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther2 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther3 = new OASPokemonSpritesOther();
        OASPokemonSpritesOther pokemonSpritesOther4 = new OASPokemonSpritesOther();

        System.assert(pokemonSpritesOther1.equals(pokemonSpritesOther2));
        System.assert(pokemonSpritesOther2.equals(pokemonSpritesOther1));
        System.assert(pokemonSpritesOther3.equals(pokemonSpritesOther4));
        System.assert(pokemonSpritesOther4.equals(pokemonSpritesOther3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpritesOther pokemonSpritesOther1 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther2 = new OASPokemonSpritesOther();

        System.assertEquals(false, pokemonSpritesOther1.equals('foo'));
        System.assertEquals(false, pokemonSpritesOther2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpritesOther pokemonSpritesOther1 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther2 = new OASPokemonSpritesOther();
        OASPokemonSpritesOther pokemonSpritesOther3;

        System.assertEquals(false, pokemonSpritesOther1.equals(pokemonSpritesOther3));
        System.assertEquals(false, pokemonSpritesOther2.equals(pokemonSpritesOther3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpritesOther pokemonSpritesOther1 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther2 = new OASPokemonSpritesOther();

        System.assertEquals(pokemonSpritesOther1.hashCode(), pokemonSpritesOther1.hashCode());
        System.assertEquals(pokemonSpritesOther2.hashCode(), pokemonSpritesOther2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpritesOther pokemonSpritesOther1 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther2 = OASPokemonSpritesOther.getExample();
        OASPokemonSpritesOther pokemonSpritesOther3 = new OASPokemonSpritesOther();
        OASPokemonSpritesOther pokemonSpritesOther4 = new OASPokemonSpritesOther();

        System.assert(pokemonSpritesOther1.equals(pokemonSpritesOther2));
        System.assert(pokemonSpritesOther3.equals(pokemonSpritesOther4));
        System.assertEquals(pokemonSpritesOther1.hashCode(), pokemonSpritesOther2.hashCode());
        System.assertEquals(pokemonSpritesOther3.hashCode(), pokemonSpritesOther4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpritesOther pokemonSpritesOther = new OASPokemonSpritesOther();
        Map<String, String> x-property-mappings = pokemonSpritesOther.getx-property-mappings();
        System.assertEquals('dreamWorld', x-property-mappings.get('dream_world'));
        System.assertEquals('officialArtwork', x-property-mappings.get('official-artwork'));
    }
}
