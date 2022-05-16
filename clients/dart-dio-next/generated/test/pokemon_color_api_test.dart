import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokemonColorApi
void main() {
  final instance = Openapi().getPokemonColorApi();

  group(PokemonColorApi, () {
    //Future<String> pokemonColorList({ int limit, int offset }) async
    test('test pokemonColorList', () async {
      // TODO
    });

    //Future<String> pokemonColorRead(int id) async
    test('test pokemonColorRead', () async {
      // TODO
    });

  });
}
