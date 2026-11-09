@isTest
private class OASPokemonPastStatTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonPastStat pokemonPastStat1 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat2 = pokemonPastStat1;
        OASPokemonPastStat pokemonPastStat3 = new OASPokemonPastStat();
        OASPokemonPastStat pokemonPastStat4 = pokemonPastStat3;

        System.assert(pokemonPastStat1.equals(pokemonPastStat2));
        System.assert(pokemonPastStat2.equals(pokemonPastStat1));
        System.assert(pokemonPastStat1.equals(pokemonPastStat1));
        System.assert(pokemonPastStat3.equals(pokemonPastStat4));
        System.assert(pokemonPastStat4.equals(pokemonPastStat3));
        System.assert(pokemonPastStat3.equals(pokemonPastStat3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonPastStat pokemonPastStat1 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat2 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat3 = new OASPokemonPastStat();
        OASPokemonPastStat pokemonPastStat4 = new OASPokemonPastStat();

        System.assert(pokemonPastStat1.equals(pokemonPastStat2));
        System.assert(pokemonPastStat2.equals(pokemonPastStat1));
        System.assert(pokemonPastStat3.equals(pokemonPastStat4));
        System.assert(pokemonPastStat4.equals(pokemonPastStat3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonPastStat pokemonPastStat1 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat2 = new OASPokemonPastStat();

        System.assertEquals(false, pokemonPastStat1.equals('foo'));
        System.assertEquals(false, pokemonPastStat2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonPastStat pokemonPastStat1 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat2 = new OASPokemonPastStat();
        OASPokemonPastStat pokemonPastStat3;

        System.assertEquals(false, pokemonPastStat1.equals(pokemonPastStat3));
        System.assertEquals(false, pokemonPastStat2.equals(pokemonPastStat3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonPastStat pokemonPastStat1 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat2 = new OASPokemonPastStat();

        System.assertEquals(pokemonPastStat1.hashCode(), pokemonPastStat1.hashCode());
        System.assertEquals(pokemonPastStat2.hashCode(), pokemonPastStat2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonPastStat pokemonPastStat1 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat2 = OASPokemonPastStat.getExample();
        OASPokemonPastStat pokemonPastStat3 = new OASPokemonPastStat();
        OASPokemonPastStat pokemonPastStat4 = new OASPokemonPastStat();

        System.assert(pokemonPastStat1.equals(pokemonPastStat2));
        System.assert(pokemonPastStat3.equals(pokemonPastStat4));
        System.assertEquals(pokemonPastStat1.hashCode(), pokemonPastStat2.hashCode());
        System.assertEquals(pokemonPastStat3.hashCode(), pokemonPastStat4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonPastStat pokemonPastStat = new OASPokemonPastStat();
        System.assertEquals(new List<OASPokemonStat>(), pokemonPastStat.stats);
        System.assertEquals(null, pokemonPastStat.generation);
    }
}
