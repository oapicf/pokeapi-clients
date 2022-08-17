import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokemonSpeciesApi
void main() {
  final instance = Openapi().getPokemonSpeciesApi();

  group(PokemonSpeciesApi, () {
    //Future<String> pokemonSpeciesList({ int limit, int offset }) async
    test('test pokemonSpeciesList', () async {
      // TODO
    });

    //Future<String> pokemonSpeciesRead(int id) async
    test('test pokemonSpeciesRead', () async {
      // TODO
    });

  });
}
