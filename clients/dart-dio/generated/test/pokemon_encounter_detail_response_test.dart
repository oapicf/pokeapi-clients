import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PokemonEncounterDetailResponse
void main() {
  final instance = PokemonEncounterDetailResponseBuilder();
  // TODO add properties to the builder and call build()

  group(PokemonEncounterDetailResponse, () {
    // Percent chance that this encounter will occur.
    // int chance
    test('to test the property `chance`', () async {
      // TODO
    });

    // A list of condition values that must be in effect for this encounter to occur.
    // BuiltList<EncounterConditionValueSummary> conditionValues
    test('to test the property `conditionValues`', () async {
      // TODO
    });

    // The highest level the Pokémon could be encountered at.
    // int maxLevel
    test('to test the property `maxLevel`', () async {
      // TODO
    });

    // The method by which this encounter happens.
    // EncounterMethodSummary method
    test('to test the property `method`', () async {
      // TODO
    });

    // The lowest level the Pokémon could be encountered at.
    // int minLevel
    test('to test the property `minLevel`', () async {
      // TODO
    });

  });
}
