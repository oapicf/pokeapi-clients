@isTest
private class OASMoveEffectChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveEffectChange moveEffectChange1 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange2 = moveEffectChange1;
        OASMoveEffectChange moveEffectChange3 = new OASMoveEffectChange();
        OASMoveEffectChange moveEffectChange4 = moveEffectChange3;

        System.assert(moveEffectChange1.equals(moveEffectChange2));
        System.assert(moveEffectChange2.equals(moveEffectChange1));
        System.assert(moveEffectChange1.equals(moveEffectChange1));
        System.assert(moveEffectChange3.equals(moveEffectChange4));
        System.assert(moveEffectChange4.equals(moveEffectChange3));
        System.assert(moveEffectChange3.equals(moveEffectChange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveEffectChange moveEffectChange1 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange2 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange3 = new OASMoveEffectChange();
        OASMoveEffectChange moveEffectChange4 = new OASMoveEffectChange();

        System.assert(moveEffectChange1.equals(moveEffectChange2));
        System.assert(moveEffectChange2.equals(moveEffectChange1));
        System.assert(moveEffectChange3.equals(moveEffectChange4));
        System.assert(moveEffectChange4.equals(moveEffectChange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveEffectChange moveEffectChange1 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange2 = new OASMoveEffectChange();

        System.assertEquals(false, moveEffectChange1.equals('foo'));
        System.assertEquals(false, moveEffectChange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveEffectChange moveEffectChange1 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange2 = new OASMoveEffectChange();
        OASMoveEffectChange moveEffectChange3;

        System.assertEquals(false, moveEffectChange1.equals(moveEffectChange3));
        System.assertEquals(false, moveEffectChange2.equals(moveEffectChange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveEffectChange moveEffectChange1 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange2 = new OASMoveEffectChange();

        System.assertEquals(moveEffectChange1.hashCode(), moveEffectChange1.hashCode());
        System.assertEquals(moveEffectChange2.hashCode(), moveEffectChange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveEffectChange moveEffectChange1 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange2 = OASMoveEffectChange.getExample();
        OASMoveEffectChange moveEffectChange3 = new OASMoveEffectChange();
        OASMoveEffectChange moveEffectChange4 = new OASMoveEffectChange();

        System.assert(moveEffectChange1.equals(moveEffectChange2));
        System.assert(moveEffectChange3.equals(moveEffectChange4));
        System.assertEquals(moveEffectChange1.hashCode(), moveEffectChange2.hashCode());
        System.assertEquals(moveEffectChange3.hashCode(), moveEffectChange4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveEffectChange moveEffectChange = new OASMoveEffectChange();
        Map<String, String> x-property-mappings = moveEffectChange.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveEffectChange moveEffectChange = new OASMoveEffectChange();
        System.assertEquals(new List<OASMoveEffectChangeEffectText>(), moveEffectChange.effectEntries);
        System.assertEquals(null, moveEffectChange.versionGroup);
    }
}
