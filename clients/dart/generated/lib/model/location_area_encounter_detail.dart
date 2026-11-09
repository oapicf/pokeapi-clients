//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocationAreaEncounterDetail {
  /// Returns a new [LocationAreaEncounterDetail] instance.
  LocationAreaEncounterDetail({
    required this.minLevel,
    required this.maxLevel,
    this.chance = 0,
    this.method,
    this.conditionValues = const [],
    required this.pokemonDetails,
  });

  /// The lowest level the Pokémon could be encountered at.
  int minLevel;

  /// The highest level the Pokémon could be encountered at.
  int maxLevel;

  /// Percent chance that this encounter will occur.
  int chance;

  /// The method by which this encounter happens.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EncounterMethodSummary? method;

  /// A list of condition values that must be in effect for this encounter to occur.
  List<EncounterConditionValueSummary> conditionValues;

  /// Additional properties of the encountered Pokémon, or null if unspecified.
  EncounterPokemonDetail? pokemonDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocationAreaEncounterDetail &&
    other.minLevel == minLevel &&
    other.maxLevel == maxLevel &&
    other.chance == chance &&
    other.method == method &&
    _deepEquality.equals(other.conditionValues, conditionValues) &&
    other.pokemonDetails == pokemonDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (minLevel.hashCode) +
    (maxLevel.hashCode) +
    (chance.hashCode) +
    (method == null ? 0 : method!.hashCode) +
    (conditionValues.hashCode) +
    (pokemonDetails == null ? 0 : pokemonDetails!.hashCode);

  @override
  String toString() => 'LocationAreaEncounterDetail[minLevel=$minLevel, maxLevel=$maxLevel, chance=$chance, method=$method, conditionValues=$conditionValues, pokemonDetails=$pokemonDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'min_level'] = this.minLevel;
      json[r'max_level'] = this.maxLevel;
      json[r'chance'] = this.chance;
    if (this.method != null) {
      json[r'method'] = this.method;
    } else {
      json[r'method'] = null;
    }
      json[r'condition_values'] = this.conditionValues;
    if (this.pokemonDetails != null) {
      json[r'pokemon_details'] = this.pokemonDetails;
    } else {
      json[r'pokemon_details'] = null;
    }
    return json;
  }

  /// Returns a new [LocationAreaEncounterDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocationAreaEncounterDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'min_level'), 'Required key "LocationAreaEncounterDetail[min_level]" is missing from JSON.');
        assert(json[r'min_level'] != null, 'Required key "LocationAreaEncounterDetail[min_level]" has a null value in JSON.');
        assert(json.containsKey(r'max_level'), 'Required key "LocationAreaEncounterDetail[max_level]" is missing from JSON.');
        assert(json[r'max_level'] != null, 'Required key "LocationAreaEncounterDetail[max_level]" has a null value in JSON.');
        assert(json.containsKey(r'condition_values'), 'Required key "LocationAreaEncounterDetail[condition_values]" is missing from JSON.');
        assert(json[r'condition_values'] != null, 'Required key "LocationAreaEncounterDetail[condition_values]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_details'), 'Required key "LocationAreaEncounterDetail[pokemon_details]" is missing from JSON.');
        return true;
      }());

      return LocationAreaEncounterDetail(
        minLevel: mapValueOfType<int>(json, r'min_level')!,
        maxLevel: mapValueOfType<int>(json, r'max_level')!,
        chance: mapValueOfType<int>(json, r'chance') ?? 0,
        method: EncounterMethodSummary.fromJson(json[r'method']),
        conditionValues: EncounterConditionValueSummary.listFromJson(json[r'condition_values']),
        pokemonDetails: EncounterPokemonDetail.fromJson(json[r'pokemon_details']),
      );
    }
    return null;
  }

  static List<LocationAreaEncounterDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocationAreaEncounterDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocationAreaEncounterDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocationAreaEncounterDetail> mapFromJson(dynamic json) {
    final map = <String, LocationAreaEncounterDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocationAreaEncounterDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocationAreaEncounterDetail-objects as value to a dart map
  static Map<String, List<LocationAreaEncounterDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocationAreaEncounterDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocationAreaEncounterDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'min_level',
    'max_level',
    'condition_values',
    'pokemon_details',
  };
}

