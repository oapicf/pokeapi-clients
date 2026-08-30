//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenderDetail {
  /// Returns a new [GenderDetail] instance.
  GenderDetail({
    required this.id,
    required this.name,
    this.pokemonSpeciesDetails = const [],
    this.requiredForEvolution = const [],
  });

  int id;

  String name;

  List<GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails;

  List<AbilityDetailPokemonInnerPokemon> requiredForEvolution;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenderDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.pokemonSpeciesDetails, pokemonSpeciesDetails) &&
    _deepEquality.equals(other.requiredForEvolution, requiredForEvolution);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (pokemonSpeciesDetails.hashCode) +
    (requiredForEvolution.hashCode);

  @override
  String toString() => 'GenderDetail[id=$id, name=$name, pokemonSpeciesDetails=$pokemonSpeciesDetails, requiredForEvolution=$requiredForEvolution]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'pokemon_species_details'] = this.pokemonSpeciesDetails;
      json[r'required_for_evolution'] = this.requiredForEvolution;
    return json;
  }

  /// Returns a new [GenderDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenderDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "GenderDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "GenderDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "GenderDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "GenderDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_species_details'), 'Required key "GenderDetail[pokemon_species_details]" is missing from JSON.');
        assert(json[r'pokemon_species_details'] != null, 'Required key "GenderDetail[pokemon_species_details]" has a null value in JSON.');
        assert(json.containsKey(r'required_for_evolution'), 'Required key "GenderDetail[required_for_evolution]" is missing from JSON.');
        assert(json[r'required_for_evolution'] != null, 'Required key "GenderDetail[required_for_evolution]" has a null value in JSON.');
        return true;
      }());

      return GenderDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        pokemonSpeciesDetails: GenderDetailPokemonSpeciesDetailsInner.listFromJson(json[r'pokemon_species_details']),
        requiredForEvolution: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'required_for_evolution']),
      );
    }
    return null;
  }

  static List<GenderDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenderDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenderDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenderDetail> mapFromJson(dynamic json) {
    final map = <String, GenderDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenderDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenderDetail-objects as value to a dart map
  static Map<String, List<GenderDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenderDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenderDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'pokemon_species_details',
    'required_for_evolution',
  };
}

