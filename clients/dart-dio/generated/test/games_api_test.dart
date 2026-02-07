import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for GamesApi
void main() {
  final instance = Openapi().getGamesApi();

  group(GamesApi, () {
    // List genrations
    //
    // A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    //
    //Future<PaginatedGenerationSummaryList> generationList({ int limit, int offset, String q }) async
    test('test generationList', () async {
      // TODO
    });

    // Get genration
    //
    // A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    //
    //Future<GenerationDetail> generationRetrieve(String id) async
    test('test generationRetrieve', () async {
      // TODO
    });

    // List pokedex
    //
    // A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    //
    //Future<PaginatedPokedexSummaryList> pokedexList({ int limit, int offset, String q }) async
    test('test pokedexList', () async {
      // TODO
    });

    // Get pokedex
    //
    // A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    //
    //Future<PokedexDetail> pokedexRetrieve(String id) async
    test('test pokedexRetrieve', () async {
      // TODO
    });

    // List version groups
    //
    // Version groups categorize highly similar versions of the games.
    //
    //Future<PaginatedVersionGroupSummaryList> versionGroupList({ int limit, int offset, String q }) async
    test('test versionGroupList', () async {
      // TODO
    });

    // Get version group
    //
    // Version groups categorize highly similar versions of the games.
    //
    //Future<VersionGroupDetail> versionGroupRetrieve(String id) async
    test('test versionGroupRetrieve', () async {
      // TODO
    });

    // List versions
    //
    // Versions of the games, e.g., Red, Blue or Yellow.
    //
    //Future<PaginatedVersionSummaryList> versionList({ int limit, int offset, String q }) async
    test('test versionList', () async {
      // TODO
    });

    // Get version
    //
    // Versions of the games, e.g., Red, Blue or Yellow.
    //
    //Future<VersionDetail> versionRetrieve(String id) async
    test('test versionRetrieve', () async {
      // TODO
    });

  });
}
