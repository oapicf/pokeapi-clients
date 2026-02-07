@isTest
private class OASGrowthRateDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASGrowthRateDescription growthRateDescription1 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription2 = growthRateDescription1;
        OASGrowthRateDescription growthRateDescription3 = new OASGrowthRateDescription();
        OASGrowthRateDescription growthRateDescription4 = growthRateDescription3;

        System.assert(growthRateDescription1.equals(growthRateDescription2));
        System.assert(growthRateDescription2.equals(growthRateDescription1));
        System.assert(growthRateDescription1.equals(growthRateDescription1));
        System.assert(growthRateDescription3.equals(growthRateDescription4));
        System.assert(growthRateDescription4.equals(growthRateDescription3));
        System.assert(growthRateDescription3.equals(growthRateDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGrowthRateDescription growthRateDescription1 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription2 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription3 = new OASGrowthRateDescription();
        OASGrowthRateDescription growthRateDescription4 = new OASGrowthRateDescription();

        System.assert(growthRateDescription1.equals(growthRateDescription2));
        System.assert(growthRateDescription2.equals(growthRateDescription1));
        System.assert(growthRateDescription3.equals(growthRateDescription4));
        System.assert(growthRateDescription4.equals(growthRateDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGrowthRateDescription growthRateDescription1 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription2 = new OASGrowthRateDescription();

        System.assertEquals(false, growthRateDescription1.equals('foo'));
        System.assertEquals(false, growthRateDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGrowthRateDescription growthRateDescription1 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription2 = new OASGrowthRateDescription();
        OASGrowthRateDescription growthRateDescription3;

        System.assertEquals(false, growthRateDescription1.equals(growthRateDescription3));
        System.assertEquals(false, growthRateDescription2.equals(growthRateDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGrowthRateDescription growthRateDescription1 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription2 = new OASGrowthRateDescription();

        System.assertEquals(growthRateDescription1.hashCode(), growthRateDescription1.hashCode());
        System.assertEquals(growthRateDescription2.hashCode(), growthRateDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGrowthRateDescription growthRateDescription1 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription2 = OASGrowthRateDescription.getExample();
        OASGrowthRateDescription growthRateDescription3 = new OASGrowthRateDescription();
        OASGrowthRateDescription growthRateDescription4 = new OASGrowthRateDescription();

        System.assert(growthRateDescription1.equals(growthRateDescription2));
        System.assert(growthRateDescription3.equals(growthRateDescription4));
        System.assertEquals(growthRateDescription1.hashCode(), growthRateDescription2.hashCode());
        System.assertEquals(growthRateDescription3.hashCode(), growthRateDescription4.hashCode());
    }
}
