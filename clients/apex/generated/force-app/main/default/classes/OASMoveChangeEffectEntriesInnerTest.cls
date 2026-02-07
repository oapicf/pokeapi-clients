@isTest
private class OASMoveChangeEffectEntriesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner1 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner2 = moveChangeEffectEntriesInner1;
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner3 = new OASMoveChangeEffectEntriesInner();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner4 = moveChangeEffectEntriesInner3;

        System.assert(moveChangeEffectEntriesInner1.equals(moveChangeEffectEntriesInner2));
        System.assert(moveChangeEffectEntriesInner2.equals(moveChangeEffectEntriesInner1));
        System.assert(moveChangeEffectEntriesInner1.equals(moveChangeEffectEntriesInner1));
        System.assert(moveChangeEffectEntriesInner3.equals(moveChangeEffectEntriesInner4));
        System.assert(moveChangeEffectEntriesInner4.equals(moveChangeEffectEntriesInner3));
        System.assert(moveChangeEffectEntriesInner3.equals(moveChangeEffectEntriesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner1 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner2 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner3 = new OASMoveChangeEffectEntriesInner();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner4 = new OASMoveChangeEffectEntriesInner();

        System.assert(moveChangeEffectEntriesInner1.equals(moveChangeEffectEntriesInner2));
        System.assert(moveChangeEffectEntriesInner2.equals(moveChangeEffectEntriesInner1));
        System.assert(moveChangeEffectEntriesInner3.equals(moveChangeEffectEntriesInner4));
        System.assert(moveChangeEffectEntriesInner4.equals(moveChangeEffectEntriesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner1 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner2 = new OASMoveChangeEffectEntriesInner();

        System.assertEquals(false, moveChangeEffectEntriesInner1.equals('foo'));
        System.assertEquals(false, moveChangeEffectEntriesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner1 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner2 = new OASMoveChangeEffectEntriesInner();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner3;

        System.assertEquals(false, moveChangeEffectEntriesInner1.equals(moveChangeEffectEntriesInner3));
        System.assertEquals(false, moveChangeEffectEntriesInner2.equals(moveChangeEffectEntriesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner1 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner2 = new OASMoveChangeEffectEntriesInner();

        System.assertEquals(moveChangeEffectEntriesInner1.hashCode(), moveChangeEffectEntriesInner1.hashCode());
        System.assertEquals(moveChangeEffectEntriesInner2.hashCode(), moveChangeEffectEntriesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner1 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner2 = OASMoveChangeEffectEntriesInner.getExample();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner3 = new OASMoveChangeEffectEntriesInner();
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner4 = new OASMoveChangeEffectEntriesInner();

        System.assert(moveChangeEffectEntriesInner1.equals(moveChangeEffectEntriesInner2));
        System.assert(moveChangeEffectEntriesInner3.equals(moveChangeEffectEntriesInner4));
        System.assertEquals(moveChangeEffectEntriesInner1.hashCode(), moveChangeEffectEntriesInner2.hashCode());
        System.assertEquals(moveChangeEffectEntriesInner3.hashCode(), moveChangeEffectEntriesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveChangeEffectEntriesInner moveChangeEffectEntriesInner = new OASMoveChangeEffectEntriesInner();
        Map<String, String> x-property-mappings = moveChangeEffectEntriesInner.getx-property-mappings();
        System.assertEquals('shortEffect', x-property-mappings.get('short_effect'));
    }
}
