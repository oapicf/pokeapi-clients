import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PokemonFormFlavorText
void main() {
  final instance = PokemonFormFlavorTextBuilder();
  // TODO add properties to the builder and call build()

  group(PokemonFormFlavorText, () {
    // The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
    // String flavorText
    test('to test the property `flavorText`', () async {
      // TODO
    });

    // The language this name is in.
    // LanguageSummary language
    test('to test the property `language`', () async {
      // TODO
    });

    // The game version this flavor text is extracted from.
    // VersionSummary version
    test('to test the property `version`', () async {
      // TODO
    });

  });
}
