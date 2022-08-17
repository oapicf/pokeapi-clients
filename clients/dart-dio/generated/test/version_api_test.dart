import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for VersionApi
void main() {
  final instance = Openapi().getVersionApi();

  group(VersionApi, () {
    //Future<String> versionList({ int limit, int offset }) async
    test('test versionList', () async {
      // TODO
    });

    //Future<String> versionRead(int id) async
    test('test versionRead', () async {
      // TODO
    });

  });
}
