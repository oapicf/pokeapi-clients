//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/evolution_chain_summary.dart';
import 'package:openapi/src/model/item_fling_effect_summary.dart';
import 'package:openapi/src/model/item_effect_text.dart';
import 'package:openapi/src/model/item_sprites.dart';
import 'package:openapi/src/model/item_category_summary.dart';
import 'package:openapi/src/model/item_game_index.dart';
import 'package:openapi/src/model/item_name.dart';
import 'package:openapi/src/model/pokemon_held_item.dart';
import 'package:openapi/src/model/item_price.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_flavor_text.dart';
import 'package:openapi/src/model/item_attribute_summary.dart';
import 'package:openapi/src/model/item_machine.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_detail.g.dart';

/// ItemDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [flingPower] - The power of the move Fling when used with this item.
/// * [flingEffect] - The effect of the move Fling when used with this item.
/// * [attributes] - A list of attributes this item has.
/// * [category] - The category of items this item falls into.
/// * [effectEntries] - The effect of this ability listed in different languages.
/// * [flavorTextEntries] - The flavor text of this ability listed in different languages.
/// * [gameIndices] - A list of game indices relevent to this item by generation.
/// * [prices] - Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
/// * [names] - The name of this item listed in different languages.
/// * [heldByPokemon] - A list of Pokémon that might be found in the wild holding this item.
/// * [sprites] - A set of sprites used to depict this item in the game.
/// * [babyTriggerFor] - An evolution chain this item requires to produce a bay during mating.
/// * [machines] - A list of the machines related to this item.
@BuiltValue()
abstract class ItemDetail implements Built<ItemDetail, ItemDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The power of the move Fling when used with this item.
  @BuiltValueField(wireName: r'fling_power')
  int? get flingPower;

  /// The effect of the move Fling when used with this item.
  @BuiltValueField(wireName: r'fling_effect')
  ItemFlingEffectSummary? get flingEffect;

  /// A list of attributes this item has.
  @BuiltValueField(wireName: r'attributes')
  BuiltList<ItemAttributeSummary> get attributes;

  /// The category of items this item falls into.
  @BuiltValueField(wireName: r'category')
  ItemCategorySummary get category;

  /// The effect of this ability listed in different languages.
  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<ItemEffectText> get effectEntries;

  /// The flavor text of this ability listed in different languages.
  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<ItemFlavorText> get flavorTextEntries;

  /// A list of game indices relevent to this item by generation.
  @BuiltValueField(wireName: r'game_indices')
  BuiltList<ItemGameIndex> get gameIndices;

  /// Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
  @BuiltValueField(wireName: r'prices')
  BuiltList<ItemPrice> get prices;

  /// The name of this item listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<ItemName> get names;

  /// A list of Pokémon that might be found in the wild holding this item.
  @BuiltValueField(wireName: r'held_by_pokemon')
  BuiltList<PokemonHeldItem> get heldByPokemon;

  /// A set of sprites used to depict this item in the game.
  @BuiltValueField(wireName: r'sprites')
  ItemSprites get sprites;

  /// An evolution chain this item requires to produce a bay during mating.
  @BuiltValueField(wireName: r'baby_trigger_for')
  EvolutionChainSummary? get babyTriggerFor;

  /// A list of the machines related to this item.
  @BuiltValueField(wireName: r'machines')
  BuiltList<ItemMachine> get machines;

  ItemDetail._();

  factory ItemDetail([void updates(ItemDetailBuilder b)]) = _$ItemDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDetail> get serializer => _$ItemDetailSerializer();
}

class _$ItemDetailSerializer implements PrimitiveSerializer<ItemDetail> {
  @override
  final Iterable<Type> types = const [ItemDetail, _$ItemDetail];

  @override
  final String wireName = r'ItemDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.flingPower != null) {
      yield r'fling_power';
      yield serializers.serialize(
        object.flingPower,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'fling_effect';
    yield object.flingEffect == null ? null : serializers.serialize(
      object.flingEffect,
      specifiedType: const FullType.nullable(ItemFlingEffectSummary),
    );
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(BuiltList, [FullType(ItemAttributeSummary)]),
    );
    yield r'category';
    yield serializers.serialize(
      object.category,
      specifiedType: const FullType(ItemCategorySummary),
    );
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(ItemEffectText)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(ItemFlavorText)]),
    );
    yield r'game_indices';
    yield serializers.serialize(
      object.gameIndices,
      specifiedType: const FullType(BuiltList, [FullType(ItemGameIndex)]),
    );
    yield r'prices';
    yield serializers.serialize(
      object.prices,
      specifiedType: const FullType(BuiltList, [FullType(ItemPrice)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(ItemName)]),
    );
    yield r'held_by_pokemon';
    yield serializers.serialize(
      object.heldByPokemon,
      specifiedType: const FullType(BuiltList, [FullType(PokemonHeldItem)]),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(ItemSprites),
    );
    yield r'baby_trigger_for';
    yield object.babyTriggerFor == null ? null : serializers.serialize(
      object.babyTriggerFor,
      specifiedType: const FullType.nullable(EvolutionChainSummary),
    );
    yield r'machines';
    yield serializers.serialize(
      object.machines,
      specifiedType: const FullType(BuiltList, [FullType(ItemMachine)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'fling_power':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.flingPower = valueDes;
          break;
        case r'fling_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ItemFlingEffectSummary),
          ) as ItemFlingEffectSummary?;
          if (valueDes == null) continue;
          result.flingEffect.replace(valueDes);
          break;
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemAttributeSummary)]),
          ) as BuiltList<ItemAttributeSummary>;
          result.attributes.replace(valueDes);
          break;
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemCategorySummary),
          ) as ItemCategorySummary;
          result.category.replace(valueDes);
          break;
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemEffectText)]),
          ) as BuiltList<ItemEffectText>;
          result.effectEntries.replace(valueDes);
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemFlavorText)]),
          ) as BuiltList<ItemFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        case r'game_indices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemGameIndex)]),
          ) as BuiltList<ItemGameIndex>;
          result.gameIndices.replace(valueDes);
          break;
        case r'prices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemPrice)]),
          ) as BuiltList<ItemPrice>;
          result.prices.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemName)]),
          ) as BuiltList<ItemName>;
          result.names.replace(valueDes);
          break;
        case r'held_by_pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonHeldItem)]),
          ) as BuiltList<PokemonHeldItem>;
          result.heldByPokemon.replace(valueDes);
          break;
        case r'sprites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemSprites),
          ) as ItemSprites;
          result.sprites.replace(valueDes);
          break;
        case r'baby_trigger_for':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EvolutionChainSummary),
          ) as EvolutionChainSummary?;
          if (valueDes == null) continue;
          result.babyTriggerFor.replace(valueDes);
          break;
        case r'machines':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemMachine)]),
          ) as BuiltList<ItemMachine>;
          result.machines.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


