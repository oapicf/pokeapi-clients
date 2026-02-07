@isTest
private class OASSuperContestEffectDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuperContestEffectDetail superContestEffectDetail1 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail2 = superContestEffectDetail1;
        OASSuperContestEffectDetail superContestEffectDetail3 = new OASSuperContestEffectDetail();
        OASSuperContestEffectDetail superContestEffectDetail4 = superContestEffectDetail3;

        System.assert(superContestEffectDetail1.equals(superContestEffectDetail2));
        System.assert(superContestEffectDetail2.equals(superContestEffectDetail1));
        System.assert(superContestEffectDetail1.equals(superContestEffectDetail1));
        System.assert(superContestEffectDetail3.equals(superContestEffectDetail4));
        System.assert(superContestEffectDetail4.equals(superContestEffectDetail3));
        System.assert(superContestEffectDetail3.equals(superContestEffectDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuperContestEffectDetail superContestEffectDetail1 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail2 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail3 = new OASSuperContestEffectDetail();
        OASSuperContestEffectDetail superContestEffectDetail4 = new OASSuperContestEffectDetail();

        System.assert(superContestEffectDetail1.equals(superContestEffectDetail2));
        System.assert(superContestEffectDetail2.equals(superContestEffectDetail1));
        System.assert(superContestEffectDetail3.equals(superContestEffectDetail4));
        System.assert(superContestEffectDetail4.equals(superContestEffectDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuperContestEffectDetail superContestEffectDetail1 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail2 = new OASSuperContestEffectDetail();

        System.assertEquals(false, superContestEffectDetail1.equals('foo'));
        System.assertEquals(false, superContestEffectDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuperContestEffectDetail superContestEffectDetail1 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail2 = new OASSuperContestEffectDetail();
        OASSuperContestEffectDetail superContestEffectDetail3;

        System.assertEquals(false, superContestEffectDetail1.equals(superContestEffectDetail3));
        System.assertEquals(false, superContestEffectDetail2.equals(superContestEffectDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuperContestEffectDetail superContestEffectDetail1 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail2 = new OASSuperContestEffectDetail();

        System.assertEquals(superContestEffectDetail1.hashCode(), superContestEffectDetail1.hashCode());
        System.assertEquals(superContestEffectDetail2.hashCode(), superContestEffectDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuperContestEffectDetail superContestEffectDetail1 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail2 = OASSuperContestEffectDetail.getExample();
        OASSuperContestEffectDetail superContestEffectDetail3 = new OASSuperContestEffectDetail();
        OASSuperContestEffectDetail superContestEffectDetail4 = new OASSuperContestEffectDetail();

        System.assert(superContestEffectDetail1.equals(superContestEffectDetail2));
        System.assert(superContestEffectDetail3.equals(superContestEffectDetail4));
        System.assertEquals(superContestEffectDetail1.hashCode(), superContestEffectDetail2.hashCode());
        System.assertEquals(superContestEffectDetail3.hashCode(), superContestEffectDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSuperContestEffectDetail superContestEffectDetail = new OASSuperContestEffectDetail();
        Map<String, String> x-property-mappings = superContestEffectDetail.getx-property-mappings();
        System.assertEquals('flavorTextEntries', x-property-mappings.get('flavor_text_entries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSuperContestEffectDetail superContestEffectDetail = new OASSuperContestEffectDetail();
        System.assertEquals(new List<OASSuperContestEffectFlavorText>(), superContestEffectDetail.flavorTextEntries);
        System.assertEquals(new List<OASMoveSummary>(), superContestEffectDetail.moves);
        System.assertEquals(null, superContestEffectDetail.id);
        System.assertEquals(null, superContestEffectDetail.appeal);
    }
}
