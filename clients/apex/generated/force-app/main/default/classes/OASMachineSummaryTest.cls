@isTest
private class OASMachineSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMachineSummary machineSummary1 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary2 = machineSummary1;
        OASMachineSummary machineSummary3 = new OASMachineSummary();
        OASMachineSummary machineSummary4 = machineSummary3;

        System.assert(machineSummary1.equals(machineSummary2));
        System.assert(machineSummary2.equals(machineSummary1));
        System.assert(machineSummary1.equals(machineSummary1));
        System.assert(machineSummary3.equals(machineSummary4));
        System.assert(machineSummary4.equals(machineSummary3));
        System.assert(machineSummary3.equals(machineSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMachineSummary machineSummary1 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary2 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary3 = new OASMachineSummary();
        OASMachineSummary machineSummary4 = new OASMachineSummary();

        System.assert(machineSummary1.equals(machineSummary2));
        System.assert(machineSummary2.equals(machineSummary1));
        System.assert(machineSummary3.equals(machineSummary4));
        System.assert(machineSummary4.equals(machineSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMachineSummary machineSummary1 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary2 = new OASMachineSummary();

        System.assertEquals(false, machineSummary1.equals('foo'));
        System.assertEquals(false, machineSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMachineSummary machineSummary1 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary2 = new OASMachineSummary();
        OASMachineSummary machineSummary3;

        System.assertEquals(false, machineSummary1.equals(machineSummary3));
        System.assertEquals(false, machineSummary2.equals(machineSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMachineSummary machineSummary1 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary2 = new OASMachineSummary();

        System.assertEquals(machineSummary1.hashCode(), machineSummary1.hashCode());
        System.assertEquals(machineSummary2.hashCode(), machineSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMachineSummary machineSummary1 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary2 = OASMachineSummary.getExample();
        OASMachineSummary machineSummary3 = new OASMachineSummary();
        OASMachineSummary machineSummary4 = new OASMachineSummary();

        System.assert(machineSummary1.equals(machineSummary2));
        System.assert(machineSummary3.equals(machineSummary4));
        System.assertEquals(machineSummary1.hashCode(), machineSummary2.hashCode());
        System.assertEquals(machineSummary3.hashCode(), machineSummary4.hashCode());
    }
}
