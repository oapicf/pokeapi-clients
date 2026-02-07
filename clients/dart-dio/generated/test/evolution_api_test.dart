import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for EvolutionApi
void main() {
  final instance = Openapi().getEvolutionApi();

  group(EvolutionApi, () {
    // List evolution chains
    //
    // Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    //
    //Future<PaginatedEvolutionChainSummaryList> evolutionChainList({ int limit, int offset, String q }) async
    test('test evolutionChainList', () async {
      // TODO
    });

    // Get evolution chain
    //
    // Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    //
    //Future<EvolutionChainDetail> evolutionChainRetrieve(String id) async
    test('test evolutionChainRetrieve', () async {
      // TODO
    });

    // List evolution triggers
    //
    // Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    //
    //Future<PaginatedEvolutionTriggerSummaryList> evolutionTriggerList({ int limit, int offset, String q }) async
    test('test evolutionTriggerList', () async {
      // TODO
    });

    // Get evolution trigger
    //
    // Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    //
    //Future<EvolutionTriggerDetail> evolutionTriggerRetrieve(String id) async
    test('test evolutionTriggerRetrieve', () async {
      // TODO
    });

  });
}
