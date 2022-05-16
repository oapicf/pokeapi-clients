import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ItemPocketApi
void main() {
  final instance = Openapi().getItemPocketApi();

  group(ItemPocketApi, () {
    //Future<String> itemPocketList({ int limit, int offset }) async
    test('test itemPocketList', () async {
      // TODO
    });

    //Future<String> itemPocketRead(int id) async
    test('test itemPocketRead', () async {
      // TODO
    });

  });
}
