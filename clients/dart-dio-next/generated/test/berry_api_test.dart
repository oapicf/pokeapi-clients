import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for BerryApi
void main() {
  final instance = Openapi().getBerryApi();

  group(BerryApi, () {
    //Future<String> berryList({ int limit, int offset }) async
    test('test berryList', () async {
      // TODO
    });

    //Future<String> berryRead(int id) async
    test('test berryRead', () async {
      // TODO
    });

  });
}
