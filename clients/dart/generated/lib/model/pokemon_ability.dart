//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonAbility {
  /// Returns a new [PokemonAbility] instance.
  PokemonAbility({
    this.isHidden,
    required this.slot,
    required this.ability,
  });

  /// Whether or not this is a hidden ability.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isHidden;

  /// The slot this ability occupies in this Pokémon species.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int slot;

  /// The ability the Pokémon may have.
  AbilitySummary ability;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonAbility &&
    other.isHidden == isHidden &&
    other.slot == slot &&
    other.ability == ability;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isHidden == null ? 0 : isHidden!.hashCode) +
    (slot.hashCode) +
    (ability.hashCode);

  @override
  String toString() => 'PokemonAbility[isHidden=$isHidden, slot=$slot, ability=$ability]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.isHidden != null) {
      json[r'is_hidden'] = this.isHidden;
    } else {
      json[r'is_hidden'] = null;
    }
      json[r'slot'] = this.slot;
      json[r'ability'] = this.ability;
    return json;
  }

  /// Returns a new [PokemonAbility] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonAbility? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'slot'), 'Required key "PokemonAbility[slot]" is missing from JSON.');
        assert(json[r'slot'] != null, 'Required key "PokemonAbility[slot]" has a null value in JSON.');
        assert(json.containsKey(r'ability'), 'Required key "PokemonAbility[ability]" is missing from JSON.');
        assert(json[r'ability'] != null, 'Required key "PokemonAbility[ability]" has a null value in JSON.');
        return true;
      }());

      return PokemonAbility(
        isHidden: mapValueOfType<bool>(json, r'is_hidden'),
        slot: mapValueOfType<int>(json, r'slot')!,
        ability: AbilitySummary.fromJson(json[r'ability'])!,
      );
    }
    return null;
  }

  static List<PokemonAbility> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonAbility>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonAbility.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonAbility> mapFromJson(dynamic json) {
    final map = <String, PokemonAbility>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonAbility.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonAbility-objects as value to a dart map
  static Map<String, List<PokemonAbility>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonAbility>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonAbility.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'slot',
    'ability',
  };
}

