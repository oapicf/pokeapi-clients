@isTest
private class OASPokemonSpritesOtherHomeTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome1 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome2 = pokemonSpritesOtherHome1;
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome3 = new OASPokemonSpritesOtherHome();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome4 = pokemonSpritesOtherHome3;

        System.assert(pokemonSpritesOtherHome1.equals(pokemonSpritesOtherHome2));
        System.assert(pokemonSpritesOtherHome2.equals(pokemonSpritesOtherHome1));
        System.assert(pokemonSpritesOtherHome1.equals(pokemonSpritesOtherHome1));
        System.assert(pokemonSpritesOtherHome3.equals(pokemonSpritesOtherHome4));
        System.assert(pokemonSpritesOtherHome4.equals(pokemonSpritesOtherHome3));
        System.assert(pokemonSpritesOtherHome3.equals(pokemonSpritesOtherHome3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome1 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome2 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome3 = new OASPokemonSpritesOtherHome();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome4 = new OASPokemonSpritesOtherHome();

        System.assert(pokemonSpritesOtherHome1.equals(pokemonSpritesOtherHome2));
        System.assert(pokemonSpritesOtherHome2.equals(pokemonSpritesOtherHome1));
        System.assert(pokemonSpritesOtherHome3.equals(pokemonSpritesOtherHome4));
        System.assert(pokemonSpritesOtherHome4.equals(pokemonSpritesOtherHome3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome1 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome2 = new OASPokemonSpritesOtherHome();

        System.assertEquals(false, pokemonSpritesOtherHome1.equals('foo'));
        System.assertEquals(false, pokemonSpritesOtherHome2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome1 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome2 = new OASPokemonSpritesOtherHome();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome3;

        System.assertEquals(false, pokemonSpritesOtherHome1.equals(pokemonSpritesOtherHome3));
        System.assertEquals(false, pokemonSpritesOtherHome2.equals(pokemonSpritesOtherHome3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome1 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome2 = new OASPokemonSpritesOtherHome();

        System.assertEquals(pokemonSpritesOtherHome1.hashCode(), pokemonSpritesOtherHome1.hashCode());
        System.assertEquals(pokemonSpritesOtherHome2.hashCode(), pokemonSpritesOtherHome2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome1 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome2 = OASPokemonSpritesOtherHome.getExample();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome3 = new OASPokemonSpritesOtherHome();
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome4 = new OASPokemonSpritesOtherHome();

        System.assert(pokemonSpritesOtherHome1.equals(pokemonSpritesOtherHome2));
        System.assert(pokemonSpritesOtherHome3.equals(pokemonSpritesOtherHome4));
        System.assertEquals(pokemonSpritesOtherHome1.hashCode(), pokemonSpritesOtherHome2.hashCode());
        System.assertEquals(pokemonSpritesOtherHome3.hashCode(), pokemonSpritesOtherHome4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpritesOtherHome pokemonSpritesOtherHome = new OASPokemonSpritesOtherHome();
        Map<String, String> x-property-mappings = pokemonSpritesOtherHome.getx-property-mappings();
        System.assertEquals('frontDefault', x-property-mappings.get('front_default'));
        System.assertEquals('frontFemale', x-property-mappings.get('front_female'));
        System.assertEquals('frontShiny', x-property-mappings.get('front_shiny'));
        System.assertEquals('frontShinyFemale', x-property-mappings.get('front_shiny_female'));
    }
}
