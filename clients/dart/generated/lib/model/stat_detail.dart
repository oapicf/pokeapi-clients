//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class StatDetail {
  /// Returns a new [StatDetail] instance.
  StatDetail({
    required this.id,
    required this.name,
    required this.gameIndex,
    this.isBattleOnly,
    required this.affectingMoves,
    required this.affectingNatures,
    this.characteristics = const [],
    required this.moveDamageClass,
    this.names = const [],
  });

  int id;

  String name;

  int gameIndex;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isBattleOnly;

  StatDetailAffectingMoves affectingMoves;

  StatDetailAffectingNatures affectingNatures;

  List<CharacteristicSummary> characteristics;

  MoveDamageClassSummary moveDamageClass;

  List<StatName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is StatDetail &&
    other.id == id &&
    other.name == name &&
    other.gameIndex == gameIndex &&
    other.isBattleOnly == isBattleOnly &&
    other.affectingMoves == affectingMoves &&
    other.affectingNatures == affectingNatures &&
    _deepEquality.equals(other.characteristics, characteristics) &&
    other.moveDamageClass == moveDamageClass &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (gameIndex.hashCode) +
    (isBattleOnly == null ? 0 : isBattleOnly!.hashCode) +
    (affectingMoves.hashCode) +
    (affectingNatures.hashCode) +
    (characteristics.hashCode) +
    (moveDamageClass.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'StatDetail[id=$id, name=$name, gameIndex=$gameIndex, isBattleOnly=$isBattleOnly, affectingMoves=$affectingMoves, affectingNatures=$affectingNatures, characteristics=$characteristics, moveDamageClass=$moveDamageClass, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'game_index'] = this.gameIndex;
    if (this.isBattleOnly != null) {
      json[r'is_battle_only'] = this.isBattleOnly;
    } else {
      json[r'is_battle_only'] = null;
    }
      json[r'affecting_moves'] = this.affectingMoves;
      json[r'affecting_natures'] = this.affectingNatures;
      json[r'characteristics'] = this.characteristics;
      json[r'move_damage_class'] = this.moveDamageClass;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [StatDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static StatDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "StatDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "StatDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "StatDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "StatDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'game_index'), 'Required key "StatDetail[game_index]" is missing from JSON.');
        assert(json[r'game_index'] != null, 'Required key "StatDetail[game_index]" has a null value in JSON.');
        assert(json.containsKey(r'affecting_moves'), 'Required key "StatDetail[affecting_moves]" is missing from JSON.');
        assert(json[r'affecting_moves'] != null, 'Required key "StatDetail[affecting_moves]" has a null value in JSON.');
        assert(json.containsKey(r'affecting_natures'), 'Required key "StatDetail[affecting_natures]" is missing from JSON.');
        assert(json[r'affecting_natures'] != null, 'Required key "StatDetail[affecting_natures]" has a null value in JSON.');
        assert(json.containsKey(r'characteristics'), 'Required key "StatDetail[characteristics]" is missing from JSON.');
        assert(json[r'characteristics'] != null, 'Required key "StatDetail[characteristics]" has a null value in JSON.');
        assert(json.containsKey(r'move_damage_class'), 'Required key "StatDetail[move_damage_class]" is missing from JSON.');
        assert(json[r'move_damage_class'] != null, 'Required key "StatDetail[move_damage_class]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "StatDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "StatDetail[names]" has a null value in JSON.');
        return true;
      }());

      return StatDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        gameIndex: mapValueOfType<int>(json, r'game_index')!,
        isBattleOnly: mapValueOfType<bool>(json, r'is_battle_only'),
        affectingMoves: StatDetailAffectingMoves.fromJson(json[r'affecting_moves'])!,
        affectingNatures: StatDetailAffectingNatures.fromJson(json[r'affecting_natures'])!,
        characteristics: CharacteristicSummary.listFromJson(json[r'characteristics']),
        moveDamageClass: MoveDamageClassSummary.fromJson(json[r'move_damage_class'])!,
        names: StatName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<StatDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StatDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StatDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, StatDetail> mapFromJson(dynamic json) {
    final map = <String, StatDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = StatDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of StatDetail-objects as value to a dart map
  static Map<String, List<StatDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<StatDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = StatDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'game_index',
    'affecting_moves',
    'affecting_natures',
    'characteristics',
    'move_damage_class',
    'names',
  };
}

