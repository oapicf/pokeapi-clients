//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AbilityDetailPokemonInner {
  /// Returns a new [AbilityDetailPokemonInner] instance.
  AbilityDetailPokemonInner({
    required this.isHidden,
    required this.slot,
    required this.pokemon,
  });

  bool isHidden;

  int slot;

  AbilityDetailPokemonInnerPokemon pokemon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AbilityDetailPokemonInner &&
    other.isHidden == isHidden &&
    other.slot == slot &&
    other.pokemon == pokemon;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isHidden.hashCode) +
    (slot.hashCode) +
    (pokemon.hashCode);

  @override
  String toString() => 'AbilityDetailPokemonInner[isHidden=$isHidden, slot=$slot, pokemon=$pokemon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'is_hidden'] = this.isHidden;
      json[r'slot'] = this.slot;
      json[r'pokemon'] = this.pokemon;
    return json;
  }

  /// Returns a new [AbilityDetailPokemonInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AbilityDetailPokemonInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AbilityDetailPokemonInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AbilityDetailPokemonInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AbilityDetailPokemonInner(
        isHidden: mapValueOfType<bool>(json, r'is_hidden')!,
        slot: mapValueOfType<int>(json, r'slot')!,
        pokemon: AbilityDetailPokemonInnerPokemon.fromJson(json[r'pokemon'])!,
      );
    }
    return null;
  }

  static List<AbilityDetailPokemonInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AbilityDetailPokemonInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AbilityDetailPokemonInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AbilityDetailPokemonInner> mapFromJson(dynamic json) {
    final map = <String, AbilityDetailPokemonInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AbilityDetailPokemonInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AbilityDetailPokemonInner-objects as value to a dart map
  static Map<String, List<AbilityDetailPokemonInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AbilityDetailPokemonInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AbilityDetailPokemonInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'is_hidden',
    'slot',
    'pokemon',
  };
}

