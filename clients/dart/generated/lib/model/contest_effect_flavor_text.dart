//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ContestEffectFlavorText {
  /// Returns a new [ContestEffectFlavorText] instance.
  ContestEffectFlavorText({
    required this.flavorText,
    required this.language,
  });

  String flavorText;

  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ContestEffectFlavorText &&
    other.flavorText == flavorText &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (flavorText.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'ContestEffectFlavorText[flavorText=$flavorText, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'flavor_text'] = this.flavorText;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [ContestEffectFlavorText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ContestEffectFlavorText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ContestEffectFlavorText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ContestEffectFlavorText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ContestEffectFlavorText(
        flavorText: mapValueOfType<String>(json, r'flavor_text')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<ContestEffectFlavorText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ContestEffectFlavorText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ContestEffectFlavorText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ContestEffectFlavorText> mapFromJson(dynamic json) {
    final map = <String, ContestEffectFlavorText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ContestEffectFlavorText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ContestEffectFlavorText-objects as value to a dart map
  static Map<String, List<ContestEffectFlavorText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ContestEffectFlavorText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ContestEffectFlavorText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'flavor_text',
    'language',
  };
}

