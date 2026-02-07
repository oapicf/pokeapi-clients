@isTest
private class OASLanguageNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASLanguageName languageName1 = OASLanguageName.getExample();
        OASLanguageName languageName2 = languageName1;
        OASLanguageName languageName3 = new OASLanguageName();
        OASLanguageName languageName4 = languageName3;

        System.assert(languageName1.equals(languageName2));
        System.assert(languageName2.equals(languageName1));
        System.assert(languageName1.equals(languageName1));
        System.assert(languageName3.equals(languageName4));
        System.assert(languageName4.equals(languageName3));
        System.assert(languageName3.equals(languageName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLanguageName languageName1 = OASLanguageName.getExample();
        OASLanguageName languageName2 = OASLanguageName.getExample();
        OASLanguageName languageName3 = new OASLanguageName();
        OASLanguageName languageName4 = new OASLanguageName();

        System.assert(languageName1.equals(languageName2));
        System.assert(languageName2.equals(languageName1));
        System.assert(languageName3.equals(languageName4));
        System.assert(languageName4.equals(languageName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLanguageName languageName1 = OASLanguageName.getExample();
        OASLanguageName languageName2 = new OASLanguageName();

        System.assertEquals(false, languageName1.equals('foo'));
        System.assertEquals(false, languageName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLanguageName languageName1 = OASLanguageName.getExample();
        OASLanguageName languageName2 = new OASLanguageName();
        OASLanguageName languageName3;

        System.assertEquals(false, languageName1.equals(languageName3));
        System.assertEquals(false, languageName2.equals(languageName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLanguageName languageName1 = OASLanguageName.getExample();
        OASLanguageName languageName2 = new OASLanguageName();

        System.assertEquals(languageName1.hashCode(), languageName1.hashCode());
        System.assertEquals(languageName2.hashCode(), languageName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLanguageName languageName1 = OASLanguageName.getExample();
        OASLanguageName languageName2 = OASLanguageName.getExample();
        OASLanguageName languageName3 = new OASLanguageName();
        OASLanguageName languageName4 = new OASLanguageName();

        System.assert(languageName1.equals(languageName2));
        System.assert(languageName3.equals(languageName4));
        System.assertEquals(languageName1.hashCode(), languageName2.hashCode());
        System.assertEquals(languageName3.hashCode(), languageName4.hashCode());
    }
}
