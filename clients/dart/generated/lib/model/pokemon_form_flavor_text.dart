//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonFormFlavorText {
  /// Returns a new [PokemonFormFlavorText] instance.
  PokemonFormFlavorText({
    required this.flavorText,
    required this.language,
    required this.version,
  });

  /// The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
  String flavorText;

  /// The language this name is in.
  LanguageSummary language;

  /// The game version this flavor text is extracted from.
  VersionSummary version;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonFormFlavorText &&
    other.flavorText == flavorText &&
    other.language == language &&
    other.version == version;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (flavorText.hashCode) +
    (language.hashCode) +
    (version.hashCode);

  @override
  String toString() => 'PokemonFormFlavorText[flavorText=$flavorText, language=$language, version=$version]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'flavor_text'] = this.flavorText;
      json[r'language'] = this.language;
      json[r'version'] = this.version;
    return json;
  }

  /// Returns a new [PokemonFormFlavorText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonFormFlavorText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'flavor_text'), 'Required key "PokemonFormFlavorText[flavor_text]" is missing from JSON.');
        assert(json[r'flavor_text'] != null, 'Required key "PokemonFormFlavorText[flavor_text]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "PokemonFormFlavorText[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "PokemonFormFlavorText[language]" has a null value in JSON.');
        assert(json.containsKey(r'version'), 'Required key "PokemonFormFlavorText[version]" is missing from JSON.');
        assert(json[r'version'] != null, 'Required key "PokemonFormFlavorText[version]" has a null value in JSON.');
        return true;
      }());

      return PokemonFormFlavorText(
        flavorText: mapValueOfType<String>(json, r'flavor_text')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
        version: VersionSummary.fromJson(json[r'version'])!,
      );
    }
    return null;
  }

  static List<PokemonFormFlavorText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonFormFlavorText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonFormFlavorText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonFormFlavorText> mapFromJson(dynamic json) {
    final map = <String, PokemonFormFlavorText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonFormFlavorText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonFormFlavorText-objects as value to a dart map
  static Map<String, List<PokemonFormFlavorText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonFormFlavorText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonFormFlavorText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'flavor_text',
    'language',
    'version',
  };
}

