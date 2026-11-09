//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpritesOther {
  /// Returns a new [PokemonSpritesOther] instance.
  PokemonSpritesOther({
    this.dreamWorld,
    this.home,
    this.showdown,
    this.officialArtwork,
  });

  /// Pokémon Dream World artwork URLs.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PokemonSpritesOtherDreamWorld? dreamWorld;

  /// Pokémon HOME sprite URLs.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PokemonSpritesOtherHome? home;

  /// Pokémon Showdown sprite URLs.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PokemonSpritesOtherShowdown? showdown;

  /// Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PokemonSpritesOtherOfficialArtwork? officialArtwork;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpritesOther &&
    other.dreamWorld == dreamWorld &&
    other.home == home &&
    other.showdown == showdown &&
    other.officialArtwork == officialArtwork;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dreamWorld == null ? 0 : dreamWorld!.hashCode) +
    (home == null ? 0 : home!.hashCode) +
    (showdown == null ? 0 : showdown!.hashCode) +
    (officialArtwork == null ? 0 : officialArtwork!.hashCode);

  @override
  String toString() => 'PokemonSpritesOther[dreamWorld=$dreamWorld, home=$home, showdown=$showdown, officialArtwork=$officialArtwork]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dreamWorld != null) {
      json[r'dream_world'] = this.dreamWorld;
    } else {
      json[r'dream_world'] = null;
    }
    if (this.home != null) {
      json[r'home'] = this.home;
    } else {
      json[r'home'] = null;
    }
    if (this.showdown != null) {
      json[r'showdown'] = this.showdown;
    } else {
      json[r'showdown'] = null;
    }
    if (this.officialArtwork != null) {
      json[r'official-artwork'] = this.officialArtwork;
    } else {
      json[r'official-artwork'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonSpritesOther] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpritesOther? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return PokemonSpritesOther(
        dreamWorld: PokemonSpritesOtherDreamWorld.fromJson(json[r'dream_world']),
        home: PokemonSpritesOtherHome.fromJson(json[r'home']),
        showdown: PokemonSpritesOtherShowdown.fromJson(json[r'showdown']),
        officialArtwork: PokemonSpritesOtherOfficialArtwork.fromJson(json[r'official-artwork']),
      );
    }
    return null;
  }

  static List<PokemonSpritesOther> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpritesOther>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpritesOther.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpritesOther> mapFromJson(dynamic json) {
    final map = <String, PokemonSpritesOther>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpritesOther.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpritesOther-objects as value to a dart map
  static Map<String, List<PokemonSpritesOther>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpritesOther>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpritesOther.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

