//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetailMovesInnerVersionGroupDetailsInner {
  /// Returns a new [PokemonDetailMovesInnerVersionGroupDetailsInner] instance.
  PokemonDetailMovesInnerVersionGroupDetailsInner({
    required this.levelLearnedAt,
    required this.moveLearnMethod,
    required this.versionGroup,
  });

  int levelLearnedAt;

  AbilityDetailPokemonInnerPokemon moveLearnMethod;

  AbilityDetailPokemonInnerPokemon versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetailMovesInnerVersionGroupDetailsInner &&
    other.levelLearnedAt == levelLearnedAt &&
    other.moveLearnMethod == moveLearnMethod &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (levelLearnedAt.hashCode) +
    (moveLearnMethod.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'PokemonDetailMovesInnerVersionGroupDetailsInner[levelLearnedAt=$levelLearnedAt, moveLearnMethod=$moveLearnMethod, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'level_learned_at'] = this.levelLearnedAt;
      json[r'move_learn_method'] = this.moveLearnMethod;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [PokemonDetailMovesInnerVersionGroupDetailsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetailMovesInnerVersionGroupDetailsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'level_learned_at'), 'Required key "PokemonDetailMovesInnerVersionGroupDetailsInner[level_learned_at]" is missing from JSON.');
        assert(json[r'level_learned_at'] != null, 'Required key "PokemonDetailMovesInnerVersionGroupDetailsInner[level_learned_at]" has a null value in JSON.');
        assert(json.containsKey(r'move_learn_method'), 'Required key "PokemonDetailMovesInnerVersionGroupDetailsInner[move_learn_method]" is missing from JSON.');
        assert(json[r'move_learn_method'] != null, 'Required key "PokemonDetailMovesInnerVersionGroupDetailsInner[move_learn_method]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "PokemonDetailMovesInnerVersionGroupDetailsInner[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "PokemonDetailMovesInnerVersionGroupDetailsInner[version_group]" has a null value in JSON.');
        return true;
      }());

      return PokemonDetailMovesInnerVersionGroupDetailsInner(
        levelLearnedAt: mapValueOfType<int>(json, r'level_learned_at')!,
        moveLearnMethod: AbilityDetailPokemonInnerPokemon.fromJson(json[r'move_learn_method'])!,
        versionGroup: AbilityDetailPokemonInnerPokemon.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<PokemonDetailMovesInnerVersionGroupDetailsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetailMovesInnerVersionGroupDetailsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetailMovesInnerVersionGroupDetailsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetailMovesInnerVersionGroupDetailsInner> mapFromJson(dynamic json) {
    final map = <String, PokemonDetailMovesInnerVersionGroupDetailsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetailMovesInnerVersionGroupDetailsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetailMovesInnerVersionGroupDetailsInner-objects as value to a dart map
  static Map<String, List<PokemonDetailMovesInnerVersionGroupDetailsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetailMovesInnerVersionGroupDetailsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetailMovesInnerVersionGroupDetailsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'level_learned_at',
    'move_learn_method',
    'version_group',
  };
}

