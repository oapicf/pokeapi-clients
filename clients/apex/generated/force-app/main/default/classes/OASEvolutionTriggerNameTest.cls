@isTest
private class OASEvolutionTriggerNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionTriggerName evolutionTriggerName1 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName2 = evolutionTriggerName1;
        OASEvolutionTriggerName evolutionTriggerName3 = new OASEvolutionTriggerName();
        OASEvolutionTriggerName evolutionTriggerName4 = evolutionTriggerName3;

        System.assert(evolutionTriggerName1.equals(evolutionTriggerName2));
        System.assert(evolutionTriggerName2.equals(evolutionTriggerName1));
        System.assert(evolutionTriggerName1.equals(evolutionTriggerName1));
        System.assert(evolutionTriggerName3.equals(evolutionTriggerName4));
        System.assert(evolutionTriggerName4.equals(evolutionTriggerName3));
        System.assert(evolutionTriggerName3.equals(evolutionTriggerName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionTriggerName evolutionTriggerName1 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName2 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName3 = new OASEvolutionTriggerName();
        OASEvolutionTriggerName evolutionTriggerName4 = new OASEvolutionTriggerName();

        System.assert(evolutionTriggerName1.equals(evolutionTriggerName2));
        System.assert(evolutionTriggerName2.equals(evolutionTriggerName1));
        System.assert(evolutionTriggerName3.equals(evolutionTriggerName4));
        System.assert(evolutionTriggerName4.equals(evolutionTriggerName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionTriggerName evolutionTriggerName1 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName2 = new OASEvolutionTriggerName();

        System.assertEquals(false, evolutionTriggerName1.equals('foo'));
        System.assertEquals(false, evolutionTriggerName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionTriggerName evolutionTriggerName1 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName2 = new OASEvolutionTriggerName();
        OASEvolutionTriggerName evolutionTriggerName3;

        System.assertEquals(false, evolutionTriggerName1.equals(evolutionTriggerName3));
        System.assertEquals(false, evolutionTriggerName2.equals(evolutionTriggerName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionTriggerName evolutionTriggerName1 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName2 = new OASEvolutionTriggerName();

        System.assertEquals(evolutionTriggerName1.hashCode(), evolutionTriggerName1.hashCode());
        System.assertEquals(evolutionTriggerName2.hashCode(), evolutionTriggerName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionTriggerName evolutionTriggerName1 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName2 = OASEvolutionTriggerName.getExample();
        OASEvolutionTriggerName evolutionTriggerName3 = new OASEvolutionTriggerName();
        OASEvolutionTriggerName evolutionTriggerName4 = new OASEvolutionTriggerName();

        System.assert(evolutionTriggerName1.equals(evolutionTriggerName2));
        System.assert(evolutionTriggerName3.equals(evolutionTriggerName4));
        System.assertEquals(evolutionTriggerName1.hashCode(), evolutionTriggerName2.hashCode());
        System.assertEquals(evolutionTriggerName3.hashCode(), evolutionTriggerName4.hashCode());
    }
}
