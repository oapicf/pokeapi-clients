//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_attribute_description.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/item_attribute_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_attribute_detail.g.dart';

/// ItemAttributeDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [descriptions] 
/// * [items] 
/// * [names] 
@BuiltValue()
abstract class ItemAttributeDetail implements Built<ItemAttributeDetail, ItemAttributeDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'descriptions')
  BuiltList<ItemAttributeDescription> get descriptions;

  @BuiltValueField(wireName: r'items')
  BuiltList<AbilityDetailPokemonInnerPokemon> get items;

  @BuiltValueField(wireName: r'names')
  BuiltList<ItemAttributeName> get names;

  ItemAttributeDetail._();

  factory ItemAttributeDetail([void updates(ItemAttributeDetailBuilder b)]) = _$ItemAttributeDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemAttributeDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemAttributeDetail> get serializer => _$ItemAttributeDetailSerializer();
}

class _$ItemAttributeDetailSerializer implements PrimitiveSerializer<ItemAttributeDetail> {
  @override
  final Iterable<Type> types = const [ItemAttributeDetail, _$ItemAttributeDetail];

  @override
  final String wireName = r'ItemAttributeDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemAttributeDetail object, {
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
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(ItemAttributeDescription)]),
    );
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(ItemAttributeName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemAttributeDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemAttributeDetailBuilder result,
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
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemAttributeDescription)]),
          ) as BuiltList<ItemAttributeDescription>;
          result.descriptions.replace(valueDes);
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.items.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemAttributeName)]),
          ) as BuiltList<ItemAttributeName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemAttributeDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemAttributeDetailBuilder();
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

