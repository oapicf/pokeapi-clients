import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokemonFormApi
void main() {
  final instance = Openapi().getPokemonFormApi();

  group(PokemonFormApi, () {
    //Future<String> pokemonFormList({ int limit, int offset }) async
    test('test pokemonFormList', () async {
      // TODO
    });

    //Future<String> pokemonFormRead(int id) async
    test('test pokemonFormRead', () async {
      // TODO
    });

  });
}
