import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PokemonFormTriggerCondition
void main() {
  final instance = PokemonFormTriggerConditionBuilder();
  // TODO add properties to the builder and call build()

  group(PokemonFormTriggerCondition, () {
    // The trigger for this form change.
    // String trigger
    test('to test the property `trigger`', () async {
      // TODO
    });

    // The name of the required item, ability, or move. Only present for a resource-based trigger.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The URL of the required item, ability, or move. Only present for a resource-based trigger.
    // String url
    test('to test the property `url`', () async {
      // TODO
    });

    // The required base form. Only present when the trigger specifies one.
    // PokemonFormSummary baseForm
    test('to test the property `baseForm`', () async {
      // TODO
    });

  });
}
