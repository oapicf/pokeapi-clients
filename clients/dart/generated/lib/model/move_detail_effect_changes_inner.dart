//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveDetailEffectChangesInner {
  /// Returns a new [MoveDetailEffectChangesInner] instance.
  MoveDetailEffectChangesInner({
    this.effectEntries = const [],
    required this.versionGroup,
  });

  List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries;

  AbilityDetailPokemonInnerPokemon versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveDetailEffectChangesInner &&
    _deepEquality.equals(other.effectEntries, effectEntries) &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (effectEntries.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'MoveDetailEffectChangesInner[effectEntries=$effectEntries, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'effect_entries'] = this.effectEntries;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [MoveDetailEffectChangesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveDetailEffectChangesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'effect_entries'), 'Required key "MoveDetailEffectChangesInner[effect_entries]" is missing from JSON.');
        assert(json[r'effect_entries'] != null, 'Required key "MoveDetailEffectChangesInner[effect_entries]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "MoveDetailEffectChangesInner[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "MoveDetailEffectChangesInner[version_group]" has a null value in JSON.');
        return true;
      }());

      return MoveDetailEffectChangesInner(
        effectEntries: MoveDetailEffectChangesInnerEffectEntriesInner.listFromJson(json[r'effect_entries']),
        versionGroup: AbilityDetailPokemonInnerPokemon.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<MoveDetailEffectChangesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveDetailEffectChangesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveDetailEffectChangesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveDetailEffectChangesInner> mapFromJson(dynamic json) {
    final map = <String, MoveDetailEffectChangesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveDetailEffectChangesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveDetailEffectChangesInner-objects as value to a dart map
  static Map<String, List<MoveDetailEffectChangesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveDetailEffectChangesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveDetailEffectChangesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'effect_entries',
    'version_group',
  };
}

