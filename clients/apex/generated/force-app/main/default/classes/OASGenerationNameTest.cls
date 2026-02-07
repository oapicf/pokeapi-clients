@isTest
private class OASGenerationNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerationName generationName1 = OASGenerationName.getExample();
        OASGenerationName generationName2 = generationName1;
        OASGenerationName generationName3 = new OASGenerationName();
        OASGenerationName generationName4 = generationName3;

        System.assert(generationName1.equals(generationName2));
        System.assert(generationName2.equals(generationName1));
        System.assert(generationName1.equals(generationName1));
        System.assert(generationName3.equals(generationName4));
        System.assert(generationName4.equals(generationName3));
        System.assert(generationName3.equals(generationName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerationName generationName1 = OASGenerationName.getExample();
        OASGenerationName generationName2 = OASGenerationName.getExample();
        OASGenerationName generationName3 = new OASGenerationName();
        OASGenerationName generationName4 = new OASGenerationName();

        System.assert(generationName1.equals(generationName2));
        System.assert(generationName2.equals(generationName1));
        System.assert(generationName3.equals(generationName4));
        System.assert(generationName4.equals(generationName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerationName generationName1 = OASGenerationName.getExample();
        OASGenerationName generationName2 = new OASGenerationName();

        System.assertEquals(false, generationName1.equals('foo'));
        System.assertEquals(false, generationName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerationName generationName1 = OASGenerationName.getExample();
        OASGenerationName generationName2 = new OASGenerationName();
        OASGenerationName generationName3;

        System.assertEquals(false, generationName1.equals(generationName3));
        System.assertEquals(false, generationName2.equals(generationName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerationName generationName1 = OASGenerationName.getExample();
        OASGenerationName generationName2 = new OASGenerationName();

        System.assertEquals(generationName1.hashCode(), generationName1.hashCode());
        System.assertEquals(generationName2.hashCode(), generationName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerationName generationName1 = OASGenerationName.getExample();
        OASGenerationName generationName2 = OASGenerationName.getExample();
        OASGenerationName generationName3 = new OASGenerationName();
        OASGenerationName generationName4 = new OASGenerationName();

        System.assert(generationName1.equals(generationName2));
        System.assert(generationName3.equals(generationName4));
        System.assertEquals(generationName1.hashCode(), generationName2.hashCode());
        System.assertEquals(generationName3.hashCode(), generationName4.hashCode());
    }
}
