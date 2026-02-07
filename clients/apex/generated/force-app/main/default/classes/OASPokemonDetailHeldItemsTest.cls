@isTest
private class OASPokemonDetailHeldItemsTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems1 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems2 = pokemonDetailHeldItems1;
        OASPokemonDetailHeldItems pokemonDetailHeldItems3 = new OASPokemonDetailHeldItems();
        OASPokemonDetailHeldItems pokemonDetailHeldItems4 = pokemonDetailHeldItems3;

        System.assert(pokemonDetailHeldItems1.equals(pokemonDetailHeldItems2));
        System.assert(pokemonDetailHeldItems2.equals(pokemonDetailHeldItems1));
        System.assert(pokemonDetailHeldItems1.equals(pokemonDetailHeldItems1));
        System.assert(pokemonDetailHeldItems3.equals(pokemonDetailHeldItems4));
        System.assert(pokemonDetailHeldItems4.equals(pokemonDetailHeldItems3));
        System.assert(pokemonDetailHeldItems3.equals(pokemonDetailHeldItems3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems1 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems2 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems3 = new OASPokemonDetailHeldItems();
        OASPokemonDetailHeldItems pokemonDetailHeldItems4 = new OASPokemonDetailHeldItems();

        System.assert(pokemonDetailHeldItems1.equals(pokemonDetailHeldItems2));
        System.assert(pokemonDetailHeldItems2.equals(pokemonDetailHeldItems1));
        System.assert(pokemonDetailHeldItems3.equals(pokemonDetailHeldItems4));
        System.assert(pokemonDetailHeldItems4.equals(pokemonDetailHeldItems3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems1 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems2 = new OASPokemonDetailHeldItems();

        System.assertEquals(false, pokemonDetailHeldItems1.equals('foo'));
        System.assertEquals(false, pokemonDetailHeldItems2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems1 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems2 = new OASPokemonDetailHeldItems();
        OASPokemonDetailHeldItems pokemonDetailHeldItems3;

        System.assertEquals(false, pokemonDetailHeldItems1.equals(pokemonDetailHeldItems3));
        System.assertEquals(false, pokemonDetailHeldItems2.equals(pokemonDetailHeldItems3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems1 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems2 = new OASPokemonDetailHeldItems();

        System.assertEquals(pokemonDetailHeldItems1.hashCode(), pokemonDetailHeldItems1.hashCode());
        System.assertEquals(pokemonDetailHeldItems2.hashCode(), pokemonDetailHeldItems2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems1 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems2 = OASPokemonDetailHeldItems.getExample();
        OASPokemonDetailHeldItems pokemonDetailHeldItems3 = new OASPokemonDetailHeldItems();
        OASPokemonDetailHeldItems pokemonDetailHeldItems4 = new OASPokemonDetailHeldItems();

        System.assert(pokemonDetailHeldItems1.equals(pokemonDetailHeldItems2));
        System.assert(pokemonDetailHeldItems3.equals(pokemonDetailHeldItems4));
        System.assertEquals(pokemonDetailHeldItems1.hashCode(), pokemonDetailHeldItems2.hashCode());
        System.assertEquals(pokemonDetailHeldItems3.hashCode(), pokemonDetailHeldItems4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems = new OASPokemonDetailHeldItems();
        Map<String, String> x-property-mappings = pokemonDetailHeldItems.getx-property-mappings();
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonDetailHeldItems pokemonDetailHeldItems = new OASPokemonDetailHeldItems();
        System.assertEquals(new List<OASItemDetailHeldByPokemonInnerVersi>(), pokemonDetailHeldItems.versionDetails);
        System.assertEquals(null, pokemonDetailHeldItems.item);
    }
}
