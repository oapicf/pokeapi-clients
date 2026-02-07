@isTest
private class OASItemDetailMachinesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDetailMachinesInner itemDetailMachinesInner1 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner2 = itemDetailMachinesInner1;
        OASItemDetailMachinesInner itemDetailMachinesInner3 = new OASItemDetailMachinesInner();
        OASItemDetailMachinesInner itemDetailMachinesInner4 = itemDetailMachinesInner3;

        System.assert(itemDetailMachinesInner1.equals(itemDetailMachinesInner2));
        System.assert(itemDetailMachinesInner2.equals(itemDetailMachinesInner1));
        System.assert(itemDetailMachinesInner1.equals(itemDetailMachinesInner1));
        System.assert(itemDetailMachinesInner3.equals(itemDetailMachinesInner4));
        System.assert(itemDetailMachinesInner4.equals(itemDetailMachinesInner3));
        System.assert(itemDetailMachinesInner3.equals(itemDetailMachinesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDetailMachinesInner itemDetailMachinesInner1 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner2 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner3 = new OASItemDetailMachinesInner();
        OASItemDetailMachinesInner itemDetailMachinesInner4 = new OASItemDetailMachinesInner();

        System.assert(itemDetailMachinesInner1.equals(itemDetailMachinesInner2));
        System.assert(itemDetailMachinesInner2.equals(itemDetailMachinesInner1));
        System.assert(itemDetailMachinesInner3.equals(itemDetailMachinesInner4));
        System.assert(itemDetailMachinesInner4.equals(itemDetailMachinesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDetailMachinesInner itemDetailMachinesInner1 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner2 = new OASItemDetailMachinesInner();

        System.assertEquals(false, itemDetailMachinesInner1.equals('foo'));
        System.assertEquals(false, itemDetailMachinesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDetailMachinesInner itemDetailMachinesInner1 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner2 = new OASItemDetailMachinesInner();
        OASItemDetailMachinesInner itemDetailMachinesInner3;

        System.assertEquals(false, itemDetailMachinesInner1.equals(itemDetailMachinesInner3));
        System.assertEquals(false, itemDetailMachinesInner2.equals(itemDetailMachinesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDetailMachinesInner itemDetailMachinesInner1 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner2 = new OASItemDetailMachinesInner();

        System.assertEquals(itemDetailMachinesInner1.hashCode(), itemDetailMachinesInner1.hashCode());
        System.assertEquals(itemDetailMachinesInner2.hashCode(), itemDetailMachinesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDetailMachinesInner itemDetailMachinesInner1 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner2 = OASItemDetailMachinesInner.getExample();
        OASItemDetailMachinesInner itemDetailMachinesInner3 = new OASItemDetailMachinesInner();
        OASItemDetailMachinesInner itemDetailMachinesInner4 = new OASItemDetailMachinesInner();

        System.assert(itemDetailMachinesInner1.equals(itemDetailMachinesInner2));
        System.assert(itemDetailMachinesInner3.equals(itemDetailMachinesInner4));
        System.assertEquals(itemDetailMachinesInner1.hashCode(), itemDetailMachinesInner2.hashCode());
        System.assertEquals(itemDetailMachinesInner3.hashCode(), itemDetailMachinesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemDetailMachinesInner itemDetailMachinesInner = new OASItemDetailMachinesInner();
        Map<String, String> x-property-mappings = itemDetailMachinesInner.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
