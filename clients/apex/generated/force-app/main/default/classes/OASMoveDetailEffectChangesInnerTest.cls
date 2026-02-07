@isTest
private class OASMoveDetailEffectChangesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner1 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner2 = moveDetailEffectChangesInner1;
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner3 = new OASMoveDetailEffectChangesInner();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner4 = moveDetailEffectChangesInner3;

        System.assert(moveDetailEffectChangesInner1.equals(moveDetailEffectChangesInner2));
        System.assert(moveDetailEffectChangesInner2.equals(moveDetailEffectChangesInner1));
        System.assert(moveDetailEffectChangesInner1.equals(moveDetailEffectChangesInner1));
        System.assert(moveDetailEffectChangesInner3.equals(moveDetailEffectChangesInner4));
        System.assert(moveDetailEffectChangesInner4.equals(moveDetailEffectChangesInner3));
        System.assert(moveDetailEffectChangesInner3.equals(moveDetailEffectChangesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner1 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner2 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner3 = new OASMoveDetailEffectChangesInner();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner4 = new OASMoveDetailEffectChangesInner();

        System.assert(moveDetailEffectChangesInner1.equals(moveDetailEffectChangesInner2));
        System.assert(moveDetailEffectChangesInner2.equals(moveDetailEffectChangesInner1));
        System.assert(moveDetailEffectChangesInner3.equals(moveDetailEffectChangesInner4));
        System.assert(moveDetailEffectChangesInner4.equals(moveDetailEffectChangesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner1 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner2 = new OASMoveDetailEffectChangesInner();

        System.assertEquals(false, moveDetailEffectChangesInner1.equals('foo'));
        System.assertEquals(false, moveDetailEffectChangesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner1 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner2 = new OASMoveDetailEffectChangesInner();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner3;

        System.assertEquals(false, moveDetailEffectChangesInner1.equals(moveDetailEffectChangesInner3));
        System.assertEquals(false, moveDetailEffectChangesInner2.equals(moveDetailEffectChangesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner1 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner2 = new OASMoveDetailEffectChangesInner();

        System.assertEquals(moveDetailEffectChangesInner1.hashCode(), moveDetailEffectChangesInner1.hashCode());
        System.assertEquals(moveDetailEffectChangesInner2.hashCode(), moveDetailEffectChangesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner1 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner2 = OASMoveDetailEffectChangesInner.getExample();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner3 = new OASMoveDetailEffectChangesInner();
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner4 = new OASMoveDetailEffectChangesInner();

        System.assert(moveDetailEffectChangesInner1.equals(moveDetailEffectChangesInner2));
        System.assert(moveDetailEffectChangesInner3.equals(moveDetailEffectChangesInner4));
        System.assertEquals(moveDetailEffectChangesInner1.hashCode(), moveDetailEffectChangesInner2.hashCode());
        System.assertEquals(moveDetailEffectChangesInner3.hashCode(), moveDetailEffectChangesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner = new OASMoveDetailEffectChangesInner();
        Map<String, String> x-property-mappings = moveDetailEffectChangesInner.getx-property-mappings();
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveDetailEffectChangesInner moveDetailEffectChangesInner = new OASMoveDetailEffectChangesInner();
        System.assertEquals(new List<OASMoveDetailEffectChangesInnerEffec>(), moveDetailEffectChangesInner.effectEntries);
        System.assertEquals(null, moveDetailEffectChangesInner.versionGroup);
    }
}
