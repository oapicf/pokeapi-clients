import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for UtilityApi
void main() {
  final instance = Openapi().getUtilityApi();

  group(UtilityApi, () {
    // List languages
    //
    // Languages for translations of API resource information.
    //
    //Future<PaginatedLanguageSummaryList> languageList({ int limit, int offset, String q }) async
    test('test languageList', () async {
      // TODO
    });

    // Get language
    //
    // Languages for translations of API resource information.
    //
    //Future<LanguageDetail> languageRetrieve(String id) async
    test('test languageRetrieve', () async {
      // TODO
    });

  });
}
