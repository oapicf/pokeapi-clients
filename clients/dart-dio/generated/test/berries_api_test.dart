import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for BerriesApi
void main() {
  final instance = Openapi().getBerriesApi();

  group(BerriesApi, () {
    // List berry firmness
    //
    // Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    //
    //Future<PaginatedBerryFirmnessSummaryList> berryFirmnessList({ int limit, int offset, String q }) async
    test('test berryFirmnessList', () async {
      // TODO
    });

    // Get berry by firmness
    //
    // Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    //
    //Future<BerryFirmnessDetail> berryFirmnessRetrieve(String id) async
    test('test berryFirmnessRetrieve', () async {
      // TODO
    });

    // List berry flavors
    //
    // Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    //
    //Future<PaginatedBerryFlavorSummaryList> berryFlavorList({ int limit, int offset, String q }) async
    test('test berryFlavorList', () async {
      // TODO
    });

    // Get berries by flavor
    //
    // Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    //
    //Future<BerryFlavorDetail> berryFlavorRetrieve(String id) async
    test('test berryFlavorRetrieve', () async {
      // TODO
    });

    // List berries
    //
    // Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    //
    //Future<PaginatedBerrySummaryList> berryList({ int limit, int offset, String q }) async
    test('test berryList', () async {
      // TODO
    });

    // Get a berry
    //
    // Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    //
    //Future<BerryDetail> berryRetrieve(String id) async
    test('test berryRetrieve', () async {
      // TODO
    });

  });
}
