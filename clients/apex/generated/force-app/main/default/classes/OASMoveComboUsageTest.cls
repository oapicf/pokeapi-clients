@isTest
private class OASMoveComboUsageTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveComboUsage moveComboUsage1 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage2 = moveComboUsage1;
        OASMoveComboUsage moveComboUsage3 = new OASMoveComboUsage();
        OASMoveComboUsage moveComboUsage4 = moveComboUsage3;

        System.assert(moveComboUsage1.equals(moveComboUsage2));
        System.assert(moveComboUsage2.equals(moveComboUsage1));
        System.assert(moveComboUsage1.equals(moveComboUsage1));
        System.assert(moveComboUsage3.equals(moveComboUsage4));
        System.assert(moveComboUsage4.equals(moveComboUsage3));
        System.assert(moveComboUsage3.equals(moveComboUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveComboUsage moveComboUsage1 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage2 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage3 = new OASMoveComboUsage();
        OASMoveComboUsage moveComboUsage4 = new OASMoveComboUsage();

        System.assert(moveComboUsage1.equals(moveComboUsage2));
        System.assert(moveComboUsage2.equals(moveComboUsage1));
        System.assert(moveComboUsage3.equals(moveComboUsage4));
        System.assert(moveComboUsage4.equals(moveComboUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveComboUsage moveComboUsage1 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage2 = new OASMoveComboUsage();

        System.assertEquals(false, moveComboUsage1.equals('foo'));
        System.assertEquals(false, moveComboUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveComboUsage moveComboUsage1 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage2 = new OASMoveComboUsage();
        OASMoveComboUsage moveComboUsage3;

        System.assertEquals(false, moveComboUsage1.equals(moveComboUsage3));
        System.assertEquals(false, moveComboUsage2.equals(moveComboUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveComboUsage moveComboUsage1 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage2 = new OASMoveComboUsage();

        System.assertEquals(moveComboUsage1.hashCode(), moveComboUsage1.hashCode());
        System.assertEquals(moveComboUsage2.hashCode(), moveComboUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveComboUsage moveComboUsage1 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage2 = OASMoveComboUsage.getExample();
        OASMoveComboUsage moveComboUsage3 = new OASMoveComboUsage();
        OASMoveComboUsage moveComboUsage4 = new OASMoveComboUsage();

        System.assert(moveComboUsage1.equals(moveComboUsage2));
        System.assert(moveComboUsage3.equals(moveComboUsage4));
        System.assertEquals(moveComboUsage1.hashCode(), moveComboUsage2.hashCode());
        System.assertEquals(moveComboUsage3.hashCode(), moveComboUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveComboUsage moveComboUsage = new OASMoveComboUsage();
        Map<String, String> x-property-mappings = moveComboUsage.getx-property-mappings();
        System.assertEquals('useBefore', x-property-mappings.get('use_before'));
        System.assertEquals('useAfter', x-property-mappings.get('use_after'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveComboUsage moveComboUsage = new OASMoveComboUsage();
        System.assertEquals(new List<OASMoveSummary>(), moveComboUsage.useBefore);
        System.assertEquals(new List<OASMoveSummary>(), moveComboUsage.useAfter);
    }
}
