//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveChange {
  /// Returns a new [MoveChange] instance.
  MoveChange({
    this.accuracy,
    this.power,
    this.pp,
    required this.effectChance,
    this.effectEntries = const [],
    required this.type,
    required this.versionGroup,
  });

  int? accuracy;

  int? power;

  int? pp;

  int effectChance;

  List<MoveChangeEffectEntriesInner> effectEntries;

  TypeSummary type;

  VersionGroupSummary versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveChange &&
    other.accuracy == accuracy &&
    other.power == power &&
    other.pp == pp &&
    other.effectChance == effectChance &&
    _deepEquality.equals(other.effectEntries, effectEntries) &&
    other.type == type &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accuracy == null ? 0 : accuracy!.hashCode) +
    (power == null ? 0 : power!.hashCode) +
    (pp == null ? 0 : pp!.hashCode) +
    (effectChance.hashCode) +
    (effectEntries.hashCode) +
    (type.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'MoveChange[accuracy=$accuracy, power=$power, pp=$pp, effectChance=$effectChance, effectEntries=$effectEntries, type=$type, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.accuracy != null) {
      json[r'accuracy'] = this.accuracy;
    } else {
      json[r'accuracy'] = null;
    }
    if (this.power != null) {
      json[r'power'] = this.power;
    } else {
      json[r'power'] = null;
    }
    if (this.pp != null) {
      json[r'pp'] = this.pp;
    } else {
      json[r'pp'] = null;
    }
      json[r'effect_chance'] = this.effectChance;
      json[r'effect_entries'] = this.effectEntries;
      json[r'type'] = this.type;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [MoveChange] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveChange? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveChange[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveChange[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveChange(
        accuracy: mapValueOfType<int>(json, r'accuracy'),
        power: mapValueOfType<int>(json, r'power'),
        pp: mapValueOfType<int>(json, r'pp'),
        effectChance: mapValueOfType<int>(json, r'effect_chance')!,
        effectEntries: MoveChangeEffectEntriesInner.listFromJson(json[r'effect_entries']),
        type: TypeSummary.fromJson(json[r'type'])!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<MoveChange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveChange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveChange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveChange> mapFromJson(dynamic json) {
    final map = <String, MoveChange>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveChange.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveChange-objects as value to a dart map
  static Map<String, List<MoveChange>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveChange>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveChange.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'effect_chance',
    'effect_entries',
    'type',
    'version_group',
  };
}

