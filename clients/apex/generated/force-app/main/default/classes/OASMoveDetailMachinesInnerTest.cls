@isTest
private class OASMoveDetailMachinesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetailMachinesInner moveDetailMachinesInner1 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner2 = moveDetailMachinesInner1;
        OASMoveDetailMachinesInner moveDetailMachinesInner3 = new OASMoveDetailMachinesInner();
        OASMoveDetailMachinesInner moveDetailMachinesInner4 = moveDetailMachinesInner3;

        System.assert(moveDetailMachinesInner1.equals(moveDetailMachinesInner2));
        System.assert(moveDetailMachinesInner2.equals(moveDetailMachinesInner1));
        System.assert(moveDetailMachinesInner1.equals(moveDetailMachinesInner1));
        System.assert(moveDetailMachinesInner3.equals(moveDetailMachinesInner4));
        System.assert(moveDetailMachinesInner4.equals(moveDetailMachinesInner3));
        System.assert(moveDetailMachinesInner3.equals(moveDetailMachinesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetailMachinesInner moveDetailMachinesInner1 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner2 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner3 = new OASMoveDetailMachinesInner();
        OASMoveDetailMachinesInner moveDetailMachinesInner4 = new OASMoveDetailMachinesInner();

        System.assert(moveDetailMachinesInner1.equals(moveDetailMachinesInner2));
        System.assert(moveDetailMachinesInner2.equals(moveDetailMachinesInner1));
        System.assert(moveDetailMachinesInner3.equals(moveDetailMachinesInner4));
        System.assert(moveDetailMachinesInner4.equals(moveDetailMachinesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetailMachinesInner moveDetailMachinesInner1 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner2 = new OASMoveDetailMachinesInner();

        System.assertEquals(false, moveDetailMachinesInner1.equals('foo'));
        System.assertEquals(false, moveDetailMachinesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetailMachinesInner moveDetailMachinesInner1 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner2 = new OASMoveDetailMachinesInner();
        OASMoveDetailMachinesInner moveDetailMachinesInner3;

        System.assertEquals(false, moveDetailMachinesInner1.equals(moveDetailMachinesInner3));
        System.assertEquals(false, moveDetailMachinesInner2.equals(moveDetailMachinesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetailMachinesInner moveDetailMachinesInner1 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner2 = new OASMoveDetailMachinesInner();

        System.assertEquals(moveDetailMachinesInner1.hashCode(), moveDetailMachinesInner1.hashCode());
        System.assertEquals(moveDetailMachinesInner2.hashCode(), moveDetailMachinesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetailMachinesInner moveDetailMachinesInner1 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner2 = OASMoveDetailMachinesInner.getExample();
        OASMoveDetailMachinesInner moveDetailMachinesInner3 = new OASMoveDetailMachinesInner();
        OASMoveDetailMachinesInner moveDetailMachinesInner4 = new OASMoveDetailMachinesInner();

        System.assert(moveDetailMachinesInner1.equals(moveDetailMachinesInner2));
        System.assert(moveDetailMachinesInner3.equals(moveDetailMachinesInner4));
        System.assertEquals(moveDetailMachinesInner1.hashCode(), moveDetailMachinesInner2.hashCode());
        System.assertEquals(moveDetailMachinesInner3.hashCode(), moveDetailMachinesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveDetailMachinesInner moveDetailMachinesInner = new OASMoveDetailMachinesInner();
        Map<String, String> x-property-mappings = moveDetailMachinesInner.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
