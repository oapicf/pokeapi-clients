//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaEncounterVersionDetail {
  /// Returns a new [LocationAreaEncounterVersionDetail] instance.
  LocationAreaEncounterVersionDetail({
    required this.rate,
    required this.version,
  });

  /// The chance of an encounter to occur.
  int rate;

  /// The version of the game in which the encounter can occur with the given chance.
  VersionSummary version;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaEncounterVersionDetail &&
    other.rate == rate &&
    other.version == version;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rate.hashCode) +
    (version.hashCode);

  @override
  String toString() => 'LocationAreaEncounterVersionDetail[rate=$rate, version=$version]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'rate'] = this.rate;
      json[r'version'] = this.version;
    return json;
  }

  /// Returns a new [LocationAreaEncounterVersionDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaEncounterVersionDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'rate'), 'Required key "LocationAreaEncounterVersionDetail[rate]" is missing from JSON.');
        assert(json[r'rate'] != null, 'Required key "LocationAreaEncounterVersionDetail[rate]" has a null value in JSON.');
        assert(json.containsKey(r'version'), 'Required key "LocationAreaEncounterVersionDetail[version]" is missing from JSON.');
        assert(json[r'version'] != null, 'Required key "LocationAreaEncounterVersionDetail[version]" has a null value in JSON.');
        return true;
      }());

      return LocationAreaEncounterVersionDetail(
        rate: mapValueOfType<int>(json, r'rate')!,
        version: VersionSummary.fromJson(json[r'version'])!,
      );
    }
    return null;
  }

  static List<LocationAreaEncounterVersionDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaEncounterVersionDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaEncounterVersionDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaEncounterVersionDetail> mapFromJson(dynamic json) {
    final map = <String, LocationAreaEncounterVersionDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaEncounterVersionDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaEncounterVersionDetail-objects as value to a dart map
  static Map<String, List<LocationAreaEncounterVersionDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaEncounterVersionDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaEncounterVersionDetail.listFromJson(entry.value, growable: growable,);
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

