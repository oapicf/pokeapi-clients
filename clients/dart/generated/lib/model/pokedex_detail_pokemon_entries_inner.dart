//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokedexDetailPokemonEntriesInner {
  /// Returns a new [PokedexDetailPokemonEntriesInner] instance.
  PokedexDetailPokemonEntriesInner({
    required this.entryNumber,
    required this.pokemonSpecies,
  });

  int entryNumber;

  AbilityDetailPokemonInnerPokemon pokemonSpecies;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokedexDetailPokemonEntriesInner &&
    other.entryNumber == entryNumber &&
    other.pokemonSpecies == pokemonSpecies;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryNumber.hashCode) +
    (pokemonSpecies.hashCode);

  @override
  String toString() => 'PokedexDetailPokemonEntriesInner[entryNumber=$entryNumber, pokemonSpecies=$pokemonSpecies]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entry_number'] = this.entryNumber;
      json[r'pokemon_species'] = this.pokemonSpecies;
    return json;
  }

  /// Returns a new [PokedexDetailPokemonEntriesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokedexDetailPokemonEntriesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entry_number'), 'Required key "PokedexDetailPokemonEntriesInner[entry_number]" is missing from JSON.');
        assert(json[r'entry_number'] != null, 'Required key "PokedexDetailPokemonEntriesInner[entry_number]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_species'), 'Required key "PokedexDetailPokemonEntriesInner[pokemon_species]" is missing from JSON.');
        assert(json[r'pokemon_species'] != null, 'Required key "PokedexDetailPokemonEntriesInner[pokemon_species]" has a null value in JSON.');
        return true;
      }());

      return PokedexDetailPokemonEntriesInner(
        entryNumber: mapValueOfType<int>(json, r'entry_number')!,
        pokemonSpecies: AbilityDetailPokemonInnerPokemon.fromJson(json[r'pokemon_species'])!,
      );
    }
    return null;
  }

  static List<PokedexDetailPokemonEntriesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokedexDetailPokemonEntriesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokedexDetailPokemonEntriesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokedexDetailPokemonEntriesInner> mapFromJson(dynamic json) {
    final map = <String, PokedexDetailPokemonEntriesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokedexDetailPokemonEntriesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokedexDetailPokemonEntriesInner-objects as value to a dart map
  static Map<String, List<PokedexDetailPokemonEntriesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokedexDetailPokemonEntriesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokedexDetailPokemonEntriesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entry_number',
    'pokemon_species',
  };
}

