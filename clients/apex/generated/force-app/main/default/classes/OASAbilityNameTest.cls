@isTest
private class OASAbilityNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityName abilityName1 = OASAbilityName.getExample();
        OASAbilityName abilityName2 = abilityName1;
        OASAbilityName abilityName3 = new OASAbilityName();
        OASAbilityName abilityName4 = abilityName3;

        System.assert(abilityName1.equals(abilityName2));
        System.assert(abilityName2.equals(abilityName1));
        System.assert(abilityName1.equals(abilityName1));
        System.assert(abilityName3.equals(abilityName4));
        System.assert(abilityName4.equals(abilityName3));
        System.assert(abilityName3.equals(abilityName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityName abilityName1 = OASAbilityName.getExample();
        OASAbilityName abilityName2 = OASAbilityName.getExample();
        OASAbilityName abilityName3 = new OASAbilityName();
        OASAbilityName abilityName4 = new OASAbilityName();

        System.assert(abilityName1.equals(abilityName2));
        System.assert(abilityName2.equals(abilityName1));
        System.assert(abilityName3.equals(abilityName4));
        System.assert(abilityName4.equals(abilityName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityName abilityName1 = OASAbilityName.getExample();
        OASAbilityName abilityName2 = new OASAbilityName();

        System.assertEquals(false, abilityName1.equals('foo'));
        System.assertEquals(false, abilityName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityName abilityName1 = OASAbilityName.getExample();
        OASAbilityName abilityName2 = new OASAbilityName();
        OASAbilityName abilityName3;

        System.assertEquals(false, abilityName1.equals(abilityName3));
        System.assertEquals(false, abilityName2.equals(abilityName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityName abilityName1 = OASAbilityName.getExample();
        OASAbilityName abilityName2 = new OASAbilityName();

        System.assertEquals(abilityName1.hashCode(), abilityName1.hashCode());
        System.assertEquals(abilityName2.hashCode(), abilityName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityName abilityName1 = OASAbilityName.getExample();
        OASAbilityName abilityName2 = OASAbilityName.getExample();
        OASAbilityName abilityName3 = new OASAbilityName();
        OASAbilityName abilityName4 = new OASAbilityName();

        System.assert(abilityName1.equals(abilityName2));
        System.assert(abilityName3.equals(abilityName4));
        System.assertEquals(abilityName1.hashCode(), abilityName2.hashCode());
        System.assertEquals(abilityName3.hashCode(), abilityName4.hashCode());
    }
}
