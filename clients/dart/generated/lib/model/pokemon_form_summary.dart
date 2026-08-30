//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonFormSummary {
  /// Returns a new [PokemonFormSummary] instance.
  PokemonFormSummary({
    required this.name,
    required this.url,
  });

  String name;

  String url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonFormSummary &&
    other.name == name &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (url.hashCode);

  @override
  String toString() => 'PokemonFormSummary[name=$name, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'url'] = this.url;
    return json;
  }

  /// Returns a new [PokemonFormSummary] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonFormSummary? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "PokemonFormSummary[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PokemonFormSummary[name]" has a null value in JSON.');
        assert(json.containsKey(r'url'), 'Required key "PokemonFormSummary[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "PokemonFormSummary[url]" has a null value in JSON.');
        return true;
      }());

      return PokemonFormSummary(
        name: mapValueOfType<String>(json, r'name')!,
        url: mapValueOfType<String>(json, r'url')!,
      );
    }
    return null;
  }

  static List<PokemonFormSummary> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonFormSummary>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonFormSummary.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonFormSummary> mapFromJson(dynamic json) {
    final map = <String, PokemonFormSummary>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonFormSummary.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonFormSummary-objects as value to a dart map
  static Map<String, List<PokemonFormSummary>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonFormSummary>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonFormSummary.listFromJson(entry.value, growable: growable,);
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

