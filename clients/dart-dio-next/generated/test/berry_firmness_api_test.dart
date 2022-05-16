import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for BerryFirmnessApi
void main() {
  final instance = Openapi().getBerryFirmnessApi();

  group(BerryFirmnessApi, () {
    //Future<String> berryFirmnessList({ int limit, int offset }) async
    test('test berryFirmnessList', () async {
      // TODO
    });

    //Future<String> berryFirmnessRead(int id) async
    test('test berryFirmnessRead', () async {
      // TODO
    });

  });
}
