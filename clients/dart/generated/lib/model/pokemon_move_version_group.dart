//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonMoveVersionGroup {
  /// Returns a new [PokemonMoveVersionGroup] instance.
  PokemonMoveVersionGroup({
    required this.levelLearnedAt,
    required this.moveLearnMethod,
    required this.versionGroup,
    this.order,
  });

  /// The minimum level to learn the move.
  int levelLearnedAt;

  /// The method by which the move is learned.
  MoveLearnMethodSummary moveLearnMethod;

  /// The version group in which the move is learned.
  VersionGroupSummary versionGroup;

  /// Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
  int? order;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonMoveVersionGroup &&
    other.levelLearnedAt == levelLearnedAt &&
    other.moveLearnMethod == moveLearnMethod &&
    other.versionGroup == versionGroup &&
    other.order == order;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (levelLearnedAt.hashCode) +
    (moveLearnMethod.hashCode) +
    (versionGroup.hashCode) +
    (order == null ? 0 : order!.hashCode);

  @override
  String toString() => 'PokemonMoveVersionGroup[levelLearnedAt=$levelLearnedAt, moveLearnMethod=$moveLearnMethod, versionGroup=$versionGroup, order=$order]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'level_learned_at'] = this.levelLearnedAt;
      json[r'move_learn_method'] = this.moveLearnMethod;
      json[r'version_group'] = this.versionGroup;
    if (this.order != null) {
      json[r'order'] = this.order;
    } else {
      json[r'order'] = null;
    }
    return json;
  }

  /// Returns a new [PokemonMoveVersionGroup] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonMoveVersionGroup? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'level_learned_at'), 'Required key "PokemonMoveVersionGroup[level_learned_at]" is missing from JSON.');
        assert(json[r'level_learned_at'] != null, 'Required key "PokemonMoveVersionGroup[level_learned_at]" has a null value in JSON.');
        assert(json.containsKey(r'move_learn_method'), 'Required key "PokemonMoveVersionGroup[move_learn_method]" is missing from JSON.');
        assert(json[r'move_learn_method'] != null, 'Required key "PokemonMoveVersionGroup[move_learn_method]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "PokemonMoveVersionGroup[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "PokemonMoveVersionGroup[version_group]" has a null value in JSON.');
        return true;
      }());

      return PokemonMoveVersionGroup(
        levelLearnedAt: mapValueOfType<int>(json, r'level_learned_at')!,
        moveLearnMethod: MoveLearnMethodSummary.fromJson(json[r'move_learn_method'])!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
        order: mapValueOfType<int>(json, r'order'),
      );
    }
    return null;
  }

  static List<PokemonMoveVersionGroup> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonMoveVersionGroup>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonMoveVersionGroup.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonMoveVersionGroup> mapFromJson(dynamic json) {
    final map = <String, PokemonMoveVersionGroup>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonMoveVersionGroup.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonMoveVersionGroup-objects as value to a dart map
  static Map<String, List<PokemonMoveVersionGroup>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonMoveVersionGroup>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonMoveVersionGroup.listFromJson(entry.value, growable: growable,);
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

