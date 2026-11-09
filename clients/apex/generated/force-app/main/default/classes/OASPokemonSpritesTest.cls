@isTest
private class OASPokemonSpritesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSprites pokemonSprites1 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites2 = pokemonSprites1;
        OASPokemonSprites pokemonSprites3 = new OASPokemonSprites();
        OASPokemonSprites pokemonSprites4 = pokemonSprites3;

        System.assert(pokemonSprites1.equals(pokemonSprites2));
        System.assert(pokemonSprites2.equals(pokemonSprites1));
        System.assert(pokemonSprites1.equals(pokemonSprites1));
        System.assert(pokemonSprites3.equals(pokemonSprites4));
        System.assert(pokemonSprites4.equals(pokemonSprites3));
        System.assert(pokemonSprites3.equals(pokemonSprites3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSprites pokemonSprites1 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites2 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites3 = new OASPokemonSprites();
        OASPokemonSprites pokemonSprites4 = new OASPokemonSprites();

        System.assert(pokemonSprites1.equals(pokemonSprites2));
        System.assert(pokemonSprites2.equals(pokemonSprites1));
        System.assert(pokemonSprites3.equals(pokemonSprites4));
        System.assert(pokemonSprites4.equals(pokemonSprites3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSprites pokemonSprites1 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites2 = new OASPokemonSprites();

        System.assertEquals(false, pokemonSprites1.equals('foo'));
        System.assertEquals(false, pokemonSprites2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSprites pokemonSprites1 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites2 = new OASPokemonSprites();
        OASPokemonSprites pokemonSprites3;

        System.assertEquals(false, pokemonSprites1.equals(pokemonSprites3));
        System.assertEquals(false, pokemonSprites2.equals(pokemonSprites3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSprites pokemonSprites1 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites2 = new OASPokemonSprites();

        System.assertEquals(pokemonSprites1.hashCode(), pokemonSprites1.hashCode());
        System.assertEquals(pokemonSprites2.hashCode(), pokemonSprites2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSprites pokemonSprites1 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites2 = OASPokemonSprites.getExample();
        OASPokemonSprites pokemonSprites3 = new OASPokemonSprites();
        OASPokemonSprites pokemonSprites4 = new OASPokemonSprites();

        System.assert(pokemonSprites1.equals(pokemonSprites2));
        System.assert(pokemonSprites3.equals(pokemonSprites4));
        System.assertEquals(pokemonSprites1.hashCode(), pokemonSprites2.hashCode());
        System.assertEquals(pokemonSprites3.hashCode(), pokemonSprites4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSprites pokemonSprites = new OASPokemonSprites();
        Map<String, String> x-property-mappings = pokemonSprites.getx-property-mappings();
        System.assertEquals('frontDefault', x-property-mappings.get('front_default'));
        System.assertEquals('frontShiny', x-property-mappings.get('front_shiny'));
        System.assertEquals('frontFemale', x-property-mappings.get('front_female'));
        System.assertEquals('frontShinyFemale', x-property-mappings.get('front_shiny_female'));
        System.assertEquals('backDefault', x-property-mappings.get('back_default'));
        System.assertEquals('backShiny', x-property-mappings.get('back_shiny'));
        System.assertEquals('backFemale', x-property-mappings.get('back_female'));
        System.assertEquals('backShinyFemale', x-property-mappings.get('back_shiny_female'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonSprites pokemonSprites = new OASPokemonSprites();
        System.assertEquals(new Map<String, Map<String, oas_any_type_not_mapped>>(), pokemonSprites.versions);
        System.assertEquals(null, pokemonSprites.frontDefault);
        System.assertEquals(null, pokemonSprites.frontShiny);
        System.assertEquals(null, pokemonSprites.frontFemale);
        System.assertEquals(null, pokemonSprites.frontShinyFemale);
        System.assertEquals(null, pokemonSprites.backDefault);
        System.assertEquals(null, pokemonSprites.backShiny);
        System.assertEquals(null, pokemonSprites.backFemale);
        System.assertEquals(null, pokemonSprites.backShinyFemale);
        System.assertEquals(null, pokemonSprites.other);
    }
}
