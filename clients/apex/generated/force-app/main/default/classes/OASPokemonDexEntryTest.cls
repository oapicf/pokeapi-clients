@isTest
private class OASPokemonDexEntryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDexEntry pokemonDexEntry1 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry2 = pokemonDexEntry1;
        OASPokemonDexEntry pokemonDexEntry3 = new OASPokemonDexEntry();
        OASPokemonDexEntry pokemonDexEntry4 = pokemonDexEntry3;

        System.assert(pokemonDexEntry1.equals(pokemonDexEntry2));
        System.assert(pokemonDexEntry2.equals(pokemonDexEntry1));
        System.assert(pokemonDexEntry1.equals(pokemonDexEntry1));
        System.assert(pokemonDexEntry3.equals(pokemonDexEntry4));
        System.assert(pokemonDexEntry4.equals(pokemonDexEntry3));
        System.assert(pokemonDexEntry3.equals(pokemonDexEntry3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDexEntry pokemonDexEntry1 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry2 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry3 = new OASPokemonDexEntry();
        OASPokemonDexEntry pokemonDexEntry4 = new OASPokemonDexEntry();

        System.assert(pokemonDexEntry1.equals(pokemonDexEntry2));
        System.assert(pokemonDexEntry2.equals(pokemonDexEntry1));
        System.assert(pokemonDexEntry3.equals(pokemonDexEntry4));
        System.assert(pokemonDexEntry4.equals(pokemonDexEntry3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDexEntry pokemonDexEntry1 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry2 = new OASPokemonDexEntry();

        System.assertEquals(false, pokemonDexEntry1.equals('foo'));
        System.assertEquals(false, pokemonDexEntry2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDexEntry pokemonDexEntry1 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry2 = new OASPokemonDexEntry();
        OASPokemonDexEntry pokemonDexEntry3;

        System.assertEquals(false, pokemonDexEntry1.equals(pokemonDexEntry3));
        System.assertEquals(false, pokemonDexEntry2.equals(pokemonDexEntry3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDexEntry pokemonDexEntry1 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry2 = new OASPokemonDexEntry();

        System.assertEquals(pokemonDexEntry1.hashCode(), pokemonDexEntry1.hashCode());
        System.assertEquals(pokemonDexEntry2.hashCode(), pokemonDexEntry2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDexEntry pokemonDexEntry1 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry2 = OASPokemonDexEntry.getExample();
        OASPokemonDexEntry pokemonDexEntry3 = new OASPokemonDexEntry();
        OASPokemonDexEntry pokemonDexEntry4 = new OASPokemonDexEntry();

        System.assert(pokemonDexEntry1.equals(pokemonDexEntry2));
        System.assert(pokemonDexEntry3.equals(pokemonDexEntry4));
        System.assertEquals(pokemonDexEntry1.hashCode(), pokemonDexEntry2.hashCode());
        System.assertEquals(pokemonDexEntry3.hashCode(), pokemonDexEntry4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDexEntry pokemonDexEntry = new OASPokemonDexEntry();
        Map<String, String> x-property-mappings = pokemonDexEntry.getx-property-mappings();
        System.assertEquals('entryNumber', x-property-mappings.get('entry_number'));
    }
}
