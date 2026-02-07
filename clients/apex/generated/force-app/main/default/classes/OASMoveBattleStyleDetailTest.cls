@isTest
private class OASMoveBattleStyleDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveBattleStyleDetail moveBattleStyleDetail1 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail2 = moveBattleStyleDetail1;
        OASMoveBattleStyleDetail moveBattleStyleDetail3 = new OASMoveBattleStyleDetail();
        OASMoveBattleStyleDetail moveBattleStyleDetail4 = moveBattleStyleDetail3;

        System.assert(moveBattleStyleDetail1.equals(moveBattleStyleDetail2));
        System.assert(moveBattleStyleDetail2.equals(moveBattleStyleDetail1));
        System.assert(moveBattleStyleDetail1.equals(moveBattleStyleDetail1));
        System.assert(moveBattleStyleDetail3.equals(moveBattleStyleDetail4));
        System.assert(moveBattleStyleDetail4.equals(moveBattleStyleDetail3));
        System.assert(moveBattleStyleDetail3.equals(moveBattleStyleDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveBattleStyleDetail moveBattleStyleDetail1 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail2 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail3 = new OASMoveBattleStyleDetail();
        OASMoveBattleStyleDetail moveBattleStyleDetail4 = new OASMoveBattleStyleDetail();

        System.assert(moveBattleStyleDetail1.equals(moveBattleStyleDetail2));
        System.assert(moveBattleStyleDetail2.equals(moveBattleStyleDetail1));
        System.assert(moveBattleStyleDetail3.equals(moveBattleStyleDetail4));
        System.assert(moveBattleStyleDetail4.equals(moveBattleStyleDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveBattleStyleDetail moveBattleStyleDetail1 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail2 = new OASMoveBattleStyleDetail();

        System.assertEquals(false, moveBattleStyleDetail1.equals('foo'));
        System.assertEquals(false, moveBattleStyleDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveBattleStyleDetail moveBattleStyleDetail1 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail2 = new OASMoveBattleStyleDetail();
        OASMoveBattleStyleDetail moveBattleStyleDetail3;

        System.assertEquals(false, moveBattleStyleDetail1.equals(moveBattleStyleDetail3));
        System.assertEquals(false, moveBattleStyleDetail2.equals(moveBattleStyleDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveBattleStyleDetail moveBattleStyleDetail1 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail2 = new OASMoveBattleStyleDetail();

        System.assertEquals(moveBattleStyleDetail1.hashCode(), moveBattleStyleDetail1.hashCode());
        System.assertEquals(moveBattleStyleDetail2.hashCode(), moveBattleStyleDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveBattleStyleDetail moveBattleStyleDetail1 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail2 = OASMoveBattleStyleDetail.getExample();
        OASMoveBattleStyleDetail moveBattleStyleDetail3 = new OASMoveBattleStyleDetail();
        OASMoveBattleStyleDetail moveBattleStyleDetail4 = new OASMoveBattleStyleDetail();

        System.assert(moveBattleStyleDetail1.equals(moveBattleStyleDetail2));
        System.assert(moveBattleStyleDetail3.equals(moveBattleStyleDetail4));
        System.assertEquals(moveBattleStyleDetail1.hashCode(), moveBattleStyleDetail2.hashCode());
        System.assertEquals(moveBattleStyleDetail3.hashCode(), moveBattleStyleDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveBattleStyleDetail moveBattleStyleDetail = new OASMoveBattleStyleDetail();
        System.assertEquals(new List<OASMoveBattleStyleName>(), moveBattleStyleDetail.names);
        System.assertEquals(null, moveBattleStyleDetail.id);
        System.assertEquals(null, moveBattleStyleDetail.name);
    }
}
