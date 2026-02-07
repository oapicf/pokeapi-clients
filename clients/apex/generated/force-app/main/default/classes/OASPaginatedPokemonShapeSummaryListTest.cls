@isTest
private class OASPaginatedPokemonShapeSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList1 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList2 = paginatedPokemonShapeSummaryList1;
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList3 = new OASPaginatedPokemonShapeSummaryList();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList4 = paginatedPokemonShapeSummaryList3;

        System.assert(paginatedPokemonShapeSummaryList1.equals(paginatedPokemonShapeSummaryList2));
        System.assert(paginatedPokemonShapeSummaryList2.equals(paginatedPokemonShapeSummaryList1));
        System.assert(paginatedPokemonShapeSummaryList1.equals(paginatedPokemonShapeSummaryList1));
        System.assert(paginatedPokemonShapeSummaryList3.equals(paginatedPokemonShapeSummaryList4));
        System.assert(paginatedPokemonShapeSummaryList4.equals(paginatedPokemonShapeSummaryList3));
        System.assert(paginatedPokemonShapeSummaryList3.equals(paginatedPokemonShapeSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList1 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList2 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList3 = new OASPaginatedPokemonShapeSummaryList();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList4 = new OASPaginatedPokemonShapeSummaryList();

        System.assert(paginatedPokemonShapeSummaryList1.equals(paginatedPokemonShapeSummaryList2));
        System.assert(paginatedPokemonShapeSummaryList2.equals(paginatedPokemonShapeSummaryList1));
        System.assert(paginatedPokemonShapeSummaryList3.equals(paginatedPokemonShapeSummaryList4));
        System.assert(paginatedPokemonShapeSummaryList4.equals(paginatedPokemonShapeSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList1 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList2 = new OASPaginatedPokemonShapeSummaryList();

        System.assertEquals(false, paginatedPokemonShapeSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokemonShapeSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList1 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList2 = new OASPaginatedPokemonShapeSummaryList();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList3;

        System.assertEquals(false, paginatedPokemonShapeSummaryList1.equals(paginatedPokemonShapeSummaryList3));
        System.assertEquals(false, paginatedPokemonShapeSummaryList2.equals(paginatedPokemonShapeSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList1 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList2 = new OASPaginatedPokemonShapeSummaryList();

        System.assertEquals(paginatedPokemonShapeSummaryList1.hashCode(), paginatedPokemonShapeSummaryList1.hashCode());
        System.assertEquals(paginatedPokemonShapeSummaryList2.hashCode(), paginatedPokemonShapeSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList1 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList2 = OASPaginatedPokemonShapeSummaryList.getExample();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList3 = new OASPaginatedPokemonShapeSummaryList();
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList4 = new OASPaginatedPokemonShapeSummaryList();

        System.assert(paginatedPokemonShapeSummaryList1.equals(paginatedPokemonShapeSummaryList2));
        System.assert(paginatedPokemonShapeSummaryList3.equals(paginatedPokemonShapeSummaryList4));
        System.assertEquals(paginatedPokemonShapeSummaryList1.hashCode(), paginatedPokemonShapeSummaryList2.hashCode());
        System.assertEquals(paginatedPokemonShapeSummaryList3.hashCode(), paginatedPokemonShapeSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokemonShapeSummaryList paginatedPokemonShapeSummaryList = new OASPaginatedPokemonShapeSummaryList();
        System.assertEquals(new List<OASPokemonShapeSummary>(), paginatedPokemonShapeSummaryList.results);
        System.assertEquals(null, paginatedPokemonShapeSummaryList.count);
        System.assertEquals(null, paginatedPokemonShapeSummaryList.next);
        System.assertEquals(null, paginatedPokemonShapeSummaryList.previous);
    }
}
