//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EncounterConditionDetail {
  /// Returns a new [EncounterConditionDetail] instance.
  EncounterConditionDetail({
    required this.id,
    required this.name,
    this.values = const [],
    this.names = const [],
  });

  int id;

  String name;

  List<EncounterConditionValueSummary> values;

  List<EncounterConditionName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EncounterConditionDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.values, values) &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (values.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'EncounterConditionDetail[id=$id, name=$name, values=$values, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'values'] = this.values;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [EncounterConditionDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EncounterConditionDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EncounterConditionDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EncounterConditionDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EncounterConditionDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        values: EncounterConditionValueSummary.listFromJson(json[r'values']),
        names: EncounterConditionName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<EncounterConditionDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EncounterConditionDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EncounterConditionDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EncounterConditionDetail> mapFromJson(dynamic json) {
    final map = <String, EncounterConditionDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EncounterConditionDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EncounterConditionDetail-objects as value to a dart map
  static Map<String, List<EncounterConditionDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EncounterConditionDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EncounterConditionDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'values',
    'names',
  };
}

