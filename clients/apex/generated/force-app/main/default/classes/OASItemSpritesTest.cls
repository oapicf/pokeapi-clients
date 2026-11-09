@isTest
private class OASItemSpritesTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemSprites itemSprites1 = OASItemSprites.getExample();
        OASItemSprites itemSprites2 = itemSprites1;
        OASItemSprites itemSprites3 = new OASItemSprites();
        OASItemSprites itemSprites4 = itemSprites3;

        System.assert(itemSprites1.equals(itemSprites2));
        System.assert(itemSprites2.equals(itemSprites1));
        System.assert(itemSprites1.equals(itemSprites1));
        System.assert(itemSprites3.equals(itemSprites4));
        System.assert(itemSprites4.equals(itemSprites3));
        System.assert(itemSprites3.equals(itemSprites3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemSprites itemSprites1 = OASItemSprites.getExample();
        OASItemSprites itemSprites2 = OASItemSprites.getExample();
        OASItemSprites itemSprites3 = new OASItemSprites();
        OASItemSprites itemSprites4 = new OASItemSprites();

        System.assert(itemSprites1.equals(itemSprites2));
        System.assert(itemSprites2.equals(itemSprites1));
        System.assert(itemSprites3.equals(itemSprites4));
        System.assert(itemSprites4.equals(itemSprites3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemSprites itemSprites1 = OASItemSprites.getExample();
        OASItemSprites itemSprites2 = new OASItemSprites();

        System.assertEquals(false, itemSprites1.equals('foo'));
        System.assertEquals(false, itemSprites2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemSprites itemSprites1 = OASItemSprites.getExample();
        OASItemSprites itemSprites2 = new OASItemSprites();
        OASItemSprites itemSprites3;

        System.assertEquals(false, itemSprites1.equals(itemSprites3));
        System.assertEquals(false, itemSprites2.equals(itemSprites3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemSprites itemSprites1 = OASItemSprites.getExample();
        OASItemSprites itemSprites2 = new OASItemSprites();

        System.assertEquals(itemSprites1.hashCode(), itemSprites1.hashCode());
        System.assertEquals(itemSprites2.hashCode(), itemSprites2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemSprites itemSprites1 = OASItemSprites.getExample();
        OASItemSprites itemSprites2 = OASItemSprites.getExample();
        OASItemSprites itemSprites3 = new OASItemSprites();
        OASItemSprites itemSprites4 = new OASItemSprites();

        System.assert(itemSprites1.equals(itemSprites2));
        System.assert(itemSprites3.equals(itemSprites4));
        System.assertEquals(itemSprites1.hashCode(), itemSprites2.hashCode());
        System.assertEquals(itemSprites3.hashCode(), itemSprites4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemSprites itemSprites = new OASItemSprites();
        Map<String, String> x-property-mappings = itemSprites.getx-property-mappings();
        System.assertEquals('r_default', x-property-mappings.get('default'));
    }
}
