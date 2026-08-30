//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpeciesDetailVarietiesInner {
  /// Returns a new [PokemonSpeciesDetailVarietiesInner] instance.
  PokemonSpeciesDetailVarietiesInner({
    required this.isDefault,
    required this.pokemon,
  });

  bool isDefault;

  AbilityDetailPokemonInnerPokemon pokemon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpeciesDetailVarietiesInner &&
    other.isDefault == isDefault &&
    other.pokemon == pokemon;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isDefault.hashCode) +
    (pokemon.hashCode);

  @override
  String toString() => 'PokemonSpeciesDetailVarietiesInner[isDefault=$isDefault, pokemon=$pokemon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'is_default'] = this.isDefault;
      json[r'pokemon'] = this.pokemon;
    return json;
  }

  /// Returns a new [PokemonSpeciesDetailVarietiesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpeciesDetailVarietiesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'is_default'), 'Required key "PokemonSpeciesDetailVarietiesInner[is_default]" is missing from JSON.');
        assert(json[r'is_default'] != null, 'Required key "PokemonSpeciesDetailVarietiesInner[is_default]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon'), 'Required key "PokemonSpeciesDetailVarietiesInner[pokemon]" is missing from JSON.');
        assert(json[r'pokemon'] != null, 'Required key "PokemonSpeciesDetailVarietiesInner[pokemon]" has a null value in JSON.');
        return true;
      }());

      return PokemonSpeciesDetailVarietiesInner(
        isDefault: mapValueOfType<bool>(json, r'is_default')!,
        pokemon: AbilityDetailPokemonInnerPokemon.fromJson(json[r'pokemon'])!,
      );
    }
    return null;
  }

  static List<PokemonSpeciesDetailVarietiesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpeciesDetailVarietiesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpeciesDetailVarietiesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpeciesDetailVarietiesInner> mapFromJson(dynamic json) {
    final map = <String, PokemonSpeciesDetailVarietiesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpeciesDetailVarietiesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpeciesDetailVarietiesInner-objects as value to a dart map
  static Map<String, List<PokemonSpeciesDetailVarietiesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpeciesDetailVarietiesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpeciesDetailVarietiesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'is_default',
    'pokemon',
  };
}

