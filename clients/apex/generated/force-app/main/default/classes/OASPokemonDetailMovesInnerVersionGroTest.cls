@isTest
private class OASPokemonDetailMovesInnerVersionGroTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner1 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner2 = pokemonDetailMovesInnerVersionGroupDetailsInner1;
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner3 = new OASPokemonDetailMovesInnerVersionGro();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner4 = pokemonDetailMovesInnerVersionGroupDetailsInner3;

        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner1.equals(pokemonDetailMovesInnerVersionGroupDetailsInner2));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner2.equals(pokemonDetailMovesInnerVersionGroupDetailsInner1));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner1.equals(pokemonDetailMovesInnerVersionGroupDetailsInner1));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner3.equals(pokemonDetailMovesInnerVersionGroupDetailsInner4));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner4.equals(pokemonDetailMovesInnerVersionGroupDetailsInner3));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner3.equals(pokemonDetailMovesInnerVersionGroupDetailsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner1 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner2 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner3 = new OASPokemonDetailMovesInnerVersionGro();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner4 = new OASPokemonDetailMovesInnerVersionGro();

        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner1.equals(pokemonDetailMovesInnerVersionGroupDetailsInner2));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner2.equals(pokemonDetailMovesInnerVersionGroupDetailsInner1));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner3.equals(pokemonDetailMovesInnerVersionGroupDetailsInner4));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner4.equals(pokemonDetailMovesInnerVersionGroupDetailsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner1 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner2 = new OASPokemonDetailMovesInnerVersionGro();

        System.assertEquals(false, pokemonDetailMovesInnerVersionGroupDetailsInner1.equals('foo'));
        System.assertEquals(false, pokemonDetailMovesInnerVersionGroupDetailsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner1 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner2 = new OASPokemonDetailMovesInnerVersionGro();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner3;

        System.assertEquals(false, pokemonDetailMovesInnerVersionGroupDetailsInner1.equals(pokemonDetailMovesInnerVersionGroupDetailsInner3));
        System.assertEquals(false, pokemonDetailMovesInnerVersionGroupDetailsInner2.equals(pokemonDetailMovesInnerVersionGroupDetailsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner1 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner2 = new OASPokemonDetailMovesInnerVersionGro();

        System.assertEquals(pokemonDetailMovesInnerVersionGroupDetailsInner1.hashCode(), pokemonDetailMovesInnerVersionGroupDetailsInner1.hashCode());
        System.assertEquals(pokemonDetailMovesInnerVersionGroupDetailsInner2.hashCode(), pokemonDetailMovesInnerVersionGroupDetailsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner1 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner2 = OASPokemonDetailMovesInnerVersionGro.getExample();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner3 = new OASPokemonDetailMovesInnerVersionGro();
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner4 = new OASPokemonDetailMovesInnerVersionGro();

        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner1.equals(pokemonDetailMovesInnerVersionGroupDetailsInner2));
        System.assert(pokemonDetailMovesInnerVersionGroupDetailsInner3.equals(pokemonDetailMovesInnerVersionGroupDetailsInner4));
        System.assertEquals(pokemonDetailMovesInnerVersionGroupDetailsInner1.hashCode(), pokemonDetailMovesInnerVersionGroupDetailsInner2.hashCode());
        System.assertEquals(pokemonDetailMovesInnerVersionGroupDetailsInner3.hashCode(), pokemonDetailMovesInnerVersionGroupDetailsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDetailMovesInnerVersionGro pokemonDetailMovesInnerVersionGroupDetailsInner = new OASPokemonDetailMovesInnerVersionGro();
        Map<String, String> x-property-mappings = pokemonDetailMovesInnerVersionGroupDetailsInner.getx-property-mappings();
        System.assertEquals('levelLearnedAt', x-property-mappings.get('level_learned_at'));
        System.assertEquals('moveLearnMethod', x-property-mappings.get('move_learn_method'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
