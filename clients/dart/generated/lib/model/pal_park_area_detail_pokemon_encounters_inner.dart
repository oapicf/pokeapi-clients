//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PalParkAreaDetailPokemonEncountersInner {
  /// Returns a new [PalParkAreaDetailPokemonEncountersInner] instance.
  PalParkAreaDetailPokemonEncountersInner({
    required this.baseScore,
    required this.pokemonSpecies,
    required this.rate,
  });

  int baseScore;

  AbilityDetailPokemonInnerPokemon pokemonSpecies;

  int rate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PalParkAreaDetailPokemonEncountersInner &&
    other.baseScore == baseScore &&
    other.pokemonSpecies == pokemonSpecies &&
    other.rate == rate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (baseScore.hashCode) +
    (pokemonSpecies.hashCode) +
    (rate.hashCode);

  @override
  String toString() => 'PalParkAreaDetailPokemonEncountersInner[baseScore=$baseScore, pokemonSpecies=$pokemonSpecies, rate=$rate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'base_score'] = this.baseScore;
      json[r'pokemon-species'] = this.pokemonSpecies;
      json[r'rate'] = this.rate;
    return json;
  }

  /// Returns a new [PalParkAreaDetailPokemonEncountersInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PalParkAreaDetailPokemonEncountersInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PalParkAreaDetailPokemonEncountersInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PalParkAreaDetailPokemonEncountersInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PalParkAreaDetailPokemonEncountersInner(
        baseScore: mapValueOfType<int>(json, r'base_score')!,
        pokemonSpecies: AbilityDetailPokemonInnerPokemon.fromJson(json[r'pokemon-species'])!,
        rate: mapValueOfType<int>(json, r'rate')!,
      );
    }
    return null;
  }

  static List<PalParkAreaDetailPokemonEncountersInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PalParkAreaDetailPokemonEncountersInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PalParkAreaDetailPokemonEncountersInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PalParkAreaDetailPokemonEncountersInner> mapFromJson(dynamic json) {
    final map = <String, PalParkAreaDetailPokemonEncountersInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PalParkAreaDetailPokemonEncountersInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PalParkAreaDetailPokemonEncountersInner-objects as value to a dart map
  static Map<String, List<PalParkAreaDetailPokemonEncountersInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PalParkAreaDetailPokemonEncountersInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PalParkAreaDetailPokemonEncountersInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'base_score',
    'pokemon-species',
    'rate',
  };
}

