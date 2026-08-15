//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EncounterConditionValueDetail {
  /// Returns a new [EncounterConditionValueDetail] instance.
  EncounterConditionValueDetail({
    required this.id,
    required this.name,
    required this.condition,
    this.names = const [],
  });

  int id;

  String name;

  EncounterConditionSummary condition;

  List<EncounterConditionValueName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EncounterConditionValueDetail &&
    other.id == id &&
    other.name == name &&
    other.condition == condition &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (condition.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'EncounterConditionValueDetail[id=$id, name=$name, condition=$condition, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'condition'] = this.condition;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [EncounterConditionValueDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EncounterConditionValueDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EncounterConditionValueDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EncounterConditionValueDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EncounterConditionValueDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        condition: EncounterConditionSummary.fromJson(json[r'condition'])!,
        names: EncounterConditionValueName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<EncounterConditionValueDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EncounterConditionValueDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EncounterConditionValueDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EncounterConditionValueDetail> mapFromJson(dynamic json) {
    final map = <String, EncounterConditionValueDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EncounterConditionValueDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EncounterConditionValueDetail-objects as value to a dart map
  static Map<String, List<EncounterConditionValueDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EncounterConditionValueDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EncounterConditionValueDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'condition',
    'names',
  };
}

