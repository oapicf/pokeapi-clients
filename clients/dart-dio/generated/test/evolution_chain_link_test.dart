import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for EvolutionChainLink
void main() {
  final instance = EvolutionChainLinkBuilder();
  // TODO add properties to the builder and call build()

  group(EvolutionChainLink, () {
    // Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
    // bool isBaby
    test('to test the property `isBaby`', () async {
      // TODO
    });

    // The Pokémon species at this point in the evolution chain.
    // PokemonSpeciesSummary species
    test('to test the property `species`', () async {
      // TODO
    });

    // All details regarding the specific details of the referenced Pokémon species evolution.
    // BuiltList<PokemonEvolution> evolutionDetails
    test('to test the property `evolutionDetails`', () async {
      // TODO
    });

    // A List of chain objects.
    // BuiltList<EvolutionChainLink> evolvesTo
    test('to test the property `evolvesTo`', () async {
      // TODO
    });

  });
}
