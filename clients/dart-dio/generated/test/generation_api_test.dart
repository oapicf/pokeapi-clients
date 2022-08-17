import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for GenerationApi
void main() {
  final instance = Openapi().getGenerationApi();

  group(GenerationApi, () {
    //Future<String> generationList({ int limit, int offset }) async
    test('test generationList', () async {
      // TODO
    });

    //Future<String> generationRead(int id) async
    test('test generationRead', () async {
      // TODO
    });

  });
}
