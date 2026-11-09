//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonFormTriggerCondition {
  /// Returns a new [PokemonFormTriggerCondition] instance.
  PokemonFormTriggerCondition({
    required this.trigger,
    this.name,
    this.url,
    this.baseForm,
  });

  /// The trigger for this form change.
  String trigger;

  /// The name of the required item, ability, or move. Only present for a resource-based trigger.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// The URL of the required item, ability, or move. Only present for a resource-based trigger.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? url;

  /// The required base form. Only present when the trigger specifies one.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PokemonFormSummary? baseForm;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonFormTriggerCondition &&
    other.trigger == trigger &&
    other.name == name &&
    other.url == url &&
    other.baseForm == baseForm;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (trigger.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (url == null ? 0 : url!.hashCode) +
    (baseForm == null ? 0 : baseForm!.hashCode);

  @override
  String toString() => 'PokemonFormTriggerCondition[trigger=$trigger, name=$name, url=$url, baseForm=$baseForm]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'trigger'] = this.trigger;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
    if (this.baseForm != null) {
      json[r'base_form'] = this.baseForm;
    } else {
      json[r'base_form'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonFormTriggerCondition] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonFormTriggerCondition? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'trigger'), 'Required key "PokemonFormTriggerCondition[trigger]" is missing from JSON.');
        assert(json[r'trigger'] != null, 'Required key "PokemonFormTriggerCondition[trigger]" has a null value in JSON.');
        return true;
      }());

      return PokemonFormTriggerCondition(
        trigger: mapValueOfType<String>(json, r'trigger')!,
        name: mapValueOfType<String>(json, r'name'),
        url: mapValueOfType<String>(json, r'url'),
        baseForm: PokemonFormSummary.fromJson(json[r'base_form']),
      );
    }
    return null;
  }

  static List<PokemonFormTriggerCondition> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonFormTriggerCondition>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonFormTriggerCondition.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonFormTriggerCondition> mapFromJson(dynamic json) {
    final map = <String, PokemonFormTriggerCondition>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonFormTriggerCondition.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonFormTriggerCondition-objects as value to a dart map
  static Map<String, List<PokemonFormTriggerCondition>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonFormTriggerCondition>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonFormTriggerCondition.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'trigger',
  };
}

