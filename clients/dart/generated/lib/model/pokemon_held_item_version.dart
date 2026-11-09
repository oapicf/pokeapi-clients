//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonHeldItemVersion {
  /// Returns a new [PokemonHeldItemVersion] instance.
  PokemonHeldItemVersion({
    required this.rarity,
    required this.version,
  });

  /// How often the item is held.
  int rarity;

  /// The version in which the item is held.
  VersionSummary version;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonHeldItemVersion &&
    other.rarity == rarity &&
    other.version == version;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rarity.hashCode) +
    (version.hashCode);

  @override
  String toString() => 'PokemonHeldItemVersion[rarity=$rarity, version=$version]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'rarity'] = this.rarity;
      json[r'version'] = this.version;
    return json;
  }

  /// Returns a new [PokemonHeldItemVersion] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonHeldItemVersion? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'rarity'), 'Required key "PokemonHeldItemVersion[rarity]" is missing from JSON.');
        assert(json[r'rarity'] != null, 'Required key "PokemonHeldItemVersion[rarity]" has a null value in JSON.');
        assert(json.containsKey(r'version'), 'Required key "PokemonHeldItemVersion[version]" is missing from JSON.');
        assert(json[r'version'] != null, 'Required key "PokemonHeldItemVersion[version]" has a null value in JSON.');
        return true;
      }());

      return PokemonHeldItemVersion(
        rarity: mapValueOfType<int>(json, r'rarity')!,
        version: VersionSummary.fromJson(json[r'version'])!,
      );
    }
    return null;
  }

  static List<PokemonHeldItemVersion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonHeldItemVersion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonHeldItemVersion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonHeldItemVersion> mapFromJson(dynamic json) {
    final map = <String, PokemonHeldItemVersion>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonHeldItemVersion.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonHeldItemVersion-objects as value to a dart map
  static Map<String, List<PokemonHeldItemVersion>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonHeldItemVersion>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonHeldItemVersion.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'rarity',
    'version',
  };
}

