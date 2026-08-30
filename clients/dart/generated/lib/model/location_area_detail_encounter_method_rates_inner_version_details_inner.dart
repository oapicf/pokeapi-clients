//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {
  /// Returns a new [LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] instance.
  LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner({
    required this.rate,
    required this.version,
  });

  int rate;

  AbilityDetailPokemonInnerPokemon version;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner &&
    other.rate == rate &&
    other.version == version;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rate.hashCode) +
    (version.hashCode);

  @override
  String toString() => 'LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[rate=$rate, version=$version]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'rate'] = this.rate;
      json[r'version'] = this.version;
    return json;
  }

  /// Returns a new [LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'rate'), 'Required key "LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[rate]" is missing from JSON.');
        assert(json[r'rate'] != null, 'Required key "LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[rate]" has a null value in JSON.');
        assert(json.containsKey(r'version'), 'Required key "LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[version]" is missing from JSON.');
        assert(json[r'version'] != null, 'Required key "LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner[version]" has a null value in JSON.');
        return true;
      }());

      return LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(
        rate: mapValueOfType<int>(json, r'rate')!,
        version: AbilityDetailPokemonInnerPokemon.fromJson(json[r'version'])!,
      );
    }
    return null;
  }

  static List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> mapFromJson(dynamic json) {
    final map = <String, LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner-objects as value to a dart map
  static Map<String, List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'rate',
    'version',
  };
}

