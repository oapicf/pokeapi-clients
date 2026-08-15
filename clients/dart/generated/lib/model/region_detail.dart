//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RegionDetail {
  /// Returns a new [RegionDetail] instance.
  RegionDetail({
    required this.id,
    required this.name,
    this.locations = const [],
    required this.mainGeneration,
    this.names = const [],
    this.pokedexes = const [],
    this.versionGroups = const [],
  });

  int id;

  String name;

  List<LocationSummary> locations;

  GenerationSummary mainGeneration;

  List<RegionName> names;

  List<PokedexSummary> pokedexes;

  List<AbilityDetailPokemonInnerPokemon> versionGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RegionDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.locations, locations) &&
    other.mainGeneration == mainGeneration &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pokedexes, pokedexes) &&
    _deepEquality.equals(other.versionGroups, versionGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (locations.hashCode) +
    (mainGeneration.hashCode) +
    (names.hashCode) +
    (pokedexes.hashCode) +
    (versionGroups.hashCode);

  @override
  String toString() => 'RegionDetail[id=$id, name=$name, locations=$locations, mainGeneration=$mainGeneration, names=$names, pokedexes=$pokedexes, versionGroups=$versionGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'locations'] = this.locations;
      json[r'main_generation'] = this.mainGeneration;
      json[r'names'] = this.names;
      json[r'pokedexes'] = this.pokedexes;
      json[r'version_groups'] = this.versionGroups;
    return json;
  }

  /// Returns a new [RegionDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RegionDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RegionDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RegionDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RegionDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        locations: LocationSummary.listFromJson(json[r'locations']),
        mainGeneration: GenerationSummary.fromJson(json[r'main_generation'])!,
        names: RegionName.listFromJson(json[r'names']),
        pokedexes: PokedexSummary.listFromJson(json[r'pokedexes']),
        versionGroups: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'version_groups']),
      );
    }
    return null;
  }

  static List<RegionDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RegionDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RegionDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RegionDetail> mapFromJson(dynamic json) {
    final map = <String, RegionDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RegionDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RegionDetail-objects as value to a dart map
  static Map<String, List<RegionDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RegionDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RegionDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'locations',
    'main_generation',
    'names',
    'pokedexes',
    'version_groups',
  };
}

