//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonEncounterDetailResponse {
  /// Returns a new [PokemonEncounterDetailResponse] instance.
  PokemonEncounterDetailResponse({
    required this.chance,
    this.conditionValues = const [],
    required this.maxLevel,
    required this.method,
    required this.minLevel,
  });

  /// Percent chance that this encounter will occur.
  int chance;

  /// A list of condition values that must be in effect for this encounter to occur.
  List<EncounterConditionValueSummary> conditionValues;

  /// The highest level the Pokémon could be encountered at.
  int maxLevel;

  /// The method by which this encounter happens.
  EncounterMethodSummary method;

  /// The lowest level the Pokémon could be encountered at.
  int minLevel;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonEncounterDetailResponse &&
    other.chance == chance &&
    _deepEquality.equals(other.conditionValues, conditionValues) &&
    other.maxLevel == maxLevel &&
    other.method == method &&
    other.minLevel == minLevel;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (chance.hashCode) +
    (conditionValues.hashCode) +
    (maxLevel.hashCode) +
    (method.hashCode) +
    (minLevel.hashCode);

  @override
  String toString() => 'PokemonEncounterDetailResponse[chance=$chance, conditionValues=$conditionValues, maxLevel=$maxLevel, method=$method, minLevel=$minLevel]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'chance'] = this.chance;
      json[r'condition_values'] = this.conditionValues;
      json[r'max_level'] = this.maxLevel;
      json[r'method'] = this.method;
      json[r'min_level'] = this.minLevel;
    return json;
  }

  /// Returns a new [PokemonEncounterDetailResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonEncounterDetailResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'chance'), 'Required key "PokemonEncounterDetailResponse[chance]" is missing from JSON.');
        assert(json[r'chance'] != null, 'Required key "PokemonEncounterDetailResponse[chance]" has a null value in JSON.');
        assert(json.containsKey(r'condition_values'), 'Required key "PokemonEncounterDetailResponse[condition_values]" is missing from JSON.');
        assert(json[r'condition_values'] != null, 'Required key "PokemonEncounterDetailResponse[condition_values]" has a null value in JSON.');
        assert(json.containsKey(r'max_level'), 'Required key "PokemonEncounterDetailResponse[max_level]" is missing from JSON.');
        assert(json[r'max_level'] != null, 'Required key "PokemonEncounterDetailResponse[max_level]" has a null value in JSON.');
        assert(json.containsKey(r'method'), 'Required key "PokemonEncounterDetailResponse[method]" is missing from JSON.');
        assert(json[r'method'] != null, 'Required key "PokemonEncounterDetailResponse[method]" has a null value in JSON.');
        assert(json.containsKey(r'min_level'), 'Required key "PokemonEncounterDetailResponse[min_level]" is missing from JSON.');
        assert(json[r'min_level'] != null, 'Required key "PokemonEncounterDetailResponse[min_level]" has a null value in JSON.');
        return true;
      }());

      return PokemonEncounterDetailResponse(
        chance: mapValueOfType<int>(json, r'chance')!,
        conditionValues: EncounterConditionValueSummary.listFromJson(json[r'condition_values']),
        maxLevel: mapValueOfType<int>(json, r'max_level')!,
        method: EncounterMethodSummary.fromJson(json[r'method'])!,
        minLevel: mapValueOfType<int>(json, r'min_level')!,
      );
    }
    return null;
  }

  static List<PokemonEncounterDetailResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonEncounterDetailResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonEncounterDetailResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonEncounterDetailResponse> mapFromJson(dynamic json) {
    final map = <String, PokemonEncounterDetailResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonEncounterDetailResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonEncounterDetailResponse-objects as value to a dart map
  static Map<String, List<PokemonEncounterDetailResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonEncounterDetailResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonEncounterDetailResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'chance',
    'condition_values',
    'max_level',
    'method',
    'min_level',
  };
}

