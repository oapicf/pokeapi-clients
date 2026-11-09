@isTest
private class OASEvolutionVariableDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionVariableDescription evolutionVariableDescription1 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription2 = evolutionVariableDescription1;
        OASEvolutionVariableDescription evolutionVariableDescription3 = new OASEvolutionVariableDescription();
        OASEvolutionVariableDescription evolutionVariableDescription4 = evolutionVariableDescription3;

        System.assert(evolutionVariableDescription1.equals(evolutionVariableDescription2));
        System.assert(evolutionVariableDescription2.equals(evolutionVariableDescription1));
        System.assert(evolutionVariableDescription1.equals(evolutionVariableDescription1));
        System.assert(evolutionVariableDescription3.equals(evolutionVariableDescription4));
        System.assert(evolutionVariableDescription4.equals(evolutionVariableDescription3));
        System.assert(evolutionVariableDescription3.equals(evolutionVariableDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionVariableDescription evolutionVariableDescription1 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription2 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription3 = new OASEvolutionVariableDescription();
        OASEvolutionVariableDescription evolutionVariableDescription4 = new OASEvolutionVariableDescription();

        System.assert(evolutionVariableDescription1.equals(evolutionVariableDescription2));
        System.assert(evolutionVariableDescription2.equals(evolutionVariableDescription1));
        System.assert(evolutionVariableDescription3.equals(evolutionVariableDescription4));
        System.assert(evolutionVariableDescription4.equals(evolutionVariableDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionVariableDescription evolutionVariableDescription1 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription2 = new OASEvolutionVariableDescription();

        System.assertEquals(false, evolutionVariableDescription1.equals('foo'));
        System.assertEquals(false, evolutionVariableDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionVariableDescription evolutionVariableDescription1 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription2 = new OASEvolutionVariableDescription();
        OASEvolutionVariableDescription evolutionVariableDescription3;

        System.assertEquals(false, evolutionVariableDescription1.equals(evolutionVariableDescription3));
        System.assertEquals(false, evolutionVariableDescription2.equals(evolutionVariableDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionVariableDescription evolutionVariableDescription1 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription2 = new OASEvolutionVariableDescription();

        System.assertEquals(evolutionVariableDescription1.hashCode(), evolutionVariableDescription1.hashCode());
        System.assertEquals(evolutionVariableDescription2.hashCode(), evolutionVariableDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionVariableDescription evolutionVariableDescription1 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription2 = OASEvolutionVariableDescription.getExample();
        OASEvolutionVariableDescription evolutionVariableDescription3 = new OASEvolutionVariableDescription();
        OASEvolutionVariableDescription evolutionVariableDescription4 = new OASEvolutionVariableDescription();

        System.assert(evolutionVariableDescription1.equals(evolutionVariableDescription2));
        System.assert(evolutionVariableDescription3.equals(evolutionVariableDescription4));
        System.assertEquals(evolutionVariableDescription1.hashCode(), evolutionVariableDescription2.hashCode());
        System.assertEquals(evolutionVariableDescription3.hashCode(), evolutionVariableDescription4.hashCode());
    }
}
