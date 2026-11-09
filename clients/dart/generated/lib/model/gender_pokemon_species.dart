//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenderPokemonSpecies {
  /// Returns a new [GenderPokemonSpecies] instance.
  GenderPokemonSpecies({
    required this.rate,
    required this.pokemonSpecies,
  });

  /// The chance of this Pokémon being female, in eighths; or -1 for genderless.
  int rate;

  /// A Pokémon species that can be the referenced gender.
  PokemonSpeciesSummary pokemonSpecies;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenderPokemonSpecies &&
    other.rate == rate &&
    other.pokemonSpecies == pokemonSpecies;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rate.hashCode) +
    (pokemonSpecies.hashCode);

  @override
  String toString() => 'GenderPokemonSpecies[rate=$rate, pokemonSpecies=$pokemonSpecies]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'rate'] = this.rate;
      json[r'pokemon_species'] = this.pokemonSpecies;
    return json;
  }

  /// Returns a new [GenderPokemonSpecies] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenderPokemonSpecies? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'rate'), 'Required key "GenderPokemonSpecies[rate]" is missing from JSON.');
        assert(json[r'rate'] != null, 'Required key "GenderPokemonSpecies[rate]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_species'), 'Required key "GenderPokemonSpecies[pokemon_species]" is missing from JSON.');
        assert(json[r'pokemon_species'] != null, 'Required key "GenderPokemonSpecies[pokemon_species]" has a null value in JSON.');
        return true;
      }());

      return GenderPokemonSpecies(
        rate: mapValueOfType<int>(json, r'rate')!,
        pokemonSpecies: PokemonSpeciesSummary.fromJson(json[r'pokemon_species'])!,
      );
    }
    return null;
  }

  static List<GenderPokemonSpecies> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenderPokemonSpecies>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenderPokemonSpecies.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenderPokemonSpecies> mapFromJson(dynamic json) {
    final map = <String, GenderPokemonSpecies>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenderPokemonSpecies.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenderPokemonSpecies-objects as value to a dart map
  static Map<String, List<GenderPokemonSpecies>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenderPokemonSpecies>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenderPokemonSpecies.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'rate',
    'pokemon_species',
  };
}

