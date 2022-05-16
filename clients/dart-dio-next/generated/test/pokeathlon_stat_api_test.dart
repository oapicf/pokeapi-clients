import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PokeathlonStatApi
void main() {
  final instance = Openapi().getPokeathlonStatApi();

  group(PokeathlonStatApi, () {
    //Future<String> pokeathlonStatList({ int limit, int offset }) async
    test('test pokeathlonStatList', () async {
      // TODO
    });

    //Future<String> pokeathlonStatRead(int id) async
    test('test pokeathlonStatRead', () async {
      // TODO
    });

  });
}
