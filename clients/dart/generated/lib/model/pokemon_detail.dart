//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonDetail {
  /// Returns a new [PokemonDetail] instance.
  PokemonDetail({
    required this.id,
    required this.name,
    this.baseExperience,
    this.height,
    this.isDefault,
    this.order,
    this.weight,
    this.abilities = const [],
    this.pastAbilities = const [],
    this.forms = const [],
    this.gameIndices = const [],
    this.heldItems = const [],
    required this.locationAreaEncounters,
    this.moves = const [],
    required this.species,
    required this.sprites,
    required this.cries,
    this.stats = const [],
    this.pastStats = const [],
    this.types = const [],
    this.pastTypes = const [],
  });

  /// The identifier for this resource.
  int id;

  /// The name for this resource.
  String name;

  /// The base experience gained for defeating this Pokémon.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? baseExperience;

  /// The height of this Pokémon in decimetres.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? height;

  /// Set for exactly one Pokémon used as the default for each species.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isDefault;

  /// Order for sorting. Almost national order, except families are grouped together.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? order;

  /// The weight of this Pokémon in hectograms.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? weight;

  /// A list of abilities this Pokémon could potentially have.
  List<PokemonAbility> abilities;

  /// A list of details showing abilities this pokémon had in previous generations
  List<PokemonPastAbility> pastAbilities;

  /// A list of forms this Pokémon can take on.
  List<PokemonFormSummary> forms;

  /// A list of game indices relevent to Pokémon item by generation.
  List<PokemonGameIndex> gameIndices;

  /// A list of items this Pokémon may be holding when encountered.
  List<PokemonHeldItemSummary> heldItems;

  /// A link to a list of location areas, as well as encounter details pertaining to specific versions.
  String locationAreaEncounters;

  /// A list of moves along with learn methods and level details pertaining to specific version groups.
  List<PokemonMove> moves;

  /// The species this Pokémon belongs to.
  PokemonSpeciesSummary species;

  /// A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
  PokemonSprites sprites;

  /// A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
  PokemonCries cries;

  /// A list of base stat values for this Pokémon.
  List<PokemonStat> stats;

  /// A list of details showing stats this pokémon had in previous generations
  List<PokemonPastStat> pastStats;

  /// A list of details showing types this Pokémon has.
  List<PokemonType> types;

  /// A list of details showing types this pokémon had in previous generations
  List<PokemonPastType> pastTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonDetail &&
    other.id == id &&
    other.name == name &&
    other.baseExperience == baseExperience &&
    other.height == height &&
    other.isDefault == isDefault &&
    other.order == order &&
    other.weight == weight &&
    _deepEquality.equals(other.abilities, abilities) &&
    _deepEquality.equals(other.pastAbilities, pastAbilities) &&
    _deepEquality.equals(other.forms, forms) &&
    _deepEquality.equals(other.gameIndices, gameIndices) &&
    _deepEquality.equals(other.heldItems, heldItems) &&
    other.locationAreaEncounters == locationAreaEncounters &&
    _deepEquality.equals(other.moves, moves) &&
    other.species == species &&
    other.sprites == sprites &&
    other.cries == cries &&
    _deepEquality.equals(other.stats, stats) &&
    _deepEquality.equals(other.pastStats, pastStats) &&
    _deepEquality.equals(other.types, types) &&
    _deepEquality.equals(other.pastTypes, pastTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (baseExperience == null ? 0 : baseExperience!.hashCode) +
    (height == null ? 0 : height!.hashCode) +
    (isDefault == null ? 0 : isDefault!.hashCode) +
    (order == null ? 0 : order!.hashCode) +
    (weight == null ? 0 : weight!.hashCode) +
    (abilities.hashCode) +
    (pastAbilities.hashCode) +
    (forms.hashCode) +
    (gameIndices.hashCode) +
    (heldItems.hashCode) +
    (locationAreaEncounters.hashCode) +
    (moves.hashCode) +
    (species.hashCode) +
    (sprites.hashCode) +
    (cries.hashCode) +
    (stats.hashCode) +
    (pastStats.hashCode) +
    (types.hashCode) +
    (pastTypes.hashCode);

  @override
  String toString() => 'PokemonDetail[id=$id, name=$name, baseExperience=$baseExperience, height=$height, isDefault=$isDefault, order=$order, weight=$weight, abilities=$abilities, pastAbilities=$pastAbilities, forms=$forms, gameIndices=$gameIndices, heldItems=$heldItems, locationAreaEncounters=$locationAreaEncounters, moves=$moves, species=$species, sprites=$sprites, cries=$cries, stats=$stats, pastStats=$pastStats, types=$types, pastTypes=$pastTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.baseExperience != null) {
      json[r'base_experience'] = this.baseExperience;
    } else {
      json[r'base_experience'] = null;
    }
    if (this.height != null) {
      json[r'height'] = this.height;
    } else {
      json[r'height'] = null;
    }
    if (this.isDefault != null) {
      json[r'is_default'] = this.isDefault;
    } else {
      json[r'is_default'] = null;
    }
    if (this.order != null) {
      json[r'order'] = this.order;
    } else {
      json[r'order'] = null;
    }
    if (this.weight != null) {
      json[r'weight'] = this.weight;
    } else {
      json[r'weight'] = null;
    }
      json[r'abilities'] = this.abilities;
      json[r'past_abilities'] = this.pastAbilities;
      json[r'forms'] = this.forms;
      json[r'game_indices'] = this.gameIndices;
      json[r'held_items'] = this.heldItems;
      json[r'location_area_encounters'] = this.locationAreaEncounters;
      json[r'moves'] = this.moves;
      json[r'species'] = this.species;
      json[r'sprites'] = this.sprites;
      json[r'cries'] = this.cries;
      json[r'stats'] = this.stats;
      json[r'past_stats'] = this.pastStats;
      json[r'types'] = this.types;
      json[r'past_types'] = this.pastTypes;
    return json;
  }

  /// Returns a new [PokemonDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "PokemonDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "PokemonDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "PokemonDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PokemonDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'abilities'), 'Required key "PokemonDetail[abilities]" is missing from JSON.');
        assert(json[r'abilities'] != null, 'Required key "PokemonDetail[abilities]" has a null value in JSON.');
        assert(json.containsKey(r'past_abilities'), 'Required key "PokemonDetail[past_abilities]" is missing from JSON.');
        assert(json[r'past_abilities'] != null, 'Required key "PokemonDetail[past_abilities]" has a null value in JSON.');
        assert(json.containsKey(r'forms'), 'Required key "PokemonDetail[forms]" is missing from JSON.');
        assert(json[r'forms'] != null, 'Required key "PokemonDetail[forms]" has a null value in JSON.');
        assert(json.containsKey(r'game_indices'), 'Required key "PokemonDetail[game_indices]" is missing from JSON.');
        assert(json[r'game_indices'] != null, 'Required key "PokemonDetail[game_indices]" has a null value in JSON.');
        assert(json.containsKey(r'held_items'), 'Required key "PokemonDetail[held_items]" is missing from JSON.');
        assert(json[r'held_items'] != null, 'Required key "PokemonDetail[held_items]" has a null value in JSON.');
        assert(json.containsKey(r'location_area_encounters'), 'Required key "PokemonDetail[location_area_encounters]" is missing from JSON.');
        assert(json[r'location_area_encounters'] != null, 'Required key "PokemonDetail[location_area_encounters]" has a null value in JSON.');
        assert(json.containsKey(r'moves'), 'Required key "PokemonDetail[moves]" is missing from JSON.');
        assert(json[r'moves'] != null, 'Required key "PokemonDetail[moves]" has a null value in JSON.');
        assert(json.containsKey(r'species'), 'Required key "PokemonDetail[species]" is missing from JSON.');
        assert(json[r'species'] != null, 'Required key "PokemonDetail[species]" has a null value in JSON.');
        assert(json.containsKey(r'sprites'), 'Required key "PokemonDetail[sprites]" is missing from JSON.');
        assert(json[r'sprites'] != null, 'Required key "PokemonDetail[sprites]" has a null value in JSON.');
        assert(json.containsKey(r'cries'), 'Required key "PokemonDetail[cries]" is missing from JSON.');
        assert(json[r'cries'] != null, 'Required key "PokemonDetail[cries]" has a null value in JSON.');
        assert(json.containsKey(r'stats'), 'Required key "PokemonDetail[stats]" is missing from JSON.');
        assert(json[r'stats'] != null, 'Required key "PokemonDetail[stats]" has a null value in JSON.');
        assert(json.containsKey(r'past_stats'), 'Required key "PokemonDetail[past_stats]" is missing from JSON.');
        assert(json[r'past_stats'] != null, 'Required key "PokemonDetail[past_stats]" has a null value in JSON.');
        assert(json.containsKey(r'types'), 'Required key "PokemonDetail[types]" is missing from JSON.');
        assert(json[r'types'] != null, 'Required key "PokemonDetail[types]" has a null value in JSON.');
        assert(json.containsKey(r'past_types'), 'Required key "PokemonDetail[past_types]" is missing from JSON.');
        assert(json[r'past_types'] != null, 'Required key "PokemonDetail[past_types]" has a null value in JSON.');
        return true;
      }());

      return PokemonDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        baseExperience: mapValueOfType<int>(json, r'base_experience'),
        height: mapValueOfType<int>(json, r'height'),
        isDefault: mapValueOfType<bool>(json, r'is_default'),
        order: mapValueOfType<int>(json, r'order'),
        weight: mapValueOfType<int>(json, r'weight'),
        abilities: PokemonAbility.listFromJson(json[r'abilities']),
        pastAbilities: PokemonPastAbility.listFromJson(json[r'past_abilities']),
        forms: PokemonFormSummary.listFromJson(json[r'forms']),
        gameIndices: PokemonGameIndex.listFromJson(json[r'game_indices']),
        heldItems: PokemonHeldItemSummary.listFromJson(json[r'held_items']),
        locationAreaEncounters: mapValueOfType<String>(json, r'location_area_encounters')!,
        moves: PokemonMove.listFromJson(json[r'moves']),
        species: PokemonSpeciesSummary.fromJson(json[r'species'])!,
        sprites: PokemonSprites.fromJson(json[r'sprites'])!,
        cries: PokemonCries.fromJson(json[r'cries'])!,
        stats: PokemonStat.listFromJson(json[r'stats']),
        pastStats: PokemonPastStat.listFromJson(json[r'past_stats']),
        types: PokemonType.listFromJson(json[r'types']),
        pastTypes: PokemonPastType.listFromJson(json[r'past_types']),
      );
    }
    return null;
  }

  static List<PokemonDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonDetail> mapFromJson(dynamic json) {
    final map = <String, PokemonDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonDetail-objects as value to a dart map
  static Map<String, List<PokemonDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'abilities',
    'past_abilities',
    'forms',
    'game_indices',
    'held_items',
    'location_area_encounters',
    'moves',
    'species',
    'sprites',
    'cries',
    'stats',
    'past_stats',
    'types',
    'past_types',
  };
}

