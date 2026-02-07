@isTest
private class OASPokemonDetailMovesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner1 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner2 = pokemonDetailMovesInner1;
        OASPokemonDetailMovesInner pokemonDetailMovesInner3 = new OASPokemonDetailMovesInner();
        OASPokemonDetailMovesInner pokemonDetailMovesInner4 = pokemonDetailMovesInner3;

        System.assert(pokemonDetailMovesInner1.equals(pokemonDetailMovesInner2));
        System.assert(pokemonDetailMovesInner2.equals(pokemonDetailMovesInner1));
        System.assert(pokemonDetailMovesInner1.equals(pokemonDetailMovesInner1));
        System.assert(pokemonDetailMovesInner3.equals(pokemonDetailMovesInner4));
        System.assert(pokemonDetailMovesInner4.equals(pokemonDetailMovesInner3));
        System.assert(pokemonDetailMovesInner3.equals(pokemonDetailMovesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner1 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner2 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner3 = new OASPokemonDetailMovesInner();
        OASPokemonDetailMovesInner pokemonDetailMovesInner4 = new OASPokemonDetailMovesInner();

        System.assert(pokemonDetailMovesInner1.equals(pokemonDetailMovesInner2));
        System.assert(pokemonDetailMovesInner2.equals(pokemonDetailMovesInner1));
        System.assert(pokemonDetailMovesInner3.equals(pokemonDetailMovesInner4));
        System.assert(pokemonDetailMovesInner4.equals(pokemonDetailMovesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner1 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner2 = new OASPokemonDetailMovesInner();

        System.assertEquals(false, pokemonDetailMovesInner1.equals('foo'));
        System.assertEquals(false, pokemonDetailMovesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner1 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner2 = new OASPokemonDetailMovesInner();
        OASPokemonDetailMovesInner pokemonDetailMovesInner3;

        System.assertEquals(false, pokemonDetailMovesInner1.equals(pokemonDetailMovesInner3));
        System.assertEquals(false, pokemonDetailMovesInner2.equals(pokemonDetailMovesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner1 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner2 = new OASPokemonDetailMovesInner();

        System.assertEquals(pokemonDetailMovesInner1.hashCode(), pokemonDetailMovesInner1.hashCode());
        System.assertEquals(pokemonDetailMovesInner2.hashCode(), pokemonDetailMovesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner1 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner2 = OASPokemonDetailMovesInner.getExample();
        OASPokemonDetailMovesInner pokemonDetailMovesInner3 = new OASPokemonDetailMovesInner();
        OASPokemonDetailMovesInner pokemonDetailMovesInner4 = new OASPokemonDetailMovesInner();

        System.assert(pokemonDetailMovesInner1.equals(pokemonDetailMovesInner2));
        System.assert(pokemonDetailMovesInner3.equals(pokemonDetailMovesInner4));
        System.assertEquals(pokemonDetailMovesInner1.hashCode(), pokemonDetailMovesInner2.hashCode());
        System.assertEquals(pokemonDetailMovesInner3.hashCode(), pokemonDetailMovesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner = new OASPokemonDetailMovesInner();
        Map<String, String> x-property-mappings = pokemonDetailMovesInner.getx-property-mappings();
        System.assertEquals('versionGroupDetails', x-property-mappings.get('version_group_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonDetailMovesInner pokemonDetailMovesInner = new OASPokemonDetailMovesInner();
        System.assertEquals(new List<OASPokemonDetailMovesInnerVersionGro>(), pokemonDetailMovesInner.versionGroupDetails);
        System.assertEquals(null, pokemonDetailMovesInner.move);
    }
}
