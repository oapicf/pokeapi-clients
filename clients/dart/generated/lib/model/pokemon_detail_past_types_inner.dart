//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetailPastTypesInner {
  /// Returns a new [PokemonDetailPastTypesInner] instance.
  PokemonDetailPastTypesInner({
    required this.generation,
    this.types = const [],
  });

  AbilityDetailPokemonInnerPokemon generation;

  List<PokemonDetailTypesInner> types;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetailPastTypesInner &&
    other.generation == generation &&
    _deepEquality.equals(other.types, types);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (generation.hashCode) +
    (types.hashCode);

  @override
  String toString() => 'PokemonDetailPastTypesInner[generation=$generation, types=$types]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'generation'] = this.generation;
      json[r'types'] = this.types;
    return json;
  }

  /// Returns a new [PokemonDetailPastTypesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetailPastTypesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'generation'), 'Required key "PokemonDetailPastTypesInner[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "PokemonDetailPastTypesInner[generation]" has a null value in JSON.');
        assert(json.containsKey(r'types'), 'Required key "PokemonDetailPastTypesInner[types]" is missing from JSON.');
        assert(json[r'types'] != null, 'Required key "PokemonDetailPastTypesInner[types]" has a null value in JSON.');
        return true;
      }());

      return PokemonDetailPastTypesInner(
        generation: AbilityDetailPokemonInnerPokemon.fromJson(json[r'generation'])!,
        types: PokemonDetailTypesInner.listFromJson(json[r'types']),
      );
    }
    return null;
  }

  static List<PokemonDetailPastTypesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetailPastTypesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetailPastTypesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetailPastTypesInner> mapFromJson(dynamic json) {
    final map = <String, PokemonDetailPastTypesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetailPastTypesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetailPastTypesInner-objects as value to a dart map
  static Map<String, List<PokemonDetailPastTypesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetailPastTypesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetailPastTypesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'generation',
    'types',
  };
}

