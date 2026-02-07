@isTest
private class OASEvolutionTriggerSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionTriggerSummary evolutionTriggerSummary1 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary2 = evolutionTriggerSummary1;
        OASEvolutionTriggerSummary evolutionTriggerSummary3 = new OASEvolutionTriggerSummary();
        OASEvolutionTriggerSummary evolutionTriggerSummary4 = evolutionTriggerSummary3;

        System.assert(evolutionTriggerSummary1.equals(evolutionTriggerSummary2));
        System.assert(evolutionTriggerSummary2.equals(evolutionTriggerSummary1));
        System.assert(evolutionTriggerSummary1.equals(evolutionTriggerSummary1));
        System.assert(evolutionTriggerSummary3.equals(evolutionTriggerSummary4));
        System.assert(evolutionTriggerSummary4.equals(evolutionTriggerSummary3));
        System.assert(evolutionTriggerSummary3.equals(evolutionTriggerSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionTriggerSummary evolutionTriggerSummary1 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary2 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary3 = new OASEvolutionTriggerSummary();
        OASEvolutionTriggerSummary evolutionTriggerSummary4 = new OASEvolutionTriggerSummary();

        System.assert(evolutionTriggerSummary1.equals(evolutionTriggerSummary2));
        System.assert(evolutionTriggerSummary2.equals(evolutionTriggerSummary1));
        System.assert(evolutionTriggerSummary3.equals(evolutionTriggerSummary4));
        System.assert(evolutionTriggerSummary4.equals(evolutionTriggerSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionTriggerSummary evolutionTriggerSummary1 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary2 = new OASEvolutionTriggerSummary();

        System.assertEquals(false, evolutionTriggerSummary1.equals('foo'));
        System.assertEquals(false, evolutionTriggerSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionTriggerSummary evolutionTriggerSummary1 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary2 = new OASEvolutionTriggerSummary();
        OASEvolutionTriggerSummary evolutionTriggerSummary3;

        System.assertEquals(false, evolutionTriggerSummary1.equals(evolutionTriggerSummary3));
        System.assertEquals(false, evolutionTriggerSummary2.equals(evolutionTriggerSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionTriggerSummary evolutionTriggerSummary1 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary2 = new OASEvolutionTriggerSummary();

        System.assertEquals(evolutionTriggerSummary1.hashCode(), evolutionTriggerSummary1.hashCode());
        System.assertEquals(evolutionTriggerSummary2.hashCode(), evolutionTriggerSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionTriggerSummary evolutionTriggerSummary1 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary2 = OASEvolutionTriggerSummary.getExample();
        OASEvolutionTriggerSummary evolutionTriggerSummary3 = new OASEvolutionTriggerSummary();
        OASEvolutionTriggerSummary evolutionTriggerSummary4 = new OASEvolutionTriggerSummary();

        System.assert(evolutionTriggerSummary1.equals(evolutionTriggerSummary2));
        System.assert(evolutionTriggerSummary3.equals(evolutionTriggerSummary4));
        System.assertEquals(evolutionTriggerSummary1.hashCode(), evolutionTriggerSummary2.hashCode());
        System.assertEquals(evolutionTriggerSummary3.hashCode(), evolutionTriggerSummary4.hashCode());
    }
}
