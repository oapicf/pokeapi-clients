//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MachineSummary {
  /// Returns a new [MachineSummary] instance.
  MachineSummary({
    required this.url,
  });

  String url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MachineSummary &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (url.hashCode);

  @override
  String toString() => 'MachineSummary[url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'url'] = this.url;
    return json;
  }

  /// Returns a new [MachineSummary] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MachineSummary? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MachineSummary[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MachineSummary[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MachineSummary(
        url: mapValueOfType<String>(json, r'url')!,
      );
    }
    return null;
  }

  static List<MachineSummary> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MachineSummary>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MachineSummary.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MachineSummary> mapFromJson(dynamic json) {
    final map = <String, MachineSummary>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MachineSummary.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MachineSummary-objects as value to a dart map
  static Map<String, List<MachineSummary>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MachineSummary>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MachineSummary.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'url',
  };
}

