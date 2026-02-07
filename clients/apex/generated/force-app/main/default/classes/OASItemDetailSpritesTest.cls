@isTest
private class OASItemDetailSpritesTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDetailSprites itemDetailSprites1 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites2 = itemDetailSprites1;
        OASItemDetailSprites itemDetailSprites3 = new OASItemDetailSprites();
        OASItemDetailSprites itemDetailSprites4 = itemDetailSprites3;

        System.assert(itemDetailSprites1.equals(itemDetailSprites2));
        System.assert(itemDetailSprites2.equals(itemDetailSprites1));
        System.assert(itemDetailSprites1.equals(itemDetailSprites1));
        System.assert(itemDetailSprites3.equals(itemDetailSprites4));
        System.assert(itemDetailSprites4.equals(itemDetailSprites3));
        System.assert(itemDetailSprites3.equals(itemDetailSprites3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDetailSprites itemDetailSprites1 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites2 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites3 = new OASItemDetailSprites();
        OASItemDetailSprites itemDetailSprites4 = new OASItemDetailSprites();

        System.assert(itemDetailSprites1.equals(itemDetailSprites2));
        System.assert(itemDetailSprites2.equals(itemDetailSprites1));
        System.assert(itemDetailSprites3.equals(itemDetailSprites4));
        System.assert(itemDetailSprites4.equals(itemDetailSprites3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDetailSprites itemDetailSprites1 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites2 = new OASItemDetailSprites();

        System.assertEquals(false, itemDetailSprites1.equals('foo'));
        System.assertEquals(false, itemDetailSprites2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDetailSprites itemDetailSprites1 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites2 = new OASItemDetailSprites();
        OASItemDetailSprites itemDetailSprites3;

        System.assertEquals(false, itemDetailSprites1.equals(itemDetailSprites3));
        System.assertEquals(false, itemDetailSprites2.equals(itemDetailSprites3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDetailSprites itemDetailSprites1 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites2 = new OASItemDetailSprites();

        System.assertEquals(itemDetailSprites1.hashCode(), itemDetailSprites1.hashCode());
        System.assertEquals(itemDetailSprites2.hashCode(), itemDetailSprites2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDetailSprites itemDetailSprites1 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites2 = OASItemDetailSprites.getExample();
        OASItemDetailSprites itemDetailSprites3 = new OASItemDetailSprites();
        OASItemDetailSprites itemDetailSprites4 = new OASItemDetailSprites();

        System.assert(itemDetailSprites1.equals(itemDetailSprites2));
        System.assert(itemDetailSprites3.equals(itemDetailSprites4));
        System.assertEquals(itemDetailSprites1.hashCode(), itemDetailSprites2.hashCode());
        System.assertEquals(itemDetailSprites3.hashCode(), itemDetailSprites4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemDetailSprites itemDetailSprites = new OASItemDetailSprites();
        Map<String, String> x-property-mappings = itemDetailSprites.getx-property-mappings();
        System.assertEquals('r_default', x-property-mappings.get('default'));
    }
}
