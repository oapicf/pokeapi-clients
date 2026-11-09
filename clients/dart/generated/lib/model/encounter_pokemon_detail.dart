//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EncounterPokemonDetail {
  /// Returns a new [EncounterPokemonDetail] instance.
  EncounterPokemonDetail({
    this.minPerfectIvs,
    this.alwaysShiny,
    this.neverShiny,
    this.isAlpha,
  });

  /// The minimum number of perfect IVs, or null if unspecified.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? minPerfectIvs;

  /// Whether the encountered Pokémon is always shiny.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? alwaysShiny;

  /// Whether the encountered Pokémon can never be shiny.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? neverShiny;

  /// Whether the encountered Pokémon is an alpha Pokémon.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isAlpha;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EncounterPokemonDetail &&
    other.minPerfectIvs == minPerfectIvs &&
    other.alwaysShiny == alwaysShiny &&
    other.neverShiny == neverShiny &&
    other.isAlpha == isAlpha;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (minPerfectIvs == null ? 0 : minPerfectIvs!.hashCode) +
    (alwaysShiny == null ? 0 : alwaysShiny!.hashCode) +
    (neverShiny == null ? 0 : neverShiny!.hashCode) +
    (isAlpha == null ? 0 : isAlpha!.hashCode);

  @override
  String toString() => 'EncounterPokemonDetail[minPerfectIvs=$minPerfectIvs, alwaysShiny=$alwaysShiny, neverShiny=$neverShiny, isAlpha=$isAlpha]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.minPerfectIvs != null) {
      json[r'min_perfect_ivs'] = this.minPerfectIvs;
    } else {
      json[r'min_perfect_ivs'] = null;
    }
    if (this.alwaysShiny != null) {
      json[r'always_shiny'] = this.alwaysShiny;
    } else {
      json[r'always_shiny'] = null;
    }
    if (this.neverShiny != null) {
      json[r'never_shiny'] = this.neverShiny;
    } else {
      json[r'never_shiny'] = null;
    }
    if (this.isAlpha != null) {
      json[r'is_alpha'] = this.isAlpha;
    } else {
      json[r'is_alpha'] = null;
    }
    return json;
  }

  /// Returns a new [EncounterPokemonDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EncounterPokemonDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return EncounterPokemonDetail(
        minPerfectIvs: mapValueOfType<int>(json, r'min_perfect_ivs'),
        alwaysShiny: mapValueOfType<bool>(json, r'always_shiny'),
        neverShiny: mapValueOfType<bool>(json, r'never_shiny'),
        isAlpha: mapValueOfType<bool>(json, r'is_alpha'),
      );
    }
    return null;
  }

  static List<EncounterPokemonDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EncounterPokemonDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EncounterPokemonDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EncounterPokemonDetail> mapFromJson(dynamic json) {
    final map = <String, EncounterPokemonDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EncounterPokemonDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EncounterPokemonDetail-objects as value to a dart map
  static Map<String, List<EncounterPokemonDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EncounterPokemonDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EncounterPokemonDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

