import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for GrowthRateApi
void main() {
  final instance = Openapi().getGrowthRateApi();

  group(GrowthRateApi, () {
    //Future<String> growthRateList({ int limit, int offset }) async
    test('test growthRateList', () async {
      // TODO
    });

    //Future<String> growthRateRead(int id) async
    test('test growthRateRead', () async {
      // TODO
    });

  });
}
