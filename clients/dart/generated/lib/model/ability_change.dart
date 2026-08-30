//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AbilityChange {
  /// Returns a new [AbilityChange] instance.
  AbilityChange({
    required this.versionGroup,
    this.effectEntries = const [],
  });

  VersionGroupSummary versionGroup;

  List<AbilityChangeEffectText> effectEntries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AbilityChange &&
    other.versionGroup == versionGroup &&
    _deepEquality.equals(other.effectEntries, effectEntries);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (versionGroup.hashCode) +
    (effectEntries.hashCode);

  @override
  String toString() => 'AbilityChange[versionGroup=$versionGroup, effectEntries=$effectEntries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'version_group'] = this.versionGroup;
      json[r'effect_entries'] = this.effectEntries;
    return json;
  }

  /// Returns a new [AbilityChange] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AbilityChange? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'version_group'), 'Required key "AbilityChange[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "AbilityChange[version_group]" has a null value in JSON.');
        assert(json.containsKey(r'effect_entries'), 'Required key "AbilityChange[effect_entries]" is missing from JSON.');
        assert(json[r'effect_entries'] != null, 'Required key "AbilityChange[effect_entries]" has a null value in JSON.');
        return true;
      }());

      return AbilityChange(
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
        effectEntries: AbilityChangeEffectText.listFromJson(json[r'effect_entries']),
      );
    }
    return null;
  }

  static List<AbilityChange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AbilityChange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AbilityChange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AbilityChange> mapFromJson(dynamic json) {
    final map = <String, AbilityChange>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AbilityChange.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AbilityChange-objects as value to a dart map
  static Map<String, List<AbilityChange>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AbilityChange>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AbilityChange.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'version_group',
    'effect_entries',
  };
}

