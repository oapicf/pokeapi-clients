import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for MachinesApi
void main() {
  final instance = Openapi().getMachinesApi();

  group(MachinesApi, () {
    // List machines
    //
    // Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    //
    //Future<PaginatedMachineSummaryList> machineList({ int limit, int offset, String q }) async
    test('test machineList', () async {
      // TODO
    });

    // Get machine
    //
    // Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    //
    //Future<MachineDetail> machineRetrieve(String id) async
    test('test machineRetrieve', () async {
      // TODO
    });

  });
}
