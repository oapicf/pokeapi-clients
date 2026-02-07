@isTest
private class OASGrowthRateSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASGrowthRateSummary growthRateSummary1 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary2 = growthRateSummary1;
        OASGrowthRateSummary growthRateSummary3 = new OASGrowthRateSummary();
        OASGrowthRateSummary growthRateSummary4 = growthRateSummary3;

        System.assert(growthRateSummary1.equals(growthRateSummary2));
        System.assert(growthRateSummary2.equals(growthRateSummary1));
        System.assert(growthRateSummary1.equals(growthRateSummary1));
        System.assert(growthRateSummary3.equals(growthRateSummary4));
        System.assert(growthRateSummary4.equals(growthRateSummary3));
        System.assert(growthRateSummary3.equals(growthRateSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGrowthRateSummary growthRateSummary1 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary2 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary3 = new OASGrowthRateSummary();
        OASGrowthRateSummary growthRateSummary4 = new OASGrowthRateSummary();

        System.assert(growthRateSummary1.equals(growthRateSummary2));
        System.assert(growthRateSummary2.equals(growthRateSummary1));
        System.assert(growthRateSummary3.equals(growthRateSummary4));
        System.assert(growthRateSummary4.equals(growthRateSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGrowthRateSummary growthRateSummary1 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary2 = new OASGrowthRateSummary();

        System.assertEquals(false, growthRateSummary1.equals('foo'));
        System.assertEquals(false, growthRateSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGrowthRateSummary growthRateSummary1 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary2 = new OASGrowthRateSummary();
        OASGrowthRateSummary growthRateSummary3;

        System.assertEquals(false, growthRateSummary1.equals(growthRateSummary3));
        System.assertEquals(false, growthRateSummary2.equals(growthRateSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGrowthRateSummary growthRateSummary1 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary2 = new OASGrowthRateSummary();

        System.assertEquals(growthRateSummary1.hashCode(), growthRateSummary1.hashCode());
        System.assertEquals(growthRateSummary2.hashCode(), growthRateSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGrowthRateSummary growthRateSummary1 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary2 = OASGrowthRateSummary.getExample();
        OASGrowthRateSummary growthRateSummary3 = new OASGrowthRateSummary();
        OASGrowthRateSummary growthRateSummary4 = new OASGrowthRateSummary();

        System.assert(growthRateSummary1.equals(growthRateSummary2));
        System.assert(growthRateSummary3.equals(growthRateSummary4));
        System.assertEquals(growthRateSummary1.hashCode(), growthRateSummary2.hashCode());
        System.assertEquals(growthRateSummary3.hashCode(), growthRateSummary4.hashCode());
    }
}
