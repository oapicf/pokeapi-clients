//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpeciesPalParkEncounter {
  /// Returns a new [PokemonSpeciesPalParkEncounter] instance.
  PokemonSpeciesPalParkEncounter({
    this.baseScore,
    required this.rate,
    required this.area,
  });

  /// The base score given to the player when the referenced Pokémon is caught during a pal park run.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? baseScore;

  /// The base rate for encountering the referenced Pokémon in this pal park area.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int rate;

  /// The pal park area where this encounter happens.
  PalParkAreaSummary area;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpeciesPalParkEncounter &&
    other.baseScore == baseScore &&
    other.rate == rate &&
    other.area == area;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (baseScore == null ? 0 : baseScore!.hashCode) +
    (rate.hashCode) +
    (area.hashCode);

  @override
  String toString() => 'PokemonSpeciesPalParkEncounter[baseScore=$baseScore, rate=$rate, area=$area]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.baseScore != null) {
      json[r'base_score'] = this.baseScore;
    } else {
      json[r'base_score'] = null;
    }
      json[r'rate'] = this.rate;
      json[r'area'] = this.area;
    return json;
  }

  /// Returns a new [PokemonSpeciesPalParkEncounter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpeciesPalParkEncounter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'rate'), 'Required key "PokemonSpeciesPalParkEncounter[rate]" is missing from JSON.');
        assert(json[r'rate'] != null, 'Required key "PokemonSpeciesPalParkEncounter[rate]" has a null value in JSON.');
        assert(json.containsKey(r'area'), 'Required key "PokemonSpeciesPalParkEncounter[area]" is missing from JSON.');
        assert(json[r'area'] != null, 'Required key "PokemonSpeciesPalParkEncounter[area]" has a null value in JSON.');
        return true;
      }());

      return PokemonSpeciesPalParkEncounter(
        baseScore: mapValueOfType<int>(json, r'base_score'),
        rate: mapValueOfType<int>(json, r'rate')!,
        area: PalParkAreaSummary.fromJson(json[r'area'])!,
      );
    }
    return null;
  }

  static List<PokemonSpeciesPalParkEncounter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpeciesPalParkEncounter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpeciesPalParkEncounter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpeciesPalParkEncounter> mapFromJson(dynamic json) {
    final map = <String, PokemonSpeciesPalParkEncounter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpeciesPalParkEncounter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpeciesPalParkEncounter-objects as value to a dart map
  static Map<String, List<PokemonSpeciesPalParkEncounter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpeciesPalParkEncounter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpeciesPalParkEncounter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'rate',
    'area',
  };
}

