//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonEncounterResponse {
  /// Returns a new [PokemonEncounterResponse] instance.
  PokemonEncounterResponse({
    required this.locationArea,
    this.versionDetails = const [],
  });

  /// The location area the referenced Pokémon can be encountered in.
  LocationAreaSummary locationArea;

  /// A list of versions and encounters with the referenced Pokémon that might happen.
  List<PokemonEncounterVersionDetailResponse> versionDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonEncounterResponse &&
    other.locationArea == locationArea &&
    _deepEquality.equals(other.versionDetails, versionDetails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (locationArea.hashCode) +
    (versionDetails.hashCode);

  @override
  String toString() => 'PokemonEncounterResponse[locationArea=$locationArea, versionDetails=$versionDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'location_area'] = this.locationArea;
      json[r'version_details'] = this.versionDetails;
    return json;
  }

  /// Returns a new [PokemonEncounterResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonEncounterResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'location_area'), 'Required key "PokemonEncounterResponse[location_area]" is missing from JSON.');
        assert(json[r'location_area'] != null, 'Required key "PokemonEncounterResponse[location_area]" has a null value in JSON.');
        assert(json.containsKey(r'version_details'), 'Required key "PokemonEncounterResponse[version_details]" is missing from JSON.');
        assert(json[r'version_details'] != null, 'Required key "PokemonEncounterResponse[version_details]" has a null value in JSON.');
        return true;
      }());

      return PokemonEncounterResponse(
        locationArea: LocationAreaSummary.fromJson(json[r'location_area'])!,
        versionDetails: PokemonEncounterVersionDetailResponse.listFromJson(json[r'version_details']),
      );
    }
    return null;
  }

  static List<PokemonEncounterResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonEncounterResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonEncounterResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonEncounterResponse> mapFromJson(dynamic json) {
    final map = <String, PokemonEncounterResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonEncounterResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonEncounterResponse-objects as value to a dart map
  static Map<String, List<PokemonEncounterResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonEncounterResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonEncounterResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'location_area',
    'version_details',
  };
}

