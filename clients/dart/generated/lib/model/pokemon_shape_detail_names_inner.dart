//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonShapeDetailNamesInner {
  /// Returns a new [PokemonShapeDetailNamesInner] instance.
  PokemonShapeDetailNamesInner({
    required this.url,
    required this.name,
  });

  String url;

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonShapeDetailNamesInner &&
    other.url == url &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (url.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'PokemonShapeDetailNamesInner[url=$url, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'url'] = this.url;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [PokemonShapeDetailNamesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonShapeDetailNamesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'url'), 'Required key "PokemonShapeDetailNamesInner[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "PokemonShapeDetailNamesInner[url]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "PokemonShapeDetailNamesInner[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PokemonShapeDetailNamesInner[name]" has a null value in JSON.');
        return true;
      }());

      return PokemonShapeDetailNamesInner(
        url: mapValueOfType<String>(json, r'url')!,
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<PokemonShapeDetailNamesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonShapeDetailNamesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonShapeDetailNamesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonShapeDetailNamesInner> mapFromJson(dynamic json) {
    final map = <String, PokemonShapeDetailNamesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonShapeDetailNamesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonShapeDetailNamesInner-objects as value to a dart map
  static Map<String, List<PokemonShapeDetailNamesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonShapeDetailNamesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonShapeDetailNamesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'url',
    'name',
  };
}

