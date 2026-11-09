@isTest
private class OASEvolutionChainLinkTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionChainLink evolutionChainLink1 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink2 = evolutionChainLink1;
        OASEvolutionChainLink evolutionChainLink3 = new OASEvolutionChainLink();
        OASEvolutionChainLink evolutionChainLink4 = evolutionChainLink3;

        System.assert(evolutionChainLink1.equals(evolutionChainLink2));
        System.assert(evolutionChainLink2.equals(evolutionChainLink1));
        System.assert(evolutionChainLink1.equals(evolutionChainLink1));
        System.assert(evolutionChainLink3.equals(evolutionChainLink4));
        System.assert(evolutionChainLink4.equals(evolutionChainLink3));
        System.assert(evolutionChainLink3.equals(evolutionChainLink3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionChainLink evolutionChainLink1 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink2 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink3 = new OASEvolutionChainLink();
        OASEvolutionChainLink evolutionChainLink4 = new OASEvolutionChainLink();

        System.assert(evolutionChainLink1.equals(evolutionChainLink2));
        System.assert(evolutionChainLink2.equals(evolutionChainLink1));
        System.assert(evolutionChainLink3.equals(evolutionChainLink4));
        System.assert(evolutionChainLink4.equals(evolutionChainLink3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionChainLink evolutionChainLink1 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink2 = new OASEvolutionChainLink();

        System.assertEquals(false, evolutionChainLink1.equals('foo'));
        System.assertEquals(false, evolutionChainLink2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionChainLink evolutionChainLink1 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink2 = new OASEvolutionChainLink();
        OASEvolutionChainLink evolutionChainLink3;

        System.assertEquals(false, evolutionChainLink1.equals(evolutionChainLink3));
        System.assertEquals(false, evolutionChainLink2.equals(evolutionChainLink3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionChainLink evolutionChainLink1 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink2 = new OASEvolutionChainLink();

        System.assertEquals(evolutionChainLink1.hashCode(), evolutionChainLink1.hashCode());
        System.assertEquals(evolutionChainLink2.hashCode(), evolutionChainLink2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionChainLink evolutionChainLink1 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink2 = OASEvolutionChainLink.getExample();
        OASEvolutionChainLink evolutionChainLink3 = new OASEvolutionChainLink();
        OASEvolutionChainLink evolutionChainLink4 = new OASEvolutionChainLink();

        System.assert(evolutionChainLink1.equals(evolutionChainLink2));
        System.assert(evolutionChainLink3.equals(evolutionChainLink4));
        System.assertEquals(evolutionChainLink1.hashCode(), evolutionChainLink2.hashCode());
        System.assertEquals(evolutionChainLink3.hashCode(), evolutionChainLink4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEvolutionChainLink evolutionChainLink = new OASEvolutionChainLink();
        Map<String, String> x-property-mappings = evolutionChainLink.getx-property-mappings();
        System.assertEquals('isBaby', x-property-mappings.get('is_baby'));
        System.assertEquals('evolutionDetails', x-property-mappings.get('evolution_details'));
        System.assertEquals('evolvesTo', x-property-mappings.get('evolves_to'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEvolutionChainLink evolutionChainLink = new OASEvolutionChainLink();
        System.assertEquals(new List<OASPokemonEvolution>(), evolutionChainLink.evolutionDetails);
        System.assertEquals(new List<OASEvolutionChainLink>(), evolutionChainLink.evolvesTo);
        System.assertEquals(null, evolutionChainLink.isBaby);
        System.assertEquals(null, evolutionChainLink.species);
    }
}
