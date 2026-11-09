@isTest
private class OASPokemonEvolutionKnownMoveTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove1 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove2 = pokemonEvolutionKnownMove1;
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove3 = new OASPokemonEvolutionKnownMove();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove4 = pokemonEvolutionKnownMove3;

        System.assert(pokemonEvolutionKnownMove1.equals(pokemonEvolutionKnownMove2));
        System.assert(pokemonEvolutionKnownMove2.equals(pokemonEvolutionKnownMove1));
        System.assert(pokemonEvolutionKnownMove1.equals(pokemonEvolutionKnownMove1));
        System.assert(pokemonEvolutionKnownMove3.equals(pokemonEvolutionKnownMove4));
        System.assert(pokemonEvolutionKnownMove4.equals(pokemonEvolutionKnownMove3));
        System.assert(pokemonEvolutionKnownMove3.equals(pokemonEvolutionKnownMove3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove1 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove2 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove3 = new OASPokemonEvolutionKnownMove();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove4 = new OASPokemonEvolutionKnownMove();

        System.assert(pokemonEvolutionKnownMove1.equals(pokemonEvolutionKnownMove2));
        System.assert(pokemonEvolutionKnownMove2.equals(pokemonEvolutionKnownMove1));
        System.assert(pokemonEvolutionKnownMove3.equals(pokemonEvolutionKnownMove4));
        System.assert(pokemonEvolutionKnownMove4.equals(pokemonEvolutionKnownMove3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove1 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove2 = new OASPokemonEvolutionKnownMove();

        System.assertEquals(false, pokemonEvolutionKnownMove1.equals('foo'));
        System.assertEquals(false, pokemonEvolutionKnownMove2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove1 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove2 = new OASPokemonEvolutionKnownMove();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove3;

        System.assertEquals(false, pokemonEvolutionKnownMove1.equals(pokemonEvolutionKnownMove3));
        System.assertEquals(false, pokemonEvolutionKnownMove2.equals(pokemonEvolutionKnownMove3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove1 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove2 = new OASPokemonEvolutionKnownMove();

        System.assertEquals(pokemonEvolutionKnownMove1.hashCode(), pokemonEvolutionKnownMove1.hashCode());
        System.assertEquals(pokemonEvolutionKnownMove2.hashCode(), pokemonEvolutionKnownMove2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove1 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove2 = OASPokemonEvolutionKnownMove.getExample();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove3 = new OASPokemonEvolutionKnownMove();
        OASPokemonEvolutionKnownMove pokemonEvolutionKnownMove4 = new OASPokemonEvolutionKnownMove();

        System.assert(pokemonEvolutionKnownMove1.equals(pokemonEvolutionKnownMove2));
        System.assert(pokemonEvolutionKnownMove3.equals(pokemonEvolutionKnownMove4));
        System.assertEquals(pokemonEvolutionKnownMove1.hashCode(), pokemonEvolutionKnownMove2.hashCode());
        System.assertEquals(pokemonEvolutionKnownMove3.hashCode(), pokemonEvolutionKnownMove4.hashCode());
    }
}
