import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokedexApi
void main() {
  final instance = Openapi().getPokedexApi();

  group(PokedexApi, () {
    //Future<String> pokedexList({ int limit, int offset }) async
    test('test pokedexList', () async {
      // TODO
    });

    //Future<String> pokedexRead(int id) async
    test('test pokedexRead', () async {
      // TODO
    });

  });
}
