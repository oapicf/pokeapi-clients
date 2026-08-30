//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokedexDetail {
  /// Returns a new [PokedexDetail] instance.
  PokedexDetail({
    required this.id,
    required this.name,
    this.isMainSeries,
    this.descriptions = const [],
    this.names = const [],
    this.pokemonEntries = const [],
    required this.region,
    this.versionGroups = const [],
  });

  int id;

  String name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isMainSeries;

  List<PokedexDescription> descriptions;

  List<PokedexName> names;

  List<PokedexDetailPokemonEntriesInner> pokemonEntries;

  RegionSummary region;

  List<AbilityDetailPokemonInnerPokemon> versionGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokedexDetail &&
    other.id == id &&
    other.name == name &&
    other.isMainSeries == isMainSeries &&
    _deepEquality.equals(other.descriptions, descriptions) &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pokemonEntries, pokemonEntries) &&
    other.region == region &&
    _deepEquality.equals(other.versionGroups, versionGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (isMainSeries == null ? 0 : isMainSeries!.hashCode) +
    (descriptions.hashCode) +
    (names.hashCode) +
    (pokemonEntries.hashCode) +
    (region.hashCode) +
    (versionGroups.hashCode);

  @override
  String toString() => 'PokedexDetail[id=$id, name=$name, isMainSeries=$isMainSeries, descriptions=$descriptions, names=$names, pokemonEntries=$pokemonEntries, region=$region, versionGroups=$versionGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.isMainSeries != null) {
      json[r'is_main_series'] = this.isMainSeries;
    } else {
      json[r'is_main_series'] = null;
    }
      json[r'descriptions'] = this.descriptions;
      json[r'names'] = this.names;
      json[r'pokemon_entries'] = this.pokemonEntries;
      json[r'region'] = this.region;
      json[r'version_groups'] = this.versionGroups;
    return json;
  }

  /// Returns a new [PokedexDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokedexDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "PokedexDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "PokedexDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "PokedexDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PokedexDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'descriptions'), 'Required key "PokedexDetail[descriptions]" is missing from JSON.');
        assert(json[r'descriptions'] != null, 'Required key "PokedexDetail[descriptions]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "PokedexDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "PokedexDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_entries'), 'Required key "PokedexDetail[pokemon_entries]" is missing from JSON.');
        assert(json[r'pokemon_entries'] != null, 'Required key "PokedexDetail[pokemon_entries]" has a null value in JSON.');
        assert(json.containsKey(r'region'), 'Required key "PokedexDetail[region]" is missing from JSON.');
        assert(json[r'region'] != null, 'Required key "PokedexDetail[region]" has a null value in JSON.');
        assert(json.containsKey(r'version_groups'), 'Required key "PokedexDetail[version_groups]" is missing from JSON.');
        assert(json[r'version_groups'] != null, 'Required key "PokedexDetail[version_groups]" has a null value in JSON.');
        return true;
      }());

      return PokedexDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        isMainSeries: mapValueOfType<bool>(json, r'is_main_series'),
        descriptions: PokedexDescription.listFromJson(json[r'descriptions']),
        names: PokedexName.listFromJson(json[r'names']),
        pokemonEntries: PokedexDetailPokemonEntriesInner.listFromJson(json[r'pokemon_entries']),
        region: RegionSummary.fromJson(json[r'region'])!,
        versionGroups: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'version_groups']),
      );
    }
    return null;
  }

  static List<PokedexDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokedexDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokedexDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokedexDetail> mapFromJson(dynamic json) {
    final map = <String, PokedexDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokedexDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokedexDetail-objects as value to a dart map
  static Map<String, List<PokedexDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokedexDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokedexDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'descriptions',
    'names',
    'pokemon_entries',
    'region',
    'version_groups',
  };
}

