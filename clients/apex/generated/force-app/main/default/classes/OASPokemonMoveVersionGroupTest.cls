@isTest
private class OASPokemonMoveVersionGroupTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup1 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup2 = pokemonMoveVersionGroup1;
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup3 = new OASPokemonMoveVersionGroup();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup4 = pokemonMoveVersionGroup3;

        System.assert(pokemonMoveVersionGroup1.equals(pokemonMoveVersionGroup2));
        System.assert(pokemonMoveVersionGroup2.equals(pokemonMoveVersionGroup1));
        System.assert(pokemonMoveVersionGroup1.equals(pokemonMoveVersionGroup1));
        System.assert(pokemonMoveVersionGroup3.equals(pokemonMoveVersionGroup4));
        System.assert(pokemonMoveVersionGroup4.equals(pokemonMoveVersionGroup3));
        System.assert(pokemonMoveVersionGroup3.equals(pokemonMoveVersionGroup3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup1 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup2 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup3 = new OASPokemonMoveVersionGroup();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup4 = new OASPokemonMoveVersionGroup();

        System.assert(pokemonMoveVersionGroup1.equals(pokemonMoveVersionGroup2));
        System.assert(pokemonMoveVersionGroup2.equals(pokemonMoveVersionGroup1));
        System.assert(pokemonMoveVersionGroup3.equals(pokemonMoveVersionGroup4));
        System.assert(pokemonMoveVersionGroup4.equals(pokemonMoveVersionGroup3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup1 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup2 = new OASPokemonMoveVersionGroup();

        System.assertEquals(false, pokemonMoveVersionGroup1.equals('foo'));
        System.assertEquals(false, pokemonMoveVersionGroup2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup1 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup2 = new OASPokemonMoveVersionGroup();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup3;

        System.assertEquals(false, pokemonMoveVersionGroup1.equals(pokemonMoveVersionGroup3));
        System.assertEquals(false, pokemonMoveVersionGroup2.equals(pokemonMoveVersionGroup3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup1 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup2 = new OASPokemonMoveVersionGroup();

        System.assertEquals(pokemonMoveVersionGroup1.hashCode(), pokemonMoveVersionGroup1.hashCode());
        System.assertEquals(pokemonMoveVersionGroup2.hashCode(), pokemonMoveVersionGroup2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup1 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup2 = OASPokemonMoveVersionGroup.getExample();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup3 = new OASPokemonMoveVersionGroup();
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup4 = new OASPokemonMoveVersionGroup();

        System.assert(pokemonMoveVersionGroup1.equals(pokemonMoveVersionGroup2));
        System.assert(pokemonMoveVersionGroup3.equals(pokemonMoveVersionGroup4));
        System.assertEquals(pokemonMoveVersionGroup1.hashCode(), pokemonMoveVersionGroup2.hashCode());
        System.assertEquals(pokemonMoveVersionGroup3.hashCode(), pokemonMoveVersionGroup4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonMoveVersionGroup pokemonMoveVersionGroup = new OASPokemonMoveVersionGroup();
        Map<String, String> x-property-mappings = pokemonMoveVersionGroup.getx-property-mappings();
        System.assertEquals('levelLearnedAt', x-property-mappings.get('level_learned_at'));
        System.assertEquals('moveLearnMethod', x-property-mappings.get('move_learn_method'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
