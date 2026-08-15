//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveDamageClassDetail {
  /// Returns a new [MoveDamageClassDetail] instance.
  MoveDamageClassDetail({
    required this.id,
    required this.name,
    this.descriptions = const [],
    this.moves = const [],
    this.names = const [],
  });

  int id;

  String name;

  List<MoveDamageClassDescription> descriptions;

  List<MoveSummary> moves;

  List<MoveDamageClassName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveDamageClassDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.descriptions, descriptions) &&
    _deepEquality.equals(other.moves, moves) &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (descriptions.hashCode) +
    (moves.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'MoveDamageClassDetail[id=$id, name=$name, descriptions=$descriptions, moves=$moves, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'descriptions'] = this.descriptions;
      json[r'moves'] = this.moves;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [MoveDamageClassDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveDamageClassDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MoveDamageClassDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MoveDamageClassDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MoveDamageClassDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        descriptions: MoveDamageClassDescription.listFromJson(json[r'descriptions']),
        moves: MoveSummary.listFromJson(json[r'moves']),
        names: MoveDamageClassName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<MoveDamageClassDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveDamageClassDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveDamageClassDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveDamageClassDetail> mapFromJson(dynamic json) {
    final map = <String, MoveDamageClassDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveDamageClassDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveDamageClassDetail-objects as value to a dart map
  static Map<String, List<MoveDamageClassDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveDamageClassDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveDamageClassDetail.listFromJson(entry.value, growable: growable,);
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
    'names',
  };
}

