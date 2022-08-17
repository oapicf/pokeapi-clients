import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ItemApi
void main() {
  final instance = Openapi().getItemApi();

  group(ItemApi, () {
    //Future<String> itemList({ int limit, int offset }) async
    test('test itemList', () async {
      // TODO
    });

    //Future<String> itemRead(int id) async
    test('test itemRead', () async {
      // TODO
    });

  });
}
