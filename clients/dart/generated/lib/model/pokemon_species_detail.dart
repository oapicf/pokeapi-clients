//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokemonSpeciesDetail {
  /// Returns a new [PokemonSpeciesDetail] instance.
  PokemonSpeciesDetail({
    required this.id,
    required this.name,
    this.order,
    this.genderRate,
    this.captureRate,
    this.baseHappiness,
    this.isBaby,
    this.isLegendary,
    this.isMythical,
    this.hatchCounter,
    this.hasGenderDifferences,
    this.formsSwitchable,
    required this.growthRate,
    this.pokedexNumbers = const [],
    this.eggGroups = const [],
    required this.color,
    required this.shape,
    required this.evolvesFromSpecies,
    required this.evolutionChain,
    required this.habitat,
    required this.generation,
    this.names = const [],
    this.palParkEncounters = const [],
    this.formDescriptions = const [],
    this.flavorTextEntries = const [],
    this.genera = const [],
    this.varieties = const [],
  });

  int id;

  String name;

  int? order;

  int? genderRate;

  int? captureRate;

  int? baseHappiness;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isBaby;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isLegendary;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isMythical;

  int? hatchCounter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasGenderDifferences;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? formsSwitchable;

  GrowthRateSummary growthRate;

  List<PokemonDexEntry> pokedexNumbers;

  List<AbilityDetailPokemonInnerPokemon> eggGroups;

  PokemonColorSummary color;

  PokemonShapeSummary shape;

  PokemonSpeciesSummary evolvesFromSpecies;

  EvolutionChainSummary evolutionChain;

  PokemonHabitatSummary habitat;

  GenerationSummary generation;

  List<PokemonFormDetailFormNamesInner> names;

  List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters;

  List<PokemonSpeciesDescription> formDescriptions;

  List<PokemonSpeciesFlavorText> flavorTextEntries;

  List<PokemonSpeciesDetailGeneraInner> genera;

  List<PokemonSpeciesDetailVarietiesInner> varieties;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokemonSpeciesDetail &&
    other.id == id &&
    other.name == name &&
    other.order == order &&
    other.genderRate == genderRate &&
    other.captureRate == captureRate &&
    other.baseHappiness == baseHappiness &&
    other.isBaby == isBaby &&
    other.isLegendary == isLegendary &&
    other.isMythical == isMythical &&
    other.hatchCounter == hatchCounter &&
    other.hasGenderDifferences == hasGenderDifferences &&
    other.formsSwitchable == formsSwitchable &&
    other.growthRate == growthRate &&
    _deepEquality.equals(other.pokedexNumbers, pokedexNumbers) &&
    _deepEquality.equals(other.eggGroups, eggGroups) &&
    other.color == color &&
    other.shape == shape &&
    other.evolvesFromSpecies == evolvesFromSpecies &&
    other.evolutionChain == evolutionChain &&
    other.habitat == habitat &&
    other.generation == generation &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.palParkEncounters, palParkEncounters) &&
    _deepEquality.equals(other.formDescriptions, formDescriptions) &&
    _deepEquality.equals(other.flavorTextEntries, flavorTextEntries) &&
    _deepEquality.equals(other.genera, genera) &&
    _deepEquality.equals(other.varieties, varieties);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (order == null ? 0 : order!.hashCode) +
    (genderRate == null ? 0 : genderRate!.hashCode) +
    (captureRate == null ? 0 : captureRate!.hashCode) +
    (baseHappiness == null ? 0 : baseHappiness!.hashCode) +
    (isBaby == null ? 0 : isBaby!.hashCode) +
    (isLegendary == null ? 0 : isLegendary!.hashCode) +
    (isMythical == null ? 0 : isMythical!.hashCode) +
    (hatchCounter == null ? 0 : hatchCounter!.hashCode) +
    (hasGenderDifferences == null ? 0 : hasGenderDifferences!.hashCode) +
    (formsSwitchable == null ? 0 : formsSwitchable!.hashCode) +
    (growthRate.hashCode) +
    (pokedexNumbers.hashCode) +
    (eggGroups.hashCode) +
    (color.hashCode) +
    (shape.hashCode) +
    (evolvesFromSpecies.hashCode) +
    (evolutionChain.hashCode) +
    (habitat.hashCode) +
    (generation.hashCode) +
    (names.hashCode) +
    (palParkEncounters.hashCode) +
    (formDescriptions.hashCode) +
    (flavorTextEntries.hashCode) +
    (genera.hashCode) +
    (varieties.hashCode);

  @override
  String toString() => 'PokemonSpeciesDetail[id=$id, name=$name, order=$order, genderRate=$genderRate, captureRate=$captureRate, baseHappiness=$baseHappiness, isBaby=$isBaby, isLegendary=$isLegendary, isMythical=$isMythical, hatchCounter=$hatchCounter, hasGenderDifferences=$hasGenderDifferences, formsSwitchable=$formsSwitchable, growthRate=$growthRate, pokedexNumbers=$pokedexNumbers, eggGroups=$eggGroups, color=$color, shape=$shape, evolvesFromSpecies=$evolvesFromSpecies, evolutionChain=$evolutionChain, habitat=$habitat, generation=$generation, names=$names, palParkEncounters=$palParkEncounters, formDescriptions=$formDescriptions, flavorTextEntries=$flavorTextEntries, genera=$genera, varieties=$varieties]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.order != null) {
      json[r'order'] = this.order;
    } else {
      json[r'order'] = null;
    }
    if (this.genderRate != null) {
      json[r'gender_rate'] = this.genderRate;
    } else {
      json[r'gender_rate'] = null;
    }
    if (this.captureRate != null) {
      json[r'capture_rate'] = this.captureRate;
    } else {
      json[r'capture_rate'] = null;
    }
    if (this.baseHappiness != null) {
      json[r'base_happiness'] = this.baseHappiness;
    } else {
      json[r'base_happiness'] = null;
    }
    if (this.isBaby != null) {
      json[r'is_baby'] = this.isBaby;
    } else {
      json[r'is_baby'] = null;
    }
    if (this.isLegendary != null) {
      json[r'is_legendary'] = this.isLegendary;
    } else {
      json[r'is_legendary'] = null;
    }
    if (this.isMythical != null) {
      json[r'is_mythical'] = this.isMythical;
    } else {
      json[r'is_mythical'] = null;
    }
    if (this.hatchCounter != null) {
      json[r'hatch_counter'] = this.hatchCounter;
    } else {
      json[r'hatch_counter'] = null;
    }
    if (this.hasGenderDifferences != null) {
      json[r'has_gender_differences'] = this.hasGenderDifferences;
    } else {
      json[r'has_gender_differences'] = null;
    }
    if (this.formsSwitchable != null) {
      json[r'forms_switchable'] = this.formsSwitchable;
    } else {
      json[r'forms_switchable'] = null;
    }
      json[r'growth_rate'] = this.growthRate;
      json[r'pokedex_numbers'] = this.pokedexNumbers;
      json[r'egg_groups'] = this.eggGroups;
      json[r'color'] = this.color;
      json[r'shape'] = this.shape;
      json[r'evolves_from_species'] = this.evolvesFromSpecies;
      json[r'evolution_chain'] = this.evolutionChain;
      json[r'habitat'] = this.habitat;
      json[r'generation'] = this.generation;
      json[r'names'] = this.names;
      json[r'pal_park_encounters'] = this.palParkEncounters;
      json[r'form_descriptions'] = this.formDescriptions;
      json[r'flavor_text_entries'] = this.flavorTextEntries;
      json[r'genera'] = this.genera;
      json[r'varieties'] = this.varieties;
    return json;
  }

  /// Returns a new [PokemonSpeciesDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokemonSpeciesDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "PokemonSpeciesDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "PokemonSpeciesDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "PokemonSpeciesDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "PokemonSpeciesDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'growth_rate'), 'Required key "PokemonSpeciesDetail[growth_rate]" is missing from JSON.');
        assert(json[r'growth_rate'] != null, 'Required key "PokemonSpeciesDetail[growth_rate]" has a null value in JSON.');
        assert(json.containsKey(r'pokedex_numbers'), 'Required key "PokemonSpeciesDetail[pokedex_numbers]" is missing from JSON.');
        assert(json[r'pokedex_numbers'] != null, 'Required key "PokemonSpeciesDetail[pokedex_numbers]" has a null value in JSON.');
        assert(json.containsKey(r'egg_groups'), 'Required key "PokemonSpeciesDetail[egg_groups]" is missing from JSON.');
        assert(json[r'egg_groups'] != null, 'Required key "PokemonSpeciesDetail[egg_groups]" has a null value in JSON.');
        assert(json.containsKey(r'color'), 'Required key "PokemonSpeciesDetail[color]" is missing from JSON.');
        assert(json[r'color'] != null, 'Required key "PokemonSpeciesDetail[color]" has a null value in JSON.');
        assert(json.containsKey(r'shape'), 'Required key "PokemonSpeciesDetail[shape]" is missing from JSON.');
        assert(json[r'shape'] != null, 'Required key "PokemonSpeciesDetail[shape]" has a null value in JSON.');
        assert(json.containsKey(r'evolves_from_species'), 'Required key "PokemonSpeciesDetail[evolves_from_species]" is missing from JSON.');
        assert(json[r'evolves_from_species'] != null, 'Required key "PokemonSpeciesDetail[evolves_from_species]" has a null value in JSON.');
        assert(json.containsKey(r'evolution_chain'), 'Required key "PokemonSpeciesDetail[evolution_chain]" is missing from JSON.');
        assert(json[r'evolution_chain'] != null, 'Required key "PokemonSpeciesDetail[evolution_chain]" has a null value in JSON.');
        assert(json.containsKey(r'habitat'), 'Required key "PokemonSpeciesDetail[habitat]" is missing from JSON.');
        assert(json[r'habitat'] != null, 'Required key "PokemonSpeciesDetail[habitat]" has a null value in JSON.');
        assert(json.containsKey(r'generation'), 'Required key "PokemonSpeciesDetail[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "PokemonSpeciesDetail[generation]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "PokemonSpeciesDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "PokemonSpeciesDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'pal_park_encounters'), 'Required key "PokemonSpeciesDetail[pal_park_encounters]" is missing from JSON.');
        assert(json[r'pal_park_encounters'] != null, 'Required key "PokemonSpeciesDetail[pal_park_encounters]" has a null value in JSON.');
        assert(json.containsKey(r'form_descriptions'), 'Required key "PokemonSpeciesDetail[form_descriptions]" is missing from JSON.');
        assert(json[r'form_descriptions'] != null, 'Required key "PokemonSpeciesDetail[form_descriptions]" has a null value in JSON.');
        assert(json.containsKey(r'flavor_text_entries'), 'Required key "PokemonSpeciesDetail[flavor_text_entries]" is missing from JSON.');
        assert(json[r'flavor_text_entries'] != null, 'Required key "PokemonSpeciesDetail[flavor_text_entries]" has a null value in JSON.');
        assert(json.containsKey(r'genera'), 'Required key "PokemonSpeciesDetail[genera]" is missing from JSON.');
        assert(json[r'genera'] != null, 'Required key "PokemonSpeciesDetail[genera]" has a null value in JSON.');
        assert(json.containsKey(r'varieties'), 'Required key "PokemonSpeciesDetail[varieties]" is missing from JSON.');
        assert(json[r'varieties'] != null, 'Required key "PokemonSpeciesDetail[varieties]" has a null value in JSON.');
        return true;
      }());

      return PokemonSpeciesDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        order: mapValueOfType<int>(json, r'order'),
        genderRate: mapValueOfType<int>(json, r'gender_rate'),
        captureRate: mapValueOfType<int>(json, r'capture_rate'),
        baseHappiness: mapValueOfType<int>(json, r'base_happiness'),
        isBaby: mapValueOfType<bool>(json, r'is_baby'),
        isLegendary: mapValueOfType<bool>(json, r'is_legendary'),
        isMythical: mapValueOfType<bool>(json, r'is_mythical'),
        hatchCounter: mapValueOfType<int>(json, r'hatch_counter'),
        hasGenderDifferences: mapValueOfType<bool>(json, r'has_gender_differences'),
        formsSwitchable: mapValueOfType<bool>(json, r'forms_switchable'),
        growthRate: GrowthRateSummary.fromJson(json[r'growth_rate'])!,
        pokedexNumbers: PokemonDexEntry.listFromJson(json[r'pokedex_numbers']),
        eggGroups: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'egg_groups']),
        color: PokemonColorSummary.fromJson(json[r'color'])!,
        shape: PokemonShapeSummary.fromJson(json[r'shape'])!,
        evolvesFromSpecies: PokemonSpeciesSummary.fromJson(json[r'evolves_from_species'])!,
        evolutionChain: EvolutionChainSummary.fromJson(json[r'evolution_chain'])!,
        habitat: PokemonHabitatSummary.fromJson(json[r'habitat'])!,
        generation: GenerationSummary.fromJson(json[r'generation'])!,
        names: PokemonFormDetailFormNamesInner.listFromJson(json[r'names']),
        palParkEncounters: PokemonSpeciesDetailPalParkEncountersInner.listFromJson(json[r'pal_park_encounters']),
        formDescriptions: PokemonSpeciesDescription.listFromJson(json[r'form_descriptions']),
        flavorTextEntries: PokemonSpeciesFlavorText.listFromJson(json[r'flavor_text_entries']),
        genera: PokemonSpeciesDetailGeneraInner.listFromJson(json[r'genera']),
        varieties: PokemonSpeciesDetailVarietiesInner.listFromJson(json[r'varieties']),
      );
    }
    return null;
  }

  static List<PokemonSpeciesDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokemonSpeciesDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokemonSpeciesDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokemonSpeciesDetail> mapFromJson(dynamic json) {
    final map = <String, PokemonSpeciesDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokemonSpeciesDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokemonSpeciesDetail-objects as value to a dart map
  static Map<String, List<PokemonSpeciesDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokemonSpeciesDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokemonSpeciesDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'growth_rate',
    'pokedex_numbers',
    'egg_groups',
    'color',
    'shape',
    'evolves_from_species',
    'evolution_chain',
    'habitat',
    'generation',
    'names',
    'pal_park_encounters',
    'form_descriptions',
    'flavor_text_entries',
    'genera',
    'varieties',
  };
}

