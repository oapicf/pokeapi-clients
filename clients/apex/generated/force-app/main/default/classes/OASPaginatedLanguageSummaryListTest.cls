@isTest
private class OASPaginatedLanguageSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList1 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList2 = paginatedLanguageSummaryList1;
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList3 = new OASPaginatedLanguageSummaryList();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList4 = paginatedLanguageSummaryList3;

        System.assert(paginatedLanguageSummaryList1.equals(paginatedLanguageSummaryList2));
        System.assert(paginatedLanguageSummaryList2.equals(paginatedLanguageSummaryList1));
        System.assert(paginatedLanguageSummaryList1.equals(paginatedLanguageSummaryList1));
        System.assert(paginatedLanguageSummaryList3.equals(paginatedLanguageSummaryList4));
        System.assert(paginatedLanguageSummaryList4.equals(paginatedLanguageSummaryList3));
        System.assert(paginatedLanguageSummaryList3.equals(paginatedLanguageSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList1 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList2 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList3 = new OASPaginatedLanguageSummaryList();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList4 = new OASPaginatedLanguageSummaryList();

        System.assert(paginatedLanguageSummaryList1.equals(paginatedLanguageSummaryList2));
        System.assert(paginatedLanguageSummaryList2.equals(paginatedLanguageSummaryList1));
        System.assert(paginatedLanguageSummaryList3.equals(paginatedLanguageSummaryList4));
        System.assert(paginatedLanguageSummaryList4.equals(paginatedLanguageSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList1 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList2 = new OASPaginatedLanguageSummaryList();

        System.assertEquals(false, paginatedLanguageSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedLanguageSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList1 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList2 = new OASPaginatedLanguageSummaryList();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList3;

        System.assertEquals(false, paginatedLanguageSummaryList1.equals(paginatedLanguageSummaryList3));
        System.assertEquals(false, paginatedLanguageSummaryList2.equals(paginatedLanguageSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList1 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList2 = new OASPaginatedLanguageSummaryList();

        System.assertEquals(paginatedLanguageSummaryList1.hashCode(), paginatedLanguageSummaryList1.hashCode());
        System.assertEquals(paginatedLanguageSummaryList2.hashCode(), paginatedLanguageSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList1 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList2 = OASPaginatedLanguageSummaryList.getExample();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList3 = new OASPaginatedLanguageSummaryList();
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList4 = new OASPaginatedLanguageSummaryList();

        System.assert(paginatedLanguageSummaryList1.equals(paginatedLanguageSummaryList2));
        System.assert(paginatedLanguageSummaryList3.equals(paginatedLanguageSummaryList4));
        System.assertEquals(paginatedLanguageSummaryList1.hashCode(), paginatedLanguageSummaryList2.hashCode());
        System.assertEquals(paginatedLanguageSummaryList3.hashCode(), paginatedLanguageSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedLanguageSummaryList paginatedLanguageSummaryList = new OASPaginatedLanguageSummaryList();
        System.assertEquals(new List<OASLanguageSummary>(), paginatedLanguageSummaryList.results);
        System.assertEquals(null, paginatedLanguageSummaryList.count);
        System.assertEquals(null, paginatedLanguageSummaryList.next);
        System.assertEquals(null, paginatedLanguageSummaryList.previous);
    }
}
