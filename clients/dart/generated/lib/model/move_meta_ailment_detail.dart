//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveMetaAilmentDetail {
  /// Returns a new [MoveMetaAilmentDetail] instance.
  MoveMetaAilmentDetail({
    required this.id,
    required this.name,
    this.moves = const [],
    this.names = const [],
  });

  int id;

  String name;

  List<AbilityDetailPokemonInnerPokemon> moves;

  List<MoveMetaAilmentName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveMetaAilmentDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.moves, moves) &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (moves.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'MoveMetaAilmentDetail[id=$id, name=$name, moves=$moves, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'moves'] = this.moves;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [MoveMetaAilmentDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveMetaAilmentDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveMetaAilmentDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveMetaAilmentDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveMetaAilmentDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        moves: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'moves']),
        names: MoveMetaAilmentName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<MoveMetaAilmentDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveMetaAilmentDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveMetaAilmentDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveMetaAilmentDetail> mapFromJson(dynamic json) {
    final map = <String, MoveMetaAilmentDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveMetaAilmentDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveMetaAilmentDetail-objects as value to a dart map
  static Map<String, List<MoveMetaAilmentDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveMetaAilmentDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveMetaAilmentDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'moves',
    'names',
  };
}

