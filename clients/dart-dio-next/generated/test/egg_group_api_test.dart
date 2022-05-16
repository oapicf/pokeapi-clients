import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for EggGroupApi
void main() {
  final instance = Openapi().getEggGroupApi();

  group(EggGroupApi, () {
    //Future<String> eggGroupList({ int limit, int offset }) async
    test('test eggGroupList', () async {
      // TODO
    });

    //Future<String> eggGroupRead(int id) async
    test('test eggGroupRead', () async {
      // TODO
    });

  });
}
