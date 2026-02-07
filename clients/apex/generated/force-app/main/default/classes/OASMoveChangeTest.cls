@isTest
private class OASMoveChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveChange moveChange1 = OASMoveChange.getExample();
        OASMoveChange moveChange2 = moveChange1;
        OASMoveChange moveChange3 = new OASMoveChange();
        OASMoveChange moveChange4 = moveChange3;

        System.assert(moveChange1.equals(moveChange2));
        System.assert(moveChange2.equals(moveChange1));
        System.assert(moveChange1.equals(moveChange1));
        System.assert(moveChange3.equals(moveChange4));
        System.assert(moveChange4.equals(moveChange3));
        System.assert(moveChange3.equals(moveChange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveChange moveChange1 = OASMoveChange.getExample();
        OASMoveChange moveChange2 = OASMoveChange.getExample();
        OASMoveChange moveChange3 = new OASMoveChange();
        OASMoveChange moveChange4 = new OASMoveChange();

        System.assert(moveChange1.equals(moveChange2));
        System.assert(moveChange2.equals(moveChange1));
        System.assert(moveChange3.equals(moveChange4));
        System.assert(moveChange4.equals(moveChange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveChange moveChange1 = OASMoveChange.getExample();
        OASMoveChange moveChange2 = new OASMoveChange();

        System.assertEquals(false, moveChange1.equals('foo'));
        System.assertEquals(false, moveChange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveChange moveChange1 = OASMoveChange.getExample();
        OASMoveChange moveChange2 = new OASMoveChange();
        OASMoveChange moveChange3;

        System.assertEquals(false, moveChange1.equals(moveChange3));
        System.assertEquals(false, moveChange2.equals(moveChange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveChange moveChange1 = OASMoveChange.getExample();
        OASMoveChange moveChange2 = new OASMoveChange();

        System.assertEquals(moveChange1.hashCode(), moveChange1.hashCode());
        System.assertEquals(moveChange2.hashCode(), moveChange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveChange moveChange1 = OASMoveChange.getExample();
        OASMoveChange moveChange2 = OASMoveChange.getExample();
        OASMoveChange moveChange3 = new OASMoveChange();
        OASMoveChange moveChange4 = new OASMoveChange();

        System.assert(moveChange1.equals(moveChange2));
        System.assert(moveChange3.equals(moveChange4));
        System.assertEquals(moveChange1.hashCode(), moveChange2.hashCode());
        System.assertEquals(moveChange3.hashCode(), moveChange4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveChange moveChange = new OASMoveChange();
        Map<String, String> x-property-mappings = moveChange.getx-property-mappings();
        System.assertEquals('effectChance', x-property-mappings.get('effect_chance'));
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveChange moveChange = new OASMoveChange();
        System.assertEquals(new List<OASMoveChangeEffectEntriesInner>(), moveChange.effectEntries);
        System.assertEquals(null, moveChange.accuracy);
        System.assertEquals(null, moveChange.power);
        System.assertEquals(null, moveChange.pp);
        System.assertEquals(null, moveChange.effectChance);
        System.assertEquals(null, moveChange.type);
        System.assertEquals(null, moveChange.versionGroup);
    }
}
