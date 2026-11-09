import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AbilityPokemonDetail
void main() {
  final instance = AbilityPokemonDetailBuilder();
  // TODO add properties to the builder and call build()

  group(AbilityPokemonDetail, () {
    // Whether or not this a hidden ability for the referenced Pokémon.
    // bool isHidden
    test('to test the property `isHidden`', () async {
      // TODO
    });

    // Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
    // int slot
    test('to test the property `slot`', () async {
      // TODO
    });

    // The Pokémon this ability could belong to.
    // PokemonSummary pokemon
    test('to test the property `pokemon`', () async {
      // TODO
    });

  });
}
