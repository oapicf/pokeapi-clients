@isTest
private class OASItemDetailBabyTriggerForTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor1 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor2 = itemDetailBabyTriggerFor1;
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor3 = new OASItemDetailBabyTriggerFor();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor4 = itemDetailBabyTriggerFor3;

        System.assert(itemDetailBabyTriggerFor1.equals(itemDetailBabyTriggerFor2));
        System.assert(itemDetailBabyTriggerFor2.equals(itemDetailBabyTriggerFor1));
        System.assert(itemDetailBabyTriggerFor1.equals(itemDetailBabyTriggerFor1));
        System.assert(itemDetailBabyTriggerFor3.equals(itemDetailBabyTriggerFor4));
        System.assert(itemDetailBabyTriggerFor4.equals(itemDetailBabyTriggerFor3));
        System.assert(itemDetailBabyTriggerFor3.equals(itemDetailBabyTriggerFor3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor1 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor2 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor3 = new OASItemDetailBabyTriggerFor();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor4 = new OASItemDetailBabyTriggerFor();

        System.assert(itemDetailBabyTriggerFor1.equals(itemDetailBabyTriggerFor2));
        System.assert(itemDetailBabyTriggerFor2.equals(itemDetailBabyTriggerFor1));
        System.assert(itemDetailBabyTriggerFor3.equals(itemDetailBabyTriggerFor4));
        System.assert(itemDetailBabyTriggerFor4.equals(itemDetailBabyTriggerFor3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor1 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor2 = new OASItemDetailBabyTriggerFor();

        System.assertEquals(false, itemDetailBabyTriggerFor1.equals('foo'));
        System.assertEquals(false, itemDetailBabyTriggerFor2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor1 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor2 = new OASItemDetailBabyTriggerFor();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor3;

        System.assertEquals(false, itemDetailBabyTriggerFor1.equals(itemDetailBabyTriggerFor3));
        System.assertEquals(false, itemDetailBabyTriggerFor2.equals(itemDetailBabyTriggerFor3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor1 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor2 = new OASItemDetailBabyTriggerFor();

        System.assertEquals(itemDetailBabyTriggerFor1.hashCode(), itemDetailBabyTriggerFor1.hashCode());
        System.assertEquals(itemDetailBabyTriggerFor2.hashCode(), itemDetailBabyTriggerFor2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor1 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor2 = OASItemDetailBabyTriggerFor.getExample();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor3 = new OASItemDetailBabyTriggerFor();
        OASItemDetailBabyTriggerFor itemDetailBabyTriggerFor4 = new OASItemDetailBabyTriggerFor();

        System.assert(itemDetailBabyTriggerFor1.equals(itemDetailBabyTriggerFor2));
        System.assert(itemDetailBabyTriggerFor3.equals(itemDetailBabyTriggerFor4));
        System.assertEquals(itemDetailBabyTriggerFor1.hashCode(), itemDetailBabyTriggerFor2.hashCode());
        System.assertEquals(itemDetailBabyTriggerFor3.hashCode(), itemDetailBabyTriggerFor4.hashCode());
    }
}
