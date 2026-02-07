@isTest
private class OASPokemonDetailSpritesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailSprites pokemonDetailSprites1 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites2 = pokemonDetailSprites1;
        OASPokemonDetailSprites pokemonDetailSprites3 = new OASPokemonDetailSprites();
        OASPokemonDetailSprites pokemonDetailSprites4 = pokemonDetailSprites3;

        System.assert(pokemonDetailSprites1.equals(pokemonDetailSprites2));
        System.assert(pokemonDetailSprites2.equals(pokemonDetailSprites1));
        System.assert(pokemonDetailSprites1.equals(pokemonDetailSprites1));
        System.assert(pokemonDetailSprites3.equals(pokemonDetailSprites4));
        System.assert(pokemonDetailSprites4.equals(pokemonDetailSprites3));
        System.assert(pokemonDetailSprites3.equals(pokemonDetailSprites3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailSprites pokemonDetailSprites1 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites2 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites3 = new OASPokemonDetailSprites();
        OASPokemonDetailSprites pokemonDetailSprites4 = new OASPokemonDetailSprites();

        System.assert(pokemonDetailSprites1.equals(pokemonDetailSprites2));
        System.assert(pokemonDetailSprites2.equals(pokemonDetailSprites1));
        System.assert(pokemonDetailSprites3.equals(pokemonDetailSprites4));
        System.assert(pokemonDetailSprites4.equals(pokemonDetailSprites3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailSprites pokemonDetailSprites1 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites2 = new OASPokemonDetailSprites();

        System.assertEquals(false, pokemonDetailSprites1.equals('foo'));
        System.assertEquals(false, pokemonDetailSprites2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailSprites pokemonDetailSprites1 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites2 = new OASPokemonDetailSprites();
        OASPokemonDetailSprites pokemonDetailSprites3;

        System.assertEquals(false, pokemonDetailSprites1.equals(pokemonDetailSprites3));
        System.assertEquals(false, pokemonDetailSprites2.equals(pokemonDetailSprites3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailSprites pokemonDetailSprites1 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites2 = new OASPokemonDetailSprites();

        System.assertEquals(pokemonDetailSprites1.hashCode(), pokemonDetailSprites1.hashCode());
        System.assertEquals(pokemonDetailSprites2.hashCode(), pokemonDetailSprites2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailSprites pokemonDetailSprites1 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites2 = OASPokemonDetailSprites.getExample();
        OASPokemonDetailSprites pokemonDetailSprites3 = new OASPokemonDetailSprites();
        OASPokemonDetailSprites pokemonDetailSprites4 = new OASPokemonDetailSprites();

        System.assert(pokemonDetailSprites1.equals(pokemonDetailSprites2));
        System.assert(pokemonDetailSprites3.equals(pokemonDetailSprites4));
        System.assertEquals(pokemonDetailSprites1.hashCode(), pokemonDetailSprites2.hashCode());
        System.assertEquals(pokemonDetailSprites3.hashCode(), pokemonDetailSprites4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDetailSprites pokemonDetailSprites = new OASPokemonDetailSprites();
        Map<String, String> x-property-mappings = pokemonDetailSprites.getx-property-mappings();
        System.assertEquals('frontDefault', x-property-mappings.get('front_default'));
    }
}
