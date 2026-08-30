//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MoveDetail {
  /// Returns a new [MoveDetail] instance.
  MoveDetail({
    required this.id,
    required this.name,
    this.accuracy,
    required this.effectChance,
    this.pp,
    this.priority,
    this.power,
    required this.contestCombos,
    required this.contestType,
    required this.contestEffect,
    required this.damageClass,
    this.effectEntries = const [],
    this.effectChanges = const [],
    required this.generation,
    required this.meta,
    this.names = const [],
    this.pastValues = const [],
    this.statChanges = const [],
    required this.superContestEffect,
    required this.target,
    required this.type,
    this.machines = const [],
    this.flavorTextEntries = const [],
    this.learnedByPokemon = const [],
  });

  int id;

  String name;

  int? accuracy;

  int effectChance;

  int? pp;

  int? priority;

  int? power;

  MoveDetailContestCombos contestCombos;

  ContestTypeSummary contestType;

  ContestEffectSummary contestEffect;

  MoveDamageClassSummary damageClass;

  List<MoveChangeEffectEntriesInner> effectEntries;

  List<MoveDetailEffectChangesInner> effectChanges;

  GenerationSummary generation;

  MoveMeta meta;

  List<MoveName> names;

  List<MoveChange> pastValues;

  List<MoveDetailStatChangesInner> statChanges;

  SuperContestEffectSummary superContestEffect;

  MoveTargetSummary target;

  TypeSummary type;

  List<MoveDetailMachinesInner> machines;

  List<MoveFlavorText> flavorTextEntries;

  List<AbilityDetailPokemonInnerPokemon> learnedByPokemon;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MoveDetail &&
    other.id == id &&
    other.name == name &&
    other.accuracy == accuracy &&
    other.effectChance == effectChance &&
    other.pp == pp &&
    other.priority == priority &&
    other.power == power &&
    other.contestCombos == contestCombos &&
    other.contestType == contestType &&
    other.contestEffect == contestEffect &&
    other.damageClass == damageClass &&
    _deepEquality.equals(other.effectEntries, effectEntries) &&
    _deepEquality.equals(other.effectChanges, effectChanges) &&
    other.generation == generation &&
    other.meta == meta &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.pastValues, pastValues) &&
    _deepEquality.equals(other.statChanges, statChanges) &&
    other.superContestEffect == superContestEffect &&
    other.target == target &&
    other.type == type &&
    _deepEquality.equals(other.machines, machines) &&
    _deepEquality.equals(other.flavorTextEntries, flavorTextEntries) &&
    _deepEquality.equals(other.learnedByPokemon, learnedByPokemon);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (accuracy == null ? 0 : accuracy!.hashCode) +
    (effectChance.hashCode) +
    (pp == null ? 0 : pp!.hashCode) +
    (priority == null ? 0 : priority!.hashCode) +
    (power == null ? 0 : power!.hashCode) +
    (contestCombos.hashCode) +
    (contestType.hashCode) +
    (contestEffect.hashCode) +
    (damageClass.hashCode) +
    (effectEntries.hashCode) +
    (effectChanges.hashCode) +
    (generation.hashCode) +
    (meta.hashCode) +
    (names.hashCode) +
    (pastValues.hashCode) +
    (statChanges.hashCode) +
    (superContestEffect.hashCode) +
    (target.hashCode) +
    (type.hashCode) +
    (machines.hashCode) +
    (flavorTextEntries.hashCode) +
    (learnedByPokemon.hashCode);

  @override
  String toString() => 'MoveDetail[id=$id, name=$name, accuracy=$accuracy, effectChance=$effectChance, pp=$pp, priority=$priority, power=$power, contestCombos=$contestCombos, contestType=$contestType, contestEffect=$contestEffect, damageClass=$damageClass, effectEntries=$effectEntries, effectChanges=$effectChanges, generation=$generation, meta=$meta, names=$names, pastValues=$pastValues, statChanges=$statChanges, superContestEffect=$superContestEffect, target=$target, type=$type, machines=$machines, flavorTextEntries=$flavorTextEntries, learnedByPokemon=$learnedByPokemon]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.accuracy != null) {
      json[r'accuracy'] = this.accuracy;
    } else {
      json[r'accuracy'] = null;
    }
      json[r'effect_chance'] = this.effectChance;
    if (this.pp != null) {
      json[r'pp'] = this.pp;
    } else {
      json[r'pp'] = null;
    }
    if (this.priority != null) {
      json[r'priority'] = this.priority;
    } else {
      json[r'priority'] = null;
    }
    if (this.power != null) {
      json[r'power'] = this.power;
    } else {
      json[r'power'] = null;
    }
      json[r'contest_combos'] = this.contestCombos;
      json[r'contest_type'] = this.contestType;
      json[r'contest_effect'] = this.contestEffect;
      json[r'damage_class'] = this.damageClass;
      json[r'effect_entries'] = this.effectEntries;
      json[r'effect_changes'] = this.effectChanges;
      json[r'generation'] = this.generation;
      json[r'meta'] = this.meta;
      json[r'names'] = this.names;
      json[r'past_values'] = this.pastValues;
      json[r'stat_changes'] = this.statChanges;
      json[r'super_contest_effect'] = this.superContestEffect;
      json[r'target'] = this.target;
      json[r'type'] = this.type;
      json[r'machines'] = this.machines;
      json[r'flavor_text_entries'] = this.flavorTextEntries;
      json[r'learned_by_pokemon'] = this.learnedByPokemon;
    return json;
  }

  /// Returns a new [MoveDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MoveDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "MoveDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "MoveDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "MoveDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "MoveDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'effect_chance'), 'Required key "MoveDetail[effect_chance]" is missing from JSON.');
        assert(json[r'effect_chance'] != null, 'Required key "MoveDetail[effect_chance]" has a null value in JSON.');
        assert(json.containsKey(r'contest_combos'), 'Required key "MoveDetail[contest_combos]" is missing from JSON.');
        assert(json[r'contest_combos'] != null, 'Required key "MoveDetail[contest_combos]" has a null value in JSON.');
        assert(json.containsKey(r'contest_type'), 'Required key "MoveDetail[contest_type]" is missing from JSON.');
        assert(json[r'contest_type'] != null, 'Required key "MoveDetail[contest_type]" has a null value in JSON.');
        assert(json.containsKey(r'contest_effect'), 'Required key "MoveDetail[contest_effect]" is missing from JSON.');
        assert(json[r'contest_effect'] != null, 'Required key "MoveDetail[contest_effect]" has a null value in JSON.');
        assert(json.containsKey(r'damage_class'), 'Required key "MoveDetail[damage_class]" is missing from JSON.');
        assert(json[r'damage_class'] != null, 'Required key "MoveDetail[damage_class]" has a null value in JSON.');
        assert(json.containsKey(r'effect_entries'), 'Required key "MoveDetail[effect_entries]" is missing from JSON.');
        assert(json[r'effect_entries'] != null, 'Required key "MoveDetail[effect_entries]" has a null value in JSON.');
        assert(json.containsKey(r'effect_changes'), 'Required key "MoveDetail[effect_changes]" is missing from JSON.');
        assert(json[r'effect_changes'] != null, 'Required key "MoveDetail[effect_changes]" has a null value in JSON.');
        assert(json.containsKey(r'generation'), 'Required key "MoveDetail[generation]" is missing from JSON.');
        assert(json[r'generation'] != null, 'Required key "MoveDetail[generation]" has a null value in JSON.');
        assert(json.containsKey(r'meta'), 'Required key "MoveDetail[meta]" is missing from JSON.');
        assert(json[r'meta'] != null, 'Required key "MoveDetail[meta]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "MoveDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "MoveDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'past_values'), 'Required key "MoveDetail[past_values]" is missing from JSON.');
        assert(json[r'past_values'] != null, 'Required key "MoveDetail[past_values]" has a null value in JSON.');
        assert(json.containsKey(r'stat_changes'), 'Required key "MoveDetail[stat_changes]" is missing from JSON.');
        assert(json[r'stat_changes'] != null, 'Required key "MoveDetail[stat_changes]" has a null value in JSON.');
        assert(json.containsKey(r'super_contest_effect'), 'Required key "MoveDetail[super_contest_effect]" is missing from JSON.');
        assert(json[r'super_contest_effect'] != null, 'Required key "MoveDetail[super_contest_effect]" has a null value in JSON.');
        assert(json.containsKey(r'target'), 'Required key "MoveDetail[target]" is missing from JSON.');
        assert(json[r'target'] != null, 'Required key "MoveDetail[target]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "MoveDetail[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "MoveDetail[type]" has a null value in JSON.');
        assert(json.containsKey(r'machines'), 'Required key "MoveDetail[machines]" is missing from JSON.');
        assert(json[r'machines'] != null, 'Required key "MoveDetail[machines]" has a null value in JSON.');
        assert(json.containsKey(r'flavor_text_entries'), 'Required key "MoveDetail[flavor_text_entries]" is missing from JSON.');
        assert(json[r'flavor_text_entries'] != null, 'Required key "MoveDetail[flavor_text_entries]" has a null value in JSON.');
        assert(json.containsKey(r'learned_by_pokemon'), 'Required key "MoveDetail[learned_by_pokemon]" is missing from JSON.');
        assert(json[r'learned_by_pokemon'] != null, 'Required key "MoveDetail[learned_by_pokemon]" has a null value in JSON.');
        return true;
      }());

      return MoveDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        accuracy: mapValueOfType<int>(json, r'accuracy'),
        effectChance: mapValueOfType<int>(json, r'effect_chance')!,
        pp: mapValueOfType<int>(json, r'pp'),
        priority: mapValueOfType<int>(json, r'priority'),
        power: mapValueOfType<int>(json, r'power'),
        contestCombos: MoveDetailContestCombos.fromJson(json[r'contest_combos'])!,
        contestType: ContestTypeSummary.fromJson(json[r'contest_type'])!,
        contestEffect: ContestEffectSummary.fromJson(json[r'contest_effect'])!,
        damageClass: MoveDamageClassSummary.fromJson(json[r'damage_class'])!,
        effectEntries: MoveChangeEffectEntriesInner.listFromJson(json[r'effect_entries']),
        effectChanges: MoveDetailEffectChangesInner.listFromJson(json[r'effect_changes']),
        generation: GenerationSummary.fromJson(json[r'generation'])!,
        meta: MoveMeta.fromJson(json[r'meta'])!,
        names: MoveName.listFromJson(json[r'names']),
        pastValues: MoveChange.listFromJson(json[r'past_values']),
        statChanges: MoveDetailStatChangesInner.listFromJson(json[r'stat_changes']),
        superContestEffect: SuperContestEffectSummary.fromJson(json[r'super_contest_effect'])!,
        target: MoveTargetSummary.fromJson(json[r'target'])!,
        type: TypeSummary.fromJson(json[r'type'])!,
        machines: MoveDetailMachinesInner.listFromJson(json[r'machines']),
        flavorTextEntries: MoveFlavorText.listFromJson(json[r'flavor_text_entries']),
        learnedByPokemon: AbilityDetailPokemonInnerPokemon.listFromJson(json[r'learned_by_pokemon']),
      );
    }
    return null;
  }

  static List<MoveDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MoveDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MoveDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MoveDetail> mapFromJson(dynamic json) {
    final map = <String, MoveDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MoveDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MoveDetail-objects as value to a dart map
  static Map<String, List<MoveDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MoveDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MoveDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'effect_chance',
    'contest_combos',
    'contest_type',
    'contest_effect',
    'damage_class',
    'effect_entries',
    'effect_changes',
    'generation',
    'meta',
    'names',
    'past_values',
    'stat_changes',
    'super_contest_effect',
    'target',
    'type',
    'machines',
    'flavor_text_entries',
    'learned_by_pokemon',
  };
}

