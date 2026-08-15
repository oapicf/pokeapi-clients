//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetailAbilitiesInner {
  /// Returns a new [PokemonDetailAbilitiesInner] instance.
  PokemonDetailAbilitiesInner({
    required this.ability,
    required this.isHidden,
    required this.slot,
  });

  AbilityDetailPokemonInnerPokemon ability;

  bool isHidden;

  int slot;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetailAbilitiesInner &&
    other.ability == ability &&
    other.isHidden == isHidden &&
    other.slot == slot;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ability.hashCode) +
    (isHidden.hashCode) +
    (slot.hashCode);

  @override
  String toString() => 'PokemonDetailAbilitiesInner[ability=$ability, isHidden=$isHidden, slot=$slot]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ability'] = this.ability;
      json[r'is_hidden'] = this.isHidden;
      json[r'slot'] = this.slot;
    return json;
  }

  /// Returns a new [PokemonDetailAbilitiesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetailAbilitiesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonDetailAbilitiesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonDetailAbilitiesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokemonDetailAbilitiesInner(
        ability: AbilityDetailPokemonInnerPokemon.fromJson(json[r'ability'])!,
        isHidden: mapValueOfType<bool>(json, r'is_hidden')!,
        slot: mapValueOfType<int>(json, r'slot')!,
      );
    }
    return null;
  }

  static List<PokemonDetailAbilitiesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetailAbilitiesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetailAbilitiesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetailAbilitiesInner> mapFromJson(dynamic json) {
    final map = <String, PokemonDetailAbilitiesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetailAbilitiesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetailAbilitiesInner-objects as value to a dart map
  static Map<String, List<PokemonDetailAbilitiesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetailAbilitiesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetailAbilitiesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ability',
    'is_hidden',
    'slot',
  };
}

