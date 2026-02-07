@isTest
private class OASEncounterConditionValueNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterConditionValueName encounterConditionValueName1 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName2 = encounterConditionValueName1;
        OASEncounterConditionValueName encounterConditionValueName3 = new OASEncounterConditionValueName();
        OASEncounterConditionValueName encounterConditionValueName4 = encounterConditionValueName3;

        System.assert(encounterConditionValueName1.equals(encounterConditionValueName2));
        System.assert(encounterConditionValueName2.equals(encounterConditionValueName1));
        System.assert(encounterConditionValueName1.equals(encounterConditionValueName1));
        System.assert(encounterConditionValueName3.equals(encounterConditionValueName4));
        System.assert(encounterConditionValueName4.equals(encounterConditionValueName3));
        System.assert(encounterConditionValueName3.equals(encounterConditionValueName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterConditionValueName encounterConditionValueName1 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName2 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName3 = new OASEncounterConditionValueName();
        OASEncounterConditionValueName encounterConditionValueName4 = new OASEncounterConditionValueName();

        System.assert(encounterConditionValueName1.equals(encounterConditionValueName2));
        System.assert(encounterConditionValueName2.equals(encounterConditionValueName1));
        System.assert(encounterConditionValueName3.equals(encounterConditionValueName4));
        System.assert(encounterConditionValueName4.equals(encounterConditionValueName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterConditionValueName encounterConditionValueName1 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName2 = new OASEncounterConditionValueName();

        System.assertEquals(false, encounterConditionValueName1.equals('foo'));
        System.assertEquals(false, encounterConditionValueName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterConditionValueName encounterConditionValueName1 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName2 = new OASEncounterConditionValueName();
        OASEncounterConditionValueName encounterConditionValueName3;

        System.assertEquals(false, encounterConditionValueName1.equals(encounterConditionValueName3));
        System.assertEquals(false, encounterConditionValueName2.equals(encounterConditionValueName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterConditionValueName encounterConditionValueName1 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName2 = new OASEncounterConditionValueName();

        System.assertEquals(encounterConditionValueName1.hashCode(), encounterConditionValueName1.hashCode());
        System.assertEquals(encounterConditionValueName2.hashCode(), encounterConditionValueName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterConditionValueName encounterConditionValueName1 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName2 = OASEncounterConditionValueName.getExample();
        OASEncounterConditionValueName encounterConditionValueName3 = new OASEncounterConditionValueName();
        OASEncounterConditionValueName encounterConditionValueName4 = new OASEncounterConditionValueName();

        System.assert(encounterConditionValueName1.equals(encounterConditionValueName2));
        System.assert(encounterConditionValueName3.equals(encounterConditionValueName4));
        System.assertEquals(encounterConditionValueName1.hashCode(), encounterConditionValueName2.hashCode());
        System.assertEquals(encounterConditionValueName3.hashCode(), encounterConditionValueName4.hashCode());
    }
}
