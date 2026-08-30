//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveLearnMethodDetail {
  /// Returns a new [MoveLearnMethodDetail] instance.
  MoveLearnMethodDetail({
    required this.id,
    required this.name,
    this.names = const [],
    this.descriptions = const [],
    this.versionGroups = const [],
  });

  int id;

  String name;

  List<MoveLearnMethodName> names;

  List<MoveLearnMethodDescription> descriptions;

  List<AbilityDetailPokemonInnerPokemon> versionGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveLearnMethodDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.descriptions, descriptions) &&
    _deepEquality.equals(other.versionGroups, versionGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (names.hashCode) +
    (descriptions.hashCode) +
    (versionGroups.hashCode);

  @override
  String toString() => 'MoveLearnMethodDetail[id=$id, name=$name, names=$names, descriptions=$descriptions, versionGroups=$versionGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'names'] = this.names;
      json[r'descriptions'] = this.descriptions;
      json[r'version_groups'] = this.versionGroups;
    return json;
  }

  /// Returns a new [MoveLearnMethodDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveLearnMethodDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "MoveLearnMethodDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "MoveLearnMethodDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "MoveLearnMethodDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "MoveLearnMethodDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "MoveLearnMethodDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "MoveLearnMethodDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'descriptions'), 'Required key "MoveLearnMethodDetail[descriptions]" is missing from JSON.');
        assert(json[r'descriptions'] != null, 'Required key "MoveLearnMethodDetail[descriptions]" has a null value in JSON.');
        assert(json.containsKey(r'version_groups'), 'Required key "MoveLearnMethodDetail[version_groups]" is missing from JSON.');
        assert(json[r'version_groups'] != null, 'Required key "MoveLearnMethodDetail[version_groups]" has a null value in JSON.');
        return true;
      }());

      return MoveLearnMethodDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        names: MoveLearnMethodName.listFromJson(json[r'names']),
        descriptions: MoveLearnMethodDescription.listFromJson(json[r'descriptions']),
        versionGroups: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'version_groups']),
      );
    }
    return null;
  }

  static List<MoveLearnMethodDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveLearnMethodDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveLearnMethodDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveLearnMethodDetail> mapFromJson(dynamic json) {
    final map = <String, MoveLearnMethodDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveLearnMethodDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveLearnMethodDetail-objects as value to a dart map
  static Map<String, List<MoveLearnMethodDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveLearnMethodDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveLearnMethodDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'names',
    'descriptions',
    'version_groups',
  };
}

