//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class StatAffectingNatures {
  /// Returns a new [StatAffectingNatures] instance.
  StatAffectingNatures({
    this.increase = const [],
    this.decrease = const [],
  });

  /// A list of natures and how they change the referenced stat.
  List<NatureSummary> increase;

  /// A list of nature sand how they change the referenced stat.
  List<NatureSummary> decrease;

  @override
  bool operator ==(Object other) => identical(this, other) || other is StatAffectingNatures &&
    _deepEquality.equals(other.increase, increase) &&
    _deepEquality.equals(other.decrease, decrease);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (increase.hashCode) +
    (decrease.hashCode);

  @override
  String toString() => 'StatAffectingNatures[increase=$increase, decrease=$decrease]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'increase'] = this.increase;
      json[r'decrease'] = this.decrease;
    return json;
  }

  /// Returns a new [StatAffectingNatures] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static StatAffectingNatures? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'increase'), 'Required key "StatAffectingNatures[increase]" is missing from JSON.');
        assert(json[r'increase'] != null, 'Required key "StatAffectingNatures[increase]" has a null value in JSON.');
        assert(json.containsKey(r'decrease'), 'Required key "StatAffectingNatures[decrease]" is missing from JSON.');
        assert(json[r'decrease'] != null, 'Required key "StatAffectingNatures[decrease]" has a null value in JSON.');
        return true;
      }());

      return StatAffectingNatures(
        increase: NatureSummary.listFromJson(json[r'increase']),
        decrease: NatureSummary.listFromJson(json[r'decrease']),
      );
    }
    return null;
  }

  static List<StatAffectingNatures> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StatAffectingNatures>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StatAffectingNatures.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, StatAffectingNatures> mapFromJson(dynamic json) {
    final map = <String, StatAffectingNatures>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = StatAffectingNatures.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of StatAffectingNatures-objects as value to a dart map
  static Map<String, List<StatAffectingNatures>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<StatAffectingNatures>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = StatAffectingNatures.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'increase',
    'decrease',
  };
}

