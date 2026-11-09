//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaPokemonEncounter {
  /// Returns a new [LocationAreaPokemonEncounter] instance.
  LocationAreaPokemonEncounter({
    required this.pokemon,
    this.versionDetails = const [],
  });

  /// The Pokémon being encountered.
  PokemonSummary pokemon;

  /// A list of versions and encounters with Pokémon that might happen in the referenced location area.
  List<LocationAreaPokemonEncounterVersion> versionDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaPokemonEncounter &&
    other.pokemon == pokemon &&
    _deepEquality.equals(other.versionDetails, versionDetails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pokemon.hashCode) +
    (versionDetails.hashCode);

  @override
  String toString() => 'LocationAreaPokemonEncounter[pokemon=$pokemon, versionDetails=$versionDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'pokemon'] = this.pokemon;
      json[r'version_details'] = this.versionDetails;
    return json;
  }

  /// Returns a new [LocationAreaPokemonEncounter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaPokemonEncounter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'pokemon'), 'Required key "LocationAreaPokemonEncounter[pokemon]" is missing from JSON.');
        assert(json[r'pokemon'] != null, 'Required key "LocationAreaPokemonEncounter[pokemon]" has a null value in JSON.');
        assert(json.containsKey(r'version_details'), 'Required key "LocationAreaPokemonEncounter[version_details]" is missing from JSON.');
        assert(json[r'version_details'] != null, 'Required key "LocationAreaPokemonEncounter[version_details]" has a null value in JSON.');
        return true;
      }());

      return LocationAreaPokemonEncounter(
        pokemon: PokemonSummary.fromJson(json[r'pokemon'])!,
        versionDetails: LocationAreaPokemonEncounterVersion.listFromJson(json[r'version_details']),
      );
    }
    return null;
  }

  static List<LocationAreaPokemonEncounter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaPokemonEncounter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaPokemonEncounter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaPokemonEncounter> mapFromJson(dynamic json) {
    final map = <String, LocationAreaPokemonEncounter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaPokemonEncounter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaPokemonEncounter-objects as value to a dart map
  static Map<String, List<LocationAreaPokemonEncounter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaPokemonEncounter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaPokemonEncounter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'pokemon',
    'version_details',
  };
}

