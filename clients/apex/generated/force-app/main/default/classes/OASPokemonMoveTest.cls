@isTest
private class OASPokemonMoveTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonMove pokemonMove1 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove2 = pokemonMove1;
        OASPokemonMove pokemonMove3 = new OASPokemonMove();
        OASPokemonMove pokemonMove4 = pokemonMove3;

        System.assert(pokemonMove1.equals(pokemonMove2));
        System.assert(pokemonMove2.equals(pokemonMove1));
        System.assert(pokemonMove1.equals(pokemonMove1));
        System.assert(pokemonMove3.equals(pokemonMove4));
        System.assert(pokemonMove4.equals(pokemonMove3));
        System.assert(pokemonMove3.equals(pokemonMove3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonMove pokemonMove1 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove2 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove3 = new OASPokemonMove();
        OASPokemonMove pokemonMove4 = new OASPokemonMove();

        System.assert(pokemonMove1.equals(pokemonMove2));
        System.assert(pokemonMove2.equals(pokemonMove1));
        System.assert(pokemonMove3.equals(pokemonMove4));
        System.assert(pokemonMove4.equals(pokemonMove3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonMove pokemonMove1 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove2 = new OASPokemonMove();

        System.assertEquals(false, pokemonMove1.equals('foo'));
        System.assertEquals(false, pokemonMove2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonMove pokemonMove1 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove2 = new OASPokemonMove();
        OASPokemonMove pokemonMove3;

        System.assertEquals(false, pokemonMove1.equals(pokemonMove3));
        System.assertEquals(false, pokemonMove2.equals(pokemonMove3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonMove pokemonMove1 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove2 = new OASPokemonMove();

        System.assertEquals(pokemonMove1.hashCode(), pokemonMove1.hashCode());
        System.assertEquals(pokemonMove2.hashCode(), pokemonMove2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonMove pokemonMove1 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove2 = OASPokemonMove.getExample();
        OASPokemonMove pokemonMove3 = new OASPokemonMove();
        OASPokemonMove pokemonMove4 = new OASPokemonMove();

        System.assert(pokemonMove1.equals(pokemonMove2));
        System.assert(pokemonMove3.equals(pokemonMove4));
        System.assertEquals(pokemonMove1.hashCode(), pokemonMove2.hashCode());
        System.assertEquals(pokemonMove3.hashCode(), pokemonMove4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonMove pokemonMove = new OASPokemonMove();
        Map<String, String> x-property-mappings = pokemonMove.getx-property-mappings();
        System.assertEquals('versionGroupDetails', x-property-mappings.get('version_group_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonMove pokemonMove = new OASPokemonMove();
        System.assertEquals(new List<OASPokemonMoveVersionGroup>(), pokemonMove.versionGroupDetails);
        System.assertEquals(null, pokemonMove.move);
    }
}
