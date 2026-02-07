import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for EncountersApi
void main() {
  final instance = Openapi().getEncountersApi();

  group(EncountersApi, () {
    // List encounter conditions
    //
    // Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    //
    //Future<PaginatedEncounterConditionSummaryList> encounterConditionList({ int limit, int offset, String q }) async
    test('test encounterConditionList', () async {
      // TODO
    });

    // Get encounter condition
    //
    // Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    //
    //Future<EncounterConditionDetail> encounterConditionRetrieve(String id) async
    test('test encounterConditionRetrieve', () async {
      // TODO
    });

    // List encounter condition values
    //
    // Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    //
    //Future<PaginatedEncounterConditionValueSummaryList> encounterConditionValueList({ int limit, int offset, String q }) async
    test('test encounterConditionValueList', () async {
      // TODO
    });

    // Get encounter condition value
    //
    // Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    //
    //Future<EncounterConditionValueDetail> encounterConditionValueRetrieve(String id) async
    test('test encounterConditionValueRetrieve', () async {
      // TODO
    });

    // List encounter methods
    //
    // Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    //
    //Future<PaginatedEncounterMethodSummaryList> encounterMethodList({ int limit, int offset, String q }) async
    test('test encounterMethodList', () async {
      // TODO
    });

    // Get encounter method
    //
    // Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    //
    //Future<EncounterMethodDetail> encounterMethodRetrieve(String id) async
    test('test encounterMethodRetrieve', () async {
      // TODO
    });

    // Get pokemon encounter
    //
    // Handles Pokemon Encounters as a sub-resource.
    //
    //Future<BuiltList<PokemonEncountersRetrieve200ResponseInner>> pokemonEncountersRetrieve(String pokemonId) async
    test('test pokemonEncountersRetrieve', () async {
      // TODO
    });

  });
}
