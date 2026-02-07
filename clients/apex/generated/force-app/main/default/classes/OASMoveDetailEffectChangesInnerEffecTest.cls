@isTest
private class OASMoveDetailEffectChangesInnerEffecTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner1 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner2 = moveDetailEffectChangesInnerEffectEntriesInner1;
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner3 = new OASMoveDetailEffectChangesInnerEffec();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner4 = moveDetailEffectChangesInnerEffectEntriesInner3;

        System.assert(moveDetailEffectChangesInnerEffectEntriesInner1.equals(moveDetailEffectChangesInnerEffectEntriesInner2));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner2.equals(moveDetailEffectChangesInnerEffectEntriesInner1));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner1.equals(moveDetailEffectChangesInnerEffectEntriesInner1));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner3.equals(moveDetailEffectChangesInnerEffectEntriesInner4));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner4.equals(moveDetailEffectChangesInnerEffectEntriesInner3));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner3.equals(moveDetailEffectChangesInnerEffectEntriesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner1 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner2 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner3 = new OASMoveDetailEffectChangesInnerEffec();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner4 = new OASMoveDetailEffectChangesInnerEffec();

        System.assert(moveDetailEffectChangesInnerEffectEntriesInner1.equals(moveDetailEffectChangesInnerEffectEntriesInner2));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner2.equals(moveDetailEffectChangesInnerEffectEntriesInner1));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner3.equals(moveDetailEffectChangesInnerEffectEntriesInner4));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner4.equals(moveDetailEffectChangesInnerEffectEntriesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner1 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner2 = new OASMoveDetailEffectChangesInnerEffec();

        System.assertEquals(false, moveDetailEffectChangesInnerEffectEntriesInner1.equals('foo'));
        System.assertEquals(false, moveDetailEffectChangesInnerEffectEntriesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner1 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner2 = new OASMoveDetailEffectChangesInnerEffec();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner3;

        System.assertEquals(false, moveDetailEffectChangesInnerEffectEntriesInner1.equals(moveDetailEffectChangesInnerEffectEntriesInner3));
        System.assertEquals(false, moveDetailEffectChangesInnerEffectEntriesInner2.equals(moveDetailEffectChangesInnerEffectEntriesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner1 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner2 = new OASMoveDetailEffectChangesInnerEffec();

        System.assertEquals(moveDetailEffectChangesInnerEffectEntriesInner1.hashCode(), moveDetailEffectChangesInnerEffectEntriesInner1.hashCode());
        System.assertEquals(moveDetailEffectChangesInnerEffectEntriesInner2.hashCode(), moveDetailEffectChangesInnerEffectEntriesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner1 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner2 = OASMoveDetailEffectChangesInnerEffec.getExample();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner3 = new OASMoveDetailEffectChangesInnerEffec();
        OASMoveDetailEffectChangesInnerEffec moveDetailEffectChangesInnerEffectEntriesInner4 = new OASMoveDetailEffectChangesInnerEffec();

        System.assert(moveDetailEffectChangesInnerEffectEntriesInner1.equals(moveDetailEffectChangesInnerEffectEntriesInner2));
        System.assert(moveDetailEffectChangesInnerEffectEntriesInner3.equals(moveDetailEffectChangesInnerEffectEntriesInner4));
        System.assertEquals(moveDetailEffectChangesInnerEffectEntriesInner1.hashCode(), moveDetailEffectChangesInnerEffectEntriesInner2.hashCode());
        System.assertEquals(moveDetailEffectChangesInnerEffectEntriesInner3.hashCode(), moveDetailEffectChangesInnerEffectEntriesInner4.hashCode());
    }
}
