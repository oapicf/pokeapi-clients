@isTest
private class OASStatDetailAffectingMovesIncreaseITest {
    @isTest
    private static void equalsSameInstance() {
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner1 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner2 = statDetailAffectingMovesIncreaseInner1;
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner3 = new OASStatDetailAffectingMovesIncreaseI();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner4 = statDetailAffectingMovesIncreaseInner3;

        System.assert(statDetailAffectingMovesIncreaseInner1.equals(statDetailAffectingMovesIncreaseInner2));
        System.assert(statDetailAffectingMovesIncreaseInner2.equals(statDetailAffectingMovesIncreaseInner1));
        System.assert(statDetailAffectingMovesIncreaseInner1.equals(statDetailAffectingMovesIncreaseInner1));
        System.assert(statDetailAffectingMovesIncreaseInner3.equals(statDetailAffectingMovesIncreaseInner4));
        System.assert(statDetailAffectingMovesIncreaseInner4.equals(statDetailAffectingMovesIncreaseInner3));
        System.assert(statDetailAffectingMovesIncreaseInner3.equals(statDetailAffectingMovesIncreaseInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner1 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner2 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner3 = new OASStatDetailAffectingMovesIncreaseI();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner4 = new OASStatDetailAffectingMovesIncreaseI();

        System.assert(statDetailAffectingMovesIncreaseInner1.equals(statDetailAffectingMovesIncreaseInner2));
        System.assert(statDetailAffectingMovesIncreaseInner2.equals(statDetailAffectingMovesIncreaseInner1));
        System.assert(statDetailAffectingMovesIncreaseInner3.equals(statDetailAffectingMovesIncreaseInner4));
        System.assert(statDetailAffectingMovesIncreaseInner4.equals(statDetailAffectingMovesIncreaseInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner1 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner2 = new OASStatDetailAffectingMovesIncreaseI();

        System.assertEquals(false, statDetailAffectingMovesIncreaseInner1.equals('foo'));
        System.assertEquals(false, statDetailAffectingMovesIncreaseInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner1 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner2 = new OASStatDetailAffectingMovesIncreaseI();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner3;

        System.assertEquals(false, statDetailAffectingMovesIncreaseInner1.equals(statDetailAffectingMovesIncreaseInner3));
        System.assertEquals(false, statDetailAffectingMovesIncreaseInner2.equals(statDetailAffectingMovesIncreaseInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner1 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner2 = new OASStatDetailAffectingMovesIncreaseI();

        System.assertEquals(statDetailAffectingMovesIncreaseInner1.hashCode(), statDetailAffectingMovesIncreaseInner1.hashCode());
        System.assertEquals(statDetailAffectingMovesIncreaseInner2.hashCode(), statDetailAffectingMovesIncreaseInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner1 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner2 = OASStatDetailAffectingMovesIncreaseI.getExample();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner3 = new OASStatDetailAffectingMovesIncreaseI();
        OASStatDetailAffectingMovesIncreaseI statDetailAffectingMovesIncreaseInner4 = new OASStatDetailAffectingMovesIncreaseI();

        System.assert(statDetailAffectingMovesIncreaseInner1.equals(statDetailAffectingMovesIncreaseInner2));
        System.assert(statDetailAffectingMovesIncreaseInner3.equals(statDetailAffectingMovesIncreaseInner4));
        System.assertEquals(statDetailAffectingMovesIncreaseInner1.hashCode(), statDetailAffectingMovesIncreaseInner2.hashCode());
        System.assertEquals(statDetailAffectingMovesIncreaseInner3.hashCode(), statDetailAffectingMovesIncreaseInner4.hashCode());
    }
}
