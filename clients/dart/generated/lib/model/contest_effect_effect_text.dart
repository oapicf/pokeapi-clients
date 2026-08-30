//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ContestEffectEffectText {
  /// Returns a new [ContestEffectEffectText] instance.
  ContestEffectEffectText({
    required this.effect,
    required this.language,
  });

  String effect;

  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ContestEffectEffectText &&
    other.effect == effect &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (effect.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'ContestEffectEffectText[effect=$effect, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'effect'] = this.effect;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [ContestEffectEffectText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ContestEffectEffectText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'effect'), 'Required key "ContestEffectEffectText[effect]" is missing from JSON.');
        assert(json[r'effect'] != null, 'Required key "ContestEffectEffectText[effect]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "ContestEffectEffectText[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "ContestEffectEffectText[language]" has a null value in JSON.');
        return true;
      }());

      return ContestEffectEffectText(
        effect: mapValueOfType<String>(json, r'effect')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<ContestEffectEffectText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ContestEffectEffectText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ContestEffectEffectText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ContestEffectEffectText> mapFromJson(dynamic json) {
    final map = <String, ContestEffectEffectText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ContestEffectEffectText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ContestEffectEffectText-objects as value to a dart map
  static Map<String, List<ContestEffectEffectText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ContestEffectEffectText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ContestEffectEffectText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'effect',
    'language',
  };
}

