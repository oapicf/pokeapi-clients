@isTest
private class OASLanguageDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASLanguageDetail languageDetail1 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail2 = languageDetail1;
        OASLanguageDetail languageDetail3 = new OASLanguageDetail();
        OASLanguageDetail languageDetail4 = languageDetail3;

        System.assert(languageDetail1.equals(languageDetail2));
        System.assert(languageDetail2.equals(languageDetail1));
        System.assert(languageDetail1.equals(languageDetail1));
        System.assert(languageDetail3.equals(languageDetail4));
        System.assert(languageDetail4.equals(languageDetail3));
        System.assert(languageDetail3.equals(languageDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLanguageDetail languageDetail1 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail2 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail3 = new OASLanguageDetail();
        OASLanguageDetail languageDetail4 = new OASLanguageDetail();

        System.assert(languageDetail1.equals(languageDetail2));
        System.assert(languageDetail2.equals(languageDetail1));
        System.assert(languageDetail3.equals(languageDetail4));
        System.assert(languageDetail4.equals(languageDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLanguageDetail languageDetail1 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail2 = new OASLanguageDetail();

        System.assertEquals(false, languageDetail1.equals('foo'));
        System.assertEquals(false, languageDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLanguageDetail languageDetail1 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail2 = new OASLanguageDetail();
        OASLanguageDetail languageDetail3;

        System.assertEquals(false, languageDetail1.equals(languageDetail3));
        System.assertEquals(false, languageDetail2.equals(languageDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLanguageDetail languageDetail1 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail2 = new OASLanguageDetail();

        System.assertEquals(languageDetail1.hashCode(), languageDetail1.hashCode());
        System.assertEquals(languageDetail2.hashCode(), languageDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLanguageDetail languageDetail1 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail2 = OASLanguageDetail.getExample();
        OASLanguageDetail languageDetail3 = new OASLanguageDetail();
        OASLanguageDetail languageDetail4 = new OASLanguageDetail();

        System.assert(languageDetail1.equals(languageDetail2));
        System.assert(languageDetail3.equals(languageDetail4));
        System.assertEquals(languageDetail1.hashCode(), languageDetail2.hashCode());
        System.assertEquals(languageDetail3.hashCode(), languageDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLanguageDetail languageDetail = new OASLanguageDetail();
        System.assertEquals(new List<OASLanguageName>(), languageDetail.names);
        System.assertEquals(null, languageDetail.id);
        System.assertEquals(null, languageDetail.name);
        System.assertEquals(null, languageDetail.official);
        System.assertEquals(null, languageDetail.iso639);
        System.assertEquals(null, languageDetail.iso3166);
    }
}
