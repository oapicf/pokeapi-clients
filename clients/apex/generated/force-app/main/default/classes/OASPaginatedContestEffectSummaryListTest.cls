@isTest
private class OASPaginatedContestEffectSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList1 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList2 = paginatedContestEffectSummaryList1;
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList3 = new OASPaginatedContestEffectSummaryList();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList4 = paginatedContestEffectSummaryList3;

        System.assert(paginatedContestEffectSummaryList1.equals(paginatedContestEffectSummaryList2));
        System.assert(paginatedContestEffectSummaryList2.equals(paginatedContestEffectSummaryList1));
        System.assert(paginatedContestEffectSummaryList1.equals(paginatedContestEffectSummaryList1));
        System.assert(paginatedContestEffectSummaryList3.equals(paginatedContestEffectSummaryList4));
        System.assert(paginatedContestEffectSummaryList4.equals(paginatedContestEffectSummaryList3));
        System.assert(paginatedContestEffectSummaryList3.equals(paginatedContestEffectSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList1 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList2 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList3 = new OASPaginatedContestEffectSummaryList();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList4 = new OASPaginatedContestEffectSummaryList();

        System.assert(paginatedContestEffectSummaryList1.equals(paginatedContestEffectSummaryList2));
        System.assert(paginatedContestEffectSummaryList2.equals(paginatedContestEffectSummaryList1));
        System.assert(paginatedContestEffectSummaryList3.equals(paginatedContestEffectSummaryList4));
        System.assert(paginatedContestEffectSummaryList4.equals(paginatedContestEffectSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList1 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList2 = new OASPaginatedContestEffectSummaryList();

        System.assertEquals(false, paginatedContestEffectSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedContestEffectSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList1 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList2 = new OASPaginatedContestEffectSummaryList();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList3;

        System.assertEquals(false, paginatedContestEffectSummaryList1.equals(paginatedContestEffectSummaryList3));
        System.assertEquals(false, paginatedContestEffectSummaryList2.equals(paginatedContestEffectSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList1 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList2 = new OASPaginatedContestEffectSummaryList();

        System.assertEquals(paginatedContestEffectSummaryList1.hashCode(), paginatedContestEffectSummaryList1.hashCode());
        System.assertEquals(paginatedContestEffectSummaryList2.hashCode(), paginatedContestEffectSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList1 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList2 = OASPaginatedContestEffectSummaryList.getExample();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList3 = new OASPaginatedContestEffectSummaryList();
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList4 = new OASPaginatedContestEffectSummaryList();

        System.assert(paginatedContestEffectSummaryList1.equals(paginatedContestEffectSummaryList2));
        System.assert(paginatedContestEffectSummaryList3.equals(paginatedContestEffectSummaryList4));
        System.assertEquals(paginatedContestEffectSummaryList1.hashCode(), paginatedContestEffectSummaryList2.hashCode());
        System.assertEquals(paginatedContestEffectSummaryList3.hashCode(), paginatedContestEffectSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedContestEffectSummaryList paginatedContestEffectSummaryList = new OASPaginatedContestEffectSummaryList();
        System.assertEquals(new List<OASContestEffectSummary>(), paginatedContestEffectSummaryList.results);
        System.assertEquals(null, paginatedContestEffectSummaryList.count);
        System.assertEquals(null, paginatedContestEffectSummaryList.next);
        System.assertEquals(null, paginatedContestEffectSummaryList.previous);
    }
}
