//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDexNumber {
  /// Returns a new [PokemonDexNumber] instance.
  PokemonDexNumber({
    required this.entryNumber,
    required this.pokemonSpecies,
  });

  /// The index of this Pokémon species entry within the Pokédex.
  int entryNumber;

  /// The Pokémon species being encountered.
  PokemonSpeciesSummary pokemonSpecies;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDexNumber &&
    other.entryNumber == entryNumber &&
    other.pokemonSpecies == pokemonSpecies;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryNumber.hashCode) +
    (pokemonSpecies.hashCode);

  @override
  String toString() => 'PokemonDexNumber[entryNumber=$entryNumber, pokemonSpecies=$pokemonSpecies]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entry_number'] = this.entryNumber;
      json[r'pokemon_species'] = this.pokemonSpecies;
    return json;
  }

  /// Returns a new [PokemonDexNumber] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDexNumber? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entry_number'), 'Required key "PokemonDexNumber[entry_number]" is missing from JSON.');
        assert(json[r'entry_number'] != null, 'Required key "PokemonDexNumber[entry_number]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_species'), 'Required key "PokemonDexNumber[pokemon_species]" is missing from JSON.');
        assert(json[r'pokemon_species'] != null, 'Required key "PokemonDexNumber[pokemon_species]" has a null value in JSON.');
        return true;
      }());

      return PokemonDexNumber(
        entryNumber: mapValueOfType<int>(json, r'entry_number')!,
        pokemonSpecies: PokemonSpeciesSummary.fromJson(json[r'pokemon_species'])!,
      );
    }
    return null;
  }

  static List<PokemonDexNumber> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDexNumber>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDexNumber.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDexNumber> mapFromJson(dynamic json) {
    final map = <String, PokemonDexNumber>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDexNumber.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDexNumber-objects as value to a dart map
  static Map<String, List<PokemonDexNumber>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDexNumber>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDexNumber.listFromJson(entry.value, growable: growable,);
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

