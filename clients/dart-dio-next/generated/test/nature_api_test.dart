import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for NatureApi
void main() {
  final instance = Openapi().getNatureApi();

  group(NatureApi, () {
    //Future<String> natureList({ int limit, int offset }) async
    test('test natureList', () async {
      // TODO
    });

    //Future<String> natureRead(int id) async
    test('test natureRead', () async {
      // TODO
    });

  });
}
