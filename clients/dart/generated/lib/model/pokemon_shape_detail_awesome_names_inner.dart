//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonShapeDetailAwesomeNamesInner {
  /// Returns a new [PokemonShapeDetailAwesomeNamesInner] instance.
  PokemonShapeDetailAwesomeNamesInner({
    required this.awesomeName,
    required this.language,
  });

  String awesomeName;

  AbilityDetailPokemonInnerPokemon language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonShapeDetailAwesomeNamesInner &&
    other.awesomeName == awesomeName &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (awesomeName.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'PokemonShapeDetailAwesomeNamesInner[awesomeName=$awesomeName, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'awesome_name'] = this.awesomeName;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [PokemonShapeDetailAwesomeNamesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonShapeDetailAwesomeNamesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'awesome_name'), 'Required key "PokemonShapeDetailAwesomeNamesInner[awesome_name]" is missing from JSON.');
        assert(json[r'awesome_name'] != null, 'Required key "PokemonShapeDetailAwesomeNamesInner[awesome_name]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "PokemonShapeDetailAwesomeNamesInner[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "PokemonShapeDetailAwesomeNamesInner[language]" has a null value in JSON.');
        return true;
      }());

      return PokemonShapeDetailAwesomeNamesInner(
        awesomeName: mapValueOfType<String>(json, r'awesome_name')!,
        language: AbilityDetailPokemonInnerPokemon.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<PokemonShapeDetailAwesomeNamesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonShapeDetailAwesomeNamesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonShapeDetailAwesomeNamesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonShapeDetailAwesomeNamesInner> mapFromJson(dynamic json) {
    final map = <String, PokemonShapeDetailAwesomeNamesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonShapeDetailAwesomeNamesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonShapeDetailAwesomeNamesInner-objects as value to a dart map
  static Map<String, List<PokemonShapeDetailAwesomeNamesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonShapeDetailAwesomeNamesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonShapeDetailAwesomeNamesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'awesome_name',
    'language',
  };
}

