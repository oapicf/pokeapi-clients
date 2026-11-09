@isTest
private class OASPokemonSpritesOtherShowdownTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown1 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown2 = pokemonSpritesOtherShowdown1;
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown3 = new OASPokemonSpritesOtherShowdown();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown4 = pokemonSpritesOtherShowdown3;

        System.assert(pokemonSpritesOtherShowdown1.equals(pokemonSpritesOtherShowdown2));
        System.assert(pokemonSpritesOtherShowdown2.equals(pokemonSpritesOtherShowdown1));
        System.assert(pokemonSpritesOtherShowdown1.equals(pokemonSpritesOtherShowdown1));
        System.assert(pokemonSpritesOtherShowdown3.equals(pokemonSpritesOtherShowdown4));
        System.assert(pokemonSpritesOtherShowdown4.equals(pokemonSpritesOtherShowdown3));
        System.assert(pokemonSpritesOtherShowdown3.equals(pokemonSpritesOtherShowdown3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown1 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown2 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown3 = new OASPokemonSpritesOtherShowdown();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown4 = new OASPokemonSpritesOtherShowdown();

        System.assert(pokemonSpritesOtherShowdown1.equals(pokemonSpritesOtherShowdown2));
        System.assert(pokemonSpritesOtherShowdown2.equals(pokemonSpritesOtherShowdown1));
        System.assert(pokemonSpritesOtherShowdown3.equals(pokemonSpritesOtherShowdown4));
        System.assert(pokemonSpritesOtherShowdown4.equals(pokemonSpritesOtherShowdown3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown1 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown2 = new OASPokemonSpritesOtherShowdown();

        System.assertEquals(false, pokemonSpritesOtherShowdown1.equals('foo'));
        System.assertEquals(false, pokemonSpritesOtherShowdown2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown1 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown2 = new OASPokemonSpritesOtherShowdown();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown3;

        System.assertEquals(false, pokemonSpritesOtherShowdown1.equals(pokemonSpritesOtherShowdown3));
        System.assertEquals(false, pokemonSpritesOtherShowdown2.equals(pokemonSpritesOtherShowdown3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown1 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown2 = new OASPokemonSpritesOtherShowdown();

        System.assertEquals(pokemonSpritesOtherShowdown1.hashCode(), pokemonSpritesOtherShowdown1.hashCode());
        System.assertEquals(pokemonSpritesOtherShowdown2.hashCode(), pokemonSpritesOtherShowdown2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown1 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown2 = OASPokemonSpritesOtherShowdown.getExample();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown3 = new OASPokemonSpritesOtherShowdown();
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown4 = new OASPokemonSpritesOtherShowdown();

        System.assert(pokemonSpritesOtherShowdown1.equals(pokemonSpritesOtherShowdown2));
        System.assert(pokemonSpritesOtherShowdown3.equals(pokemonSpritesOtherShowdown4));
        System.assertEquals(pokemonSpritesOtherShowdown1.hashCode(), pokemonSpritesOtherShowdown2.hashCode());
        System.assertEquals(pokemonSpritesOtherShowdown3.hashCode(), pokemonSpritesOtherShowdown4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpritesOtherShowdown pokemonSpritesOtherShowdown = new OASPokemonSpritesOtherShowdown();
        Map<String, String> x-property-mappings = pokemonSpritesOtherShowdown.getx-property-mappings();
        System.assertEquals('frontDefault', x-property-mappings.get('front_default'));
        System.assertEquals('frontFemale', x-property-mappings.get('front_female'));
        System.assertEquals('frontShiny', x-property-mappings.get('front_shiny'));
        System.assertEquals('frontShinyFemale', x-property-mappings.get('front_shiny_female'));
        System.assertEquals('backDefault', x-property-mappings.get('back_default'));
        System.assertEquals('backFemale', x-property-mappings.get('back_female'));
        System.assertEquals('backShiny', x-property-mappings.get('back_shiny'));
        System.assertEquals('backShinyFemale', x-property-mappings.get('back_shiny_female'));
    }
}
