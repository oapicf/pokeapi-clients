//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EvolutionChainDetailChainEvolvesToInner {
  /// Returns a new [EvolutionChainDetailChainEvolvesToInner] instance.
  EvolutionChainDetailChainEvolvesToInner({
    this.evolutionDetails = const [],
    required this.isBaby,
    required this.species,
  });

  List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails;

  bool isBaby;

  AbilityDetailPokemonInnerPokemon species;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EvolutionChainDetailChainEvolvesToInner &&
    _deepEquality.equals(other.evolutionDetails, evolutionDetails) &&
    other.isBaby == isBaby &&
    other.species == species;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (evolutionDetails.hashCode) +
    (isBaby.hashCode) +
    (species.hashCode);

  @override
  String toString() => 'EvolutionChainDetailChainEvolvesToInner[evolutionDetails=$evolutionDetails, isBaby=$isBaby, species=$species]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'evolution_details'] = this.evolutionDetails;
      json[r'is_baby'] = this.isBaby;
      json[r'species'] = this.species;
    return json;
  }

  /// Returns a new [EvolutionChainDetailChainEvolvesToInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EvolutionChainDetailChainEvolvesToInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'evolution_details'), 'Required key "EvolutionChainDetailChainEvolvesToInner[evolution_details]" is missing from JSON.');
        assert(json[r'evolution_details'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInner[evolution_details]" has a null value in JSON.');
        assert(json.containsKey(r'is_baby'), 'Required key "EvolutionChainDetailChainEvolvesToInner[is_baby]" is missing from JSON.');
        assert(json[r'is_baby'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInner[is_baby]" has a null value in JSON.');
        assert(json.containsKey(r'species'), 'Required key "EvolutionChainDetailChainEvolvesToInner[species]" is missing from JSON.');
        assert(json[r'species'] != null, 'Required key "EvolutionChainDetailChainEvolvesToInner[species]" has a null value in JSON.');
        return true;
      }());

      return EvolutionChainDetailChainEvolvesToInner(
        evolutionDetails: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.listFromJson(json[r'evolution_details']),
        isBaby: mapValueOfType<bool>(json, r'is_baby')!,
        species: AbilityDetailPokemonInnerPokemon.fromJson(json[r'species'])!,
      );
    }
    return null;
  }

  static List<EvolutionChainDetailChainEvolvesToInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EvolutionChainDetailChainEvolvesToInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EvolutionChainDetailChainEvolvesToInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EvolutionChainDetailChainEvolvesToInner> mapFromJson(dynamic json) {
    final map = <String, EvolutionChainDetailChainEvolvesToInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EvolutionChainDetailChainEvolvesToInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EvolutionChainDetailChainEvolvesToInner-objects as value to a dart map
  static Map<String, List<EvolutionChainDetailChainEvolvesToInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EvolutionChainDetailChainEvolvesToInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EvolutionChainDetailChainEvolvesToInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'evolution_details',
    'is_baby',
    'species',
  };
}

