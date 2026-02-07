@isTest
private class OASEncounterMethodNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterMethodName encounterMethodName1 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName2 = encounterMethodName1;
        OASEncounterMethodName encounterMethodName3 = new OASEncounterMethodName();
        OASEncounterMethodName encounterMethodName4 = encounterMethodName3;

        System.assert(encounterMethodName1.equals(encounterMethodName2));
        System.assert(encounterMethodName2.equals(encounterMethodName1));
        System.assert(encounterMethodName1.equals(encounterMethodName1));
        System.assert(encounterMethodName3.equals(encounterMethodName4));
        System.assert(encounterMethodName4.equals(encounterMethodName3));
        System.assert(encounterMethodName3.equals(encounterMethodName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterMethodName encounterMethodName1 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName2 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName3 = new OASEncounterMethodName();
        OASEncounterMethodName encounterMethodName4 = new OASEncounterMethodName();

        System.assert(encounterMethodName1.equals(encounterMethodName2));
        System.assert(encounterMethodName2.equals(encounterMethodName1));
        System.assert(encounterMethodName3.equals(encounterMethodName4));
        System.assert(encounterMethodName4.equals(encounterMethodName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterMethodName encounterMethodName1 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName2 = new OASEncounterMethodName();

        System.assertEquals(false, encounterMethodName1.equals('foo'));
        System.assertEquals(false, encounterMethodName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterMethodName encounterMethodName1 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName2 = new OASEncounterMethodName();
        OASEncounterMethodName encounterMethodName3;

        System.assertEquals(false, encounterMethodName1.equals(encounterMethodName3));
        System.assertEquals(false, encounterMethodName2.equals(encounterMethodName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterMethodName encounterMethodName1 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName2 = new OASEncounterMethodName();

        System.assertEquals(encounterMethodName1.hashCode(), encounterMethodName1.hashCode());
        System.assertEquals(encounterMethodName2.hashCode(), encounterMethodName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterMethodName encounterMethodName1 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName2 = OASEncounterMethodName.getExample();
        OASEncounterMethodName encounterMethodName3 = new OASEncounterMethodName();
        OASEncounterMethodName encounterMethodName4 = new OASEncounterMethodName();

        System.assert(encounterMethodName1.equals(encounterMethodName2));
        System.assert(encounterMethodName3.equals(encounterMethodName4));
        System.assertEquals(encounterMethodName1.hashCode(), encounterMethodName2.hashCode());
        System.assertEquals(encounterMethodName3.hashCode(), encounterMethodName4.hashCode());
    }
}
