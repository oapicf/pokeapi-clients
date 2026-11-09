//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpritesOtherShowdown {
  /// Returns a new [PokemonSpritesOtherShowdown] instance.
  PokemonSpritesOtherShowdown({
    required this.frontDefault,
    required this.frontFemale,
    required this.frontShiny,
    required this.frontShinyFemale,
    required this.backDefault,
    required this.backFemale,
    required this.backShiny,
    required this.backShinyFemale,
  });

  /// The URL of the default Pokémon Showdown front image, or null if unavailable.
  String? frontDefault;

  /// The URL of the female Pokémon Showdown front image, or null if unavailable.
  String? frontFemale;

  /// The URL of the shiny Pokémon Showdown front image, or null if unavailable.
  String? frontShiny;

  /// The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
  String? frontShinyFemale;

  /// The URL of the default Pokémon Showdown back image, or null if unavailable.
  String? backDefault;

  /// The URL of the female Pokémon Showdown back image, or null if unavailable.
  String? backFemale;

  /// The URL of the shiny Pokémon Showdown back image, or null if unavailable.
  String? backShiny;

  /// The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
  String? backShinyFemale;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpritesOtherShowdown &&
    other.frontDefault == frontDefault &&
    other.frontFemale == frontFemale &&
    other.frontShiny == frontShiny &&
    other.frontShinyFemale == frontShinyFemale &&
    other.backDefault == backDefault &&
    other.backFemale == backFemale &&
    other.backShiny == backShiny &&
    other.backShinyFemale == backShinyFemale;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (frontDefault == null ? 0 : frontDefault!.hashCode) +
    (frontFemale == null ? 0 : frontFemale!.hashCode) +
    (frontShiny == null ? 0 : frontShiny!.hashCode) +
    (frontShinyFemale == null ? 0 : frontShinyFemale!.hashCode) +
    (backDefault == null ? 0 : backDefault!.hashCode) +
    (backFemale == null ? 0 : backFemale!.hashCode) +
    (backShiny == null ? 0 : backShiny!.hashCode) +
    (backShinyFemale == null ? 0 : backShinyFemale!.hashCode);

  @override
  String toString() => 'PokemonSpritesOtherShowdown[frontDefault=$frontDefault, frontFemale=$frontFemale, frontShiny=$frontShiny, frontShinyFemale=$frontShinyFemale, backDefault=$backDefault, backFemale=$backFemale, backShiny=$backShiny, backShinyFemale=$backShinyFemale]';

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
    if (this.backDefault != null) {
      json[r'back_default'] = this.backDefault;
    } else {
      json[r'back_default'] = null;
    }
    if (this.backFemale != null) {
      json[r'back_female'] = this.backFemale;
    } else {
      json[r'back_female'] = null;
    }
    if (this.backShiny != null) {
      json[r'back_shiny'] = this.backShiny;
    } else {
      json[r'back_shiny'] = null;
    }
    if (this.backShinyFemale != null) {
      json[r'back_shiny_female'] = this.backShinyFemale;
    } else {
      json[r'back_shiny_female'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonSpritesOtherShowdown] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpritesOtherShowdown? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'front_default'), 'Required key "PokemonSpritesOtherShowdown[front_default]" is missing from JSON.');
        assert(json.containsKey(r'front_female'), 'Required key "PokemonSpritesOtherShowdown[front_female]" is missing from JSON.');
        assert(json.containsKey(r'front_shiny'), 'Required key "PokemonSpritesOtherShowdown[front_shiny]" is missing from JSON.');
        assert(json.containsKey(r'front_shiny_female'), 'Required key "PokemonSpritesOtherShowdown[front_shiny_female]" is missing from JSON.');
        assert(json.containsKey(r'back_default'), 'Required key "PokemonSpritesOtherShowdown[back_default]" is missing from JSON.');
        assert(json.containsKey(r'back_female'), 'Required key "PokemonSpritesOtherShowdown[back_female]" is missing from JSON.');
        assert(json.containsKey(r'back_shiny'), 'Required key "PokemonSpritesOtherShowdown[back_shiny]" is missing from JSON.');
        assert(json.containsKey(r'back_shiny_female'), 'Required key "PokemonSpritesOtherShowdown[back_shiny_female]" is missing from JSON.');
        return true;
      }());

      return PokemonSpritesOtherShowdown(
        frontDefault: mapValueOfType<String>(json, r'front_default'),
        frontFemale: mapValueOfType<String>(json, r'front_female'),
        frontShiny: mapValueOfType<String>(json, r'front_shiny'),
        frontShinyFemale: mapValueOfType<String>(json, r'front_shiny_female'),
        backDefault: mapValueOfType<String>(json, r'back_default'),
        backFemale: mapValueOfType<String>(json, r'back_female'),
        backShiny: mapValueOfType<String>(json, r'back_shiny'),
        backShinyFemale: mapValueOfType<String>(json, r'back_shiny_female'),
      );
    }
    return null;
  }

  static List<PokemonSpritesOtherShowdown> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpritesOtherShowdown>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpritesOtherShowdown.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpritesOtherShowdown> mapFromJson(dynamic json) {
    final map = <String, PokemonSpritesOtherShowdown>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpritesOtherShowdown.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpritesOtherShowdown-objects as value to a dart map
  static Map<String, List<PokemonSpritesOtherShowdown>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpritesOtherShowdown>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpritesOtherShowdown.listFromJson(entry.value, growable: growable,);
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
    'back_default',
    'back_female',
    'back_shiny',
    'back_shiny_female',
  };
}

