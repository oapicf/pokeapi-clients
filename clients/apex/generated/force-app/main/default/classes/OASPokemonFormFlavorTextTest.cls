@isTest
private class OASPokemonFormFlavorTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormFlavorText pokemonFormFlavorText1 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText2 = pokemonFormFlavorText1;
        OASPokemonFormFlavorText pokemonFormFlavorText3 = new OASPokemonFormFlavorText();
        OASPokemonFormFlavorText pokemonFormFlavorText4 = pokemonFormFlavorText3;

        System.assert(pokemonFormFlavorText1.equals(pokemonFormFlavorText2));
        System.assert(pokemonFormFlavorText2.equals(pokemonFormFlavorText1));
        System.assert(pokemonFormFlavorText1.equals(pokemonFormFlavorText1));
        System.assert(pokemonFormFlavorText3.equals(pokemonFormFlavorText4));
        System.assert(pokemonFormFlavorText4.equals(pokemonFormFlavorText3));
        System.assert(pokemonFormFlavorText3.equals(pokemonFormFlavorText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormFlavorText pokemonFormFlavorText1 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText2 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText3 = new OASPokemonFormFlavorText();
        OASPokemonFormFlavorText pokemonFormFlavorText4 = new OASPokemonFormFlavorText();

        System.assert(pokemonFormFlavorText1.equals(pokemonFormFlavorText2));
        System.assert(pokemonFormFlavorText2.equals(pokemonFormFlavorText1));
        System.assert(pokemonFormFlavorText3.equals(pokemonFormFlavorText4));
        System.assert(pokemonFormFlavorText4.equals(pokemonFormFlavorText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormFlavorText pokemonFormFlavorText1 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText2 = new OASPokemonFormFlavorText();

        System.assertEquals(false, pokemonFormFlavorText1.equals('foo'));
        System.assertEquals(false, pokemonFormFlavorText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormFlavorText pokemonFormFlavorText1 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText2 = new OASPokemonFormFlavorText();
        OASPokemonFormFlavorText pokemonFormFlavorText3;

        System.assertEquals(false, pokemonFormFlavorText1.equals(pokemonFormFlavorText3));
        System.assertEquals(false, pokemonFormFlavorText2.equals(pokemonFormFlavorText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormFlavorText pokemonFormFlavorText1 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText2 = new OASPokemonFormFlavorText();

        System.assertEquals(pokemonFormFlavorText1.hashCode(), pokemonFormFlavorText1.hashCode());
        System.assertEquals(pokemonFormFlavorText2.hashCode(), pokemonFormFlavorText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormFlavorText pokemonFormFlavorText1 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText2 = OASPokemonFormFlavorText.getExample();
        OASPokemonFormFlavorText pokemonFormFlavorText3 = new OASPokemonFormFlavorText();
        OASPokemonFormFlavorText pokemonFormFlavorText4 = new OASPokemonFormFlavorText();

        System.assert(pokemonFormFlavorText1.equals(pokemonFormFlavorText2));
        System.assert(pokemonFormFlavorText3.equals(pokemonFormFlavorText4));
        System.assertEquals(pokemonFormFlavorText1.hashCode(), pokemonFormFlavorText2.hashCode());
        System.assertEquals(pokemonFormFlavorText3.hashCode(), pokemonFormFlavorText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonFormFlavorText pokemonFormFlavorText = new OASPokemonFormFlavorText();
        Map<String, String> x-property-mappings = pokemonFormFlavorText.getx-property-mappings();
        System.assertEquals('flavorText', x-property-mappings.get('flavor_text'));
    }
}
