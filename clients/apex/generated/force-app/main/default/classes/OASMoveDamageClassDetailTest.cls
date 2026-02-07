@isTest
private class OASMoveDamageClassDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDamageClassDetail moveDamageClassDetail1 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail2 = moveDamageClassDetail1;
        OASMoveDamageClassDetail moveDamageClassDetail3 = new OASMoveDamageClassDetail();
        OASMoveDamageClassDetail moveDamageClassDetail4 = moveDamageClassDetail3;

        System.assert(moveDamageClassDetail1.equals(moveDamageClassDetail2));
        System.assert(moveDamageClassDetail2.equals(moveDamageClassDetail1));
        System.assert(moveDamageClassDetail1.equals(moveDamageClassDetail1));
        System.assert(moveDamageClassDetail3.equals(moveDamageClassDetail4));
        System.assert(moveDamageClassDetail4.equals(moveDamageClassDetail3));
        System.assert(moveDamageClassDetail3.equals(moveDamageClassDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDamageClassDetail moveDamageClassDetail1 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail2 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail3 = new OASMoveDamageClassDetail();
        OASMoveDamageClassDetail moveDamageClassDetail4 = new OASMoveDamageClassDetail();

        System.assert(moveDamageClassDetail1.equals(moveDamageClassDetail2));
        System.assert(moveDamageClassDetail2.equals(moveDamageClassDetail1));
        System.assert(moveDamageClassDetail3.equals(moveDamageClassDetail4));
        System.assert(moveDamageClassDetail4.equals(moveDamageClassDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDamageClassDetail moveDamageClassDetail1 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail2 = new OASMoveDamageClassDetail();

        System.assertEquals(false, moveDamageClassDetail1.equals('foo'));
        System.assertEquals(false, moveDamageClassDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDamageClassDetail moveDamageClassDetail1 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail2 = new OASMoveDamageClassDetail();
        OASMoveDamageClassDetail moveDamageClassDetail3;

        System.assertEquals(false, moveDamageClassDetail1.equals(moveDamageClassDetail3));
        System.assertEquals(false, moveDamageClassDetail2.equals(moveDamageClassDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDamageClassDetail moveDamageClassDetail1 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail2 = new OASMoveDamageClassDetail();

        System.assertEquals(moveDamageClassDetail1.hashCode(), moveDamageClassDetail1.hashCode());
        System.assertEquals(moveDamageClassDetail2.hashCode(), moveDamageClassDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDamageClassDetail moveDamageClassDetail1 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail2 = OASMoveDamageClassDetail.getExample();
        OASMoveDamageClassDetail moveDamageClassDetail3 = new OASMoveDamageClassDetail();
        OASMoveDamageClassDetail moveDamageClassDetail4 = new OASMoveDamageClassDetail();

        System.assert(moveDamageClassDetail1.equals(moveDamageClassDetail2));
        System.assert(moveDamageClassDetail3.equals(moveDamageClassDetail4));
        System.assertEquals(moveDamageClassDetail1.hashCode(), moveDamageClassDetail2.hashCode());
        System.assertEquals(moveDamageClassDetail3.hashCode(), moveDamageClassDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveDamageClassDetail moveDamageClassDetail = new OASMoveDamageClassDetail();
        System.assertEquals(new List<OASMoveDamageClassDescription>(), moveDamageClassDetail.descriptions);
        System.assertEquals(new List<OASMoveSummary>(), moveDamageClassDetail.moves);
        System.assertEquals(new List<OASMoveDamageClassName>(), moveDamageClassDetail.names);
        System.assertEquals(null, moveDamageClassDetail.id);
        System.assertEquals(null, moveDamageClassDetail.name);
    }
}
