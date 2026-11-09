import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TypeRelationships
void main() {
  final instance = TypeRelationshipsBuilder();
  // TODO add properties to the builder and call build()

  group(TypeRelationships, () {
    // A list of types this type has no effect on.
    // BuiltList<TypeSummary> noDamageTo
    test('to test the property `noDamageTo`', () async {
      // TODO
    });

    // A list of types this type is not very effect against.
    // BuiltList<TypeSummary> halfDamageTo
    test('to test the property `halfDamageTo`', () async {
      // TODO
    });

    // A list of types this type is very effect against.
    // BuiltList<TypeSummary> doubleDamageTo
    test('to test the property `doubleDamageTo`', () async {
      // TODO
    });

    // A list of types that have no effect on this type.
    // BuiltList<TypeSummary> noDamageFrom
    test('to test the property `noDamageFrom`', () async {
      // TODO
    });

    // A list of types that are not very effective against this type.
    // BuiltList<TypeSummary> halfDamageFrom
    test('to test the property `halfDamageFrom`', () async {
      // TODO
    });

    // A list of types that are very effective against this type.
    // BuiltList<TypeSummary> doubleDamageFrom
    test('to test the property `doubleDamageFrom`', () async {
      // TODO
    });

  });
}
