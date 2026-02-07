@isTest
private class OASExperienceTest {
    @isTest
    private static void equalsSameInstance() {
        OASExperience experience1 = OASExperience.getExample();
        OASExperience experience2 = experience1;
        OASExperience experience3 = new OASExperience();
        OASExperience experience4 = experience3;

        System.assert(experience1.equals(experience2));
        System.assert(experience2.equals(experience1));
        System.assert(experience1.equals(experience1));
        System.assert(experience3.equals(experience4));
        System.assert(experience4.equals(experience3));
        System.assert(experience3.equals(experience3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASExperience experience1 = OASExperience.getExample();
        OASExperience experience2 = OASExperience.getExample();
        OASExperience experience3 = new OASExperience();
        OASExperience experience4 = new OASExperience();

        System.assert(experience1.equals(experience2));
        System.assert(experience2.equals(experience1));
        System.assert(experience3.equals(experience4));
        System.assert(experience4.equals(experience3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASExperience experience1 = OASExperience.getExample();
        OASExperience experience2 = new OASExperience();

        System.assertEquals(false, experience1.equals('foo'));
        System.assertEquals(false, experience2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASExperience experience1 = OASExperience.getExample();
        OASExperience experience2 = new OASExperience();
        OASExperience experience3;

        System.assertEquals(false, experience1.equals(experience3));
        System.assertEquals(false, experience2.equals(experience3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASExperience experience1 = OASExperience.getExample();
        OASExperience experience2 = new OASExperience();

        System.assertEquals(experience1.hashCode(), experience1.hashCode());
        System.assertEquals(experience2.hashCode(), experience2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASExperience experience1 = OASExperience.getExample();
        OASExperience experience2 = OASExperience.getExample();
        OASExperience experience3 = new OASExperience();
        OASExperience experience4 = new OASExperience();

        System.assert(experience1.equals(experience2));
        System.assert(experience3.equals(experience4));
        System.assertEquals(experience1.hashCode(), experience2.hashCode());
        System.assertEquals(experience3.hashCode(), experience4.hashCode());
    }
}
