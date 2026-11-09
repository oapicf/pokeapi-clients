//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EvolutionChainLink {
  /// Returns a new [EvolutionChainLink] instance.
  EvolutionChainLink({
    required this.isBaby,
    required this.species,
    this.evolutionDetails = const [],
    this.evolvesTo = const [],
  });

  /// Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
  bool isBaby;

  /// The Pokémon species at this point in the evolution chain.
  PokemonSpeciesSummary species;

  /// All details regarding the specific details of the referenced Pokémon species evolution.
  List<PokemonEvolution> evolutionDetails;

  /// A List of chain objects.
  List<EvolutionChainLink> evolvesTo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EvolutionChainLink &&
    other.isBaby == isBaby &&
    other.species == species &&
    _deepEquality.equals(other.evolutionDetails, evolutionDetails) &&
    _deepEquality.equals(other.evolvesTo, evolvesTo);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isBaby.hashCode) +
    (species.hashCode) +
    (evolutionDetails.hashCode) +
    (evolvesTo.hashCode);

  @override
  String toString() => 'EvolutionChainLink[isBaby=$isBaby, species=$species, evolutionDetails=$evolutionDetails, evolvesTo=$evolvesTo]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'is_baby'] = this.isBaby;
      json[r'species'] = this.species;
      json[r'evolution_details'] = this.evolutionDetails;
      json[r'evolves_to'] = this.evolvesTo;
    return json;
  }

  /// Returns a new [EvolutionChainLink] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EvolutionChainLink? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'is_baby'), 'Required key "EvolutionChainLink[is_baby]" is missing from JSON.');
        assert(json[r'is_baby'] != null, 'Required key "EvolutionChainLink[is_baby]" has a null value in JSON.');
        assert(json.containsKey(r'species'), 'Required key "EvolutionChainLink[species]" is missing from JSON.');
        assert(json[r'species'] != null, 'Required key "EvolutionChainLink[species]" has a null value in JSON.');
        assert(json.containsKey(r'evolution_details'), 'Required key "EvolutionChainLink[evolution_details]" is missing from JSON.');
        assert(json[r'evolution_details'] != null, 'Required key "EvolutionChainLink[evolution_details]" has a null value in JSON.');
        assert(json.containsKey(r'evolves_to'), 'Required key "EvolutionChainLink[evolves_to]" is missing from JSON.');
        assert(json[r'evolves_to'] != null, 'Required key "EvolutionChainLink[evolves_to]" has a null value in JSON.');
        return true;
      }());

      return EvolutionChainLink(
        isBaby: mapValueOfType<bool>(json, r'is_baby')!,
        species: PokemonSpeciesSummary.fromJson(json[r'species'])!,
        evolutionDetails: PokemonEvolution.listFromJson(json[r'evolution_details']),
        evolvesTo: EvolutionChainLink.listFromJson(json[r'evolves_to']),
      );
    }
    return null;
  }

  static List<EvolutionChainLink> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EvolutionChainLink>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EvolutionChainLink.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EvolutionChainLink> mapFromJson(dynamic json) {
    final map = <String, EvolutionChainLink>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EvolutionChainLink.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EvolutionChainLink-objects as value to a dart map
  static Map<String, List<EvolutionChainLink>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EvolutionChainLink>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EvolutionChainLink.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'is_baby',
    'species',
    'evolution_details',
    'evolves_to',
  };
}

