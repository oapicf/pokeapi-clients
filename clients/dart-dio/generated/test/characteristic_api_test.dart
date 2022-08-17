import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CharacteristicApi
void main() {
  final instance = Openapi().getCharacteristicApi();

  group(CharacteristicApi, () {
    //Future<String> characteristicList({ int limit, int offset }) async
    test('test characteristicList', () async {
      // TODO
    });

    //Future<String> characteristicRead(int id) async
    test('test characteristicRead', () async {
      // TODO
    });

  });
}
