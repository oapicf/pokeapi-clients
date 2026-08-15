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
    required this.heldItems,
    required this.locationAreaEncounters,
    this.moves = const [],
    required this.species,
    required this.sprites,
    required this.cries,
    this.stats = const [],
    this.types = const [],
    this.pastTypes = const [],
  });

  int id;

  String name;

  int? baseExperience;

  int? height;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isDefault;

  int? order;

  int? weight;

  List<PokemonDetailAbilitiesInner> abilities;

  List<PokemonDetailPastAbilitiesInner> pastAbilities;

  List<PokemonFormSummary> forms;

  List<PokemonGameIndex> gameIndices;

  PokemonDetailHeldItems heldItems;

  String locationAreaEncounters;

  List<PokemonDetailMovesInner> moves;

  PokemonSpeciesSummary species;

  PokemonDetailSprites sprites;

  PokemonDetailCries cries;

  List<PokemonStat> stats;

  List<PokemonDetailTypesInner> types;

  List<PokemonDetailPastTypesInner> pastTypes;

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
    other.heldItems == heldItems &&
    other.locationAreaEncounters == locationAreaEncounters &&
    _deepEquality.equals(other.moves, moves) &&
    other.species == species &&
    other.sprites == sprites &&
    other.cries == cries &&
    _deepEquality.equals(other.stats, stats) &&
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
    (types.hashCode) +
    (pastTypes.hashCode);

  @override
  String toString() => 'PokemonDetail[id=$id, name=$name, baseExperience=$baseExperience, height=$height, isDefault=$isDefault, order=$order, weight=$weight, abilities=$abilities, pastAbilities=$pastAbilities, forms=$forms, gameIndices=$gameIndices, heldItems=$heldItems, locationAreaEncounters=$locationAreaEncounters, moves=$moves, species=$species, sprites=$sprites, cries=$cries, stats=$stats, types=$types, pastTypes=$pastTypes]';

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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PokemonDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PokemonDetail[$key]" has a null value in JSON.');
        });
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
        abilities: PokemonDetailAbilitiesInner.listFromJson(json[r'abilities']),
        pastAbilities: PokemonDetailPastAbilitiesInner.listFromJson(json[r'past_abilities']),
        forms: PokemonFormSummary.listFromJson(json[r'forms']),
        gameIndices: PokemonGameIndex.listFromJson(json[r'game_indices']),
        heldItems: PokemonDetailHeldItems.fromJson(json[r'held_items'])!,
        locationAreaEncounters: mapValueOfType<String>(json, r'location_area_encounters')!,
        moves: PokemonDetailMovesInner.listFromJson(json[r'moves']),
        species: PokemonSpeciesSummary.fromJson(json[r'species'])!,
        sprites: PokemonDetailSprites.fromJson(json[r'sprites'])!,
        cries: PokemonDetailCries.fromJson(json[r'cries'])!,
        stats: PokemonStat.listFromJson(json[r'stats']),
        types: PokemonDetailTypesInner.listFromJson(json[r'types']),
        pastTypes: PokemonDetailPastTypesInner.listFromJson(json[r'past_types']),
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
    'types',
    'past_types',
  };
}

