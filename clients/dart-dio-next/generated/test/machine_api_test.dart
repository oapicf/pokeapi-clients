import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for MachineApi
void main() {
  final instance = Openapi().getMachineApi();

  group(MachineApi, () {
    //Future<String> machineList({ int limit, int offset }) async
    test('test machineList', () async {
      // TODO
    });

    //Future<String> machineRead(int id) async
    test('test machineRead', () async {
      // TODO
    });

  });
}
