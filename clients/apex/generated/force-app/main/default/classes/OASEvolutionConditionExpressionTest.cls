@isTest
private class OASEvolutionConditionExpressionTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionConditionExpression evolutionConditionExpression1 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression2 = evolutionConditionExpression1;
        OASEvolutionConditionExpression evolutionConditionExpression3 = new OASEvolutionConditionExpression();
        OASEvolutionConditionExpression evolutionConditionExpression4 = evolutionConditionExpression3;

        System.assert(evolutionConditionExpression1.equals(evolutionConditionExpression2));
        System.assert(evolutionConditionExpression2.equals(evolutionConditionExpression1));
        System.assert(evolutionConditionExpression1.equals(evolutionConditionExpression1));
        System.assert(evolutionConditionExpression3.equals(evolutionConditionExpression4));
        System.assert(evolutionConditionExpression4.equals(evolutionConditionExpression3));
        System.assert(evolutionConditionExpression3.equals(evolutionConditionExpression3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionConditionExpression evolutionConditionExpression1 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression2 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression3 = new OASEvolutionConditionExpression();
        OASEvolutionConditionExpression evolutionConditionExpression4 = new OASEvolutionConditionExpression();

        System.assert(evolutionConditionExpression1.equals(evolutionConditionExpression2));
        System.assert(evolutionConditionExpression2.equals(evolutionConditionExpression1));
        System.assert(evolutionConditionExpression3.equals(evolutionConditionExpression4));
        System.assert(evolutionConditionExpression4.equals(evolutionConditionExpression3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionConditionExpression evolutionConditionExpression1 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression2 = new OASEvolutionConditionExpression();

        System.assertEquals(false, evolutionConditionExpression1.equals('foo'));
        System.assertEquals(false, evolutionConditionExpression2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionConditionExpression evolutionConditionExpression1 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression2 = new OASEvolutionConditionExpression();
        OASEvolutionConditionExpression evolutionConditionExpression3;

        System.assertEquals(false, evolutionConditionExpression1.equals(evolutionConditionExpression3));
        System.assertEquals(false, evolutionConditionExpression2.equals(evolutionConditionExpression3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionConditionExpression evolutionConditionExpression1 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression2 = new OASEvolutionConditionExpression();

        System.assertEquals(evolutionConditionExpression1.hashCode(), evolutionConditionExpression1.hashCode());
        System.assertEquals(evolutionConditionExpression2.hashCode(), evolutionConditionExpression2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionConditionExpression evolutionConditionExpression1 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression2 = OASEvolutionConditionExpression.getExample();
        OASEvolutionConditionExpression evolutionConditionExpression3 = new OASEvolutionConditionExpression();
        OASEvolutionConditionExpression evolutionConditionExpression4 = new OASEvolutionConditionExpression();

        System.assert(evolutionConditionExpression1.equals(evolutionConditionExpression2));
        System.assert(evolutionConditionExpression3.equals(evolutionConditionExpression4));
        System.assertEquals(evolutionConditionExpression1.hashCode(), evolutionConditionExpression2.hashCode());
        System.assertEquals(evolutionConditionExpression3.hashCode(), evolutionConditionExpression4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEvolutionConditionExpression evolutionConditionExpression = new OASEvolutionConditionExpression();
        Map<String, String> x-property-mappings = evolutionConditionExpression.getx-property-mappings();
        System.assertEquals('percentageChance', x-property-mappings.get('percentage_chance'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEvolutionConditionExpression evolutionConditionExpression = new OASEvolutionConditionExpression();
        System.assertEquals(new List<OASEvolutionVariableSummary>(), evolutionConditionExpression.variables);
        System.assertEquals(null, evolutionConditionExpression.expression);
        System.assertEquals(null, evolutionConditionExpression.percentageChance);
    }
}
