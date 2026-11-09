//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemDetail {
  /// Returns a new [ItemDetail] instance.
  ItemDetail({
    required this.id,
    required this.name,
    this.flingPower,
    required this.flingEffect,
    this.attributes = const [],
    required this.category,
    this.effectEntries = const [],
    this.flavorTextEntries = const [],
    this.gameIndices = const [],
    this.prices = const [],
    this.names = const [],
    this.heldByPokemon = const [],
    required this.sprites,
    required this.babyTriggerFor,
    this.machines = const [],
  });

  /// The identifier for this resource.
  int id;

  /// The name for this resource.
  String name;

  /// The power of the move Fling when used with this item.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? flingPower;

  /// The effect of the move Fling when used with this item.
  ItemFlingEffectSummary? flingEffect;

  /// A list of attributes this item has.
  List<ItemAttributeSummary> attributes;

  /// The category of items this item falls into.
  ItemCategorySummary category;

  /// The effect of this ability listed in different languages.
  List<ItemEffectText> effectEntries;

  /// The flavor text of this ability listed in different languages.
  List<ItemFlavorText> flavorTextEntries;

  /// A list of game indices relevent to this item by generation.
  List<ItemGameIndex> gameIndices;

  /// Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
  List<ItemPrice> prices;

  /// The name of this item listed in different languages.
  List<ItemName> names;

  /// A list of Pokémon that might be found in the wild holding this item.
  List<PokemonHeldItem> heldByPokemon;

  /// A set of sprites used to depict this item in the game.
  ItemSprites sprites;

  /// An evolution chain this item requires to produce a bay during mating.
  EvolutionChainSummary? babyTriggerFor;

  /// A list of the machines related to this item.
  List<ItemMachine> machines;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemDetail &&
    other.id == id &&
    other.name == name &&
    other.flingPower == flingPower &&
    other.flingEffect == flingEffect &&
    _deepEquality.equals(other.attributes, attributes) &&
    other.category == category &&
    _deepEquality.equals(other.effectEntries, effectEntries) &&
    _deepEquality.equals(other.flavorTextEntries, flavorTextEntries) &&
    _deepEquality.equals(other.gameIndices, gameIndices) &&
    _deepEquality.equals(other.prices, prices) &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.heldByPokemon, heldByPokemon) &&
    other.sprites == sprites &&
    other.babyTriggerFor == babyTriggerFor &&
    _deepEquality.equals(other.machines, machines);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (flingPower == null ? 0 : flingPower!.hashCode) +
    (flingEffect == null ? 0 : flingEffect!.hashCode) +
    (attributes.hashCode) +
    (category.hashCode) +
    (effectEntries.hashCode) +
    (flavorTextEntries.hashCode) +
    (gameIndices.hashCode) +
    (prices.hashCode) +
    (names.hashCode) +
    (heldByPokemon.hashCode) +
    (sprites.hashCode) +
    (babyTriggerFor == null ? 0 : babyTriggerFor!.hashCode) +
    (machines.hashCode);

  @override
  String toString() => 'ItemDetail[id=$id, name=$name, flingPower=$flingPower, flingEffect=$flingEffect, attributes=$attributes, category=$category, effectEntries=$effectEntries, flavorTextEntries=$flavorTextEntries, gameIndices=$gameIndices, prices=$prices, names=$names, heldByPokemon=$heldByPokemon, sprites=$sprites, babyTriggerFor=$babyTriggerFor, machines=$machines]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
    if (this.flingPower != null) {
      json[r'fling_power'] = this.flingPower;
    } else {
      json[r'fling_power'] = null;
    }
    if (this.flingEffect != null) {
      json[r'fling_effect'] = this.flingEffect;
    } else {
      json[r'fling_effect'] = null;
    }
      json[r'attributes'] = this.attributes;
      json[r'category'] = this.category;
      json[r'effect_entries'] = this.effectEntries;
      json[r'flavor_text_entries'] = this.flavorTextEntries;
      json[r'game_indices'] = this.gameIndices;
      json[r'prices'] = this.prices;
      json[r'names'] = this.names;
      json[r'held_by_pokemon'] = this.heldByPokemon;
      json[r'sprites'] = this.sprites;
    if (this.babyTriggerFor != null) {
      json[r'baby_trigger_for'] = this.babyTriggerFor;
    } else {
      json[r'baby_trigger_for'] = null;
    }
      json[r'machines'] = this.machines;
    return json;
  }

  /// Returns a new [ItemDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "ItemDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ItemDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "ItemDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "ItemDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'fling_effect'), 'Required key "ItemDetail[fling_effect]" is missing from JSON.');
        assert(json.containsKey(r'attributes'), 'Required key "ItemDetail[attributes]" is missing from JSON.');
        assert(json[r'attributes'] != null, 'Required key "ItemDetail[attributes]" has a null value in JSON.');
        assert(json.containsKey(r'category'), 'Required key "ItemDetail[category]" is missing from JSON.');
        assert(json[r'category'] != null, 'Required key "ItemDetail[category]" has a null value in JSON.');
        assert(json.containsKey(r'effect_entries'), 'Required key "ItemDetail[effect_entries]" is missing from JSON.');
        assert(json[r'effect_entries'] != null, 'Required key "ItemDetail[effect_entries]" has a null value in JSON.');
        assert(json.containsKey(r'flavor_text_entries'), 'Required key "ItemDetail[flavor_text_entries]" is missing from JSON.');
        assert(json[r'flavor_text_entries'] != null, 'Required key "ItemDetail[flavor_text_entries]" has a null value in JSON.');
        assert(json.containsKey(r'game_indices'), 'Required key "ItemDetail[game_indices]" is missing from JSON.');
        assert(json[r'game_indices'] != null, 'Required key "ItemDetail[game_indices]" has a null value in JSON.');
        assert(json.containsKey(r'prices'), 'Required key "ItemDetail[prices]" is missing from JSON.');
        assert(json[r'prices'] != null, 'Required key "ItemDetail[prices]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "ItemDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "ItemDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'held_by_pokemon'), 'Required key "ItemDetail[held_by_pokemon]" is missing from JSON.');
        assert(json[r'held_by_pokemon'] != null, 'Required key "ItemDetail[held_by_pokemon]" has a null value in JSON.');
        assert(json.containsKey(r'sprites'), 'Required key "ItemDetail[sprites]" is missing from JSON.');
        assert(json[r'sprites'] != null, 'Required key "ItemDetail[sprites]" has a null value in JSON.');
        assert(json.containsKey(r'baby_trigger_for'), 'Required key "ItemDetail[baby_trigger_for]" is missing from JSON.');
        assert(json.containsKey(r'machines'), 'Required key "ItemDetail[machines]" is missing from JSON.');
        assert(json[r'machines'] != null, 'Required key "ItemDetail[machines]" has a null value in JSON.');
        return true;
      }());

      return ItemDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        flingPower: mapValueOfType<int>(json, r'fling_power'),
        flingEffect: ItemFlingEffectSummary.fromJson(json[r'fling_effect']),
        attributes: ItemAttributeSummary.listFromJson(json[r'attributes']),
        category: ItemCategorySummary.fromJson(json[r'category'])!,
        effectEntries: ItemEffectText.listFromJson(json[r'effect_entries']),
        flavorTextEntries: ItemFlavorText.listFromJson(json[r'flavor_text_entries']),
        gameIndices: ItemGameIndex.listFromJson(json[r'game_indices']),
        prices: ItemPrice.listFromJson(json[r'prices']),
        names: ItemName.listFromJson(json[r'names']),
        heldByPokemon: PokemonHeldItem.listFromJson(json[r'held_by_pokemon']),
        sprites: ItemSprites.fromJson(json[r'sprites'])!,
        babyTriggerFor: EvolutionChainSummary.fromJson(json[r'baby_trigger_for']),
        machines: ItemMachine.listFromJson(json[r'machines']),
      );
    }
    return null;
  }

  static List<ItemDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemDetail> mapFromJson(dynamic json) {
    final map = <String, ItemDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemDetail-objects as value to a dart map
  static Map<String, List<ItemDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'fling_effect',
    'attributes',
    'category',
    'effect_entries',
    'flavor_text_entries',
    'game_indices',
    'prices',
    'names',
    'held_by_pokemon',
    'sprites',
    'baby_trigger_for',
    'machines',
  };
}

