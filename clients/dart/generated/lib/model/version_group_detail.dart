//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VersionGroupDetail {
  /// Returns a new [VersionGroupDetail] instance.
  VersionGroupDetail({
    required this.id,
    required this.name,
    this.order,
    required this.generation,
    this.moveLearnMethods = const [],
    this.pokedexes = const [],
    this.regions = const [],
    this.versions = const [],
  });

  int id;

  String name;

  int? order;

  GenerationSummary generation;

  List<AbilityDetailPokemonInnerPokemon> moveLearnMethods;

  List<AbilityDetailPokemonInnerPokemon> pokedexes;

  List<AbilityDetailPokemonInnerPokemon> regions;

  List<VersionSummary> versions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VersionGroupDetail &&
    other.id == id &&
    other.name == name &&
    other.order == order &&
    other.generation == generation &&
    _deepEquality.equals(other.moveLearnMethods, moveLearnMethods) &&
    _deepEquality.equals(other.pokedexes, pokedexes) &&
    _deepEquality.equals(other.regions, regions) &&
    _deepEquality.equals(other.versions, versions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (order == null ? 0 : order!.hashCode) +
    (generation.hashCode) +
    (moveLearnMethods.hashCode) +
    (pokedexes.hashCode) +
    (regions.hashCode) +
    (versions.hashCode);

  @override
  String toString() => 'VersionGroupDetail[id=$id, name=$name, order=$order, generation=$generation, moveLearnMethods=$moveLearnMethods, pokedexes=$pokedexes, regions=$regions, versions=$versions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.order != null) {
      json[r'order'] = this.order;
    } else {
      json[r'order'] = null;
    }
      json[r'generation'] = this.generation;
      json[r'move_learn_methods'] = this.moveLearnMethods;
      json[r'pokedexes'] = this.pokedexes;
      json[r'regions'] = this.regions;
      json[r'versions'] = this.versions;
    return json;
  }

  /// Returns a new [VersionGroupDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VersionGroupDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "VersionGroupDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "VersionGroupDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "VersionGroupDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "VersionGroupDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'generation'), 'Required key "VersionGroupDetail[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "VersionGroupDetail[generation]" has a null value in JSON.');
        assert(json.containsKey(r'move_learn_methods'), 'Required key "VersionGroupDetail[move_learn_methods]" is missing from JSON.');
        assert(json[r'move_learn_methods'] != null, 'Required key "VersionGroupDetail[move_learn_methods]" has a null value in JSON.');
        assert(json.containsKey(r'pokedexes'), 'Required key "VersionGroupDetail[pokedexes]" is missing from JSON.');
        assert(json[r'pokedexes'] != null, 'Required key "VersionGroupDetail[pokedexes]" has a null value in JSON.');
        assert(json.containsKey(r'regions'), 'Required key "VersionGroupDetail[regions]" is missing from JSON.');
        assert(json[r'regions'] != null, 'Required key "VersionGroupDetail[regions]" has a null value in JSON.');
        assert(json.containsKey(r'versions'), 'Required key "VersionGroupDetail[versions]" is missing from JSON.');
        assert(json[r'versions'] != null, 'Required key "VersionGroupDetail[versions]" has a null value in JSON.');
        return true;
      }());

      return VersionGroupDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        order: mapValueOfType<int>(json, r'order'),
        generation: GenerationSummary.fromJson(json[r'generation'])!,
        moveLearnMethods: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'move_learn_methods']),
        pokedexes: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'pokedexes']),
        regions: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'regions']),
        versions: VersionSummary.listFromJson(json[r'versions']),
      );
    }
    return null;
  }

  static List<VersionGroupDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VersionGroupDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VersionGroupDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VersionGroupDetail> mapFromJson(dynamic json) {
    final map = <String, VersionGroupDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VersionGroupDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VersionGroupDetail-objects as value to a dart map
  static Map<String, List<VersionGroupDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VersionGroupDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VersionGroupDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'generation',
    'move_learn_methods',
    'pokedexes',
    'regions',
    'versions',
  };
}

