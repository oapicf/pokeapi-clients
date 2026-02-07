import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for LocationApi
void main() {
  final instance = Openapi().getLocationApi();

  group(LocationApi, () {
    // List location areas
    //
    // Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    //
    //Future<PaginatedLocationAreaSummaryList> locationAreaList({ int limit, int offset }) async
    test('test locationAreaList', () async {
      // TODO
    });

    // Get location area
    //
    // Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    //
    //Future<LocationAreaDetail> locationAreaRetrieve(int id) async
    test('test locationAreaRetrieve', () async {
      // TODO
    });

    // List locations
    //
    // Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    //
    //Future<PaginatedLocationSummaryList> locationList({ int limit, int offset, String q }) async
    test('test locationList', () async {
      // TODO
    });

    // Get location
    //
    // Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    //
    //Future<LocationDetail> locationRetrieve(String id) async
    test('test locationRetrieve', () async {
      // TODO
    });

    // List pal park areas
    //
    // Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
    //
    //Future<PaginatedPalParkAreaSummaryList> palParkAreaList({ int limit, int offset, String q }) async
    test('test palParkAreaList', () async {
      // TODO
    });

    // Get pal park area
    //
    // Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
    //
    //Future<PalParkAreaDetail> palParkAreaRetrieve(String id) async
    test('test palParkAreaRetrieve', () async {
      // TODO
    });

    // List regions
    //
    // A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    //
    //Future<PaginatedRegionSummaryList> regionList({ int limit, int offset, String q }) async
    test('test regionList', () async {
      // TODO
    });

    // Get region
    //
    // A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    //
    //Future<RegionDetail> regionRetrieve(String id) async
    test('test regionRetrieve', () async {
      // TODO
    });

  });
}
