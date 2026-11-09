//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonFormSprites {
  /// Returns a new [PokemonFormSprites] instance.
  PokemonFormSprites({
    required this.frontDefault,
    required this.frontShiny,
    required this.frontFemale,
    required this.frontShinyFemale,
    required this.backDefault,
    required this.backShiny,
    required this.backFemale,
    required this.backShinyFemale,
    this.other,
    this.versions = const {},
  });

  /// The default depiction of this Pokémon from the front in battle.
  String? frontDefault;

  /// The shiny depiction of this Pokémon from the front in battle.
  String? frontShiny;

  /// The female depiction of this Pokémon from the front in battle.
  String? frontFemale;

  /// The shiny female depiction of this Pokémon from the front in battle.
  String? frontShinyFemale;

  /// The default depiction of this Pokémon from the back in battle.
  String? backDefault;

  /// The shiny depiction of this Pokémon from the back in battle.
  String? backShiny;

  /// The female depiction of this Pokémon from the back in battle.
  String? backFemale;

  /// The shiny female depiction of this Pokémon from the back in battle.
  String? backShinyFemale;

  /// Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PokemonSpritesOther? other;

  /// Sprites grouped by generation and game. Available keys vary by resource.
  Map<String, Map<String, Object?>> versions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonFormSprites &&
    other.frontDefault == frontDefault &&
    other.frontShiny == frontShiny &&
    other.frontFemale == frontFemale &&
    other.frontShinyFemale == frontShinyFemale &&
    other.backDefault == backDefault &&
    other.backShiny == backShiny &&
    other.backFemale == backFemale &&
    other.backShinyFemale == backShinyFemale &&
    other.other == other &&
    _deepEquality.equals(other.versions, versions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (frontDefault == null ? 0 : frontDefault!.hashCode) +
    (frontShiny == null ? 0 : frontShiny!.hashCode) +
    (frontFemale == null ? 0 : frontFemale!.hashCode) +
    (frontShinyFemale == null ? 0 : frontShinyFemale!.hashCode) +
    (backDefault == null ? 0 : backDefault!.hashCode) +
    (backShiny == null ? 0 : backShiny!.hashCode) +
    (backFemale == null ? 0 : backFemale!.hashCode) +
    (backShinyFemale == null ? 0 : backShinyFemale!.hashCode) +
    (other == null ? 0 : other!.hashCode) +
    (versions.hashCode);

  @override
  String toString() => 'PokemonFormSprites[frontDefault=$frontDefault, frontShiny=$frontShiny, frontFemale=$frontFemale, frontShinyFemale=$frontShinyFemale, backDefault=$backDefault, backShiny=$backShiny, backFemale=$backFemale, backShinyFemale=$backShinyFemale, other=$other, versions=$versions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.frontDefault != null) {
      json[r'front_default'] = this.frontDefault;
    } else {
      json[r'front_default'] = null;
    }
    if (this.frontShiny != null) {
      json[r'front_shiny'] = this.frontShiny;
    } else {
      json[r'front_shiny'] = null;
    }
    if (this.frontFemale != null) {
      json[r'front_female'] = this.frontFemale;
    } else {
      json[r'front_female'] = null;
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
    if (this.backShiny != null) {
      json[r'back_shiny'] = this.backShiny;
    } else {
      json[r'back_shiny'] = null;
    }
    if (this.backFemale != null) {
      json[r'back_female'] = this.backFemale;
    } else {
      json[r'back_female'] = null;
    }
    if (this.backShinyFemale != null) {
      json[r'back_shiny_female'] = this.backShinyFemale;
    } else {
      json[r'back_shiny_female'] = null;
    }
    if (this.other != null) {
      json[r'other'] = this.other;
    } else {
      json[r'other'] = null;
    }
      json[r'versions'] = this.versions;
    return json;
  }

  /// Returns a new [PokemonFormSprites] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonFormSprites? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'front_default'), 'Required key "PokemonFormSprites[front_default]" is missing from JSON.');
        assert(json.containsKey(r'front_shiny'), 'Required key "PokemonFormSprites[front_shiny]" is missing from JSON.');
        assert(json.containsKey(r'front_female'), 'Required key "PokemonFormSprites[front_female]" is missing from JSON.');
        assert(json.containsKey(r'front_shiny_female'), 'Required key "PokemonFormSprites[front_shiny_female]" is missing from JSON.');
        assert(json.containsKey(r'back_default'), 'Required key "PokemonFormSprites[back_default]" is missing from JSON.');
        assert(json.containsKey(r'back_shiny'), 'Required key "PokemonFormSprites[back_shiny]" is missing from JSON.');
        assert(json.containsKey(r'back_female'), 'Required key "PokemonFormSprites[back_female]" is missing from JSON.');
        assert(json.containsKey(r'back_shiny_female'), 'Required key "PokemonFormSprites[back_shiny_female]" is missing from JSON.');
        return true;
      }());

      return PokemonFormSprites(
        frontDefault: mapValueOfType<String>(json, r'front_default'),
        frontShiny: mapValueOfType<String>(json, r'front_shiny'),
        frontFemale: mapValueOfType<String>(json, r'front_female'),
        frontShinyFemale: mapValueOfType<String>(json, r'front_shiny_female'),
        backDefault: mapValueOfType<String>(json, r'back_default'),
        backShiny: mapValueOfType<String>(json, r'back_shiny'),
        backFemale: mapValueOfType<String>(json, r'back_female'),
        backShinyFemale: mapValueOfType<String>(json, r'back_shiny_female'),
        other: PokemonSpritesOther.fromJson(json[r'other']),
        versions: mapCastOfType<String, dynamic>(json, r'versions') ?? const {},
      );
    }
    return null;
  }

  static List<PokemonFormSprites> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonFormSprites>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonFormSprites.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonFormSprites> mapFromJson(dynamic json) {
    final map = <String, PokemonFormSprites>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonFormSprites.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonFormSprites-objects as value to a dart map
  static Map<String, List<PokemonFormSprites>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonFormSprites>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonFormSprites.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'front_default',
    'front_shiny',
    'front_female',
    'front_shiny_female',
    'back_default',
    'back_shiny',
    'back_female',
    'back_shiny_female',
  };
}

