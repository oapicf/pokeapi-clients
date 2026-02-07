@isTest
private class OASPaginatedSuperContestEffectSummarTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList1 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList2 = paginatedSuperContestEffectSummaryList1;
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList3 = new OASPaginatedSuperContestEffectSummar();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList4 = paginatedSuperContestEffectSummaryList3;

        System.assert(paginatedSuperContestEffectSummaryList1.equals(paginatedSuperContestEffectSummaryList2));
        System.assert(paginatedSuperContestEffectSummaryList2.equals(paginatedSuperContestEffectSummaryList1));
        System.assert(paginatedSuperContestEffectSummaryList1.equals(paginatedSuperContestEffectSummaryList1));
        System.assert(paginatedSuperContestEffectSummaryList3.equals(paginatedSuperContestEffectSummaryList4));
        System.assert(paginatedSuperContestEffectSummaryList4.equals(paginatedSuperContestEffectSummaryList3));
        System.assert(paginatedSuperContestEffectSummaryList3.equals(paginatedSuperContestEffectSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList1 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList2 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList3 = new OASPaginatedSuperContestEffectSummar();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList4 = new OASPaginatedSuperContestEffectSummar();

        System.assert(paginatedSuperContestEffectSummaryList1.equals(paginatedSuperContestEffectSummaryList2));
        System.assert(paginatedSuperContestEffectSummaryList2.equals(paginatedSuperContestEffectSummaryList1));
        System.assert(paginatedSuperContestEffectSummaryList3.equals(paginatedSuperContestEffectSummaryList4));
        System.assert(paginatedSuperContestEffectSummaryList4.equals(paginatedSuperContestEffectSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList1 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList2 = new OASPaginatedSuperContestEffectSummar();

        System.assertEquals(false, paginatedSuperContestEffectSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedSuperContestEffectSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList1 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList2 = new OASPaginatedSuperContestEffectSummar();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList3;

        System.assertEquals(false, paginatedSuperContestEffectSummaryList1.equals(paginatedSuperContestEffectSummaryList3));
        System.assertEquals(false, paginatedSuperContestEffectSummaryList2.equals(paginatedSuperContestEffectSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList1 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList2 = new OASPaginatedSuperContestEffectSummar();

        System.assertEquals(paginatedSuperContestEffectSummaryList1.hashCode(), paginatedSuperContestEffectSummaryList1.hashCode());
        System.assertEquals(paginatedSuperContestEffectSummaryList2.hashCode(), paginatedSuperContestEffectSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList1 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList2 = OASPaginatedSuperContestEffectSummar.getExample();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList3 = new OASPaginatedSuperContestEffectSummar();
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList4 = new OASPaginatedSuperContestEffectSummar();

        System.assert(paginatedSuperContestEffectSummaryList1.equals(paginatedSuperContestEffectSummaryList2));
        System.assert(paginatedSuperContestEffectSummaryList3.equals(paginatedSuperContestEffectSummaryList4));
        System.assertEquals(paginatedSuperContestEffectSummaryList1.hashCode(), paginatedSuperContestEffectSummaryList2.hashCode());
        System.assertEquals(paginatedSuperContestEffectSummaryList3.hashCode(), paginatedSuperContestEffectSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedSuperContestEffectSummar paginatedSuperContestEffectSummaryList = new OASPaginatedSuperContestEffectSummar();
        System.assertEquals(new List<OASSuperContestEffectSummary>(), paginatedSuperContestEffectSummaryList.results);
        System.assertEquals(null, paginatedSuperContestEffectSummaryList.count);
        System.assertEquals(null, paginatedSuperContestEffectSummaryList.next);
        System.assertEquals(null, paginatedSuperContestEffectSummaryList.previous);
    }
}
