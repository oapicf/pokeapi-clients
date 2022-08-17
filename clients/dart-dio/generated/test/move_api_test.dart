import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for MoveApi
void main() {
  final instance = Openapi().getMoveApi();

  group(MoveApi, () {
    //Future<String> moveList({ int limit, int offset }) async
    test('test moveList', () async {
      // TODO
    });

    //Future<String> moveRead(int id) async
    test('test moveRead', () async {
      // TODO
    });

  });
}
