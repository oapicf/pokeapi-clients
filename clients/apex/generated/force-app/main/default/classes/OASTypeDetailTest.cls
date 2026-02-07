@isTest
private class OASTypeDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeDetail typeDetail1 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail2 = typeDetail1;
        OASTypeDetail typeDetail3 = new OASTypeDetail();
        OASTypeDetail typeDetail4 = typeDetail3;

        System.assert(typeDetail1.equals(typeDetail2));
        System.assert(typeDetail2.equals(typeDetail1));
        System.assert(typeDetail1.equals(typeDetail1));
        System.assert(typeDetail3.equals(typeDetail4));
        System.assert(typeDetail4.equals(typeDetail3));
        System.assert(typeDetail3.equals(typeDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeDetail typeDetail1 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail2 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail3 = new OASTypeDetail();
        OASTypeDetail typeDetail4 = new OASTypeDetail();

        System.assert(typeDetail1.equals(typeDetail2));
        System.assert(typeDetail2.equals(typeDetail1));
        System.assert(typeDetail3.equals(typeDetail4));
        System.assert(typeDetail4.equals(typeDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeDetail typeDetail1 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail2 = new OASTypeDetail();

        System.assertEquals(false, typeDetail1.equals('foo'));
        System.assertEquals(false, typeDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeDetail typeDetail1 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail2 = new OASTypeDetail();
        OASTypeDetail typeDetail3;

        System.assertEquals(false, typeDetail1.equals(typeDetail3));
        System.assertEquals(false, typeDetail2.equals(typeDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeDetail typeDetail1 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail2 = new OASTypeDetail();

        System.assertEquals(typeDetail1.hashCode(), typeDetail1.hashCode());
        System.assertEquals(typeDetail2.hashCode(), typeDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeDetail typeDetail1 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail2 = OASTypeDetail.getExample();
        OASTypeDetail typeDetail3 = new OASTypeDetail();
        OASTypeDetail typeDetail4 = new OASTypeDetail();

        System.assert(typeDetail1.equals(typeDetail2));
        System.assert(typeDetail3.equals(typeDetail4));
        System.assertEquals(typeDetail1.hashCode(), typeDetail2.hashCode());
        System.assertEquals(typeDetail3.hashCode(), typeDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypeDetail typeDetail = new OASTypeDetail();
        Map<String, String> x-property-mappings = typeDetail.getx-property-mappings();
        System.assertEquals('damageRelations', x-property-mappings.get('damage_relations'));
        System.assertEquals('pastDamageRelations', x-property-mappings.get('past_damage_relations'));
        System.assertEquals('gameIndices', x-property-mappings.get('game_indices'));
        System.assertEquals('moveDamageClass', x-property-mappings.get('move_damage_class'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTypeDetail typeDetail = new OASTypeDetail();
        System.assertEquals(new List<OASTypeDetailPastDamageRelationsInne>(), typeDetail.pastDamageRelations);
        System.assertEquals(new List<OASTypeGameIndex>(), typeDetail.gameIndices);
        System.assertEquals(new List<OASAbilityName>(), typeDetail.names);
        System.assertEquals(new List<OASTypeDetailPokemonInner>(), typeDetail.pokemon);
        System.assertEquals(new List<OASMoveSummary>(), typeDetail.moves);
        System.assertEquals(new Map<String, Map<String, OASTypeDetailSpritesValueValue>>(), typeDetail.sprites);
        System.assertEquals(null, typeDetail.id);
        System.assertEquals(null, typeDetail.name);
        System.assertEquals(null, typeDetail.damageRelations);
        System.assertEquals(null, typeDetail.generation);
        System.assertEquals(null, typeDetail.moveDamageClass);
    }
}
