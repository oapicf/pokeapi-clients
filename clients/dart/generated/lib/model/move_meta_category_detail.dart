//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveMetaCategoryDetail {
  /// Returns a new [MoveMetaCategoryDetail] instance.
  MoveMetaCategoryDetail({
    required this.id,
    required this.name,
    this.descriptions = const [],
    this.moves = const [],
  });

  int id;

  String name;

  List<MoveMetaCategoryDescription> descriptions;

  List<AbilityDetailPokemonInnerPokemon> moves;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveMetaCategoryDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.descriptions, descriptions) &&
    _deepEquality.equals(other.moves, moves);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (descriptions.hashCode) +
    (moves.hashCode);

  @override
  String toString() => 'MoveMetaCategoryDetail[id=$id, name=$name, descriptions=$descriptions, moves=$moves]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'descriptions'] = this.descriptions;
      json[r'moves'] = this.moves;
    return json;
  }

  /// Returns a new [MoveMetaCategoryDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveMetaCategoryDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveMetaCategoryDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveMetaCategoryDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveMetaCategoryDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        descriptions: MoveMetaCategoryDescription.listFromJson(json[r'descriptions']),
        moves: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'moves']),
      );
    }
    return null;
  }

  static List<MoveMetaCategoryDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveMetaCategoryDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveMetaCategoryDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveMetaCategoryDetail> mapFromJson(dynamic json) {
    final map = <String, MoveMetaCategoryDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveMetaCategoryDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveMetaCategoryDetail-objects as value to a dart map
  static Map<String, List<MoveMetaCategoryDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveMetaCategoryDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveMetaCategoryDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'descriptions',
    'moves',
  };
}

