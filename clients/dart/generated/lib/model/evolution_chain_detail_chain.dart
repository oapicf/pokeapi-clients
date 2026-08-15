//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EvolutionChainDetailChain {
  /// Returns a new [EvolutionChainDetailChain] instance.
  EvolutionChainDetailChain({
    this.evolutionDetails = const [],
    this.evolvesTo = const [],
    required this.isBaby,
    required this.species,
  });

  List<Object> evolutionDetails;

  List<EvolutionChainDetailChainEvolvesToInner> evolvesTo;

  bool isBaby;

  AbilityDetailPokemonInnerPokemon species;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EvolutionChainDetailChain &&
    _deepEquality.equals(other.evolutionDetails, evolutionDetails) &&
    _deepEquality.equals(other.evolvesTo, evolvesTo) &&
    other.isBaby == isBaby &&
    other.species == species;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (evolutionDetails.hashCode) +
    (evolvesTo.hashCode) +
    (isBaby.hashCode) +
    (species.hashCode);

  @override
  String toString() => 'EvolutionChainDetailChain[evolutionDetails=$evolutionDetails, evolvesTo=$evolvesTo, isBaby=$isBaby, species=$species]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'evolution_details'] = this.evolutionDetails;
      json[r'evolves_to'] = this.evolvesTo;
      json[r'is_baby'] = this.isBaby;
      json[r'species'] = this.species;
    return json;
  }

  /// Returns a new [EvolutionChainDetailChain] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EvolutionChainDetailChain? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EvolutionChainDetailChain[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EvolutionChainDetailChain[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EvolutionChainDetailChain(
        evolutionDetails: Object.listFromJson(json[r'evolution_details']),
        evolvesTo: EvolutionChainDetailChainEvolvesToInner.listFromJson(json[r'evolves_to']),
        isBaby: mapValueOfType<bool>(json, r'is_baby')!,
        species: AbilityDetailPokemonInnerPokemon.fromJson(json[r'species'])!,
      );
    }
    return null;
  }

  static List<EvolutionChainDetailChain> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EvolutionChainDetailChain>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EvolutionChainDetailChain.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EvolutionChainDetailChain> mapFromJson(dynamic json) {
    final map = <String, EvolutionChainDetailChain>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EvolutionChainDetailChain.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EvolutionChainDetailChain-objects as value to a dart map
  static Map<String, List<EvolutionChainDetailChain>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EvolutionChainDetailChain>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EvolutionChainDetailChain.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'evolution_details',
    'evolves_to',
    'is_baby',
    'species',
  };
}

