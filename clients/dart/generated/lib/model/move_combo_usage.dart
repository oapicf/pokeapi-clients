//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveComboUsage {
  /// Returns a new [MoveComboUsage] instance.
  MoveComboUsage({
    this.useBefore = const [],
    this.useAfter = const [],
  });

  /// A list of moves to use before this move.
  List<MoveSummary>? useBefore;

  /// A list of moves to use after this move.
  List<MoveSummary>? useAfter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveComboUsage &&
    _deepEquality.equals(other.useBefore, useBefore) &&
    _deepEquality.equals(other.useAfter, useAfter);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (useBefore == null ? 0 : useBefore!.hashCode) +
    (useAfter == null ? 0 : useAfter!.hashCode);

  @override
  String toString() => 'MoveComboUsage[useBefore=$useBefore, useAfter=$useAfter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.useBefore != null) {
      json[r'use_before'] = this.useBefore;
    } else {
      json[r'use_before'] = null;
    }
    if (this.useAfter != null) {
      json[r'use_after'] = this.useAfter;
    } else {
      json[r'use_after'] = null;
    }
    return json;
  }

  /// Returns a new [MoveComboUsage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveComboUsage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'use_before'), 'Required key "MoveComboUsage[use_before]" is missing from JSON.');
        assert(json.containsKey(r'use_after'), 'Required key "MoveComboUsage[use_after]" is missing from JSON.');
        return true;
      }());

      return MoveComboUsage(
        useBefore: MoveSummary.listFromJson(json[r'use_before']),
        useAfter: MoveSummary.listFromJson(json[r'use_after']),
      );
    }
    return null;
  }

  static List<MoveComboUsage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveComboUsage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveComboUsage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveComboUsage> mapFromJson(dynamic json) {
    final map = <String, MoveComboUsage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveComboUsage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveComboUsage-objects as value to a dart map
  static Map<String, List<MoveComboUsage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveComboUsage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveComboUsage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'use_before',
    'use_after',
  };
}

