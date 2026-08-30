//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TypeDetail {
  /// Returns a new [TypeDetail] instance.
  TypeDetail({
    required this.id,
    required this.name,
    required this.damageRelations,
    this.pastDamageRelations = const [],
    this.gameIndices = const [],
    required this.generation,
    required this.moveDamageClass,
    this.names = const [],
    this.pokemon = const [],
    this.moves = const [],
    this.sprites = const {},
  });

  int id;

  String name;

  TypeDetailDamageRelations damageRelations;

  List<TypeDetailPastDamageRelationsInner> pastDamageRelations;

  List<TypeGameIndex> gameIndices;

  GenerationSummary generation;

  MoveDamageClassSummary moveDamageClass;

  List<AbilityName> names;

  List<TypeDetailPokemonInner> pokemon;

  List<MoveSummary> moves;

  Map<String, Map<String, TypeDetailSpritesValueValue>> sprites;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TypeDetail &&
    other.id == id &&
    other.name == name &&
    other.damageRelations == damageRelations &&
    _deepEquality.equals(other.pastDamageRelations, pastDamageRelations) &&
    _deepEquality.equals(other.gameIndices, gameIndices) &&
    other.generation == generation &&
    other.moveDamageClass == moveDamageClass &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pokemon, pokemon) &&
    _deepEquality.equals(other.moves, moves) &&
    _deepEquality.equals(other.sprites, sprites);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (damageRelations.hashCode) +
    (pastDamageRelations.hashCode) +
    (gameIndices.hashCode) +
    (generation.hashCode) +
    (moveDamageClass.hashCode) +
    (names.hashCode) +
    (pokemon.hashCode) +
    (moves.hashCode) +
    (sprites.hashCode);

  @override
  String toString() => 'TypeDetail[id=$id, name=$name, damageRelations=$damageRelations, pastDamageRelations=$pastDamageRelations, gameIndices=$gameIndices, generation=$generation, moveDamageClass=$moveDamageClass, names=$names, pokemon=$pokemon, moves=$moves, sprites=$sprites]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'damage_relations'] = this.damageRelations;
      json[r'past_damage_relations'] = this.pastDamageRelations;
      json[r'game_indices'] = this.gameIndices;
      json[r'generation'] = this.generation;
      json[r'move_damage_class'] = this.moveDamageClass;
      json[r'names'] = this.names;
      json[r'pokemon'] = this.pokemon;
      json[r'moves'] = this.moves;
      json[r'sprites'] = this.sprites;
    return json;
  }

  /// Returns a new [TypeDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TypeDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "TypeDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "TypeDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "TypeDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "TypeDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'damage_relations'), 'Required key "TypeDetail[damage_relations]" is missing from JSON.');
        assert(json[r'damage_relations'] != null, 'Required key "TypeDetail[damage_relations]" has a null value in JSON.');
        assert(json.containsKey(r'past_damage_relations'), 'Required key "TypeDetail[past_damage_relations]" is missing from JSON.');
        assert(json[r'past_damage_relations'] != null, 'Required key "TypeDetail[past_damage_relations]" has a null value in JSON.');
        assert(json.containsKey(r'game_indices'), 'Required key "TypeDetail[game_indices]" is missing from JSON.');
        assert(json[r'game_indices'] != null, 'Required key "TypeDetail[game_indices]" has a null value in JSON.');
        assert(json.containsKey(r'generation'), 'Required key "TypeDetail[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "TypeDetail[generation]" has a null value in JSON.');
        assert(json.containsKey(r'move_damage_class'), 'Required key "TypeDetail[move_damage_class]" is missing from JSON.');
        assert(json[r'move_damage_class'] != null, 'Required key "TypeDetail[move_damage_class]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "TypeDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "TypeDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'pokemon'), 'Required key "TypeDetail[pokemon]" is missing from JSON.');
        assert(json[r'pokemon'] != null, 'Required key "TypeDetail[pokemon]" has a null value in JSON.');
        assert(json.containsKey(r'moves'), 'Required key "TypeDetail[moves]" is missing from JSON.');
        assert(json[r'moves'] != null, 'Required key "TypeDetail[moves]" has a null value in JSON.');
        assert(json.containsKey(r'sprites'), 'Required key "TypeDetail[sprites]" is missing from JSON.');
        assert(json[r'sprites'] != null, 'Required key "TypeDetail[sprites]" has a null value in JSON.');
        return true;
      }());

      return TypeDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        damageRelations: TypeDetailDamageRelations.fromJson(json[r'damage_relations'])!,
        pastDamageRelations: TypeDetailPastDamageRelationsInner.listFromJson(json[r'past_damage_relations']),
        gameIndices: TypeGameIndex.listFromJson(json[r'game_indices']),
        generation: GenerationSummary.fromJson(json[r'generation'])!,
        moveDamageClass: MoveDamageClassSummary.fromJson(json[r'move_damage_class'])!,
        names: AbilityName.listFromJson(json[r'names']),
        pokemon: TypeDetailPokemonInner.listFromJson(json[r'pokemon']),
        moves: MoveSummary.listFromJson(json[r'moves']),
        sprites: TypeDetailSpritesValueValue.mapFromJson(json[r'sprites']),
      );
    }
    return null;
  }

  static List<TypeDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TypeDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TypeDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TypeDetail> mapFromJson(dynamic json) {
    final map = <String, TypeDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TypeDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TypeDetail-objects as value to a dart map
  static Map<String, List<TypeDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TypeDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TypeDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'damage_relations',
    'past_damage_relations',
    'game_indices',
    'generation',
    'move_damage_class',
    'names',
    'pokemon',
    'moves',
    'sprites',
  };
}

