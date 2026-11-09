@isTest
private class OASPokemonEvolutionTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonEvolution pokemonEvolution1 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution2 = pokemonEvolution1;
        OASPokemonEvolution pokemonEvolution3 = new OASPokemonEvolution();
        OASPokemonEvolution pokemonEvolution4 = pokemonEvolution3;

        System.assert(pokemonEvolution1.equals(pokemonEvolution2));
        System.assert(pokemonEvolution2.equals(pokemonEvolution1));
        System.assert(pokemonEvolution1.equals(pokemonEvolution1));
        System.assert(pokemonEvolution3.equals(pokemonEvolution4));
        System.assert(pokemonEvolution4.equals(pokemonEvolution3));
        System.assert(pokemonEvolution3.equals(pokemonEvolution3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonEvolution pokemonEvolution1 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution2 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution3 = new OASPokemonEvolution();
        OASPokemonEvolution pokemonEvolution4 = new OASPokemonEvolution();

        System.assert(pokemonEvolution1.equals(pokemonEvolution2));
        System.assert(pokemonEvolution2.equals(pokemonEvolution1));
        System.assert(pokemonEvolution3.equals(pokemonEvolution4));
        System.assert(pokemonEvolution4.equals(pokemonEvolution3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonEvolution pokemonEvolution1 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution2 = new OASPokemonEvolution();

        System.assertEquals(false, pokemonEvolution1.equals('foo'));
        System.assertEquals(false, pokemonEvolution2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonEvolution pokemonEvolution1 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution2 = new OASPokemonEvolution();
        OASPokemonEvolution pokemonEvolution3;

        System.assertEquals(false, pokemonEvolution1.equals(pokemonEvolution3));
        System.assertEquals(false, pokemonEvolution2.equals(pokemonEvolution3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonEvolution pokemonEvolution1 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution2 = new OASPokemonEvolution();

        System.assertEquals(pokemonEvolution1.hashCode(), pokemonEvolution1.hashCode());
        System.assertEquals(pokemonEvolution2.hashCode(), pokemonEvolution2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonEvolution pokemonEvolution1 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution2 = OASPokemonEvolution.getExample();
        OASPokemonEvolution pokemonEvolution3 = new OASPokemonEvolution();
        OASPokemonEvolution pokemonEvolution4 = new OASPokemonEvolution();

        System.assert(pokemonEvolution1.equals(pokemonEvolution2));
        System.assert(pokemonEvolution3.equals(pokemonEvolution4));
        System.assertEquals(pokemonEvolution1.hashCode(), pokemonEvolution2.hashCode());
        System.assertEquals(pokemonEvolution3.hashCode(), pokemonEvolution4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonEvolution pokemonEvolution = new OASPokemonEvolution();
        Map<String, String> x-property-mappings = pokemonEvolution.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
        System.assertEquals('isDefault', x-property-mappings.get('is_default'));
        System.assertEquals('r_trigger', x-property-mappings.get('trigger'));
        System.assertEquals('heldItem', x-property-mappings.get('held_item'));
        System.assertEquals('knownMove', x-property-mappings.get('known_move'));
        System.assertEquals('knownMoveType', x-property-mappings.get('known_move_type'));
        System.assertEquals('minLevel', x-property-mappings.get('min_level'));
        System.assertEquals('minHappiness', x-property-mappings.get('min_happiness'));
        System.assertEquals('minBeauty', x-property-mappings.get('min_beauty'));
        System.assertEquals('minAffection', x-property-mappings.get('min_affection'));
        System.assertEquals('nearSpecialRock', x-property-mappings.get('near_special_rock'));
        System.assertEquals('needsMultiplayer', x-property-mappings.get('needs_multiplayer'));
        System.assertEquals('needsOverworldRain', x-property-mappings.get('needs_overworld_rain'));
        System.assertEquals('partySpecies', x-property-mappings.get('party_species'));
        System.assertEquals('partyType', x-property-mappings.get('party_type'));
        System.assertEquals('relativePhysicalStats', x-property-mappings.get('relative_physical_stats'));
        System.assertEquals('timeOfDay', x-property-mappings.get('time_of_day'));
        System.assertEquals('tradeSpecies', x-property-mappings.get('trade_species'));
        System.assertEquals('turnUpsideDown', x-property-mappings.get('turn_upside_down'));
        System.assertEquals('requiredPokemonForm', x-property-mappings.get('required_pokemon_form'));
        System.assertEquals('evolvedPokemonForm', x-property-mappings.get('evolved_pokemon_form'));
        System.assertEquals('usedMove', x-property-mappings.get('used_move'));
        System.assertEquals('minMoveCount', x-property-mappings.get('min_move_count'));
        System.assertEquals('minSteps', x-property-mappings.get('min_steps'));
        System.assertEquals('minDamageTaken', x-property-mappings.get('min_damage_taken'));
        System.assertEquals('allowedNatures', x-property-mappings.get('allowed_natures'));
        System.assertEquals('conditionExpression', x-property-mappings.get('condition_expression'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonEvolution pokemonEvolution = new OASPokemonEvolution();
        System.assertEquals(new List<OASNatureSummary>(), pokemonEvolution.allowedNatures);
        System.assertEquals(null, pokemonEvolution.versionGroup);
        System.assertEquals(null, pokemonEvolution.isDefault);
        System.assertEquals(null, pokemonEvolution.item);
        System.assertEquals(null, pokemonEvolution.r_trigger);
        System.assertEquals(null, pokemonEvolution.gender);
        System.assertEquals(null, pokemonEvolution.heldItem);
        System.assertEquals(null, pokemonEvolution.knownMove);
        System.assertEquals(null, pokemonEvolution.knownMoveType);
        System.assertEquals(null, pokemonEvolution.location);
        System.assertEquals(null, pokemonEvolution.minLevel);
        System.assertEquals(null, pokemonEvolution.minHappiness);
        System.assertEquals(null, pokemonEvolution.minBeauty);
        System.assertEquals(null, pokemonEvolution.minAffection);
        System.assertEquals(null, pokemonEvolution.nearSpecialRock);
        System.assertEquals(null, pokemonEvolution.needsMultiplayer);
        System.assertEquals(null, pokemonEvolution.needsOverworldRain);
        System.assertEquals(null, pokemonEvolution.partySpecies);
        System.assertEquals(null, pokemonEvolution.partyType);
        System.assertEquals(null, pokemonEvolution.relativePhysicalStats);
        System.assertEquals(null, pokemonEvolution.timeOfDay);
        System.assertEquals(null, pokemonEvolution.tradeSpecies);
        System.assertEquals(null, pokemonEvolution.turnUpsideDown);
        System.assertEquals(null, pokemonEvolution.region);
        System.assertEquals(null, pokemonEvolution.requiredPokemonForm);
        System.assertEquals(null, pokemonEvolution.evolvedPokemonForm);
        System.assertEquals(null, pokemonEvolution.usedMove);
        System.assertEquals(null, pokemonEvolution.minMoveCount);
        System.assertEquals(null, pokemonEvolution.minSteps);
        System.assertEquals(null, pokemonEvolution.minDamageTaken);
        System.assertEquals(null, pokemonEvolution.conditionExpression);
    }
}
