import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for EvolutionConditionExpression
void main() {
  final instance = EvolutionConditionExpressionBuilder();
  // TODO add properties to the builder and call build()

  group(EvolutionConditionExpression, () {
    // Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
    // String expression
    test('to test the property `expression`', () async {
      // TODO
    });

    // Percentage chance of evolution under this condition (0-100)
    // double percentageChance
    test('to test the property `percentageChance`', () async {
      // TODO
    });

    // Evolution variables referenced in the expression
    // BuiltList<EvolutionVariableSummary> variables
    test('to test the property `variables`', () async {
      // TODO
    });

  });
}
