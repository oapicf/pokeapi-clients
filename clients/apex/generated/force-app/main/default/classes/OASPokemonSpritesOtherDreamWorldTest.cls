@isTest
private class OASPokemonSpritesOtherDreamWorldTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld1 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld2 = pokemonSpritesOtherDreamWorld1;
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld3 = new OASPokemonSpritesOtherDreamWorld();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld4 = pokemonSpritesOtherDreamWorld3;

        System.assert(pokemonSpritesOtherDreamWorld1.equals(pokemonSpritesOtherDreamWorld2));
        System.assert(pokemonSpritesOtherDreamWorld2.equals(pokemonSpritesOtherDreamWorld1));
        System.assert(pokemonSpritesOtherDreamWorld1.equals(pokemonSpritesOtherDreamWorld1));
        System.assert(pokemonSpritesOtherDreamWorld3.equals(pokemonSpritesOtherDreamWorld4));
        System.assert(pokemonSpritesOtherDreamWorld4.equals(pokemonSpritesOtherDreamWorld3));
        System.assert(pokemonSpritesOtherDreamWorld3.equals(pokemonSpritesOtherDreamWorld3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld1 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld2 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld3 = new OASPokemonSpritesOtherDreamWorld();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld4 = new OASPokemonSpritesOtherDreamWorld();

        System.assert(pokemonSpritesOtherDreamWorld1.equals(pokemonSpritesOtherDreamWorld2));
        System.assert(pokemonSpritesOtherDreamWorld2.equals(pokemonSpritesOtherDreamWorld1));
        System.assert(pokemonSpritesOtherDreamWorld3.equals(pokemonSpritesOtherDreamWorld4));
        System.assert(pokemonSpritesOtherDreamWorld4.equals(pokemonSpritesOtherDreamWorld3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld1 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld2 = new OASPokemonSpritesOtherDreamWorld();

        System.assertEquals(false, pokemonSpritesOtherDreamWorld1.equals('foo'));
        System.assertEquals(false, pokemonSpritesOtherDreamWorld2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld1 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld2 = new OASPokemonSpritesOtherDreamWorld();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld3;

        System.assertEquals(false, pokemonSpritesOtherDreamWorld1.equals(pokemonSpritesOtherDreamWorld3));
        System.assertEquals(false, pokemonSpritesOtherDreamWorld2.equals(pokemonSpritesOtherDreamWorld3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld1 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld2 = new OASPokemonSpritesOtherDreamWorld();

        System.assertEquals(pokemonSpritesOtherDreamWorld1.hashCode(), pokemonSpritesOtherDreamWorld1.hashCode());
        System.assertEquals(pokemonSpritesOtherDreamWorld2.hashCode(), pokemonSpritesOtherDreamWorld2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld1 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld2 = OASPokemonSpritesOtherDreamWorld.getExample();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld3 = new OASPokemonSpritesOtherDreamWorld();
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld4 = new OASPokemonSpritesOtherDreamWorld();

        System.assert(pokemonSpritesOtherDreamWorld1.equals(pokemonSpritesOtherDreamWorld2));
        System.assert(pokemonSpritesOtherDreamWorld3.equals(pokemonSpritesOtherDreamWorld4));
        System.assertEquals(pokemonSpritesOtherDreamWorld1.hashCode(), pokemonSpritesOtherDreamWorld2.hashCode());
        System.assertEquals(pokemonSpritesOtherDreamWorld3.hashCode(), pokemonSpritesOtherDreamWorld4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld = new OASPokemonSpritesOtherDreamWorld();
        Map<String, String> x-property-mappings = pokemonSpritesOtherDreamWorld.getx-property-mappings();
        System.assertEquals('frontDefault', x-property-mappings.get('front_default'));
        System.assertEquals('frontFemale', x-property-mappings.get('front_female'));
    }
}
