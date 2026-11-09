@isTest
private class OASItemMachineTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemMachine itemMachine1 = OASItemMachine.getExample();
        OASItemMachine itemMachine2 = itemMachine1;
        OASItemMachine itemMachine3 = new OASItemMachine();
        OASItemMachine itemMachine4 = itemMachine3;

        System.assert(itemMachine1.equals(itemMachine2));
        System.assert(itemMachine2.equals(itemMachine1));
        System.assert(itemMachine1.equals(itemMachine1));
        System.assert(itemMachine3.equals(itemMachine4));
        System.assert(itemMachine4.equals(itemMachine3));
        System.assert(itemMachine3.equals(itemMachine3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemMachine itemMachine1 = OASItemMachine.getExample();
        OASItemMachine itemMachine2 = OASItemMachine.getExample();
        OASItemMachine itemMachine3 = new OASItemMachine();
        OASItemMachine itemMachine4 = new OASItemMachine();

        System.assert(itemMachine1.equals(itemMachine2));
        System.assert(itemMachine2.equals(itemMachine1));
        System.assert(itemMachine3.equals(itemMachine4));
        System.assert(itemMachine4.equals(itemMachine3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemMachine itemMachine1 = OASItemMachine.getExample();
        OASItemMachine itemMachine2 = new OASItemMachine();

        System.assertEquals(false, itemMachine1.equals('foo'));
        System.assertEquals(false, itemMachine2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemMachine itemMachine1 = OASItemMachine.getExample();
        OASItemMachine itemMachine2 = new OASItemMachine();
        OASItemMachine itemMachine3;

        System.assertEquals(false, itemMachine1.equals(itemMachine3));
        System.assertEquals(false, itemMachine2.equals(itemMachine3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemMachine itemMachine1 = OASItemMachine.getExample();
        OASItemMachine itemMachine2 = new OASItemMachine();

        System.assertEquals(itemMachine1.hashCode(), itemMachine1.hashCode());
        System.assertEquals(itemMachine2.hashCode(), itemMachine2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemMachine itemMachine1 = OASItemMachine.getExample();
        OASItemMachine itemMachine2 = OASItemMachine.getExample();
        OASItemMachine itemMachine3 = new OASItemMachine();
        OASItemMachine itemMachine4 = new OASItemMachine();

        System.assert(itemMachine1.equals(itemMachine2));
        System.assert(itemMachine3.equals(itemMachine4));
        System.assertEquals(itemMachine1.hashCode(), itemMachine2.hashCode());
        System.assertEquals(itemMachine3.hashCode(), itemMachine4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemMachine itemMachine = new OASItemMachine();
        Map<String, String> x-property-mappings = itemMachine.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
