//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerationDetail {
  /// Returns a new [GenerationDetail] instance.
  GenerationDetail({
    required this.id,
    required this.name,
    this.abilities = const [],
    required this.mainRegion,
    this.moves = const [],
    this.names = const [],
    this.pokemonSpecies = const [],
    this.types = const [],
    this.versionGroups = const [],
  });

  int id;

  String name;

  List<AbilitySummary> abilities;

  RegionSummary mainRegion;

  List<MoveSummary> moves;

  List<GenerationName> names;

  List<PokemonSpeciesSummary> pokemonSpecies;

  List<TypeSummary> types;

  List<VersionGroupSummary> versionGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerationDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.abilities, abilities) &&
    other.mainRegion == mainRegion &&
    _deepEquality.equals(other.moves, moves) &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pokemonSpecies, pokemonSpecies) &&
    _deepEquality.equals(other.types, types) &&
    _deepEquality.equals(other.versionGroups, versionGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (abilities.hashCode) +
    (mainRegion.hashCode) +
    (moves.hashCode) +
    (names.hashCode) +
    (pokemonSpecies.hashCode) +
    (types.hashCode) +
    (versionGroups.hashCode);

  @override
  String toString() => 'GenerationDetail[id=$id, name=$name, abilities=$abilities, mainRegion=$mainRegion, moves=$moves, names=$names, pokemonSpecies=$pokemonSpecies, types=$types, versionGroups=$versionGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'abilities'] = this.abilities;
      json[r'main_region'] = this.mainRegion;
      json[r'moves'] = this.moves;
      json[r'names'] = this.names;
      json[r'pokemon_species'] = this.pokemonSpecies;
      json[r'types'] = this.types;
      json[r'version_groups'] = this.versionGroups;
    return json;
  }

  /// Returns a new [GenerationDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerationDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GenerationDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GenerationDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GenerationDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        abilities: AbilitySummary.listFromJson(json[r'abilities']),
        mainRegion: RegionSummary.fromJson(json[r'main_region'])!,
        moves: MoveSummary.listFromJson(json[r'moves']),
        names: GenerationName.listFromJson(json[r'names']),
        pokemonSpecies: PokemonSpeciesSummary.listFromJson(json[r'pokemon_species']),
        types: TypeSummary.listFromJson(json[r'types']),
        versionGroups: VersionGroupSummary.listFromJson(json[r'version_groups']),
      );
    }
    return null;
  }

  static List<GenerationDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerationDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerationDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerationDetail> mapFromJson(dynamic json) {
    final map = <String, GenerationDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerationDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerationDetail-objects as value to a dart map
  static Map<String, List<GenerationDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerationDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerationDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'abilities',
    'main_region',
    'moves',
    'names',
    'pokemon_species',
    'types',
    'version_groups',
  };
}

