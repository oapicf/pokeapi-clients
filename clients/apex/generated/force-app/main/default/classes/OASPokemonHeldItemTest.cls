@isTest
private class OASPokemonHeldItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonHeldItem pokemonHeldItem1 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem2 = pokemonHeldItem1;
        OASPokemonHeldItem pokemonHeldItem3 = new OASPokemonHeldItem();
        OASPokemonHeldItem pokemonHeldItem4 = pokemonHeldItem3;

        System.assert(pokemonHeldItem1.equals(pokemonHeldItem2));
        System.assert(pokemonHeldItem2.equals(pokemonHeldItem1));
        System.assert(pokemonHeldItem1.equals(pokemonHeldItem1));
        System.assert(pokemonHeldItem3.equals(pokemonHeldItem4));
        System.assert(pokemonHeldItem4.equals(pokemonHeldItem3));
        System.assert(pokemonHeldItem3.equals(pokemonHeldItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonHeldItem pokemonHeldItem1 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem2 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem3 = new OASPokemonHeldItem();
        OASPokemonHeldItem pokemonHeldItem4 = new OASPokemonHeldItem();

        System.assert(pokemonHeldItem1.equals(pokemonHeldItem2));
        System.assert(pokemonHeldItem2.equals(pokemonHeldItem1));
        System.assert(pokemonHeldItem3.equals(pokemonHeldItem4));
        System.assert(pokemonHeldItem4.equals(pokemonHeldItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonHeldItem pokemonHeldItem1 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem2 = new OASPokemonHeldItem();

        System.assertEquals(false, pokemonHeldItem1.equals('foo'));
        System.assertEquals(false, pokemonHeldItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonHeldItem pokemonHeldItem1 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem2 = new OASPokemonHeldItem();
        OASPokemonHeldItem pokemonHeldItem3;

        System.assertEquals(false, pokemonHeldItem1.equals(pokemonHeldItem3));
        System.assertEquals(false, pokemonHeldItem2.equals(pokemonHeldItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonHeldItem pokemonHeldItem1 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem2 = new OASPokemonHeldItem();

        System.assertEquals(pokemonHeldItem1.hashCode(), pokemonHeldItem1.hashCode());
        System.assertEquals(pokemonHeldItem2.hashCode(), pokemonHeldItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonHeldItem pokemonHeldItem1 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem2 = OASPokemonHeldItem.getExample();
        OASPokemonHeldItem pokemonHeldItem3 = new OASPokemonHeldItem();
        OASPokemonHeldItem pokemonHeldItem4 = new OASPokemonHeldItem();

        System.assert(pokemonHeldItem1.equals(pokemonHeldItem2));
        System.assert(pokemonHeldItem3.equals(pokemonHeldItem4));
        System.assertEquals(pokemonHeldItem1.hashCode(), pokemonHeldItem2.hashCode());
        System.assertEquals(pokemonHeldItem3.hashCode(), pokemonHeldItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonHeldItem pokemonHeldItem = new OASPokemonHeldItem();
        Map<String, String> x-property-mappings = pokemonHeldItem.getx-property-mappings();
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonHeldItem pokemonHeldItem = new OASPokemonHeldItem();
        System.assertEquals(new List<OASPokemonHeldItemVersion>(), pokemonHeldItem.versionDetails);
        System.assertEquals(null, pokemonHeldItem.pokemon);
    }
}
