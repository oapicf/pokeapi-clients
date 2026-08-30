//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveChangeEffectEntriesInner {
  /// Returns a new [MoveChangeEffectEntriesInner] instance.
  MoveChangeEffectEntriesInner({
    required this.effect,
    required this.shortEffect,
    required this.language,
  });

  String effect;

  String shortEffect;

  AbilityDetailPokemonInnerPokemon language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveChangeEffectEntriesInner &&
    other.effect == effect &&
    other.shortEffect == shortEffect &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (effect.hashCode) +
    (shortEffect.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'MoveChangeEffectEntriesInner[effect=$effect, shortEffect=$shortEffect, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'effect'] = this.effect;
      json[r'short_effect'] = this.shortEffect;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [MoveChangeEffectEntriesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveChangeEffectEntriesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'effect'), 'Required key "MoveChangeEffectEntriesInner[effect]" is missing from JSON.');
        assert(json[r'effect'] != null, 'Required key "MoveChangeEffectEntriesInner[effect]" has a null value in JSON.');
        assert(json.containsKey(r'short_effect'), 'Required key "MoveChangeEffectEntriesInner[short_effect]" is missing from JSON.');
        assert(json[r'short_effect'] != null, 'Required key "MoveChangeEffectEntriesInner[short_effect]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "MoveChangeEffectEntriesInner[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "MoveChangeEffectEntriesInner[language]" has a null value in JSON.');
        return true;
      }());

      return MoveChangeEffectEntriesInner(
        effect: mapValueOfType<String>(json, r'effect')!,
        shortEffect: mapValueOfType<String>(json, r'short_effect')!,
        language: AbilityDetailPokemonInnerPokemon.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<MoveChangeEffectEntriesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveChangeEffectEntriesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveChangeEffectEntriesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveChangeEffectEntriesInner> mapFromJson(dynamic json) {
    final map = <String, MoveChangeEffectEntriesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveChangeEffectEntriesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveChangeEffectEntriesInner-objects as value to a dart map
  static Map<String, List<MoveChangeEffectEntriesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveChangeEffectEntriesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveChangeEffectEntriesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'effect',
    'short_effect',
    'language',
  };
}

