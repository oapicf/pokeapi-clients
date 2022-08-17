import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for GenderApi
void main() {
  final instance = Openapi().getGenderApi();

  group(GenderApi, () {
    //Future<String> genderList({ int limit, int offset }) async
    test('test genderList', () async {
      // TODO
    });

    //Future<String> genderRead(int id) async
    test('test genderRead', () async {
      // TODO
    });

  });
}
