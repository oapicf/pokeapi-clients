//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveDetailEffectChangesInnerEffectEntriesInner {
  /// Returns a new [MoveDetailEffectChangesInnerEffectEntriesInner] instance.
  MoveDetailEffectChangesInnerEffectEntriesInner({
    required this.effect,
    required this.language,
  });

  String effect;

  AbilityDetailPokemonInnerPokemon language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveDetailEffectChangesInnerEffectEntriesInner &&
    other.effect == effect &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (effect.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'MoveDetailEffectChangesInnerEffectEntriesInner[effect=$effect, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'effect'] = this.effect;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [MoveDetailEffectChangesInnerEffectEntriesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveDetailEffectChangesInnerEffectEntriesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveDetailEffectChangesInnerEffectEntriesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveDetailEffectChangesInnerEffectEntriesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveDetailEffectChangesInnerEffectEntriesInner(
        effect: mapValueOfType<String>(json, r'effect')!,
        language: AbilityDetailPokemonInnerPokemon.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<MoveDetailEffectChangesInnerEffectEntriesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveDetailEffectChangesInnerEffectEntriesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveDetailEffectChangesInnerEffectEntriesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveDetailEffectChangesInnerEffectEntriesInner> mapFromJson(dynamic json) {
    final map = <String, MoveDetailEffectChangesInnerEffectEntriesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveDetailEffectChangesInnerEffectEntriesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveDetailEffectChangesInnerEffectEntriesInner-objects as value to a dart map
  static Map<String, List<MoveDetailEffectChangesInnerEffectEntriesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveDetailEffectChangesInnerEffectEntriesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveDetailEffectChangesInnerEffectEntriesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'effect',
    'language',
  };
}

