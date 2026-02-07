@isTest
private class OASPaginatedCharacteristicSummaryLisTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList1 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList2 = paginatedCharacteristicSummaryList1;
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList3 = new OASPaginatedCharacteristicSummaryLis();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList4 = paginatedCharacteristicSummaryList3;

        System.assert(paginatedCharacteristicSummaryList1.equals(paginatedCharacteristicSummaryList2));
        System.assert(paginatedCharacteristicSummaryList2.equals(paginatedCharacteristicSummaryList1));
        System.assert(paginatedCharacteristicSummaryList1.equals(paginatedCharacteristicSummaryList1));
        System.assert(paginatedCharacteristicSummaryList3.equals(paginatedCharacteristicSummaryList4));
        System.assert(paginatedCharacteristicSummaryList4.equals(paginatedCharacteristicSummaryList3));
        System.assert(paginatedCharacteristicSummaryList3.equals(paginatedCharacteristicSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList1 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList2 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList3 = new OASPaginatedCharacteristicSummaryLis();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList4 = new OASPaginatedCharacteristicSummaryLis();

        System.assert(paginatedCharacteristicSummaryList1.equals(paginatedCharacteristicSummaryList2));
        System.assert(paginatedCharacteristicSummaryList2.equals(paginatedCharacteristicSummaryList1));
        System.assert(paginatedCharacteristicSummaryList3.equals(paginatedCharacteristicSummaryList4));
        System.assert(paginatedCharacteristicSummaryList4.equals(paginatedCharacteristicSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList1 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList2 = new OASPaginatedCharacteristicSummaryLis();

        System.assertEquals(false, paginatedCharacteristicSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedCharacteristicSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList1 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList2 = new OASPaginatedCharacteristicSummaryLis();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList3;

        System.assertEquals(false, paginatedCharacteristicSummaryList1.equals(paginatedCharacteristicSummaryList3));
        System.assertEquals(false, paginatedCharacteristicSummaryList2.equals(paginatedCharacteristicSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList1 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList2 = new OASPaginatedCharacteristicSummaryLis();

        System.assertEquals(paginatedCharacteristicSummaryList1.hashCode(), paginatedCharacteristicSummaryList1.hashCode());
        System.assertEquals(paginatedCharacteristicSummaryList2.hashCode(), paginatedCharacteristicSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList1 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList2 = OASPaginatedCharacteristicSummaryLis.getExample();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList3 = new OASPaginatedCharacteristicSummaryLis();
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList4 = new OASPaginatedCharacteristicSummaryLis();

        System.assert(paginatedCharacteristicSummaryList1.equals(paginatedCharacteristicSummaryList2));
        System.assert(paginatedCharacteristicSummaryList3.equals(paginatedCharacteristicSummaryList4));
        System.assertEquals(paginatedCharacteristicSummaryList1.hashCode(), paginatedCharacteristicSummaryList2.hashCode());
        System.assertEquals(paginatedCharacteristicSummaryList3.hashCode(), paginatedCharacteristicSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedCharacteristicSummaryLis paginatedCharacteristicSummaryList = new OASPaginatedCharacteristicSummaryLis();
        System.assertEquals(new List<OASCharacteristicSummary>(), paginatedCharacteristicSummaryList.results);
        System.assertEquals(null, paginatedCharacteristicSummaryList.count);
        System.assertEquals(null, paginatedCharacteristicSummaryList.next);
        System.assertEquals(null, paginatedCharacteristicSummaryList.previous);
    }
}
