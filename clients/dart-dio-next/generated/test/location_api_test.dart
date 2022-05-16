import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for LocationApi
void main() {
  final instance = Openapi().getLocationApi();

  group(LocationApi, () {
    //Future<String> locationList({ int limit, int offset }) async
    test('test locationList', () async {
      // TODO
    });

    //Future<String> locationRead(int id) async
    test('test locationRead', () async {
      // TODO
    });

  });
}
