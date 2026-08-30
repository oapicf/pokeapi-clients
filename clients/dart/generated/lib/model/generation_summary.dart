//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GenerationSummary {
  /// Returns a new [GenerationSummary] instance.
  GenerationSummary({
    required this.name,
    required this.url,
  });

  String name;

  String url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GenerationSummary &&
    other.name == name &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (url.hashCode);

  @override
  String toString() => 'GenerationSummary[name=$name, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'url'] = this.url;
    return json;
  }

  /// Returns a new [GenerationSummary] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GenerationSummary? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "GenerationSummary[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "GenerationSummary[name]" has a null value in JSON.');
        assert(json.containsKey(r'url'), 'Required key "GenerationSummary[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "GenerationSummary[url]" has a null value in JSON.');
        return true;
      }());

      return GenerationSummary(
        name: mapValueOfType<String>(json, r'name')!,
        url: mapValueOfType<String>(json, r'url')!,
      );
    }
    return null;
  }

  static List<GenerationSummary> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenerationSummary>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenerationSummary.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GenerationSummary> mapFromJson(dynamic json) {
    final map = <String, GenerationSummary>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GenerationSummary.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GenerationSummary-objects as value to a dart map
  static Map<String, List<GenerationSummary>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GenerationSummary>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GenerationSummary.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'url',
  };
}

