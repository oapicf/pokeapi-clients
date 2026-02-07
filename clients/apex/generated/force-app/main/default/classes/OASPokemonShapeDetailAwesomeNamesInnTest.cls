@isTest
private class OASPokemonShapeDetailAwesomeNamesInnTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner1 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner2 = pokemonShapeDetailAwesomeNamesInner1;
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner3 = new OASPokemonShapeDetailAwesomeNamesInn();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner4 = pokemonShapeDetailAwesomeNamesInner3;

        System.assert(pokemonShapeDetailAwesomeNamesInner1.equals(pokemonShapeDetailAwesomeNamesInner2));
        System.assert(pokemonShapeDetailAwesomeNamesInner2.equals(pokemonShapeDetailAwesomeNamesInner1));
        System.assert(pokemonShapeDetailAwesomeNamesInner1.equals(pokemonShapeDetailAwesomeNamesInner1));
        System.assert(pokemonShapeDetailAwesomeNamesInner3.equals(pokemonShapeDetailAwesomeNamesInner4));
        System.assert(pokemonShapeDetailAwesomeNamesInner4.equals(pokemonShapeDetailAwesomeNamesInner3));
        System.assert(pokemonShapeDetailAwesomeNamesInner3.equals(pokemonShapeDetailAwesomeNamesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner1 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner2 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner3 = new OASPokemonShapeDetailAwesomeNamesInn();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner4 = new OASPokemonShapeDetailAwesomeNamesInn();

        System.assert(pokemonShapeDetailAwesomeNamesInner1.equals(pokemonShapeDetailAwesomeNamesInner2));
        System.assert(pokemonShapeDetailAwesomeNamesInner2.equals(pokemonShapeDetailAwesomeNamesInner1));
        System.assert(pokemonShapeDetailAwesomeNamesInner3.equals(pokemonShapeDetailAwesomeNamesInner4));
        System.assert(pokemonShapeDetailAwesomeNamesInner4.equals(pokemonShapeDetailAwesomeNamesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner1 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner2 = new OASPokemonShapeDetailAwesomeNamesInn();

        System.assertEquals(false, pokemonShapeDetailAwesomeNamesInner1.equals('foo'));
        System.assertEquals(false, pokemonShapeDetailAwesomeNamesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner1 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner2 = new OASPokemonShapeDetailAwesomeNamesInn();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner3;

        System.assertEquals(false, pokemonShapeDetailAwesomeNamesInner1.equals(pokemonShapeDetailAwesomeNamesInner3));
        System.assertEquals(false, pokemonShapeDetailAwesomeNamesInner2.equals(pokemonShapeDetailAwesomeNamesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner1 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner2 = new OASPokemonShapeDetailAwesomeNamesInn();

        System.assertEquals(pokemonShapeDetailAwesomeNamesInner1.hashCode(), pokemonShapeDetailAwesomeNamesInner1.hashCode());
        System.assertEquals(pokemonShapeDetailAwesomeNamesInner2.hashCode(), pokemonShapeDetailAwesomeNamesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner1 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner2 = OASPokemonShapeDetailAwesomeNamesInn.getExample();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner3 = new OASPokemonShapeDetailAwesomeNamesInn();
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner4 = new OASPokemonShapeDetailAwesomeNamesInn();

        System.assert(pokemonShapeDetailAwesomeNamesInner1.equals(pokemonShapeDetailAwesomeNamesInner2));
        System.assert(pokemonShapeDetailAwesomeNamesInner3.equals(pokemonShapeDetailAwesomeNamesInner4));
        System.assertEquals(pokemonShapeDetailAwesomeNamesInner1.hashCode(), pokemonShapeDetailAwesomeNamesInner2.hashCode());
        System.assertEquals(pokemonShapeDetailAwesomeNamesInner3.hashCode(), pokemonShapeDetailAwesomeNamesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonShapeDetailAwesomeNamesInn pokemonShapeDetailAwesomeNamesInner = new OASPokemonShapeDetailAwesomeNamesInn();
        Map<String, String> x-property-mappings = pokemonShapeDetailAwesomeNamesInner.getx-property-mappings();
        System.assertEquals('awesomeName', x-property-mappings.get('awesome_name'));
    }
}
