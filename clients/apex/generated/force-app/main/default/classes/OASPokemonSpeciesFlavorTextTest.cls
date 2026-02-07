@isTest
private class OASPokemonSpeciesFlavorTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText1 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText2 = pokemonSpeciesFlavorText1;
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText3 = new OASPokemonSpeciesFlavorText();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText4 = pokemonSpeciesFlavorText3;

        System.assert(pokemonSpeciesFlavorText1.equals(pokemonSpeciesFlavorText2));
        System.assert(pokemonSpeciesFlavorText2.equals(pokemonSpeciesFlavorText1));
        System.assert(pokemonSpeciesFlavorText1.equals(pokemonSpeciesFlavorText1));
        System.assert(pokemonSpeciesFlavorText3.equals(pokemonSpeciesFlavorText4));
        System.assert(pokemonSpeciesFlavorText4.equals(pokemonSpeciesFlavorText3));
        System.assert(pokemonSpeciesFlavorText3.equals(pokemonSpeciesFlavorText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText1 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText2 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText3 = new OASPokemonSpeciesFlavorText();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText4 = new OASPokemonSpeciesFlavorText();

        System.assert(pokemonSpeciesFlavorText1.equals(pokemonSpeciesFlavorText2));
        System.assert(pokemonSpeciesFlavorText2.equals(pokemonSpeciesFlavorText1));
        System.assert(pokemonSpeciesFlavorText3.equals(pokemonSpeciesFlavorText4));
        System.assert(pokemonSpeciesFlavorText4.equals(pokemonSpeciesFlavorText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText1 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText2 = new OASPokemonSpeciesFlavorText();

        System.assertEquals(false, pokemonSpeciesFlavorText1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesFlavorText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText1 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText2 = new OASPokemonSpeciesFlavorText();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText3;

        System.assertEquals(false, pokemonSpeciesFlavorText1.equals(pokemonSpeciesFlavorText3));
        System.assertEquals(false, pokemonSpeciesFlavorText2.equals(pokemonSpeciesFlavorText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText1 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText2 = new OASPokemonSpeciesFlavorText();

        System.assertEquals(pokemonSpeciesFlavorText1.hashCode(), pokemonSpeciesFlavorText1.hashCode());
        System.assertEquals(pokemonSpeciesFlavorText2.hashCode(), pokemonSpeciesFlavorText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText1 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText2 = OASPokemonSpeciesFlavorText.getExample();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText3 = new OASPokemonSpeciesFlavorText();
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText4 = new OASPokemonSpeciesFlavorText();

        System.assert(pokemonSpeciesFlavorText1.equals(pokemonSpeciesFlavorText2));
        System.assert(pokemonSpeciesFlavorText3.equals(pokemonSpeciesFlavorText4));
        System.assertEquals(pokemonSpeciesFlavorText1.hashCode(), pokemonSpeciesFlavorText2.hashCode());
        System.assertEquals(pokemonSpeciesFlavorText3.hashCode(), pokemonSpeciesFlavorText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpeciesFlavorText pokemonSpeciesFlavorText = new OASPokemonSpeciesFlavorText();
        Map<String, String> x-property-mappings = pokemonSpeciesFlavorText.getx-property-mappings();
        System.assertEquals('flavorText', x-property-mappings.get('flavor_text'));
    }
}
