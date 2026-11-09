import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PokemonSpritesOtherOfficialArtwork
void main() {
  final instance = PokemonSpritesOtherOfficialArtworkBuilder();
  // TODO add properties to the builder and call build()

  group(PokemonSpritesOtherOfficialArtwork, () {
    // The URL of the default front official artwork, or null if unavailable.
    // String frontDefault
    test('to test the property `frontDefault`', () async {
      // TODO
    });

    // The URL of the shiny front official artwork, or null if unavailable.
    // String frontShiny
    test('to test the property `frontShiny`', () async {
      // TODO
    });

    // Additional official artwork grouped by version. Available keys vary by resource.
    // BuiltMap<String, BuiltMap<String, JsonObject?>> versions
    test('to test the property `versions`', () async {
      // TODO
    });

  });
}
