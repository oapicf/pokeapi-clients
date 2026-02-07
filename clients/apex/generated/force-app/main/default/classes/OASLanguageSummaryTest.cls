@isTest
private class OASLanguageSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASLanguageSummary languageSummary1 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary2 = languageSummary1;
        OASLanguageSummary languageSummary3 = new OASLanguageSummary();
        OASLanguageSummary languageSummary4 = languageSummary3;

        System.assert(languageSummary1.equals(languageSummary2));
        System.assert(languageSummary2.equals(languageSummary1));
        System.assert(languageSummary1.equals(languageSummary1));
        System.assert(languageSummary3.equals(languageSummary4));
        System.assert(languageSummary4.equals(languageSummary3));
        System.assert(languageSummary3.equals(languageSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLanguageSummary languageSummary1 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary2 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary3 = new OASLanguageSummary();
        OASLanguageSummary languageSummary4 = new OASLanguageSummary();

        System.assert(languageSummary1.equals(languageSummary2));
        System.assert(languageSummary2.equals(languageSummary1));
        System.assert(languageSummary3.equals(languageSummary4));
        System.assert(languageSummary4.equals(languageSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLanguageSummary languageSummary1 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary2 = new OASLanguageSummary();

        System.assertEquals(false, languageSummary1.equals('foo'));
        System.assertEquals(false, languageSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLanguageSummary languageSummary1 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary2 = new OASLanguageSummary();
        OASLanguageSummary languageSummary3;

        System.assertEquals(false, languageSummary1.equals(languageSummary3));
        System.assertEquals(false, languageSummary2.equals(languageSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLanguageSummary languageSummary1 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary2 = new OASLanguageSummary();

        System.assertEquals(languageSummary1.hashCode(), languageSummary1.hashCode());
        System.assertEquals(languageSummary2.hashCode(), languageSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLanguageSummary languageSummary1 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary2 = OASLanguageSummary.getExample();
        OASLanguageSummary languageSummary3 = new OASLanguageSummary();
        OASLanguageSummary languageSummary4 = new OASLanguageSummary();

        System.assert(languageSummary1.equals(languageSummary2));
        System.assert(languageSummary3.equals(languageSummary4));
        System.assertEquals(languageSummary1.hashCode(), languageSummary2.hashCode());
        System.assertEquals(languageSummary3.hashCode(), languageSummary4.hashCode());
    }
}
