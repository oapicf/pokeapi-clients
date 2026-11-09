@isTest
private class OASEvolutionVariableNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionVariableName evolutionVariableName1 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName2 = evolutionVariableName1;
        OASEvolutionVariableName evolutionVariableName3 = new OASEvolutionVariableName();
        OASEvolutionVariableName evolutionVariableName4 = evolutionVariableName3;

        System.assert(evolutionVariableName1.equals(evolutionVariableName2));
        System.assert(evolutionVariableName2.equals(evolutionVariableName1));
        System.assert(evolutionVariableName1.equals(evolutionVariableName1));
        System.assert(evolutionVariableName3.equals(evolutionVariableName4));
        System.assert(evolutionVariableName4.equals(evolutionVariableName3));
        System.assert(evolutionVariableName3.equals(evolutionVariableName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionVariableName evolutionVariableName1 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName2 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName3 = new OASEvolutionVariableName();
        OASEvolutionVariableName evolutionVariableName4 = new OASEvolutionVariableName();

        System.assert(evolutionVariableName1.equals(evolutionVariableName2));
        System.assert(evolutionVariableName2.equals(evolutionVariableName1));
        System.assert(evolutionVariableName3.equals(evolutionVariableName4));
        System.assert(evolutionVariableName4.equals(evolutionVariableName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionVariableName evolutionVariableName1 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName2 = new OASEvolutionVariableName();

        System.assertEquals(false, evolutionVariableName1.equals('foo'));
        System.assertEquals(false, evolutionVariableName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionVariableName evolutionVariableName1 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName2 = new OASEvolutionVariableName();
        OASEvolutionVariableName evolutionVariableName3;

        System.assertEquals(false, evolutionVariableName1.equals(evolutionVariableName3));
        System.assertEquals(false, evolutionVariableName2.equals(evolutionVariableName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionVariableName evolutionVariableName1 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName2 = new OASEvolutionVariableName();

        System.assertEquals(evolutionVariableName1.hashCode(), evolutionVariableName1.hashCode());
        System.assertEquals(evolutionVariableName2.hashCode(), evolutionVariableName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionVariableName evolutionVariableName1 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName2 = OASEvolutionVariableName.getExample();
        OASEvolutionVariableName evolutionVariableName3 = new OASEvolutionVariableName();
        OASEvolutionVariableName evolutionVariableName4 = new OASEvolutionVariableName();

        System.assert(evolutionVariableName1.equals(evolutionVariableName2));
        System.assert(evolutionVariableName3.equals(evolutionVariableName4));
        System.assertEquals(evolutionVariableName1.hashCode(), evolutionVariableName2.hashCode());
        System.assertEquals(evolutionVariableName3.hashCode(), evolutionVariableName4.hashCode());
    }
}
