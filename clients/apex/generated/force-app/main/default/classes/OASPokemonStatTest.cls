@isTest
private class OASPokemonStatTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonStat pokemonStat1 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat2 = pokemonStat1;
        OASPokemonStat pokemonStat3 = new OASPokemonStat();
        OASPokemonStat pokemonStat4 = pokemonStat3;

        System.assert(pokemonStat1.equals(pokemonStat2));
        System.assert(pokemonStat2.equals(pokemonStat1));
        System.assert(pokemonStat1.equals(pokemonStat1));
        System.assert(pokemonStat3.equals(pokemonStat4));
        System.assert(pokemonStat4.equals(pokemonStat3));
        System.assert(pokemonStat3.equals(pokemonStat3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonStat pokemonStat1 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat2 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat3 = new OASPokemonStat();
        OASPokemonStat pokemonStat4 = new OASPokemonStat();

        System.assert(pokemonStat1.equals(pokemonStat2));
        System.assert(pokemonStat2.equals(pokemonStat1));
        System.assert(pokemonStat3.equals(pokemonStat4));
        System.assert(pokemonStat4.equals(pokemonStat3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonStat pokemonStat1 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat2 = new OASPokemonStat();

        System.assertEquals(false, pokemonStat1.equals('foo'));
        System.assertEquals(false, pokemonStat2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonStat pokemonStat1 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat2 = new OASPokemonStat();
        OASPokemonStat pokemonStat3;

        System.assertEquals(false, pokemonStat1.equals(pokemonStat3));
        System.assertEquals(false, pokemonStat2.equals(pokemonStat3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonStat pokemonStat1 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat2 = new OASPokemonStat();

        System.assertEquals(pokemonStat1.hashCode(), pokemonStat1.hashCode());
        System.assertEquals(pokemonStat2.hashCode(), pokemonStat2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonStat pokemonStat1 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat2 = OASPokemonStat.getExample();
        OASPokemonStat pokemonStat3 = new OASPokemonStat();
        OASPokemonStat pokemonStat4 = new OASPokemonStat();

        System.assert(pokemonStat1.equals(pokemonStat2));
        System.assert(pokemonStat3.equals(pokemonStat4));
        System.assertEquals(pokemonStat1.hashCode(), pokemonStat2.hashCode());
        System.assertEquals(pokemonStat3.hashCode(), pokemonStat4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonStat pokemonStat = new OASPokemonStat();
        Map<String, String> x-property-mappings = pokemonStat.getx-property-mappings();
        System.assertEquals('baseStat', x-property-mappings.get('base_stat'));
    }
}
