import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PokemonMoveVersionGroup
void main() {
  final instance = PokemonMoveVersionGroupBuilder();
  // TODO add properties to the builder and call build()

  group(PokemonMoveVersionGroup, () {
    // The minimum level to learn the move.
    // int levelLearnedAt
    test('to test the property `levelLearnedAt`', () async {
      // TODO
    });

    // The method by which the move is learned.
    // MoveLearnMethodSummary moveLearnMethod
    test('to test the property `moveLearnMethod`', () async {
      // TODO
    });

    // The version group in which the move is learned.
    // VersionGroupSummary versionGroup
    test('to test the property `versionGroup`', () async {
      // TODO
    });

    // Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
    // int order
    test('to test the property `order`', () async {
      // TODO
    });

  });
}
