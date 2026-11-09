//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonShapeName {
  /// Returns a new [PokemonShapeName] instance.
  PokemonShapeName({
    required this.name,
    required this.language,
  });

  /// The localized name for an API resource in a specific language.
  String name;

  /// The language this name is in.
  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonShapeName &&
    other.name == name &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'PokemonShapeName[name=$name, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [PokemonShapeName] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonShapeName? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "PokemonShapeName[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PokemonShapeName[name]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "PokemonShapeName[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "PokemonShapeName[language]" has a null value in JSON.');
        return true;
      }());

      return PokemonShapeName(
        name: mapValueOfType<String>(json, r'name')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<PokemonShapeName> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonShapeName>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonShapeName.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonShapeName> mapFromJson(dynamic json) {
    final map = <String, PokemonShapeName>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonShapeName.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonShapeName-objects as value to a dart map
  static Map<String, List<PokemonShapeName>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonShapeName>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonShapeName.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'language',
  };
}

