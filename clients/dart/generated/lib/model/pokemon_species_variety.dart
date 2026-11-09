//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpeciesVariety {
  /// Returns a new [PokemonSpeciesVariety] instance.
  PokemonSpeciesVariety({
    required this.isDefault,
    required this.pokemon,
  });

  /// Whether this variety is the default variety.
  bool isDefault;

  /// The Pokémon variety.
  PokemonSummary pokemon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpeciesVariety &&
    other.isDefault == isDefault &&
    other.pokemon == pokemon;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isDefault.hashCode) +
    (pokemon.hashCode);

  @override
  String toString() => 'PokemonSpeciesVariety[isDefault=$isDefault, pokemon=$pokemon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'is_default'] = this.isDefault;
      json[r'pokemon'] = this.pokemon;
    return json;
  }

  /// Returns a new [PokemonSpeciesVariety] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpeciesVariety? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'is_default'), 'Required key "PokemonSpeciesVariety[is_default]" is missing from JSON.');
        assert(json[r'is_default'] != null, 'Required key "PokemonSpeciesVariety[is_default]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon'), 'Required key "PokemonSpeciesVariety[pokemon]" is missing from JSON.');
        assert(json[r'pokemon'] != null, 'Required key "PokemonSpeciesVariety[pokemon]" has a null value in JSON.');
        return true;
      }());

      return PokemonSpeciesVariety(
        isDefault: mapValueOfType<bool>(json, r'is_default')!,
        pokemon: PokemonSummary.fromJson(json[r'pokemon'])!,
      );
    }
    return null;
  }

  static List<PokemonSpeciesVariety> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpeciesVariety>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpeciesVariety.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpeciesVariety> mapFromJson(dynamic json) {
    final map = <String, PokemonSpeciesVariety>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpeciesVariety.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpeciesVariety-objects as value to a dart map
  static Map<String, List<PokemonSpeciesVariety>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpeciesVariety>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpeciesVariety.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'is_default',
    'pokemon',
  };
}

