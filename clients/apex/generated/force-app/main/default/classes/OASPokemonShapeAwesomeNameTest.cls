@isTest
private class OASPokemonShapeAwesomeNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName1 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName2 = pokemonShapeAwesomeName1;
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName3 = new OASPokemonShapeAwesomeName();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName4 = pokemonShapeAwesomeName3;

        System.assert(pokemonShapeAwesomeName1.equals(pokemonShapeAwesomeName2));
        System.assert(pokemonShapeAwesomeName2.equals(pokemonShapeAwesomeName1));
        System.assert(pokemonShapeAwesomeName1.equals(pokemonShapeAwesomeName1));
        System.assert(pokemonShapeAwesomeName3.equals(pokemonShapeAwesomeName4));
        System.assert(pokemonShapeAwesomeName4.equals(pokemonShapeAwesomeName3));
        System.assert(pokemonShapeAwesomeName3.equals(pokemonShapeAwesomeName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName1 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName2 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName3 = new OASPokemonShapeAwesomeName();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName4 = new OASPokemonShapeAwesomeName();

        System.assert(pokemonShapeAwesomeName1.equals(pokemonShapeAwesomeName2));
        System.assert(pokemonShapeAwesomeName2.equals(pokemonShapeAwesomeName1));
        System.assert(pokemonShapeAwesomeName3.equals(pokemonShapeAwesomeName4));
        System.assert(pokemonShapeAwesomeName4.equals(pokemonShapeAwesomeName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName1 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName2 = new OASPokemonShapeAwesomeName();

        System.assertEquals(false, pokemonShapeAwesomeName1.equals('foo'));
        System.assertEquals(false, pokemonShapeAwesomeName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName1 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName2 = new OASPokemonShapeAwesomeName();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName3;

        System.assertEquals(false, pokemonShapeAwesomeName1.equals(pokemonShapeAwesomeName3));
        System.assertEquals(false, pokemonShapeAwesomeName2.equals(pokemonShapeAwesomeName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName1 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName2 = new OASPokemonShapeAwesomeName();

        System.assertEquals(pokemonShapeAwesomeName1.hashCode(), pokemonShapeAwesomeName1.hashCode());
        System.assertEquals(pokemonShapeAwesomeName2.hashCode(), pokemonShapeAwesomeName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName1 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName2 = OASPokemonShapeAwesomeName.getExample();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName3 = new OASPokemonShapeAwesomeName();
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName4 = new OASPokemonShapeAwesomeName();

        System.assert(pokemonShapeAwesomeName1.equals(pokemonShapeAwesomeName2));
        System.assert(pokemonShapeAwesomeName3.equals(pokemonShapeAwesomeName4));
        System.assertEquals(pokemonShapeAwesomeName1.hashCode(), pokemonShapeAwesomeName2.hashCode());
        System.assertEquals(pokemonShapeAwesomeName3.hashCode(), pokemonShapeAwesomeName4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonShapeAwesomeName pokemonShapeAwesomeName = new OASPokemonShapeAwesomeName();
        Map<String, String> x-property-mappings = pokemonShapeAwesomeName.getx-property-mappings();
        System.assertEquals('awesomeName', x-property-mappings.get('awesome_name'));
    }
}
