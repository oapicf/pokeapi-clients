//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonColorDetail {
  /// Returns a new [PokemonColorDetail] instance.
  PokemonColorDetail({
    required this.id,
    required this.name,
    this.names = const [],
    this.pokemonSpecies = const [],
  });

  int id;

  String name;

  List<PokemonColorName> names;

  List<PokemonSpeciesSummary> pokemonSpecies;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonColorDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pokemonSpecies, pokemonSpecies);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (names.hashCode) +
    (pokemonSpecies.hashCode);

  @override
  String toString() => 'PokemonColorDetail[id=$id, name=$name, names=$names, pokemonSpecies=$pokemonSpecies]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'names'] = this.names;
      json[r'pokemon_species'] = this.pokemonSpecies;
    return json;
  }

  /// Returns a new [PokemonColorDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonColorDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonColorDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonColorDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokemonColorDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        names: PokemonColorName.listFromJson(json[r'names']),
        pokemonSpecies: PokemonSpeciesSummary.listFromJson(json[r'pokemon_species']),
      );
    }
    return null;
  }

  static List<PokemonColorDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonColorDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonColorDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonColorDetail> mapFromJson(dynamic json) {
    final map = <String, PokemonColorDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonColorDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonColorDetail-objects as value to a dart map
  static Map<String, List<PokemonColorDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonColorDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonColorDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'names',
    'pokemon_species',
  };
}

