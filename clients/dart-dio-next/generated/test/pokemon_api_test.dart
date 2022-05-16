import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokemonApi
void main() {
  final instance = Openapi().getPokemonApi();

  group(PokemonApi, () {
    //Future<String> pokemonList({ int limit, int offset }) async
    test('test pokemonList', () async {
      // TODO
    });

    //Future<String> pokemonRead(int id) async
    test('test pokemonRead', () async {
      // TODO
    });

  });
}
