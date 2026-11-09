//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonEncounterVersionDetailResponse {
  /// Returns a new [PokemonEncounterVersionDetailResponse] instance.
  PokemonEncounterVersionDetailResponse({
    required this.version,
    required this.maxChance,
    this.encounterDetails = const [],
  });

  /// The game version this encounter happens in.
  VersionSummary version;

  /// The total percentage of all encounter potential.
  int maxChance;

  /// A list of encounters and their specifics.
  List<PokemonEncounterDetailResponse> encounterDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonEncounterVersionDetailResponse &&
    other.version == version &&
    other.maxChance == maxChance &&
    _deepEquality.equals(other.encounterDetails, encounterDetails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (version.hashCode) +
    (maxChance.hashCode) +
    (encounterDetails.hashCode);

  @override
  String toString() => 'PokemonEncounterVersionDetailResponse[version=$version, maxChance=$maxChance, encounterDetails=$encounterDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'version'] = this.version;
      json[r'max_chance'] = this.maxChance;
      json[r'encounter_details'] = this.encounterDetails;
    return json;
  }

  /// Returns a new [PokemonEncounterVersionDetailResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonEncounterVersionDetailResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'version'), 'Required key "PokemonEncounterVersionDetailResponse[version]" is missing from JSON.');
        assert(json[r'version'] != null, 'Required key "PokemonEncounterVersionDetailResponse[version]" has a null value in JSON.');
        assert(json.containsKey(r'max_chance'), 'Required key "PokemonEncounterVersionDetailResponse[max_chance]" is missing from JSON.');
        assert(json[r'max_chance'] != null, 'Required key "PokemonEncounterVersionDetailResponse[max_chance]" has a null value in JSON.');
        assert(json.containsKey(r'encounter_details'), 'Required key "PokemonEncounterVersionDetailResponse[encounter_details]" is missing from JSON.');
        assert(json[r'encounter_details'] != null, 'Required key "PokemonEncounterVersionDetailResponse[encounter_details]" has a null value in JSON.');
        return true;
      }());

      return PokemonEncounterVersionDetailResponse(
        version: VersionSummary.fromJson(json[r'version'])!,
        maxChance: mapValueOfType<int>(json, r'max_chance')!,
        encounterDetails: PokemonEncounterDetailResponse.listFromJson(json[r'encounter_details']),
      );
    }
    return null;
  }

  static List<PokemonEncounterVersionDetailResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonEncounterVersionDetailResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonEncounterVersionDetailResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonEncounterVersionDetailResponse> mapFromJson(dynamic json) {
    final map = <String, PokemonEncounterVersionDetailResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonEncounterVersionDetailResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonEncounterVersionDetailResponse-objects as value to a dart map
  static Map<String, List<PokemonEncounterVersionDetailResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonEncounterVersionDetailResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonEncounterVersionDetailResponse.listFromJson(entry.value, growable: growable,);
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

