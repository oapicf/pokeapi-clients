//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveEffectEffectText {
  /// Returns a new [MoveEffectEffectText] instance.
  MoveEffectEffectText({
    required this.effect,
    required this.shortEffect,
    required this.language,
  });

  /// The localized effect text for an API resource in a specific language.
  String effect;

  /// The localized effect text in brief.
  String shortEffect;

  /// The language this effect is in.
  LanguageSummary language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveEffectEffectText &&
    other.effect == effect &&
    other.shortEffect == shortEffect &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (effect.hashCode) +
    (shortEffect.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'MoveEffectEffectText[effect=$effect, shortEffect=$shortEffect, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'effect'] = this.effect;
      json[r'short_effect'] = this.shortEffect;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [MoveEffectEffectText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveEffectEffectText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'effect'), 'Required key "MoveEffectEffectText[effect]" is missing from JSON.');
        assert(json[r'effect'] != null, 'Required key "MoveEffectEffectText[effect]" has a null value in JSON.');
        assert(json.containsKey(r'short_effect'), 'Required key "MoveEffectEffectText[short_effect]" is missing from JSON.');
        assert(json[r'short_effect'] != null, 'Required key "MoveEffectEffectText[short_effect]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "MoveEffectEffectText[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "MoveEffectEffectText[language]" has a null value in JSON.');
        return true;
      }());

      return MoveEffectEffectText(
        effect: mapValueOfType<String>(json, r'effect')!,
        shortEffect: mapValueOfType<String>(json, r'short_effect')!,
        language: LanguageSummary.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<MoveEffectEffectText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveEffectEffectText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveEffectEffectText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveEffectEffectText> mapFromJson(dynamic json) {
    final map = <String, MoveEffectEffectText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveEffectEffectText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveEffectEffectText-objects as value to a dart map
  static Map<String, List<MoveEffectEffectText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveEffectEffectText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveEffectEffectText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'effect',
    'short_effect',
    'language',
  };
}

