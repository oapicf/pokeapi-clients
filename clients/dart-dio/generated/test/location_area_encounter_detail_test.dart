import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for LocationAreaEncounterDetail
void main() {
  final instance = LocationAreaEncounterDetailBuilder();
  // TODO add properties to the builder and call build()

  group(LocationAreaEncounterDetail, () {
    // The lowest level the Pokémon could be encountered at.
    // int minLevel
    test('to test the property `minLevel`', () async {
      // TODO
    });

    // The highest level the Pokémon could be encountered at.
    // int maxLevel
    test('to test the property `maxLevel`', () async {
      // TODO
    });

    // Percent chance that this encounter will occur.
    // int chance (default value: 0)
    test('to test the property `chance`', () async {
      // TODO
    });

    // The method by which this encounter happens.
    // EncounterMethodSummary method
    test('to test the property `method`', () async {
      // TODO
    });

    // A list of condition values that must be in effect for this encounter to occur.
    // BuiltList<EncounterConditionValueSummary> conditionValues
    test('to test the property `conditionValues`', () async {
      // TODO
    });

    // Additional properties of the encountered Pokémon, or null if unspecified.
    // EncounterPokemonDetail pokemonDetails
    test('to test the property `pokemonDetails`', () async {
      // TODO
    });

  });
}
