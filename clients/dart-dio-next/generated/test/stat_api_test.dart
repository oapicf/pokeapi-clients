import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for StatApi
void main() {
  final instance = Openapi().getStatApi();

  group(StatApi, () {
    //Future<String> statList({ int limit, int offset }) async
    test('test statList', () async {
      // TODO
    });

    //Future<String> statRead(int id) async
    test('test statRead', () async {
      // TODO
    });

  });
}
