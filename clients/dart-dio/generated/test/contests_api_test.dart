import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ContestsApi
void main() {
  final instance = Openapi().getContestsApi();

  group(ContestsApi, () {
    // List contest effects
    //
    // Contest effects refer to the effects of moves when used in contests.
    //
    //Future<PaginatedContestEffectSummaryList> contestEffectList({ int limit, int offset, String q }) async
    test('test contestEffectList', () async {
      // TODO
    });

    // Get contest effect
    //
    // Contest effects refer to the effects of moves when used in contests.
    //
    //Future<ContestEffectDetail> contestEffectRetrieve(String id) async
    test('test contestEffectRetrieve', () async {
      // TODO
    });

    // List contest types
    //
    // Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    //
    //Future<PaginatedContestTypeSummaryList> contestTypeList({ int limit, int offset, String q }) async
    test('test contestTypeList', () async {
      // TODO
    });

    // Get contest type
    //
    // Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    //
    //Future<ContestTypeDetail> contestTypeRetrieve(String id) async
    test('test contestTypeRetrieve', () async {
      // TODO
    });

    // List super contest effects
    //
    // Super contest effects refer to the effects of moves when used in super contests.
    //
    //Future<PaginatedSuperContestEffectSummaryList> superContestEffectList({ int limit, int offset, String q }) async
    test('test superContestEffectList', () async {
      // TODO
    });

    // Get super contest effect
    //
    // Super contest effects refer to the effects of moves when used in super contests.
    //
    //Future<SuperContestEffectDetail> superContestEffectRetrieve(String id) async
    test('test superContestEffectRetrieve', () async {
      // TODO
    });

  });
}
