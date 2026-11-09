//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveStatChange {
  /// Returns a new [MoveStatChange] instance.
  MoveStatChange({
    required this.change,
    required this.move,
  });

  /// The maximum amount of change to the referenced stat.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int change;

  /// The move causing the change.
  MoveSummary move;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveStatChange &&
    other.change == change &&
    other.move == move;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (change.hashCode) +
    (move.hashCode);

  @override
  String toString() => 'MoveStatChange[change=$change, move=$move]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'change'] = this.change;
      json[r'move'] = this.move;
    return json;
  }

  /// Returns a new [MoveStatChange] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveStatChange? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'change'), 'Required key "MoveStatChange[change]" is missing from JSON.');
        assert(json[r'change'] != null, 'Required key "MoveStatChange[change]" has a null value in JSON.');
        assert(json.containsKey(r'move'), 'Required key "MoveStatChange[move]" is missing from JSON.');
        assert(json[r'move'] != null, 'Required key "MoveStatChange[move]" has a null value in JSON.');
        return true;
      }());

      return MoveStatChange(
        change: mapValueOfType<int>(json, r'change')!,
        move: MoveSummary.fromJson(json[r'move'])!,
      );
    }
    return null;
  }

  static List<MoveStatChange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveStatChange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveStatChange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveStatChange> mapFromJson(dynamic json) {
    final map = <String, MoveStatChange>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveStatChange.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveStatChange-objects as value to a dart map
  static Map<String, List<MoveStatChange>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveStatChange>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveStatChange.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'change',
    'move',
  };
}

