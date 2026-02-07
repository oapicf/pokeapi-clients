@isTest
private class OASPaginatedItemFlingEffectSummaryLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList1 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList2 = paginatedItemFlingEffectSummaryList1;
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList3 = new OASPaginatedItemFlingEffectSummaryLi();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList4 = paginatedItemFlingEffectSummaryList3;

        System.assert(paginatedItemFlingEffectSummaryList1.equals(paginatedItemFlingEffectSummaryList2));
        System.assert(paginatedItemFlingEffectSummaryList2.equals(paginatedItemFlingEffectSummaryList1));
        System.assert(paginatedItemFlingEffectSummaryList1.equals(paginatedItemFlingEffectSummaryList1));
        System.assert(paginatedItemFlingEffectSummaryList3.equals(paginatedItemFlingEffectSummaryList4));
        System.assert(paginatedItemFlingEffectSummaryList4.equals(paginatedItemFlingEffectSummaryList3));
        System.assert(paginatedItemFlingEffectSummaryList3.equals(paginatedItemFlingEffectSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList1 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList2 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList3 = new OASPaginatedItemFlingEffectSummaryLi();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList4 = new OASPaginatedItemFlingEffectSummaryLi();

        System.assert(paginatedItemFlingEffectSummaryList1.equals(paginatedItemFlingEffectSummaryList2));
        System.assert(paginatedItemFlingEffectSummaryList2.equals(paginatedItemFlingEffectSummaryList1));
        System.assert(paginatedItemFlingEffectSummaryList3.equals(paginatedItemFlingEffectSummaryList4));
        System.assert(paginatedItemFlingEffectSummaryList4.equals(paginatedItemFlingEffectSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList1 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList2 = new OASPaginatedItemFlingEffectSummaryLi();

        System.assertEquals(false, paginatedItemFlingEffectSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedItemFlingEffectSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList1 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList2 = new OASPaginatedItemFlingEffectSummaryLi();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList3;

        System.assertEquals(false, paginatedItemFlingEffectSummaryList1.equals(paginatedItemFlingEffectSummaryList3));
        System.assertEquals(false, paginatedItemFlingEffectSummaryList2.equals(paginatedItemFlingEffectSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList1 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList2 = new OASPaginatedItemFlingEffectSummaryLi();

        System.assertEquals(paginatedItemFlingEffectSummaryList1.hashCode(), paginatedItemFlingEffectSummaryList1.hashCode());
        System.assertEquals(paginatedItemFlingEffectSummaryList2.hashCode(), paginatedItemFlingEffectSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList1 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList2 = OASPaginatedItemFlingEffectSummaryLi.getExample();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList3 = new OASPaginatedItemFlingEffectSummaryLi();
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList4 = new OASPaginatedItemFlingEffectSummaryLi();

        System.assert(paginatedItemFlingEffectSummaryList1.equals(paginatedItemFlingEffectSummaryList2));
        System.assert(paginatedItemFlingEffectSummaryList3.equals(paginatedItemFlingEffectSummaryList4));
        System.assertEquals(paginatedItemFlingEffectSummaryList1.hashCode(), paginatedItemFlingEffectSummaryList2.hashCode());
        System.assertEquals(paginatedItemFlingEffectSummaryList3.hashCode(), paginatedItemFlingEffectSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedItemFlingEffectSummaryLi paginatedItemFlingEffectSummaryList = new OASPaginatedItemFlingEffectSummaryLi();
        System.assertEquals(new List<OASItemFlingEffectSummary>(), paginatedItemFlingEffectSummaryList.results);
        System.assertEquals(null, paginatedItemFlingEffectSummaryList.count);
        System.assertEquals(null, paginatedItemFlingEffectSummaryList.next);
        System.assertEquals(null, paginatedItemFlingEffectSummaryList.previous);
    }
}
