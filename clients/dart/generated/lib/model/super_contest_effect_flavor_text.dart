//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SuperContestEffectFlavorText {
  /// Returns a new [SuperContestEffectFlavorText] instance.
  SuperContestEffectFlavorText({
    required this.flavorText,
    required this.language,
  });

  String flavorText;

  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SuperContestEffectFlavorText &&
    other.flavorText == flavorText &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (flavorText.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'SuperContestEffectFlavorText[flavorText=$flavorText, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'flavor_text'] = this.flavorText;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [SuperContestEffectFlavorText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SuperContestEffectFlavorText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SuperContestEffectFlavorText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SuperContestEffectFlavorText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SuperContestEffectFlavorText(
        flavorText: mapValueOfType<String>(json, r'flavor_text')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<SuperContestEffectFlavorText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SuperContestEffectFlavorText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SuperContestEffectFlavorText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SuperContestEffectFlavorText> mapFromJson(dynamic json) {
    final map = <String, SuperContestEffectFlavorText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SuperContestEffectFlavorText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SuperContestEffectFlavorText-objects as value to a dart map
  static Map<String, List<SuperContestEffectFlavorText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SuperContestEffectFlavorText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SuperContestEffectFlavorText.listFromJson(entry.value, growable: growable,);
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

