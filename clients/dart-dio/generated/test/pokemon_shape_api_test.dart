import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokemonShapeApi
void main() {
  final instance = Openapi().getPokemonShapeApi();

  group(PokemonShapeApi, () {
    //Future<String> pokemonShapeList({ int limit, int offset }) async
    test('test pokemonShapeList', () async {
      // TODO
    });

    //Future<String> pokemonShapeRead(int id) async
    test('test pokemonShapeRead', () async {
      // TODO
    });

  });
}
