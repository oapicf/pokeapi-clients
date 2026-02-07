@isTest
private class OASPaginatedMoveDamageClassSummaryLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList1 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList2 = paginatedMoveDamageClassSummaryList1;
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList3 = new OASPaginatedMoveDamageClassSummaryLi();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList4 = paginatedMoveDamageClassSummaryList3;

        System.assert(paginatedMoveDamageClassSummaryList1.equals(paginatedMoveDamageClassSummaryList2));
        System.assert(paginatedMoveDamageClassSummaryList2.equals(paginatedMoveDamageClassSummaryList1));
        System.assert(paginatedMoveDamageClassSummaryList1.equals(paginatedMoveDamageClassSummaryList1));
        System.assert(paginatedMoveDamageClassSummaryList3.equals(paginatedMoveDamageClassSummaryList4));
        System.assert(paginatedMoveDamageClassSummaryList4.equals(paginatedMoveDamageClassSummaryList3));
        System.assert(paginatedMoveDamageClassSummaryList3.equals(paginatedMoveDamageClassSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList1 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList2 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList3 = new OASPaginatedMoveDamageClassSummaryLi();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList4 = new OASPaginatedMoveDamageClassSummaryLi();

        System.assert(paginatedMoveDamageClassSummaryList1.equals(paginatedMoveDamageClassSummaryList2));
        System.assert(paginatedMoveDamageClassSummaryList2.equals(paginatedMoveDamageClassSummaryList1));
        System.assert(paginatedMoveDamageClassSummaryList3.equals(paginatedMoveDamageClassSummaryList4));
        System.assert(paginatedMoveDamageClassSummaryList4.equals(paginatedMoveDamageClassSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList1 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList2 = new OASPaginatedMoveDamageClassSummaryLi();

        System.assertEquals(false, paginatedMoveDamageClassSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMoveDamageClassSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList1 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList2 = new OASPaginatedMoveDamageClassSummaryLi();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList3;

        System.assertEquals(false, paginatedMoveDamageClassSummaryList1.equals(paginatedMoveDamageClassSummaryList3));
        System.assertEquals(false, paginatedMoveDamageClassSummaryList2.equals(paginatedMoveDamageClassSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList1 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList2 = new OASPaginatedMoveDamageClassSummaryLi();

        System.assertEquals(paginatedMoveDamageClassSummaryList1.hashCode(), paginatedMoveDamageClassSummaryList1.hashCode());
        System.assertEquals(paginatedMoveDamageClassSummaryList2.hashCode(), paginatedMoveDamageClassSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList1 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList2 = OASPaginatedMoveDamageClassSummaryLi.getExample();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList3 = new OASPaginatedMoveDamageClassSummaryLi();
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList4 = new OASPaginatedMoveDamageClassSummaryLi();

        System.assert(paginatedMoveDamageClassSummaryList1.equals(paginatedMoveDamageClassSummaryList2));
        System.assert(paginatedMoveDamageClassSummaryList3.equals(paginatedMoveDamageClassSummaryList4));
        System.assertEquals(paginatedMoveDamageClassSummaryList1.hashCode(), paginatedMoveDamageClassSummaryList2.hashCode());
        System.assertEquals(paginatedMoveDamageClassSummaryList3.hashCode(), paginatedMoveDamageClassSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMoveDamageClassSummaryLi paginatedMoveDamageClassSummaryList = new OASPaginatedMoveDamageClassSummaryLi();
        System.assertEquals(new List<OASMoveDamageClassSummary>(), paginatedMoveDamageClassSummaryList.results);
        System.assertEquals(null, paginatedMoveDamageClassSummaryList.count);
        System.assertEquals(null, paginatedMoveDamageClassSummaryList.next);
        System.assertEquals(null, paginatedMoveDamageClassSummaryList.previous);
    }
}
