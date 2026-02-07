@isTest
private class OASMoveBattleStyleNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveBattleStyleName moveBattleStyleName1 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName2 = moveBattleStyleName1;
        OASMoveBattleStyleName moveBattleStyleName3 = new OASMoveBattleStyleName();
        OASMoveBattleStyleName moveBattleStyleName4 = moveBattleStyleName3;

        System.assert(moveBattleStyleName1.equals(moveBattleStyleName2));
        System.assert(moveBattleStyleName2.equals(moveBattleStyleName1));
        System.assert(moveBattleStyleName1.equals(moveBattleStyleName1));
        System.assert(moveBattleStyleName3.equals(moveBattleStyleName4));
        System.assert(moveBattleStyleName4.equals(moveBattleStyleName3));
        System.assert(moveBattleStyleName3.equals(moveBattleStyleName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveBattleStyleName moveBattleStyleName1 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName2 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName3 = new OASMoveBattleStyleName();
        OASMoveBattleStyleName moveBattleStyleName4 = new OASMoveBattleStyleName();

        System.assert(moveBattleStyleName1.equals(moveBattleStyleName2));
        System.assert(moveBattleStyleName2.equals(moveBattleStyleName1));
        System.assert(moveBattleStyleName3.equals(moveBattleStyleName4));
        System.assert(moveBattleStyleName4.equals(moveBattleStyleName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveBattleStyleName moveBattleStyleName1 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName2 = new OASMoveBattleStyleName();

        System.assertEquals(false, moveBattleStyleName1.equals('foo'));
        System.assertEquals(false, moveBattleStyleName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveBattleStyleName moveBattleStyleName1 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName2 = new OASMoveBattleStyleName();
        OASMoveBattleStyleName moveBattleStyleName3;

        System.assertEquals(false, moveBattleStyleName1.equals(moveBattleStyleName3));
        System.assertEquals(false, moveBattleStyleName2.equals(moveBattleStyleName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveBattleStyleName moveBattleStyleName1 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName2 = new OASMoveBattleStyleName();

        System.assertEquals(moveBattleStyleName1.hashCode(), moveBattleStyleName1.hashCode());
        System.assertEquals(moveBattleStyleName2.hashCode(), moveBattleStyleName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveBattleStyleName moveBattleStyleName1 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName2 = OASMoveBattleStyleName.getExample();
        OASMoveBattleStyleName moveBattleStyleName3 = new OASMoveBattleStyleName();
        OASMoveBattleStyleName moveBattleStyleName4 = new OASMoveBattleStyleName();

        System.assert(moveBattleStyleName1.equals(moveBattleStyleName2));
        System.assert(moveBattleStyleName3.equals(moveBattleStyleName4));
        System.assertEquals(moveBattleStyleName1.hashCode(), moveBattleStyleName2.hashCode());
        System.assertEquals(moveBattleStyleName3.hashCode(), moveBattleStyleName4.hashCode());
    }
}
