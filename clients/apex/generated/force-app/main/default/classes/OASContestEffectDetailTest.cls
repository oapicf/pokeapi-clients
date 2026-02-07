@isTest
private class OASContestEffectDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASContestEffectDetail contestEffectDetail1 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail2 = contestEffectDetail1;
        OASContestEffectDetail contestEffectDetail3 = new OASContestEffectDetail();
        OASContestEffectDetail contestEffectDetail4 = contestEffectDetail3;

        System.assert(contestEffectDetail1.equals(contestEffectDetail2));
        System.assert(contestEffectDetail2.equals(contestEffectDetail1));
        System.assert(contestEffectDetail1.equals(contestEffectDetail1));
        System.assert(contestEffectDetail3.equals(contestEffectDetail4));
        System.assert(contestEffectDetail4.equals(contestEffectDetail3));
        System.assert(contestEffectDetail3.equals(contestEffectDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContestEffectDetail contestEffectDetail1 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail2 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail3 = new OASContestEffectDetail();
        OASContestEffectDetail contestEffectDetail4 = new OASContestEffectDetail();

        System.assert(contestEffectDetail1.equals(contestEffectDetail2));
        System.assert(contestEffectDetail2.equals(contestEffectDetail1));
        System.assert(contestEffectDetail3.equals(contestEffectDetail4));
        System.assert(contestEffectDetail4.equals(contestEffectDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContestEffectDetail contestEffectDetail1 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail2 = new OASContestEffectDetail();

        System.assertEquals(false, contestEffectDetail1.equals('foo'));
        System.assertEquals(false, contestEffectDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContestEffectDetail contestEffectDetail1 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail2 = new OASContestEffectDetail();
        OASContestEffectDetail contestEffectDetail3;

        System.assertEquals(false, contestEffectDetail1.equals(contestEffectDetail3));
        System.assertEquals(false, contestEffectDetail2.equals(contestEffectDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContestEffectDetail contestEffectDetail1 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail2 = new OASContestEffectDetail();

        System.assertEquals(contestEffectDetail1.hashCode(), contestEffectDetail1.hashCode());
        System.assertEquals(contestEffectDetail2.hashCode(), contestEffectDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContestEffectDetail contestEffectDetail1 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail2 = OASContestEffectDetail.getExample();
        OASContestEffectDetail contestEffectDetail3 = new OASContestEffectDetail();
        OASContestEffectDetail contestEffectDetail4 = new OASContestEffectDetail();

        System.assert(contestEffectDetail1.equals(contestEffectDetail2));
        System.assert(contestEffectDetail3.equals(contestEffectDetail4));
        System.assertEquals(contestEffectDetail1.hashCode(), contestEffectDetail2.hashCode());
        System.assertEquals(contestEffectDetail3.hashCode(), contestEffectDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASContestEffectDetail contestEffectDetail = new OASContestEffectDetail();
        Map<String, String> x-property-mappings = contestEffectDetail.getx-property-mappings();
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
        System.assertEquals('flavorTextEntries', x-property-mappings.get('flavor_text_entries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASContestEffectDetail contestEffectDetail = new OASContestEffectDetail();
        System.assertEquals(new List<OASContestEffectEffectText>(), contestEffectDetail.effectEntries);
        System.assertEquals(new List<OASContestEffectFlavorText>(), contestEffectDetail.flavorTextEntries);
        System.assertEquals(null, contestEffectDetail.id);
        System.assertEquals(null, contestEffectDetail.appeal);
        System.assertEquals(null, contestEffectDetail.jam);
    }
}
