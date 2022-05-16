import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for VersionGroupApi
void main() {
  final instance = Openapi().getVersionGroupApi();

  group(VersionGroupApi, () {
    //Future<String> versionGroupList({ int limit, int offset }) async
    test('test versionGroupList', () async {
      // TODO
    });

    //Future<String> versionGroupRead(int id) async
    test('test versionGroupRead', () async {
      // TODO
    });

  });
}
