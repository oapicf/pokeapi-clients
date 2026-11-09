//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PalParkEncounter {
  /// Returns a new [PalParkEncounter] instance.
  PalParkEncounter({
    this.baseScore,
    required this.rate,
    required this.pokemonSpecies,
  });

  /// The base score given to the player when this Pokémon is caught during a pal park run.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? baseScore;

  /// The base rate for encountering this Pokémon in this pal park area.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int rate;

  /// The Pokémon species being encountered.
  PokemonSpeciesSummary pokemonSpecies;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PalParkEncounter &&
    other.baseScore == baseScore &&
    other.rate == rate &&
    other.pokemonSpecies == pokemonSpecies;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (baseScore == null ? 0 : baseScore!.hashCode) +
    (rate.hashCode) +
    (pokemonSpecies.hashCode);

  @override
  String toString() => 'PalParkEncounter[baseScore=$baseScore, rate=$rate, pokemonSpecies=$pokemonSpecies]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.baseScore != null) {
      json[r'base_score'] = this.baseScore;
    } else {
      json[r'base_score'] = null;
    }
      json[r'rate'] = this.rate;
      json[r'pokemon_species'] = this.pokemonSpecies;
    return json;
  }

  /// Returns a new [PalParkEncounter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PalParkEncounter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'rate'), 'Required key "PalParkEncounter[rate]" is missing from JSON.');
        assert(json[r'rate'] != null, 'Required key "PalParkEncounter[rate]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_species'), 'Required key "PalParkEncounter[pokemon_species]" is missing from JSON.');
        assert(json[r'pokemon_species'] != null, 'Required key "PalParkEncounter[pokemon_species]" has a null value in JSON.');
        return true;
      }());

      return PalParkEncounter(
        baseScore: mapValueOfType<int>(json, r'base_score'),
        rate: mapValueOfType<int>(json, r'rate')!,
        pokemonSpecies: PokemonSpeciesSummary.fromJson(json[r'pokemon_species'])!,
      );
    }
    return null;
  }

  static List<PalParkEncounter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PalParkEncounter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PalParkEncounter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PalParkEncounter> mapFromJson(dynamic json) {
    final map = <String, PalParkEncounter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PalParkEncounter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PalParkEncounter-objects as value to a dart map
  static Map<String, List<PalParkEncounter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PalParkEncounter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PalParkEncounter.listFromJson(entry.value, growable: growable,);
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

