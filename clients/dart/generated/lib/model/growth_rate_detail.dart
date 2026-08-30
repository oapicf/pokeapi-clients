//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GrowthRateDetail {
  /// Returns a new [GrowthRateDetail] instance.
  GrowthRateDetail({
    required this.id,
    required this.name,
    required this.formula,
    this.descriptions = const [],
    this.levels = const [],
    this.pokemonSpecies = const [],
  });

  int id;

  String name;

  String formula;

  List<GrowthRateDescription> descriptions;

  List<Experience> levels;

  List<PokemonSpeciesSummary> pokemonSpecies;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GrowthRateDetail &&
    other.id == id &&
    other.name == name &&
    other.formula == formula &&
    _deepEquality.equals(other.descriptions, descriptions) &&
    _deepEquality.equals(other.levels, levels) &&
    _deepEquality.equals(other.pokemonSpecies, pokemonSpecies);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (formula.hashCode) +
    (descriptions.hashCode) +
    (levels.hashCode) +
    (pokemonSpecies.hashCode);

  @override
  String toString() => 'GrowthRateDetail[id=$id, name=$name, formula=$formula, descriptions=$descriptions, levels=$levels, pokemonSpecies=$pokemonSpecies]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'formula'] = this.formula;
      json[r'descriptions'] = this.descriptions;
      json[r'levels'] = this.levels;
      json[r'pokemon_species'] = this.pokemonSpecies;
    return json;
  }

  /// Returns a new [GrowthRateDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GrowthRateDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "GrowthRateDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "GrowthRateDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "GrowthRateDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "GrowthRateDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'formula'), 'Required key "GrowthRateDetail[formula]" is missing from JSON.');
        assert(json[r'formula'] != null, 'Required key "GrowthRateDetail[formula]" has a null value in JSON.');
        assert(json.containsKey(r'descriptions'), 'Required key "GrowthRateDetail[descriptions]" is missing from JSON.');
        assert(json[r'descriptions'] != null, 'Required key "GrowthRateDetail[descriptions]" has a null value in JSON.');
        assert(json.containsKey(r'levels'), 'Required key "GrowthRateDetail[levels]" is missing from JSON.');
        assert(json[r'levels'] != null, 'Required key "GrowthRateDetail[levels]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_species'), 'Required key "GrowthRateDetail[pokemon_species]" is missing from JSON.');
        assert(json[r'pokemon_species'] != null, 'Required key "GrowthRateDetail[pokemon_species]" has a null value in JSON.');
        return true;
      }());

      return GrowthRateDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        formula: mapValueOfType<String>(json, r'formula')!,
        descriptions: GrowthRateDescription.listFromJson(json[r'descriptions']),
        levels: Experience.listFromJson(json[r'levels']),
        pokemonSpecies: PokemonSpeciesSummary.listFromJson(json[r'pokemon_species']),
      );
    }
    return null;
  }

  static List<GrowthRateDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GrowthRateDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GrowthRateDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GrowthRateDetail> mapFromJson(dynamic json) {
    final map = <String, GrowthRateDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GrowthRateDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GrowthRateDetail-objects as value to a dart map
  static Map<String, List<GrowthRateDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GrowthRateDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GrowthRateDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'formula',
    'descriptions',
    'levels',
    'pokemon_species',
  };
}

