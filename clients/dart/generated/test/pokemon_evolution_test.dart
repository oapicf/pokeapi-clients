//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for PokemonEvolution
void main() {
  // final instance = PokemonEvolution();

  group('test PokemonEvolution', () {
    // The version group in which these evolution requirements apply.
    // VersionGroupSummary versionGroup
    test('to test the property `versionGroup`', () async {
      // TODO
    });

    // Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
    // bool isDefault
    test('to test the property `isDefault`', () async {
      // TODO
    });

    // The item required to cause evolution this into Pokémon species.
    // ItemSummary item
    test('to test the property `item`', () async {
      // TODO
    });

    // The type of event that triggers evolution into this Pokémon species.
    // EvolutionTriggerSummary trigger
    test('to test the property `trigger`', () async {
      // TODO
    });

    // The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
    // int gender
    test('to test the property `gender`', () async {
      // TODO
    });

    // The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
    // ItemSummary heldItem
    test('to test the property `heldItem`', () async {
      // TODO
    });

    // PokemonEvolutionKnownMove knownMove
    test('to test the property `knownMove`', () async {
      // TODO
    });

    // PokemonEvolutionKnownMove knownMoveType
    test('to test the property `knownMoveType`', () async {
      // TODO
    });

    // The location the evolution must be triggered at.
    // LocationSummary location
    test('to test the property `location`', () async {
      // TODO
    });

    // The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
    // int minLevel
    test('to test the property `minLevel`', () async {
      // TODO
    });

    // The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
    // int minHappiness
    test('to test the property `minHappiness`', () async {
      // TODO
    });

    // The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
    // int minBeauty
    test('to test the property `minBeauty`', () async {
      // TODO
    });

    // The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
    // int minAffection
    test('to test the property `minAffection`', () async {
      // TODO
    });

    // Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
    // bool nearSpecialRock
    test('to test the property `nearSpecialRock`', () async {
      // TODO
    });

    // Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
    // bool needsMultiplayer
    test('to test the property `needsMultiplayer`', () async {
      // TODO
    });

    // Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
    // bool needsOverworldRain
    test('to test the property `needsOverworldRain`', () async {
      // TODO
    });

    // The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
    // PokemonSpeciesSummary partySpecies
    test('to test the property `partySpecies`', () async {
      // TODO
    });

    // The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
    // TypeSummary partyType
    test('to test the property `partyType`', () async {
      // TODO
    });

    // The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
    // int relativePhysicalStats
    test('to test the property `relativePhysicalStats`', () async {
      // TODO
    });

    // The required time of day. Day or night.
    // String timeOfDay
    test('to test the property `timeOfDay`', () async {
      // TODO
    });

    // Pokémon species for which this one must be traded.
    // PokemonSpeciesSummary tradeSpecies
    test('to test the property `tradeSpecies`', () async {
      // TODO
    });

    // Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
    // bool turnUpsideDown
    test('to test the property `turnUpsideDown`', () async {
      // TODO
    });

    // The required region in which this evolution can occur.
    // RegionSummary region
    test('to test the property `region`', () async {
      // TODO
    });

    // The Pokémon form required before evolving, or null if unrestricted.
    // PokemonFormSummary requiredPokemonForm
    test('to test the property `requiredPokemonForm`', () async {
      // TODO
    });

    // The Pokémon form produced by this evolution, or null if unspecified.
    // PokemonFormSummary evolvedPokemonForm
    test('to test the property `evolvedPokemonForm`', () async {
      // TODO
    });

    // The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
    // MoveSummary usedMove
    test('to test the property `usedMove`', () async {
      // TODO
    });

    // The minimum number of times a move must be used in order to evolve into this Pokémon species.
    // int minMoveCount
    test('to test the property `minMoveCount`', () async {
      // TODO
    });

    // The minimum number of steps that must be taken in order to evolve into this Pokémon species.
    // int minSteps
    test('to test the property `minSteps`', () async {
      // TODO
    });

    // The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
    // int minDamageTaken
    test('to test the property `minDamageTaken`', () async {
      // TODO
    });

    // The natures that allow this evolution, or null if unrestricted.
    // List<NatureSummary> allowedNatures (default value: const [])
    test('to test the property `allowedNatures`', () async {
      // TODO
    });

    // An additional evolution condition expressed in reverse Polish notation, or null if none.
    // EvolutionConditionExpression conditionExpression
    test('to test the property `conditionExpression`', () async {
      // TODO
    });


  });

}
