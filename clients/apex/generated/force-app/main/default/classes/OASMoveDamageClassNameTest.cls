@isTest
private class OASMoveDamageClassNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDamageClassName moveDamageClassName1 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName2 = moveDamageClassName1;
        OASMoveDamageClassName moveDamageClassName3 = new OASMoveDamageClassName();
        OASMoveDamageClassName moveDamageClassName4 = moveDamageClassName3;

        System.assert(moveDamageClassName1.equals(moveDamageClassName2));
        System.assert(moveDamageClassName2.equals(moveDamageClassName1));
        System.assert(moveDamageClassName1.equals(moveDamageClassName1));
        System.assert(moveDamageClassName3.equals(moveDamageClassName4));
        System.assert(moveDamageClassName4.equals(moveDamageClassName3));
        System.assert(moveDamageClassName3.equals(moveDamageClassName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDamageClassName moveDamageClassName1 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName2 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName3 = new OASMoveDamageClassName();
        OASMoveDamageClassName moveDamageClassName4 = new OASMoveDamageClassName();

        System.assert(moveDamageClassName1.equals(moveDamageClassName2));
        System.assert(moveDamageClassName2.equals(moveDamageClassName1));
        System.assert(moveDamageClassName3.equals(moveDamageClassName4));
        System.assert(moveDamageClassName4.equals(moveDamageClassName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDamageClassName moveDamageClassName1 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName2 = new OASMoveDamageClassName();

        System.assertEquals(false, moveDamageClassName1.equals('foo'));
        System.assertEquals(false, moveDamageClassName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDamageClassName moveDamageClassName1 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName2 = new OASMoveDamageClassName();
        OASMoveDamageClassName moveDamageClassName3;

        System.assertEquals(false, moveDamageClassName1.equals(moveDamageClassName3));
        System.assertEquals(false, moveDamageClassName2.equals(moveDamageClassName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDamageClassName moveDamageClassName1 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName2 = new OASMoveDamageClassName();

        System.assertEquals(moveDamageClassName1.hashCode(), moveDamageClassName1.hashCode());
        System.assertEquals(moveDamageClassName2.hashCode(), moveDamageClassName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDamageClassName moveDamageClassName1 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName2 = OASMoveDamageClassName.getExample();
        OASMoveDamageClassName moveDamageClassName3 = new OASMoveDamageClassName();
        OASMoveDamageClassName moveDamageClassName4 = new OASMoveDamageClassName();

        System.assert(moveDamageClassName1.equals(moveDamageClassName2));
        System.assert(moveDamageClassName3.equals(moveDamageClassName4));
        System.assertEquals(moveDamageClassName1.hashCode(), moveDamageClassName2.hashCode());
        System.assertEquals(moveDamageClassName3.hashCode(), moveDamageClassName4.hashCode());
    }
}
