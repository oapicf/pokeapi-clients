@isTest
private class OASPokemonFormSpritesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormSprites pokemonFormSprites1 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites2 = pokemonFormSprites1;
        OASPokemonFormSprites pokemonFormSprites3 = new OASPokemonFormSprites();
        OASPokemonFormSprites pokemonFormSprites4 = pokemonFormSprites3;

        System.assert(pokemonFormSprites1.equals(pokemonFormSprites2));
        System.assert(pokemonFormSprites2.equals(pokemonFormSprites1));
        System.assert(pokemonFormSprites1.equals(pokemonFormSprites1));
        System.assert(pokemonFormSprites3.equals(pokemonFormSprites4));
        System.assert(pokemonFormSprites4.equals(pokemonFormSprites3));
        System.assert(pokemonFormSprites3.equals(pokemonFormSprites3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormSprites pokemonFormSprites1 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites2 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites3 = new OASPokemonFormSprites();
        OASPokemonFormSprites pokemonFormSprites4 = new OASPokemonFormSprites();

        System.assert(pokemonFormSprites1.equals(pokemonFormSprites2));
        System.assert(pokemonFormSprites2.equals(pokemonFormSprites1));
        System.assert(pokemonFormSprites3.equals(pokemonFormSprites4));
        System.assert(pokemonFormSprites4.equals(pokemonFormSprites3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormSprites pokemonFormSprites1 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites2 = new OASPokemonFormSprites();

        System.assertEquals(false, pokemonFormSprites1.equals('foo'));
        System.assertEquals(false, pokemonFormSprites2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormSprites pokemonFormSprites1 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites2 = new OASPokemonFormSprites();
        OASPokemonFormSprites pokemonFormSprites3;

        System.assertEquals(false, pokemonFormSprites1.equals(pokemonFormSprites3));
        System.assertEquals(false, pokemonFormSprites2.equals(pokemonFormSprites3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormSprites pokemonFormSprites1 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites2 = new OASPokemonFormSprites();

        System.assertEquals(pokemonFormSprites1.hashCode(), pokemonFormSprites1.hashCode());
        System.assertEquals(pokemonFormSprites2.hashCode(), pokemonFormSprites2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormSprites pokemonFormSprites1 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites2 = OASPokemonFormSprites.getExample();
        OASPokemonFormSprites pokemonFormSprites3 = new OASPokemonFormSprites();
        OASPokemonFormSprites pokemonFormSprites4 = new OASPokemonFormSprites();

        System.assert(pokemonFormSprites1.equals(pokemonFormSprites2));
        System.assert(pokemonFormSprites3.equals(pokemonFormSprites4));
        System.assertEquals(pokemonFormSprites1.hashCode(), pokemonFormSprites2.hashCode());
        System.assertEquals(pokemonFormSprites3.hashCode(), pokemonFormSprites4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonFormSprites pokemonFormSprites = new OASPokemonFormSprites();
        Map<String, String> x-property-mappings = pokemonFormSprites.getx-property-mappings();
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
        OASPokemonFormSprites pokemonFormSprites = new OASPokemonFormSprites();
        System.assertEquals(new Map<String, Map<String, oas_any_type_not_mapped>>(), pokemonFormSprites.versions);
        System.assertEquals(null, pokemonFormSprites.frontDefault);
        System.assertEquals(null, pokemonFormSprites.frontShiny);
        System.assertEquals(null, pokemonFormSprites.frontFemale);
        System.assertEquals(null, pokemonFormSprites.frontShinyFemale);
        System.assertEquals(null, pokemonFormSprites.backDefault);
        System.assertEquals(null, pokemonFormSprites.backShiny);
        System.assertEquals(null, pokemonFormSprites.backFemale);
        System.assertEquals(null, pokemonFormSprites.backShinyFemale);
        System.assertEquals(null, pokemonFormSprites.other);
    }
}
