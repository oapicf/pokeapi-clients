@isTest
private class OASPokemonGameIndexTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonGameIndex pokemonGameIndex1 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex2 = pokemonGameIndex1;
        OASPokemonGameIndex pokemonGameIndex3 = new OASPokemonGameIndex();
        OASPokemonGameIndex pokemonGameIndex4 = pokemonGameIndex3;

        System.assert(pokemonGameIndex1.equals(pokemonGameIndex2));
        System.assert(pokemonGameIndex2.equals(pokemonGameIndex1));
        System.assert(pokemonGameIndex1.equals(pokemonGameIndex1));
        System.assert(pokemonGameIndex3.equals(pokemonGameIndex4));
        System.assert(pokemonGameIndex4.equals(pokemonGameIndex3));
        System.assert(pokemonGameIndex3.equals(pokemonGameIndex3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonGameIndex pokemonGameIndex1 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex2 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex3 = new OASPokemonGameIndex();
        OASPokemonGameIndex pokemonGameIndex4 = new OASPokemonGameIndex();

        System.assert(pokemonGameIndex1.equals(pokemonGameIndex2));
        System.assert(pokemonGameIndex2.equals(pokemonGameIndex1));
        System.assert(pokemonGameIndex3.equals(pokemonGameIndex4));
        System.assert(pokemonGameIndex4.equals(pokemonGameIndex3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonGameIndex pokemonGameIndex1 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex2 = new OASPokemonGameIndex();

        System.assertEquals(false, pokemonGameIndex1.equals('foo'));
        System.assertEquals(false, pokemonGameIndex2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonGameIndex pokemonGameIndex1 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex2 = new OASPokemonGameIndex();
        OASPokemonGameIndex pokemonGameIndex3;

        System.assertEquals(false, pokemonGameIndex1.equals(pokemonGameIndex3));
        System.assertEquals(false, pokemonGameIndex2.equals(pokemonGameIndex3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonGameIndex pokemonGameIndex1 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex2 = new OASPokemonGameIndex();

        System.assertEquals(pokemonGameIndex1.hashCode(), pokemonGameIndex1.hashCode());
        System.assertEquals(pokemonGameIndex2.hashCode(), pokemonGameIndex2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonGameIndex pokemonGameIndex1 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex2 = OASPokemonGameIndex.getExample();
        OASPokemonGameIndex pokemonGameIndex3 = new OASPokemonGameIndex();
        OASPokemonGameIndex pokemonGameIndex4 = new OASPokemonGameIndex();

        System.assert(pokemonGameIndex1.equals(pokemonGameIndex2));
        System.assert(pokemonGameIndex3.equals(pokemonGameIndex4));
        System.assertEquals(pokemonGameIndex1.hashCode(), pokemonGameIndex2.hashCode());
        System.assertEquals(pokemonGameIndex3.hashCode(), pokemonGameIndex4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonGameIndex pokemonGameIndex = new OASPokemonGameIndex();
        Map<String, String> x-property-mappings = pokemonGameIndex.getx-property-mappings();
        System.assertEquals('gameIndex', x-property-mappings.get('game_index'));
    }
}
