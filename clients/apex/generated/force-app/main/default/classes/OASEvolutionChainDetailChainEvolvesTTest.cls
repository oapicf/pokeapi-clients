@isTest
private class OASEvolutionChainDetailChainEvolvesTTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner1 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner2 = evolutionChainDetailChainEvolvesToInner1;
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner3 = new OASEvolutionChainDetailChainEvolvesT();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner4 = evolutionChainDetailChainEvolvesToInner3;

        System.assert(evolutionChainDetailChainEvolvesToInner1.equals(evolutionChainDetailChainEvolvesToInner2));
        System.assert(evolutionChainDetailChainEvolvesToInner2.equals(evolutionChainDetailChainEvolvesToInner1));
        System.assert(evolutionChainDetailChainEvolvesToInner1.equals(evolutionChainDetailChainEvolvesToInner1));
        System.assert(evolutionChainDetailChainEvolvesToInner3.equals(evolutionChainDetailChainEvolvesToInner4));
        System.assert(evolutionChainDetailChainEvolvesToInner4.equals(evolutionChainDetailChainEvolvesToInner3));
        System.assert(evolutionChainDetailChainEvolvesToInner3.equals(evolutionChainDetailChainEvolvesToInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner1 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner2 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner3 = new OASEvolutionChainDetailChainEvolvesT();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner4 = new OASEvolutionChainDetailChainEvolvesT();

        System.assert(evolutionChainDetailChainEvolvesToInner1.equals(evolutionChainDetailChainEvolvesToInner2));
        System.assert(evolutionChainDetailChainEvolvesToInner2.equals(evolutionChainDetailChainEvolvesToInner1));
        System.assert(evolutionChainDetailChainEvolvesToInner3.equals(evolutionChainDetailChainEvolvesToInner4));
        System.assert(evolutionChainDetailChainEvolvesToInner4.equals(evolutionChainDetailChainEvolvesToInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner1 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner2 = new OASEvolutionChainDetailChainEvolvesT();

        System.assertEquals(false, evolutionChainDetailChainEvolvesToInner1.equals('foo'));
        System.assertEquals(false, evolutionChainDetailChainEvolvesToInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner1 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner2 = new OASEvolutionChainDetailChainEvolvesT();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner3;

        System.assertEquals(false, evolutionChainDetailChainEvolvesToInner1.equals(evolutionChainDetailChainEvolvesToInner3));
        System.assertEquals(false, evolutionChainDetailChainEvolvesToInner2.equals(evolutionChainDetailChainEvolvesToInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner1 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner2 = new OASEvolutionChainDetailChainEvolvesT();

        System.assertEquals(evolutionChainDetailChainEvolvesToInner1.hashCode(), evolutionChainDetailChainEvolvesToInner1.hashCode());
        System.assertEquals(evolutionChainDetailChainEvolvesToInner2.hashCode(), evolutionChainDetailChainEvolvesToInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner1 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner2 = OASEvolutionChainDetailChainEvolvesT.getExample();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner3 = new OASEvolutionChainDetailChainEvolvesT();
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner4 = new OASEvolutionChainDetailChainEvolvesT();

        System.assert(evolutionChainDetailChainEvolvesToInner1.equals(evolutionChainDetailChainEvolvesToInner2));
        System.assert(evolutionChainDetailChainEvolvesToInner3.equals(evolutionChainDetailChainEvolvesToInner4));
        System.assertEquals(evolutionChainDetailChainEvolvesToInner1.hashCode(), evolutionChainDetailChainEvolvesToInner2.hashCode());
        System.assertEquals(evolutionChainDetailChainEvolvesToInner3.hashCode(), evolutionChainDetailChainEvolvesToInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner = new OASEvolutionChainDetailChainEvolvesT();
        Map<String, String> x-property-mappings = evolutionChainDetailChainEvolvesToInner.getx-property-mappings();
        System.assertEquals('evolutionDetails', x-property-mappings.get('evolution_details'));
        System.assertEquals('isBaby', x-property-mappings.get('is_baby'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEvolutionChainDetailChainEvolvesT evolutionChainDetailChainEvolvesToInner = new OASEvolutionChainDetailChainEvolvesT();
        System.assertEquals(new List<OASEvolutionChainDetailChainEvolvesT>(), evolutionChainDetailChainEvolvesToInner.evolutionDetails);
        System.assertEquals(null, evolutionChainDetailChainEvolvesToInner.isBaby);
        System.assertEquals(null, evolutionChainDetailChainEvolvesToInner.species);
    }
}
