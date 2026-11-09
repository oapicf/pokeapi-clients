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

  /// The percent value of how likely this move is to be successful.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? accuracy;

  /// The base power before the listed version group, or null if power did not change.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? power;

  /// Power points. The number of times this move can be used.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? pp;

  /// The percent value of how likely it is this moves effect will take effect.
  int? effectChance;

  /// The effect of this move listed in different languages.
  List<MoveEffectEffectText> effectEntries;

  /// The elemental type of this move.
  TypeSummary? type;

  /// The version group in which these move stat values were in effect.
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
    (effectChance == null ? 0 : effectChance!.hashCode) +
    (effectEntries.hashCode) +
    (type == null ? 0 : type!.hashCode) +
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
    if (this.effectChance != null) {
      json[r'effect_chance'] = this.effectChance;
    } else {
      json[r'effect_chance'] = null;
    }
      json[r'effect_entries'] = this.effectEntries;
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
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
        assert(json.containsKey(r'effect_chance'), 'Required key "MoveChange[effect_chance]" is missing from JSON.');
        assert(json.containsKey(r'effect_entries'), 'Required key "MoveChange[effect_entries]" is missing from JSON.');
        assert(json[r'effect_entries'] != null, 'Required key "MoveChange[effect_entries]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "MoveChange[type]" is missing from JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "MoveChange[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "MoveChange[version_group]" has a null value in JSON.');
        return true;
      }());

      return MoveChange(
        accuracy: mapValueOfType<int>(json, r'accuracy'),
        power: mapValueOfType<int>(json, r'power'),
        pp: mapValueOfType<int>(json, r'pp'),
        effectChance: mapValueOfType<int>(json, r'effect_chance'),
        effectEntries: MoveEffectEffectText.listFromJson(json[r'effect_entries']),
        type: TypeSummary.fromJson(json[r'type']),
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

