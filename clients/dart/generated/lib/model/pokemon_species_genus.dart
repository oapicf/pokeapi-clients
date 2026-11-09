//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpeciesGenus {
  /// Returns a new [PokemonSpeciesGenus] instance.
  PokemonSpeciesGenus({
    required this.genus,
    required this.language,
  });

  /// The localized genus for the referenced Pokémon species
  String genus;

  /// The language this genus is in.
  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpeciesGenus &&
    other.genus == genus &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (genus.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'PokemonSpeciesGenus[genus=$genus, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'genus'] = this.genus;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [PokemonSpeciesGenus] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpeciesGenus? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'genus'), 'Required key "PokemonSpeciesGenus[genus]" is missing from JSON.');
        assert(json[r'genus'] != null, 'Required key "PokemonSpeciesGenus[genus]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "PokemonSpeciesGenus[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "PokemonSpeciesGenus[language]" has a null value in JSON.');
        return true;
      }());

      return PokemonSpeciesGenus(
        genus: mapValueOfType<String>(json, r'genus')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<PokemonSpeciesGenus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpeciesGenus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpeciesGenus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpeciesGenus> mapFromJson(dynamic json) {
    final map = <String, PokemonSpeciesGenus>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpeciesGenus.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpeciesGenus-objects as value to a dart map
  static Map<String, List<PokemonSpeciesGenus>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpeciesGenus>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpeciesGenus.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'genus',
    'language',
  };
}

