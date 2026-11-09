//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AbilityPokemonDetail {
  /// Returns a new [AbilityPokemonDetail] instance.
  AbilityPokemonDetail({
    this.isHidden,
    required this.slot,
    required this.pokemon,
  });

  /// Whether or not this a hidden ability for the referenced Pokémon.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isHidden;

  /// Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int slot;

  /// The Pokémon this ability could belong to.
  PokemonSummary pokemon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AbilityPokemonDetail &&
    other.isHidden == isHidden &&
    other.slot == slot &&
    other.pokemon == pokemon;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isHidden == null ? 0 : isHidden!.hashCode) +
    (slot.hashCode) +
    (pokemon.hashCode);

  @override
  String toString() => 'AbilityPokemonDetail[isHidden=$isHidden, slot=$slot, pokemon=$pokemon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.isHidden != null) {
      json[r'is_hidden'] = this.isHidden;
    } else {
      json[r'is_hidden'] = null;
    }
      json[r'slot'] = this.slot;
      json[r'pokemon'] = this.pokemon;
    return json;
  }

  /// Returns a new [AbilityPokemonDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AbilityPokemonDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'slot'), 'Required key "AbilityPokemonDetail[slot]" is missing from JSON.');
        assert(json[r'slot'] != null, 'Required key "AbilityPokemonDetail[slot]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon'), 'Required key "AbilityPokemonDetail[pokemon]" is missing from JSON.');
        assert(json[r'pokemon'] != null, 'Required key "AbilityPokemonDetail[pokemon]" has a null value in JSON.');
        return true;
      }());

      return AbilityPokemonDetail(
        isHidden: mapValueOfType<bool>(json, r'is_hidden'),
        slot: mapValueOfType<int>(json, r'slot')!,
        pokemon: PokemonSummary.fromJson(json[r'pokemon'])!,
      );
    }
    return null;
  }

  static List<AbilityPokemonDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AbilityPokemonDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AbilityPokemonDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AbilityPokemonDetail> mapFromJson(dynamic json) {
    final map = <String, AbilityPokemonDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AbilityPokemonDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AbilityPokemonDetail-objects as value to a dart map
  static Map<String, List<AbilityPokemonDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AbilityPokemonDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AbilityPokemonDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'slot',
    'pokemon',
  };
}

