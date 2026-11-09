@isTest
private class OASPokemonDexNumberTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDexNumber pokemonDexNumber1 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber2 = pokemonDexNumber1;
        OASPokemonDexNumber pokemonDexNumber3 = new OASPokemonDexNumber();
        OASPokemonDexNumber pokemonDexNumber4 = pokemonDexNumber3;

        System.assert(pokemonDexNumber1.equals(pokemonDexNumber2));
        System.assert(pokemonDexNumber2.equals(pokemonDexNumber1));
        System.assert(pokemonDexNumber1.equals(pokemonDexNumber1));
        System.assert(pokemonDexNumber3.equals(pokemonDexNumber4));
        System.assert(pokemonDexNumber4.equals(pokemonDexNumber3));
        System.assert(pokemonDexNumber3.equals(pokemonDexNumber3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDexNumber pokemonDexNumber1 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber2 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber3 = new OASPokemonDexNumber();
        OASPokemonDexNumber pokemonDexNumber4 = new OASPokemonDexNumber();

        System.assert(pokemonDexNumber1.equals(pokemonDexNumber2));
        System.assert(pokemonDexNumber2.equals(pokemonDexNumber1));
        System.assert(pokemonDexNumber3.equals(pokemonDexNumber4));
        System.assert(pokemonDexNumber4.equals(pokemonDexNumber3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDexNumber pokemonDexNumber1 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber2 = new OASPokemonDexNumber();

        System.assertEquals(false, pokemonDexNumber1.equals('foo'));
        System.assertEquals(false, pokemonDexNumber2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDexNumber pokemonDexNumber1 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber2 = new OASPokemonDexNumber();
        OASPokemonDexNumber pokemonDexNumber3;

        System.assertEquals(false, pokemonDexNumber1.equals(pokemonDexNumber3));
        System.assertEquals(false, pokemonDexNumber2.equals(pokemonDexNumber3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDexNumber pokemonDexNumber1 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber2 = new OASPokemonDexNumber();

        System.assertEquals(pokemonDexNumber1.hashCode(), pokemonDexNumber1.hashCode());
        System.assertEquals(pokemonDexNumber2.hashCode(), pokemonDexNumber2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDexNumber pokemonDexNumber1 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber2 = OASPokemonDexNumber.getExample();
        OASPokemonDexNumber pokemonDexNumber3 = new OASPokemonDexNumber();
        OASPokemonDexNumber pokemonDexNumber4 = new OASPokemonDexNumber();

        System.assert(pokemonDexNumber1.equals(pokemonDexNumber2));
        System.assert(pokemonDexNumber3.equals(pokemonDexNumber4));
        System.assertEquals(pokemonDexNumber1.hashCode(), pokemonDexNumber2.hashCode());
        System.assertEquals(pokemonDexNumber3.hashCode(), pokemonDexNumber4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDexNumber pokemonDexNumber = new OASPokemonDexNumber();
        Map<String, String> x-property-mappings = pokemonDexNumber.getx-property-mappings();
        System.assertEquals('entryNumber', x-property-mappings.get('entry_number'));
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }
}
