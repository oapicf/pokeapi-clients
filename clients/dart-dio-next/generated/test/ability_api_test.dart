import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AbilityApi
void main() {
  final instance = Openapi().getAbilityApi();

  group(AbilityApi, () {
    //Future<String> abilityList({ int limit, int offset }) async
    test('test abilityList', () async {
      // TODO
    });

    //Future<String> abilityRead(int id) async
    test('test abilityRead', () async {
      // TODO
    });

  });
}
