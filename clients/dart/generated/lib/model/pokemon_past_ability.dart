//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonPastAbility {
  /// Returns a new [PokemonPastAbility] instance.
  PokemonPastAbility({
    this.abilities = const [],
    required this.generation,
  });

  /// The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
  List<PokemonAbilityPast> abilities;

  /// The last generation in which the referenced pokémon had the listed abilities.
  GenerationSummary generation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonPastAbility &&
    _deepEquality.equals(other.abilities, abilities) &&
    other.generation == generation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (abilities.hashCode) +
    (generation.hashCode);

  @override
  String toString() => 'PokemonPastAbility[abilities=$abilities, generation=$generation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'abilities'] = this.abilities;
      json[r'generation'] = this.generation;
    return json;
  }

  /// Returns a new [PokemonPastAbility] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonPastAbility? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'abilities'), 'Required key "PokemonPastAbility[abilities]" is missing from JSON.');
        assert(json[r'abilities'] != null, 'Required key "PokemonPastAbility[abilities]" has a null value in JSON.');
        assert(json.containsKey(r'generation'), 'Required key "PokemonPastAbility[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "PokemonPastAbility[generation]" has a null value in JSON.');
        return true;
      }());

      return PokemonPastAbility(
        abilities: PokemonAbilityPast.listFromJson(json[r'abilities']),
        generation: GenerationSummary.fromJson(json[r'generation'])!,
      );
    }
    return null;
  }

  static List<PokemonPastAbility> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonPastAbility>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonPastAbility.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonPastAbility> mapFromJson(dynamic json) {
    final map = <String, PokemonPastAbility>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonPastAbility.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonPastAbility-objects as value to a dart map
  static Map<String, List<PokemonPastAbility>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonPastAbility>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonPastAbility.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'abilities',
    'generation',
  };
}

