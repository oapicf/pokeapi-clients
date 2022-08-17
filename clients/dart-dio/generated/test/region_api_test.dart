import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for RegionApi
void main() {
  final instance = Openapi().getRegionApi();

  group(RegionApi, () {
    //Future<String> regionList({ int limit, int offset }) async
    test('test regionList', () async {
      // TODO
    });

    //Future<String> regionRead(int id) async
    test('test regionRead', () async {
      // TODO
    });

  });
}
