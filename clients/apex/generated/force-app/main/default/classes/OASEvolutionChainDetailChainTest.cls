@isTest
private class OASEvolutionChainDetailChainTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionChainDetailChain evolutionChainDetailChain1 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain2 = evolutionChainDetailChain1;
        OASEvolutionChainDetailChain evolutionChainDetailChain3 = new OASEvolutionChainDetailChain();
        OASEvolutionChainDetailChain evolutionChainDetailChain4 = evolutionChainDetailChain3;

        System.assert(evolutionChainDetailChain1.equals(evolutionChainDetailChain2));
        System.assert(evolutionChainDetailChain2.equals(evolutionChainDetailChain1));
        System.assert(evolutionChainDetailChain1.equals(evolutionChainDetailChain1));
        System.assert(evolutionChainDetailChain3.equals(evolutionChainDetailChain4));
        System.assert(evolutionChainDetailChain4.equals(evolutionChainDetailChain3));
        System.assert(evolutionChainDetailChain3.equals(evolutionChainDetailChain3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionChainDetailChain evolutionChainDetailChain1 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain2 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain3 = new OASEvolutionChainDetailChain();
        OASEvolutionChainDetailChain evolutionChainDetailChain4 = new OASEvolutionChainDetailChain();

        System.assert(evolutionChainDetailChain1.equals(evolutionChainDetailChain2));
        System.assert(evolutionChainDetailChain2.equals(evolutionChainDetailChain1));
        System.assert(evolutionChainDetailChain3.equals(evolutionChainDetailChain4));
        System.assert(evolutionChainDetailChain4.equals(evolutionChainDetailChain3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionChainDetailChain evolutionChainDetailChain1 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain2 = new OASEvolutionChainDetailChain();

        System.assertEquals(false, evolutionChainDetailChain1.equals('foo'));
        System.assertEquals(false, evolutionChainDetailChain2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionChainDetailChain evolutionChainDetailChain1 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain2 = new OASEvolutionChainDetailChain();
        OASEvolutionChainDetailChain evolutionChainDetailChain3;

        System.assertEquals(false, evolutionChainDetailChain1.equals(evolutionChainDetailChain3));
        System.assertEquals(false, evolutionChainDetailChain2.equals(evolutionChainDetailChain3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionChainDetailChain evolutionChainDetailChain1 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain2 = new OASEvolutionChainDetailChain();

        System.assertEquals(evolutionChainDetailChain1.hashCode(), evolutionChainDetailChain1.hashCode());
        System.assertEquals(evolutionChainDetailChain2.hashCode(), evolutionChainDetailChain2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionChainDetailChain evolutionChainDetailChain1 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain2 = OASEvolutionChainDetailChain.getExample();
        OASEvolutionChainDetailChain evolutionChainDetailChain3 = new OASEvolutionChainDetailChain();
        OASEvolutionChainDetailChain evolutionChainDetailChain4 = new OASEvolutionChainDetailChain();

        System.assert(evolutionChainDetailChain1.equals(evolutionChainDetailChain2));
        System.assert(evolutionChainDetailChain3.equals(evolutionChainDetailChain4));
        System.assertEquals(evolutionChainDetailChain1.hashCode(), evolutionChainDetailChain2.hashCode());
        System.assertEquals(evolutionChainDetailChain3.hashCode(), evolutionChainDetailChain4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEvolutionChainDetailChain evolutionChainDetailChain = new OASEvolutionChainDetailChain();
        Map<String, String> x-property-mappings = evolutionChainDetailChain.getx-property-mappings();
        System.assertEquals('evolutionDetails', x-property-mappings.get('evolution_details'));
        System.assertEquals('evolvesTo', x-property-mappings.get('evolves_to'));
        System.assertEquals('isBaby', x-property-mappings.get('is_baby'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEvolutionChainDetailChain evolutionChainDetailChain = new OASEvolutionChainDetailChain();
        System.assertEquals(new List<oas_any_type_not_mapped>(), evolutionChainDetailChain.evolutionDetails);
        System.assertEquals(new List<OASEvolutionChainDetailChainEvolvesT>(), evolutionChainDetailChain.evolvesTo);
        System.assertEquals(null, evolutionChainDetailChain.isBaby);
        System.assertEquals(null, evolutionChainDetailChain.species);
    }
}
