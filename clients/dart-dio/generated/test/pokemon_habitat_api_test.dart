import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokemonHabitatApi
void main() {
  final instance = Openapi().getPokemonHabitatApi();

  group(PokemonHabitatApi, () {
    //Future<String> pokemonHabitatList({ int limit, int offset }) async
    test('test pokemonHabitatList', () async {
      // TODO
    });

    //Future<String> pokemonHabitatRead(int id) async
    test('test pokemonHabitatRead', () async {
      // TODO
    });

  });
}
