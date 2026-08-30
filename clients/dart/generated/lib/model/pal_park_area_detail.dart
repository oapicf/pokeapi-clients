//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PalParkAreaDetail {
  /// Returns a new [PalParkAreaDetail] instance.
  PalParkAreaDetail({
    required this.id,
    required this.name,
    this.names = const [],
    this.pokemonEncounters = const [],
  });

  int id;

  String name;

  List<PalParkAreaName> names;

  List<PalParkAreaDetailPokemonEncountersInner> pokemonEncounters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PalParkAreaDetail &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pokemonEncounters, pokemonEncounters);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (names.hashCode) +
    (pokemonEncounters.hashCode);

  @override
  String toString() => 'PalParkAreaDetail[id=$id, name=$name, names=$names, pokemonEncounters=$pokemonEncounters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'names'] = this.names;
      json[r'pokemon_encounters'] = this.pokemonEncounters;
    return json;
  }

  /// Returns a new [PalParkAreaDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PalParkAreaDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "PalParkAreaDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "PalParkAreaDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "PalParkAreaDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PalParkAreaDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "PalParkAreaDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "PalParkAreaDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon_encounters'), 'Required key "PalParkAreaDetail[pokemon_encounters]" is missing from JSON.');
        assert(json[r'pokemon_encounters'] != null, 'Required key "PalParkAreaDetail[pokemon_encounters]" has a null value in JSON.');
        return true;
      }());

      return PalParkAreaDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        names: PalParkAreaName.listFromJson(json[r'names']),
        pokemonEncounters: PalParkAreaDetailPokemonEncountersInner.listFromJson(json[r'pokemon_encounters']),
      );
    }
    return null;
  }

  static List<PalParkAreaDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PalParkAreaDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PalParkAreaDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PalParkAreaDetail> mapFromJson(dynamic json) {
    final map = <String, PalParkAreaDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PalParkAreaDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PalParkAreaDetail-objects as value to a dart map
  static Map<String, List<PalParkAreaDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PalParkAreaDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PalParkAreaDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'names',
    'pokemon_encounters',
  };
}

