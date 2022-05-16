import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for TypeApi
void main() {
  final instance = Openapi().getTypeApi();

  group(TypeApi, () {
    //Future<String> typeList({ int limit, int offset }) async
    test('test typeList', () async {
      // TODO
    });

    //Future<String> typeRead(int id) async
    test('test typeRead', () async {
      // TODO
    });

  });
}
