//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokeathlonStatDetail {
  /// Returns a new [PokeathlonStatDetail] instance.
  PokeathlonStatDetail({
    required this.id,
    required this.name,
    required this.affectingNatures,
    this.names = const [],
  });

  int id;

  String name;

  PokeathlonStatDetailAffectingNatures affectingNatures;

  List<PokeathlonStatName> names;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokeathlonStatDetail &&
    other.id == id &&
    other.name == name &&
    other.affectingNatures == affectingNatures &&
    _deepEquality.equals(other.names, names);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (affectingNatures.hashCode) +
    (names.hashCode);

  @override
  String toString() => 'PokeathlonStatDetail[id=$id, name=$name, affectingNatures=$affectingNatures, names=$names]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'affecting_natures'] = this.affectingNatures;
      json[r'names'] = this.names;
    return json;
  }

  /// Returns a new [PokeathlonStatDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokeathlonStatDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokeathlonStatDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokeathlonStatDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PokeathlonStatDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        affectingNatures: PokeathlonStatDetailAffectingNatures.fromJson(json[r'affecting_natures'])!,
        names: PokeathlonStatName.listFromJson(json[r'names']),
      );
    }
    return null;
  }

  static List<PokeathlonStatDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokeathlonStatDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokeathlonStatDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokeathlonStatDetail> mapFromJson(dynamic json) {
    final map = <String, PokeathlonStatDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokeathlonStatDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokeathlonStatDetail-objects as value to a dart map
  static Map<String, List<PokeathlonStatDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokeathlonStatDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokeathlonStatDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'affecting_natures',
    'names',
  };
}

