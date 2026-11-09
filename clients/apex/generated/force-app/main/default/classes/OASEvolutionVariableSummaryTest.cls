@isTest
private class OASEvolutionVariableSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionVariableSummary evolutionVariableSummary1 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary2 = evolutionVariableSummary1;
        OASEvolutionVariableSummary evolutionVariableSummary3 = new OASEvolutionVariableSummary();
        OASEvolutionVariableSummary evolutionVariableSummary4 = evolutionVariableSummary3;

        System.assert(evolutionVariableSummary1.equals(evolutionVariableSummary2));
        System.assert(evolutionVariableSummary2.equals(evolutionVariableSummary1));
        System.assert(evolutionVariableSummary1.equals(evolutionVariableSummary1));
        System.assert(evolutionVariableSummary3.equals(evolutionVariableSummary4));
        System.assert(evolutionVariableSummary4.equals(evolutionVariableSummary3));
        System.assert(evolutionVariableSummary3.equals(evolutionVariableSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionVariableSummary evolutionVariableSummary1 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary2 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary3 = new OASEvolutionVariableSummary();
        OASEvolutionVariableSummary evolutionVariableSummary4 = new OASEvolutionVariableSummary();

        System.assert(evolutionVariableSummary1.equals(evolutionVariableSummary2));
        System.assert(evolutionVariableSummary2.equals(evolutionVariableSummary1));
        System.assert(evolutionVariableSummary3.equals(evolutionVariableSummary4));
        System.assert(evolutionVariableSummary4.equals(evolutionVariableSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionVariableSummary evolutionVariableSummary1 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary2 = new OASEvolutionVariableSummary();

        System.assertEquals(false, evolutionVariableSummary1.equals('foo'));
        System.assertEquals(false, evolutionVariableSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionVariableSummary evolutionVariableSummary1 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary2 = new OASEvolutionVariableSummary();
        OASEvolutionVariableSummary evolutionVariableSummary3;

        System.assertEquals(false, evolutionVariableSummary1.equals(evolutionVariableSummary3));
        System.assertEquals(false, evolutionVariableSummary2.equals(evolutionVariableSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionVariableSummary evolutionVariableSummary1 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary2 = new OASEvolutionVariableSummary();

        System.assertEquals(evolutionVariableSummary1.hashCode(), evolutionVariableSummary1.hashCode());
        System.assertEquals(evolutionVariableSummary2.hashCode(), evolutionVariableSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionVariableSummary evolutionVariableSummary1 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary2 = OASEvolutionVariableSummary.getExample();
        OASEvolutionVariableSummary evolutionVariableSummary3 = new OASEvolutionVariableSummary();
        OASEvolutionVariableSummary evolutionVariableSummary4 = new OASEvolutionVariableSummary();

        System.assert(evolutionVariableSummary1.equals(evolutionVariableSummary2));
        System.assert(evolutionVariableSummary3.equals(evolutionVariableSummary4));
        System.assertEquals(evolutionVariableSummary1.hashCode(), evolutionVariableSummary2.hashCode());
        System.assertEquals(evolutionVariableSummary3.hashCode(), evolutionVariableSummary4.hashCode());
    }
}
