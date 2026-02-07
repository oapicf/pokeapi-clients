@isTest
private class OASMachineDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMachineDetail machineDetail1 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail2 = machineDetail1;
        OASMachineDetail machineDetail3 = new OASMachineDetail();
        OASMachineDetail machineDetail4 = machineDetail3;

        System.assert(machineDetail1.equals(machineDetail2));
        System.assert(machineDetail2.equals(machineDetail1));
        System.assert(machineDetail1.equals(machineDetail1));
        System.assert(machineDetail3.equals(machineDetail4));
        System.assert(machineDetail4.equals(machineDetail3));
        System.assert(machineDetail3.equals(machineDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMachineDetail machineDetail1 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail2 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail3 = new OASMachineDetail();
        OASMachineDetail machineDetail4 = new OASMachineDetail();

        System.assert(machineDetail1.equals(machineDetail2));
        System.assert(machineDetail2.equals(machineDetail1));
        System.assert(machineDetail3.equals(machineDetail4));
        System.assert(machineDetail4.equals(machineDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMachineDetail machineDetail1 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail2 = new OASMachineDetail();

        System.assertEquals(false, machineDetail1.equals('foo'));
        System.assertEquals(false, machineDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMachineDetail machineDetail1 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail2 = new OASMachineDetail();
        OASMachineDetail machineDetail3;

        System.assertEquals(false, machineDetail1.equals(machineDetail3));
        System.assertEquals(false, machineDetail2.equals(machineDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMachineDetail machineDetail1 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail2 = new OASMachineDetail();

        System.assertEquals(machineDetail1.hashCode(), machineDetail1.hashCode());
        System.assertEquals(machineDetail2.hashCode(), machineDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMachineDetail machineDetail1 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail2 = OASMachineDetail.getExample();
        OASMachineDetail machineDetail3 = new OASMachineDetail();
        OASMachineDetail machineDetail4 = new OASMachineDetail();

        System.assert(machineDetail1.equals(machineDetail2));
        System.assert(machineDetail3.equals(machineDetail4));
        System.assertEquals(machineDetail1.hashCode(), machineDetail2.hashCode());
        System.assertEquals(machineDetail3.hashCode(), machineDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMachineDetail machineDetail = new OASMachineDetail();
        Map<String, String> x-property-mappings = machineDetail.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
