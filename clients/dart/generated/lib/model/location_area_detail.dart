//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaDetail {
  /// Returns a new [LocationAreaDetail] instance.
  LocationAreaDetail({
    required this.id,
    required this.name,
    required this.gameIndex,
    this.encounterMethodRates = const [],
    required this.location,
    this.names = const [],
    this.pokemonEncounters = const [],
  });

  int id;

  String name;

  int gameIndex;

  List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates;

  LocationSummary location;

  List<LocationAreaName> names;

  List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaDetail &&
    other.id == id &&
    other.name == name &&
    other.gameIndex == gameIndex &&
    _deepEquality.equals(other.encounterMethodRates, encounterMethodRates) &&
    other.location == location &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pokemonEncounters, pokemonEncounters);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (gameIndex.hashCode) +
    (encounterMethodRates.hashCode) +
    (location.hashCode) +
    (names.hashCode) +
    (pokemonEncounters.hashCode);

  @override
  String toString() => 'LocationAreaDetail[id=$id, name=$name, gameIndex=$gameIndex, encounterMethodRates=$encounterMethodRates, location=$location, names=$names, pokemonEncounters=$pokemonEncounters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'game_index'] = this.gameIndex;
      json[r'encounter_method_rates'] = this.encounterMethodRates;
      json[r'location'] = this.location;
      json[r'names'] = this.names;
      json[r'pokemon_encounters'] = this.pokemonEncounters;
    return json;
  }

  /// Returns a new [LocationAreaDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LocationAreaDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LocationAreaDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LocationAreaDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        gameIndex: mapValueOfType<int>(json, r'game_index')!,
        encounterMethodRates: LocationAreaDetailEncounterMethodRatesInner.listFromJson(json[r'encounter_method_rates']),
        location: LocationSummary.fromJson(json[r'location'])!,
        names: LocationAreaName.listFromJson(json[r'names']),
        pokemonEncounters: LocationAreaDetailPokemonEncountersInner.listFromJson(json[r'pokemon_encounters']),
      );
    }
    return null;
  }

  static List<LocationAreaDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaDetail> mapFromJson(dynamic json) {
    final map = <String, LocationAreaDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaDetail-objects as value to a dart map
  static Map<String, List<LocationAreaDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'game_index',
    'encounter_method_rates',
    'location',
    'names',
    'pokemon_encounters',
  };
}

