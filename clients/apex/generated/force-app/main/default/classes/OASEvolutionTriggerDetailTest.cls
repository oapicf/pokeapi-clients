@isTest
private class OASEvolutionTriggerDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionTriggerDetail evolutionTriggerDetail1 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail2 = evolutionTriggerDetail1;
        OASEvolutionTriggerDetail evolutionTriggerDetail3 = new OASEvolutionTriggerDetail();
        OASEvolutionTriggerDetail evolutionTriggerDetail4 = evolutionTriggerDetail3;

        System.assert(evolutionTriggerDetail1.equals(evolutionTriggerDetail2));
        System.assert(evolutionTriggerDetail2.equals(evolutionTriggerDetail1));
        System.assert(evolutionTriggerDetail1.equals(evolutionTriggerDetail1));
        System.assert(evolutionTriggerDetail3.equals(evolutionTriggerDetail4));
        System.assert(evolutionTriggerDetail4.equals(evolutionTriggerDetail3));
        System.assert(evolutionTriggerDetail3.equals(evolutionTriggerDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionTriggerDetail evolutionTriggerDetail1 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail2 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail3 = new OASEvolutionTriggerDetail();
        OASEvolutionTriggerDetail evolutionTriggerDetail4 = new OASEvolutionTriggerDetail();

        System.assert(evolutionTriggerDetail1.equals(evolutionTriggerDetail2));
        System.assert(evolutionTriggerDetail2.equals(evolutionTriggerDetail1));
        System.assert(evolutionTriggerDetail3.equals(evolutionTriggerDetail4));
        System.assert(evolutionTriggerDetail4.equals(evolutionTriggerDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionTriggerDetail evolutionTriggerDetail1 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail2 = new OASEvolutionTriggerDetail();

        System.assertEquals(false, evolutionTriggerDetail1.equals('foo'));
        System.assertEquals(false, evolutionTriggerDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionTriggerDetail evolutionTriggerDetail1 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail2 = new OASEvolutionTriggerDetail();
        OASEvolutionTriggerDetail evolutionTriggerDetail3;

        System.assertEquals(false, evolutionTriggerDetail1.equals(evolutionTriggerDetail3));
        System.assertEquals(false, evolutionTriggerDetail2.equals(evolutionTriggerDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionTriggerDetail evolutionTriggerDetail1 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail2 = new OASEvolutionTriggerDetail();

        System.assertEquals(evolutionTriggerDetail1.hashCode(), evolutionTriggerDetail1.hashCode());
        System.assertEquals(evolutionTriggerDetail2.hashCode(), evolutionTriggerDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionTriggerDetail evolutionTriggerDetail1 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail2 = OASEvolutionTriggerDetail.getExample();
        OASEvolutionTriggerDetail evolutionTriggerDetail3 = new OASEvolutionTriggerDetail();
        OASEvolutionTriggerDetail evolutionTriggerDetail4 = new OASEvolutionTriggerDetail();

        System.assert(evolutionTriggerDetail1.equals(evolutionTriggerDetail2));
        System.assert(evolutionTriggerDetail3.equals(evolutionTriggerDetail4));
        System.assertEquals(evolutionTriggerDetail1.hashCode(), evolutionTriggerDetail2.hashCode());
        System.assertEquals(evolutionTriggerDetail3.hashCode(), evolutionTriggerDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEvolutionTriggerDetail evolutionTriggerDetail = new OASEvolutionTriggerDetail();
        Map<String, String> x-property-mappings = evolutionTriggerDetail.getx-property-mappings();
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEvolutionTriggerDetail evolutionTriggerDetail = new OASEvolutionTriggerDetail();
        System.assertEquals(new List<OASEvolutionTriggerName>(), evolutionTriggerDetail.names);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), evolutionTriggerDetail.pokemonSpecies);
        System.assertEquals(null, evolutionTriggerDetail.id);
        System.assertEquals(null, evolutionTriggerDetail.name);
    }
}
