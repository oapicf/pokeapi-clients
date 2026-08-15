//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {
  /// Returns a new [LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails] instance.
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails({
    required this.minLevel,
    required this.maxLevel,
    this.conditionValues,
    required this.chance,
    required this.method,
  });

  int minLevel;

  int maxLevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AbilityDetailPokemonInnerPokemon? conditionValues;

  int chance;

  AbilityDetailPokemonInnerPokemon method;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails &&
    other.minLevel == minLevel &&
    other.maxLevel == maxLevel &&
    other.conditionValues == conditionValues &&
    other.chance == chance &&
    other.method == method;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (minLevel.hashCode) +
    (maxLevel.hashCode) +
    (conditionValues == null ? 0 : conditionValues!.hashCode) +
    (chance.hashCode) +
    (method.hashCode);

  @override
  String toString() => 'LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails[minLevel=$minLevel, maxLevel=$maxLevel, conditionValues=$conditionValues, chance=$chance, method=$method]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'min_level'] = this.minLevel;
      json[r'max_level'] = this.maxLevel;
    if (this.conditionValues != null) {
      json[r'condition_values'] = this.conditionValues;
    } else {
      json[r'condition_values'] = null;
    }
      json[r'chance'] = this.chance;
      json[r'method'] = this.method;
    return json;
  }

  /// Returns a new [LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(
        minLevel: mapValueOfType<int>(json, r'min_level')!,
        maxLevel: mapValueOfType<int>(json, r'max_level')!,
        conditionValues: AbilityDetailPokemonInnerPokemon.fromJson(json[r'condition_values']),
        chance: mapValueOfType<int>(json, r'chance')!,
        method: AbilityDetailPokemonInnerPokemon.fromJson(json[r'method'])!,
      );
    }
    return null;
  }

  static List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails> mapFromJson(dynamic json) {
    final map = <String, LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails-objects as value to a dart map
  static Map<String, List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'min_level',
    'max_level',
    'chance',
    'method',
  };
}

