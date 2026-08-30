//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {
  /// Returns a new [LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] instance.
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInner({
    required this.version,
    required this.maxChance,
    required this.encounterDetails,
  });

  AbilityDetailPokemonInnerPokemon version;

  int maxChance;

  LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaDetailPokemonEncountersInnerVersionDetailsInner &&
    other.version == version &&
    other.maxChance == maxChance &&
    other.encounterDetails == encounterDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (version.hashCode) +
    (maxChance.hashCode) +
    (encounterDetails.hashCode);

  @override
  String toString() => 'LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[version=$version, maxChance=$maxChance, encounterDetails=$encounterDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'version'] = this.version;
      json[r'max_chance'] = this.maxChance;
      json[r'encounter_details'] = this.encounterDetails;
    return json;
  }

  /// Returns a new [LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaDetailPokemonEncountersInnerVersionDetailsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'version'), 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[version]" is missing from JSON.');
        assert(json[r'version'] != null, 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[version]" has a null value in JSON.');
        assert(json.containsKey(r'max_chance'), 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[max_chance]" is missing from JSON.');
        assert(json[r'max_chance'] != null, 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[max_chance]" has a null value in JSON.');
        assert(json.containsKey(r'encounter_details'), 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[encounter_details]" is missing from JSON.');
        assert(json[r'encounter_details'] != null, 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[encounter_details]" has a null value in JSON.');
        return true;
      }());

      return LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(
        version: AbilityDetailPokemonInnerPokemon.fromJson(json[r'version'])!,
        maxChance: mapValueOfType<int>(json, r'max_chance')!,
        encounterDetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.fromJson(json[r'encounter_details'])!,
      );
    }
    return null;
  }

  static List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> mapFromJson(dynamic json) {
    final map = <String, LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner-objects as value to a dart map
  static Map<String, List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'version',
    'max_chance',
    'encounter_details',
  };
}

