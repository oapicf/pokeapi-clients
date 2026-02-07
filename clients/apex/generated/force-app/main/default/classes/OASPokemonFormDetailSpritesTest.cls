@isTest
private class OASPokemonFormDetailSpritesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormDetailSprites pokemonFormDetailSprites1 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites2 = pokemonFormDetailSprites1;
        OASPokemonFormDetailSprites pokemonFormDetailSprites3 = new OASPokemonFormDetailSprites();
        OASPokemonFormDetailSprites pokemonFormDetailSprites4 = pokemonFormDetailSprites3;

        System.assert(pokemonFormDetailSprites1.equals(pokemonFormDetailSprites2));
        System.assert(pokemonFormDetailSprites2.equals(pokemonFormDetailSprites1));
        System.assert(pokemonFormDetailSprites1.equals(pokemonFormDetailSprites1));
        System.assert(pokemonFormDetailSprites3.equals(pokemonFormDetailSprites4));
        System.assert(pokemonFormDetailSprites4.equals(pokemonFormDetailSprites3));
        System.assert(pokemonFormDetailSprites3.equals(pokemonFormDetailSprites3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormDetailSprites pokemonFormDetailSprites1 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites2 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites3 = new OASPokemonFormDetailSprites();
        OASPokemonFormDetailSprites pokemonFormDetailSprites4 = new OASPokemonFormDetailSprites();

        System.assert(pokemonFormDetailSprites1.equals(pokemonFormDetailSprites2));
        System.assert(pokemonFormDetailSprites2.equals(pokemonFormDetailSprites1));
        System.assert(pokemonFormDetailSprites3.equals(pokemonFormDetailSprites4));
        System.assert(pokemonFormDetailSprites4.equals(pokemonFormDetailSprites3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormDetailSprites pokemonFormDetailSprites1 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites2 = new OASPokemonFormDetailSprites();

        System.assertEquals(false, pokemonFormDetailSprites1.equals('foo'));
        System.assertEquals(false, pokemonFormDetailSprites2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormDetailSprites pokemonFormDetailSprites1 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites2 = new OASPokemonFormDetailSprites();
        OASPokemonFormDetailSprites pokemonFormDetailSprites3;

        System.assertEquals(false, pokemonFormDetailSprites1.equals(pokemonFormDetailSprites3));
        System.assertEquals(false, pokemonFormDetailSprites2.equals(pokemonFormDetailSprites3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormDetailSprites pokemonFormDetailSprites1 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites2 = new OASPokemonFormDetailSprites();

        System.assertEquals(pokemonFormDetailSprites1.hashCode(), pokemonFormDetailSprites1.hashCode());
        System.assertEquals(pokemonFormDetailSprites2.hashCode(), pokemonFormDetailSprites2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormDetailSprites pokemonFormDetailSprites1 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites2 = OASPokemonFormDetailSprites.getExample();
        OASPokemonFormDetailSprites pokemonFormDetailSprites3 = new OASPokemonFormDetailSprites();
        OASPokemonFormDetailSprites pokemonFormDetailSprites4 = new OASPokemonFormDetailSprites();

        System.assert(pokemonFormDetailSprites1.equals(pokemonFormDetailSprites2));
        System.assert(pokemonFormDetailSprites3.equals(pokemonFormDetailSprites4));
        System.assertEquals(pokemonFormDetailSprites1.hashCode(), pokemonFormDetailSprites2.hashCode());
        System.assertEquals(pokemonFormDetailSprites3.hashCode(), pokemonFormDetailSprites4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonFormDetailSprites pokemonFormDetailSprites = new OASPokemonFormDetailSprites();
        Map<String, String> x-property-mappings = pokemonFormDetailSprites.getx-property-mappings();
        System.assertEquals('r_default', x-property-mappings.get('default'));
    }
}
