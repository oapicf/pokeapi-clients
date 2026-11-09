//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpritesOtherHome {
  /// Returns a new [PokemonSpritesOtherHome] instance.
  PokemonSpritesOtherHome({
    required this.frontDefault,
    required this.frontFemale,
    required this.frontShiny,
    required this.frontShinyFemale,
  });

  /// The URL of the default Pokémon HOME front image, or null if unavailable.
  String? frontDefault;

  /// The URL of the female Pokémon HOME front image, or null if unavailable.
  String? frontFemale;

  /// The URL of the shiny Pokémon HOME front image, or null if unavailable.
  String? frontShiny;

  /// The URL of the shiny female Pokémon HOME front image, or null if unavailable.
  String? frontShinyFemale;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpritesOtherHome &&
    other.frontDefault == frontDefault &&
    other.frontFemale == frontFemale &&
    other.frontShiny == frontShiny &&
    other.frontShinyFemale == frontShinyFemale;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (frontDefault == null ? 0 : frontDefault!.hashCode) +
    (frontFemale == null ? 0 : frontFemale!.hashCode) +
    (frontShiny == null ? 0 : frontShiny!.hashCode) +
    (frontShinyFemale == null ? 0 : frontShinyFemale!.hashCode);

  @override
  String toString() => 'PokemonSpritesOtherHome[frontDefault=$frontDefault, frontFemale=$frontFemale, frontShiny=$frontShiny, frontShinyFemale=$frontShinyFemale]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.frontDefault != null) {
      json[r'front_default'] = this.frontDefault;
    } else {
      json[r'front_default'] = null;
    }
    if (this.frontFemale != null) {
      json[r'front_female'] = this.frontFemale;
    } else {
      json[r'front_female'] = null;
    }
    if (this.frontShiny != null) {
      json[r'front_shiny'] = this.frontShiny;
    } else {
      json[r'front_shiny'] = null;
    }
    if (this.frontShinyFemale != null) {
      json[r'front_shiny_female'] = this.frontShinyFemale;
    } else {
      json[r'front_shiny_female'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonSpritesOtherHome] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpritesOtherHome? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'front_default'), 'Required key "PokemonSpritesOtherHome[front_default]" is missing from JSON.');
        assert(json.containsKey(r'front_female'), 'Required key "PokemonSpritesOtherHome[front_female]" is missing from JSON.');
        assert(json.containsKey(r'front_shiny'), 'Required key "PokemonSpritesOtherHome[front_shiny]" is missing from JSON.');
        assert(json.containsKey(r'front_shiny_female'), 'Required key "PokemonSpritesOtherHome[front_shiny_female]" is missing from JSON.');
        return true;
      }());

      return PokemonSpritesOtherHome(
        frontDefault: mapValueOfType<String>(json, r'front_default'),
        frontFemale: mapValueOfType<String>(json, r'front_female'),
        frontShiny: mapValueOfType<String>(json, r'front_shiny'),
        frontShinyFemale: mapValueOfType<String>(json, r'front_shiny_female'),
      );
    }
    return null;
  }

  static List<PokemonSpritesOtherHome> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpritesOtherHome>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpritesOtherHome.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpritesOtherHome> mapFromJson(dynamic json) {
    final map = <String, PokemonSpritesOtherHome>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpritesOtherHome.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpritesOtherHome-objects as value to a dart map
  static Map<String, List<PokemonSpritesOtherHome>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpritesOtherHome>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpritesOtherHome.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'front_default',
    'front_female',
    'front_shiny',
    'front_shiny_female',
  };
}

