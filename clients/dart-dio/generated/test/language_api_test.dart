import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for LanguageApi
void main() {
  final instance = Openapi().getLanguageApi();

  group(LanguageApi, () {
    //Future<String> languageList({ int limit, int offset }) async
    test('test languageList', () async {
      // TODO
    });

    //Future<String> languageRead(int id) async
    test('test languageRead', () async {
      // TODO
    });

  });
}
