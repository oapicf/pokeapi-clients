//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpritesOtherDreamWorld {
  /// Returns a new [PokemonSpritesOtherDreamWorld] instance.
  PokemonSpritesOtherDreamWorld({
    required this.frontDefault,
    required this.frontFemale,
  });

  /// The URL of the default Pokémon Dream World front image, or null if unavailable.
  String? frontDefault;

  /// The URL of the female Pokémon Dream World front image, or null if unavailable.
  String? frontFemale;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpritesOtherDreamWorld &&
    other.frontDefault == frontDefault &&
    other.frontFemale == frontFemale;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (frontDefault == null ? 0 : frontDefault!.hashCode) +
    (frontFemale == null ? 0 : frontFemale!.hashCode);

  @override
  String toString() => 'PokemonSpritesOtherDreamWorld[frontDefault=$frontDefault, frontFemale=$frontFemale]';

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
    return json;
  }

  /// Returns a new [PokemonSpritesOtherDreamWorld] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpritesOtherDreamWorld? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'front_default'), 'Required key "PokemonSpritesOtherDreamWorld[front_default]" is missing from JSON.');
        assert(json.containsKey(r'front_female'), 'Required key "PokemonSpritesOtherDreamWorld[front_female]" is missing from JSON.');
        return true;
      }());

      return PokemonSpritesOtherDreamWorld(
        frontDefault: mapValueOfType<String>(json, r'front_default'),
        frontFemale: mapValueOfType<String>(json, r'front_female'),
      );
    }
    return null;
  }

  static List<PokemonSpritesOtherDreamWorld> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpritesOtherDreamWorld>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpritesOtherDreamWorld.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpritesOtherDreamWorld> mapFromJson(dynamic json) {
    final map = <String, PokemonSpritesOtherDreamWorld>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpritesOtherDreamWorld.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpritesOtherDreamWorld-objects as value to a dart map
  static Map<String, List<PokemonSpritesOtherDreamWorld>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpritesOtherDreamWorld>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpritesOtherDreamWorld.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'front_default',
    'front_female',
  };
}

