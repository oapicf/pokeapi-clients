import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PokemonPastAbility
void main() {
  final instance = PokemonPastAbilityBuilder();
  // TODO add properties to the builder and call build()

  group(PokemonPastAbility, () {
    // The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
    // BuiltList<PokemonAbilityPast> abilities
    test('to test the property `abilities`', () async {
      // TODO
    });

    // The last generation in which the referenced pokémon had the listed abilities.
    // GenerationSummary generation
    test('to test the property `generation`', () async {
      // TODO
    });

  });
}
