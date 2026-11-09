//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EvolutionConditionExpression {
  /// Returns a new [EvolutionConditionExpression] instance.
  EvolutionConditionExpression({
    required this.expression,
    required this.percentageChance,
    this.variables = const [],
  });

  /// Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
  String expression;

  /// Percentage chance of evolution under this condition (0-100)
  double? percentageChance;

  /// Evolution variables referenced in the expression
  List<EvolutionVariableSummary> variables;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EvolutionConditionExpression &&
    other.expression == expression &&
    other.percentageChance == percentageChance &&
    _deepEquality.equals(other.variables, variables);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (expression.hashCode) +
    (percentageChance == null ? 0 : percentageChance!.hashCode) +
    (variables.hashCode);

  @override
  String toString() => 'EvolutionConditionExpression[expression=$expression, percentageChance=$percentageChance, variables=$variables]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'expression'] = this.expression;
    if (this.percentageChance != null) {
      json[r'percentage_chance'] = this.percentageChance;
    } else {
      json[r'percentage_chance'] = null;
    }
      json[r'variables'] = this.variables;
    return json;
  }

  /// Returns a new [EvolutionConditionExpression] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EvolutionConditionExpression? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'expression'), 'Required key "EvolutionConditionExpression[expression]" is missing from JSON.');
        assert(json[r'expression'] != null, 'Required key "EvolutionConditionExpression[expression]" has a null value in JSON.');
        assert(json.containsKey(r'percentage_chance'), 'Required key "EvolutionConditionExpression[percentage_chance]" is missing from JSON.');
        assert(json.containsKey(r'variables'), 'Required key "EvolutionConditionExpression[variables]" is missing from JSON.');
        assert(json[r'variables'] != null, 'Required key "EvolutionConditionExpression[variables]" has a null value in JSON.');
        return true;
      }());

      return EvolutionConditionExpression(
        expression: mapValueOfType<String>(json, r'expression')!,
        percentageChance: mapValueOfType<double>(json, r'percentage_chance'),
        variables: EvolutionVariableSummary.listFromJson(json[r'variables']),
      );
    }
    return null;
  }

  static List<EvolutionConditionExpression> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EvolutionConditionExpression>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EvolutionConditionExpression.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EvolutionConditionExpression> mapFromJson(dynamic json) {
    final map = <String, EvolutionConditionExpression>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EvolutionConditionExpression.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EvolutionConditionExpression-objects as value to a dart map
  static Map<String, List<EvolutionConditionExpression>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EvolutionConditionExpression>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EvolutionConditionExpression.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'expression',
    'percentage_chance',
    'variables',
  };
}

