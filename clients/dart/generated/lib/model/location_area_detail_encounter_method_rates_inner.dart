//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaDetailEncounterMethodRatesInner {
  /// Returns a new [LocationAreaDetailEncounterMethodRatesInner] instance.
  LocationAreaDetailEncounterMethodRatesInner({
    required this.encounterMethod,
    this.versionDetails = const [],
  });

  AbilityDetailPokemonInnerPokemon encounterMethod;

  List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaDetailEncounterMethodRatesInner &&
    other.encounterMethod == encounterMethod &&
    _deepEquality.equals(other.versionDetails, versionDetails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (encounterMethod.hashCode) +
    (versionDetails.hashCode);

  @override
  String toString() => 'LocationAreaDetailEncounterMethodRatesInner[encounterMethod=$encounterMethod, versionDetails=$versionDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'encounter_method'] = this.encounterMethod;
      json[r'version_details'] = this.versionDetails;
    return json;
  }

  /// Returns a new [LocationAreaDetailEncounterMethodRatesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaDetailEncounterMethodRatesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'encounter_method'), 'Required key "LocationAreaDetailEncounterMethodRatesInner[encounter_method]" is missing from JSON.');
        assert(json[r'encounter_method'] != null, 'Required key "LocationAreaDetailEncounterMethodRatesInner[encounter_method]" has a null value in JSON.');
        assert(json.containsKey(r'version_details'), 'Required key "LocationAreaDetailEncounterMethodRatesInner[version_details]" is missing from JSON.');
        assert(json[r'version_details'] != null, 'Required key "LocationAreaDetailEncounterMethodRatesInner[version_details]" has a null value in JSON.');
        return true;
      }());

      return LocationAreaDetailEncounterMethodRatesInner(
        encounterMethod: AbilityDetailPokemonInnerPokemon.fromJson(json[r'encounter_method'])!,
        versionDetails: LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.listFromJson(json[r'version_details']),
      );
    }
    return null;
  }

  static List<LocationAreaDetailEncounterMethodRatesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaDetailEncounterMethodRatesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaDetailEncounterMethodRatesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaDetailEncounterMethodRatesInner> mapFromJson(dynamic json) {
    final map = <String, LocationAreaDetailEncounterMethodRatesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaDetailEncounterMethodRatesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaDetailEncounterMethodRatesInner-objects as value to a dart map
  static Map<String, List<LocationAreaDetailEncounterMethodRatesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaDetailEncounterMethodRatesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaDetailEncounterMethodRatesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'encounter_method',
    'version_details',
  };
}

