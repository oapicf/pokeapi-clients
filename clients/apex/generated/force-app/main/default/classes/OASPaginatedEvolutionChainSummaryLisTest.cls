@isTest
private class OASPaginatedEvolutionChainSummaryLisTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList1 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList2 = paginatedEvolutionChainSummaryList1;
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList3 = new OASPaginatedEvolutionChainSummaryLis();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList4 = paginatedEvolutionChainSummaryList3;

        System.assert(paginatedEvolutionChainSummaryList1.equals(paginatedEvolutionChainSummaryList2));
        System.assert(paginatedEvolutionChainSummaryList2.equals(paginatedEvolutionChainSummaryList1));
        System.assert(paginatedEvolutionChainSummaryList1.equals(paginatedEvolutionChainSummaryList1));
        System.assert(paginatedEvolutionChainSummaryList3.equals(paginatedEvolutionChainSummaryList4));
        System.assert(paginatedEvolutionChainSummaryList4.equals(paginatedEvolutionChainSummaryList3));
        System.assert(paginatedEvolutionChainSummaryList3.equals(paginatedEvolutionChainSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList1 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList2 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList3 = new OASPaginatedEvolutionChainSummaryLis();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList4 = new OASPaginatedEvolutionChainSummaryLis();

        System.assert(paginatedEvolutionChainSummaryList1.equals(paginatedEvolutionChainSummaryList2));
        System.assert(paginatedEvolutionChainSummaryList2.equals(paginatedEvolutionChainSummaryList1));
        System.assert(paginatedEvolutionChainSummaryList3.equals(paginatedEvolutionChainSummaryList4));
        System.assert(paginatedEvolutionChainSummaryList4.equals(paginatedEvolutionChainSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList1 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList2 = new OASPaginatedEvolutionChainSummaryLis();

        System.assertEquals(false, paginatedEvolutionChainSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedEvolutionChainSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList1 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList2 = new OASPaginatedEvolutionChainSummaryLis();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList3;

        System.assertEquals(false, paginatedEvolutionChainSummaryList1.equals(paginatedEvolutionChainSummaryList3));
        System.assertEquals(false, paginatedEvolutionChainSummaryList2.equals(paginatedEvolutionChainSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList1 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList2 = new OASPaginatedEvolutionChainSummaryLis();

        System.assertEquals(paginatedEvolutionChainSummaryList1.hashCode(), paginatedEvolutionChainSummaryList1.hashCode());
        System.assertEquals(paginatedEvolutionChainSummaryList2.hashCode(), paginatedEvolutionChainSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList1 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList2 = OASPaginatedEvolutionChainSummaryLis.getExample();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList3 = new OASPaginatedEvolutionChainSummaryLis();
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList4 = new OASPaginatedEvolutionChainSummaryLis();

        System.assert(paginatedEvolutionChainSummaryList1.equals(paginatedEvolutionChainSummaryList2));
        System.assert(paginatedEvolutionChainSummaryList3.equals(paginatedEvolutionChainSummaryList4));
        System.assertEquals(paginatedEvolutionChainSummaryList1.hashCode(), paginatedEvolutionChainSummaryList2.hashCode());
        System.assertEquals(paginatedEvolutionChainSummaryList3.hashCode(), paginatedEvolutionChainSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedEvolutionChainSummaryLis paginatedEvolutionChainSummaryList = new OASPaginatedEvolutionChainSummaryLis();
        System.assertEquals(new List<OASEvolutionChainSummary>(), paginatedEvolutionChainSummaryList.results);
        System.assertEquals(null, paginatedEvolutionChainSummaryList.count);
        System.assertEquals(null, paginatedEvolutionChainSummaryList.next);
        System.assertEquals(null, paginatedEvolutionChainSummaryList.previous);
    }
}
