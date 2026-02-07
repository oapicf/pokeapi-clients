@isTest
private class OASMoveMetaTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMeta moveMeta1 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta2 = moveMeta1;
        OASMoveMeta moveMeta3 = new OASMoveMeta();
        OASMoveMeta moveMeta4 = moveMeta3;

        System.assert(moveMeta1.equals(moveMeta2));
        System.assert(moveMeta2.equals(moveMeta1));
        System.assert(moveMeta1.equals(moveMeta1));
        System.assert(moveMeta3.equals(moveMeta4));
        System.assert(moveMeta4.equals(moveMeta3));
        System.assert(moveMeta3.equals(moveMeta3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMeta moveMeta1 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta2 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta3 = new OASMoveMeta();
        OASMoveMeta moveMeta4 = new OASMoveMeta();

        System.assert(moveMeta1.equals(moveMeta2));
        System.assert(moveMeta2.equals(moveMeta1));
        System.assert(moveMeta3.equals(moveMeta4));
        System.assert(moveMeta4.equals(moveMeta3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMeta moveMeta1 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta2 = new OASMoveMeta();

        System.assertEquals(false, moveMeta1.equals('foo'));
        System.assertEquals(false, moveMeta2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMeta moveMeta1 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta2 = new OASMoveMeta();
        OASMoveMeta moveMeta3;

        System.assertEquals(false, moveMeta1.equals(moveMeta3));
        System.assertEquals(false, moveMeta2.equals(moveMeta3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMeta moveMeta1 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta2 = new OASMoveMeta();

        System.assertEquals(moveMeta1.hashCode(), moveMeta1.hashCode());
        System.assertEquals(moveMeta2.hashCode(), moveMeta2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMeta moveMeta1 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta2 = OASMoveMeta.getExample();
        OASMoveMeta moveMeta3 = new OASMoveMeta();
        OASMoveMeta moveMeta4 = new OASMoveMeta();

        System.assert(moveMeta1.equals(moveMeta2));
        System.assert(moveMeta3.equals(moveMeta4));
        System.assertEquals(moveMeta1.hashCode(), moveMeta2.hashCode());
        System.assertEquals(moveMeta3.hashCode(), moveMeta4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveMeta moveMeta = new OASMoveMeta();
        Map<String, String> x-property-mappings = moveMeta.getx-property-mappings();
        System.assertEquals('minHits', x-property-mappings.get('min_hits'));
        System.assertEquals('maxHits', x-property-mappings.get('max_hits'));
        System.assertEquals('minTurns', x-property-mappings.get('min_turns'));
        System.assertEquals('maxTurns', x-property-mappings.get('max_turns'));
        System.assertEquals('critRate', x-property-mappings.get('crit_rate'));
        System.assertEquals('ailmentChance', x-property-mappings.get('ailment_chance'));
        System.assertEquals('flinchChance', x-property-mappings.get('flinch_chance'));
        System.assertEquals('statChance', x-property-mappings.get('stat_chance'));
    }
}
