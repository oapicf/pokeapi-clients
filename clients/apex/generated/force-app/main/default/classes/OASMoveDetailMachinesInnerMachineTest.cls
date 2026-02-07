@isTest
private class OASMoveDetailMachinesInnerMachineTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine1 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine2 = moveDetailMachinesInnerMachine1;
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine3 = new OASMoveDetailMachinesInnerMachine();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine4 = moveDetailMachinesInnerMachine3;

        System.assert(moveDetailMachinesInnerMachine1.equals(moveDetailMachinesInnerMachine2));
        System.assert(moveDetailMachinesInnerMachine2.equals(moveDetailMachinesInnerMachine1));
        System.assert(moveDetailMachinesInnerMachine1.equals(moveDetailMachinesInnerMachine1));
        System.assert(moveDetailMachinesInnerMachine3.equals(moveDetailMachinesInnerMachine4));
        System.assert(moveDetailMachinesInnerMachine4.equals(moveDetailMachinesInnerMachine3));
        System.assert(moveDetailMachinesInnerMachine3.equals(moveDetailMachinesInnerMachine3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine1 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine2 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine3 = new OASMoveDetailMachinesInnerMachine();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine4 = new OASMoveDetailMachinesInnerMachine();

        System.assert(moveDetailMachinesInnerMachine1.equals(moveDetailMachinesInnerMachine2));
        System.assert(moveDetailMachinesInnerMachine2.equals(moveDetailMachinesInnerMachine1));
        System.assert(moveDetailMachinesInnerMachine3.equals(moveDetailMachinesInnerMachine4));
        System.assert(moveDetailMachinesInnerMachine4.equals(moveDetailMachinesInnerMachine3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine1 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine2 = new OASMoveDetailMachinesInnerMachine();

        System.assertEquals(false, moveDetailMachinesInnerMachine1.equals('foo'));
        System.assertEquals(false, moveDetailMachinesInnerMachine2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine1 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine2 = new OASMoveDetailMachinesInnerMachine();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine3;

        System.assertEquals(false, moveDetailMachinesInnerMachine1.equals(moveDetailMachinesInnerMachine3));
        System.assertEquals(false, moveDetailMachinesInnerMachine2.equals(moveDetailMachinesInnerMachine3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine1 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine2 = new OASMoveDetailMachinesInnerMachine();

        System.assertEquals(moveDetailMachinesInnerMachine1.hashCode(), moveDetailMachinesInnerMachine1.hashCode());
        System.assertEquals(moveDetailMachinesInnerMachine2.hashCode(), moveDetailMachinesInnerMachine2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine1 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine2 = OASMoveDetailMachinesInnerMachine.getExample();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine3 = new OASMoveDetailMachinesInnerMachine();
        OASMoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine4 = new OASMoveDetailMachinesInnerMachine();

        System.assert(moveDetailMachinesInnerMachine1.equals(moveDetailMachinesInnerMachine2));
        System.assert(moveDetailMachinesInnerMachine3.equals(moveDetailMachinesInnerMachine4));
        System.assertEquals(moveDetailMachinesInnerMachine1.hashCode(), moveDetailMachinesInnerMachine2.hashCode());
        System.assertEquals(moveDetailMachinesInnerMachine3.hashCode(), moveDetailMachinesInnerMachine4.hashCode());
    }
}
