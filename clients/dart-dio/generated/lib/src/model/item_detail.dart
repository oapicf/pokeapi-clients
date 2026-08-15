//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_detail_baby_trigger_for.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_detail_machines_inner.dart';
import 'package:openapi/src/model/item_flavor_text.dart';
import 'package:openapi/src/model/item_detail_held_by_pokemon_inner.dart';
import 'package:openapi/src/model/item_detail_sprites.dart';
import 'package:openapi/src/model/item_fling_effect_summary.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/item_effect_text.dart';
import 'package:openapi/src/model/item_category_summary.dart';
import 'package:openapi/src/model/item_game_index.dart';
import 'package:openapi/src/model/item_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_detail.g.dart';

/// ItemDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [cost] 
/// * [flingPower] 
/// * [flingEffect] 
/// * [attributes] 
/// * [category] 
/// * [effectEntries] 
/// * [flavorTextEntries] 
/// * [gameIndices] 
/// * [names] 
/// * [heldByPokemon] 
/// * [sprites] 
/// * [babyTriggerFor] 
/// * [machines] 
@BuiltValue()
abstract class ItemDetail implements Built<ItemDetail, ItemDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'cost')
  int? get cost;

  @BuiltValueField(wireName: r'fling_power')
  int? get flingPower;

  @BuiltValueField(wireName: r'fling_effect')
  ItemFlingEffectSummary get flingEffect;

  @BuiltValueField(wireName: r'attributes')
  BuiltList<AbilityDetailPokemonInnerPokemon> get attributes;

  @BuiltValueField(wireName: r'category')
  ItemCategorySummary get category;

  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<ItemEffectText> get effectEntries;

  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<ItemFlavorText> get flavorTextEntries;

  @BuiltValueField(wireName: r'game_indices')
  BuiltList<ItemGameIndex> get gameIndices;

  @BuiltValueField(wireName: r'names')
  BuiltList<ItemName> get names;

  @BuiltValueField(wireName: r'held_by_pokemon')
  BuiltList<ItemDetailHeldByPokemonInner> get heldByPokemon;

  @BuiltValueField(wireName: r'sprites')
  ItemDetailSprites get sprites;

  @BuiltValueField(wireName: r'baby_trigger_for')
  ItemDetailBabyTriggerFor get babyTriggerFor;

  @BuiltValueField(wireName: r'machines')
  BuiltList<ItemDetailMachinesInner> get machines;

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
    if (object.cost != null) {
      yield r'cost';
      yield serializers.serialize(
        object.cost,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.flingPower != null) {
      yield r'fling_power';
      yield serializers.serialize(
        object.flingPower,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'fling_effect';
    yield serializers.serialize(
      object.flingEffect,
      specifiedType: const FullType(ItemFlingEffectSummary),
    );
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
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
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(ItemName)]),
    );
    yield r'held_by_pokemon';
    yield serializers.serialize(
      object.heldByPokemon,
      specifiedType: const FullType(BuiltList, [FullType(ItemDetailHeldByPokemonInner)]),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(ItemDetailSprites),
    );
    yield r'baby_trigger_for';
    yield serializers.serialize(
      object.babyTriggerFor,
      specifiedType: const FullType(ItemDetailBabyTriggerFor),
    );
    yield r'machines';
    yield serializers.serialize(
      object.machines,
      specifiedType: const FullType(BuiltList, [FullType(ItemDetailMachinesInner)]),
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
        case r'cost':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.cost = valueDes;
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
            specifiedType: const FullType(ItemFlingEffectSummary),
          ) as ItemFlingEffectSummary;
          result.flingEffect.replace(valueDes);
          break;
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
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
            specifiedType: const FullType(BuiltList, [FullType(ItemDetailHeldByPokemonInner)]),
          ) as BuiltList<ItemDetailHeldByPokemonInner>;
          result.heldByPokemon.replace(valueDes);
          break;
        case r'sprites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemDetailSprites),
          ) as ItemDetailSprites;
          result.sprites.replace(valueDes);
          break;
        case r'baby_trigger_for':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemDetailBabyTriggerFor),
          ) as ItemDetailBabyTriggerFor;
          result.babyTriggerFor.replace(valueDes);
          break;
        case r'machines':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemDetailMachinesInner)]),
          ) as BuiltList<ItemDetailMachinesInner>;
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

