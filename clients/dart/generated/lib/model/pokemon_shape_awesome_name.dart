//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonShapeAwesomeName {
  /// Returns a new [PokemonShapeAwesomeName] instance.
  PokemonShapeAwesomeName({
    required this.awesomeName,
    required this.language,
  });

  /// The localized \"scientific\" name for an API resource in a specific language.
  String awesomeName;

  /// The language this \"scientific\" name is in.
  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonShapeAwesomeName &&
    other.awesomeName == awesomeName &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (awesomeName.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'PokemonShapeAwesomeName[awesomeName=$awesomeName, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'awesome_name'] = this.awesomeName;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [PokemonShapeAwesomeName] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonShapeAwesomeName? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'awesome_name'), 'Required key "PokemonShapeAwesomeName[awesome_name]" is missing from JSON.');
        assert(json[r'awesome_name'] != null, 'Required key "PokemonShapeAwesomeName[awesome_name]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "PokemonShapeAwesomeName[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "PokemonShapeAwesomeName[language]" has a null value in JSON.');
        return true;
      }());

      return PokemonShapeAwesomeName(
        awesomeName: mapValueOfType<String>(json, r'awesome_name')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<PokemonShapeAwesomeName> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonShapeAwesomeName>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonShapeAwesomeName.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonShapeAwesomeName> mapFromJson(dynamic json) {
    final map = <String, PokemonShapeAwesomeName>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonShapeAwesomeName.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonShapeAwesomeName-objects as value to a dart map
  static Map<String, List<PokemonShapeAwesomeName>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonShapeAwesomeName>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonShapeAwesomeName.listFromJson(entry.value, growable: growable,);
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

