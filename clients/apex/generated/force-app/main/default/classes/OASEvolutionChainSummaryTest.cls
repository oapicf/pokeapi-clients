@isTest
private class OASEvolutionChainSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionChainSummary evolutionChainSummary1 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary2 = evolutionChainSummary1;
        OASEvolutionChainSummary evolutionChainSummary3 = new OASEvolutionChainSummary();
        OASEvolutionChainSummary evolutionChainSummary4 = evolutionChainSummary3;

        System.assert(evolutionChainSummary1.equals(evolutionChainSummary2));
        System.assert(evolutionChainSummary2.equals(evolutionChainSummary1));
        System.assert(evolutionChainSummary1.equals(evolutionChainSummary1));
        System.assert(evolutionChainSummary3.equals(evolutionChainSummary4));
        System.assert(evolutionChainSummary4.equals(evolutionChainSummary3));
        System.assert(evolutionChainSummary3.equals(evolutionChainSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionChainSummary evolutionChainSummary1 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary2 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary3 = new OASEvolutionChainSummary();
        OASEvolutionChainSummary evolutionChainSummary4 = new OASEvolutionChainSummary();

        System.assert(evolutionChainSummary1.equals(evolutionChainSummary2));
        System.assert(evolutionChainSummary2.equals(evolutionChainSummary1));
        System.assert(evolutionChainSummary3.equals(evolutionChainSummary4));
        System.assert(evolutionChainSummary4.equals(evolutionChainSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionChainSummary evolutionChainSummary1 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary2 = new OASEvolutionChainSummary();

        System.assertEquals(false, evolutionChainSummary1.equals('foo'));
        System.assertEquals(false, evolutionChainSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionChainSummary evolutionChainSummary1 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary2 = new OASEvolutionChainSummary();
        OASEvolutionChainSummary evolutionChainSummary3;

        System.assertEquals(false, evolutionChainSummary1.equals(evolutionChainSummary3));
        System.assertEquals(false, evolutionChainSummary2.equals(evolutionChainSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionChainSummary evolutionChainSummary1 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary2 = new OASEvolutionChainSummary();

        System.assertEquals(evolutionChainSummary1.hashCode(), evolutionChainSummary1.hashCode());
        System.assertEquals(evolutionChainSummary2.hashCode(), evolutionChainSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionChainSummary evolutionChainSummary1 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary2 = OASEvolutionChainSummary.getExample();
        OASEvolutionChainSummary evolutionChainSummary3 = new OASEvolutionChainSummary();
        OASEvolutionChainSummary evolutionChainSummary4 = new OASEvolutionChainSummary();

        System.assert(evolutionChainSummary1.equals(evolutionChainSummary2));
        System.assert(evolutionChainSummary3.equals(evolutionChainSummary4));
        System.assertEquals(evolutionChainSummary1.hashCode(), evolutionChainSummary2.hashCode());
        System.assertEquals(evolutionChainSummary3.hashCode(), evolutionChainSummary4.hashCode());
    }
}
