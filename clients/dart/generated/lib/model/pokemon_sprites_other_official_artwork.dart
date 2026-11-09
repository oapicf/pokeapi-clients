//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpritesOtherOfficialArtwork {
  /// Returns a new [PokemonSpritesOtherOfficialArtwork] instance.
  PokemonSpritesOtherOfficialArtwork({
    required this.frontDefault,
    required this.frontShiny,
    this.versions = const {},
  });

  /// The URL of the default front official artwork, or null if unavailable.
  String? frontDefault;

  /// The URL of the shiny front official artwork, or null if unavailable.
  String? frontShiny;

  /// Additional official artwork grouped by version. Available keys vary by resource.
  Map<String, Map<String, Object?>> versions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpritesOtherOfficialArtwork &&
    other.frontDefault == frontDefault &&
    other.frontShiny == frontShiny &&
    _deepEquality.equals(other.versions, versions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (frontDefault == null ? 0 : frontDefault!.hashCode) +
    (frontShiny == null ? 0 : frontShiny!.hashCode) +
    (versions.hashCode);

  @override
  String toString() => 'PokemonSpritesOtherOfficialArtwork[frontDefault=$frontDefault, frontShiny=$frontShiny, versions=$versions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.frontDefault != null) {
      json[r'front_default'] = this.frontDefault;
    } else {
      json[r'front_default'] = null;
    }
    if (this.frontShiny != null) {
      json[r'front_shiny'] = this.frontShiny;
    } else {
      json[r'front_shiny'] = null;
    }
      json[r'versions'] = this.versions;
    return json;
  }

  /// Returns a new [PokemonSpritesOtherOfficialArtwork] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpritesOtherOfficialArtwork? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'front_default'), 'Required key "PokemonSpritesOtherOfficialArtwork[front_default]" is missing from JSON.');
        assert(json.containsKey(r'front_shiny'), 'Required key "PokemonSpritesOtherOfficialArtwork[front_shiny]" is missing from JSON.');
        return true;
      }());

      return PokemonSpritesOtherOfficialArtwork(
        frontDefault: mapValueOfType<String>(json, r'front_default'),
        frontShiny: mapValueOfType<String>(json, r'front_shiny'),
        versions: mapCastOfType<String, dynamic>(json, r'versions') ?? const {},
      );
    }
    return null;
  }

  static List<PokemonSpritesOtherOfficialArtwork> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpritesOtherOfficialArtwork>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpritesOtherOfficialArtwork.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpritesOtherOfficialArtwork> mapFromJson(dynamic json) {
    final map = <String, PokemonSpritesOtherOfficialArtwork>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpritesOtherOfficialArtwork.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpritesOtherOfficialArtwork-objects as value to a dart map
  static Map<String, List<PokemonSpritesOtherOfficialArtwork>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpritesOtherOfficialArtwork>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpritesOtherOfficialArtwork.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'front_default',
    'front_shiny',
  };
}

