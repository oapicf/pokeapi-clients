@isTest
private class OASPaginatedMoveBattleStyleSummaryLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList1 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList2 = paginatedMoveBattleStyleSummaryList1;
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList3 = new OASPaginatedMoveBattleStyleSummaryLi();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList4 = paginatedMoveBattleStyleSummaryList3;

        System.assert(paginatedMoveBattleStyleSummaryList1.equals(paginatedMoveBattleStyleSummaryList2));
        System.assert(paginatedMoveBattleStyleSummaryList2.equals(paginatedMoveBattleStyleSummaryList1));
        System.assert(paginatedMoveBattleStyleSummaryList1.equals(paginatedMoveBattleStyleSummaryList1));
        System.assert(paginatedMoveBattleStyleSummaryList3.equals(paginatedMoveBattleStyleSummaryList4));
        System.assert(paginatedMoveBattleStyleSummaryList4.equals(paginatedMoveBattleStyleSummaryList3));
        System.assert(paginatedMoveBattleStyleSummaryList3.equals(paginatedMoveBattleStyleSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList1 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList2 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList3 = new OASPaginatedMoveBattleStyleSummaryLi();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList4 = new OASPaginatedMoveBattleStyleSummaryLi();

        System.assert(paginatedMoveBattleStyleSummaryList1.equals(paginatedMoveBattleStyleSummaryList2));
        System.assert(paginatedMoveBattleStyleSummaryList2.equals(paginatedMoveBattleStyleSummaryList1));
        System.assert(paginatedMoveBattleStyleSummaryList3.equals(paginatedMoveBattleStyleSummaryList4));
        System.assert(paginatedMoveBattleStyleSummaryList4.equals(paginatedMoveBattleStyleSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList1 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList2 = new OASPaginatedMoveBattleStyleSummaryLi();

        System.assertEquals(false, paginatedMoveBattleStyleSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMoveBattleStyleSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList1 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList2 = new OASPaginatedMoveBattleStyleSummaryLi();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList3;

        System.assertEquals(false, paginatedMoveBattleStyleSummaryList1.equals(paginatedMoveBattleStyleSummaryList3));
        System.assertEquals(false, paginatedMoveBattleStyleSummaryList2.equals(paginatedMoveBattleStyleSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList1 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList2 = new OASPaginatedMoveBattleStyleSummaryLi();

        System.assertEquals(paginatedMoveBattleStyleSummaryList1.hashCode(), paginatedMoveBattleStyleSummaryList1.hashCode());
        System.assertEquals(paginatedMoveBattleStyleSummaryList2.hashCode(), paginatedMoveBattleStyleSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList1 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList2 = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList3 = new OASPaginatedMoveBattleStyleSummaryLi();
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList4 = new OASPaginatedMoveBattleStyleSummaryLi();

        System.assert(paginatedMoveBattleStyleSummaryList1.equals(paginatedMoveBattleStyleSummaryList2));
        System.assert(paginatedMoveBattleStyleSummaryList3.equals(paginatedMoveBattleStyleSummaryList4));
        System.assertEquals(paginatedMoveBattleStyleSummaryList1.hashCode(), paginatedMoveBattleStyleSummaryList2.hashCode());
        System.assertEquals(paginatedMoveBattleStyleSummaryList3.hashCode(), paginatedMoveBattleStyleSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMoveBattleStyleSummaryLi paginatedMoveBattleStyleSummaryList = new OASPaginatedMoveBattleStyleSummaryLi();
        System.assertEquals(new List<OASMoveBattleStyleSummary>(), paginatedMoveBattleStyleSummaryList.results);
        System.assertEquals(null, paginatedMoveBattleStyleSummaryList.count);
        System.assertEquals(null, paginatedMoveBattleStyleSummaryList.next);
        System.assertEquals(null, paginatedMoveBattleStyleSummaryList.previous);
    }
}
