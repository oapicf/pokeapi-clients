//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_fling_effect_effect_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_fling_effect_detail.g.dart';

/// ItemFlingEffectDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [effectEntries] 
/// * [items] 
@BuiltValue()
abstract class ItemFlingEffectDetail implements Built<ItemFlingEffectDetail, ItemFlingEffectDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<ItemFlingEffectEffectText> get effectEntries;

  @BuiltValueField(wireName: r'items')
  BuiltList<ItemSummary> get items;

  ItemFlingEffectDetail._();

  factory ItemFlingEffectDetail([void updates(ItemFlingEffectDetailBuilder b)]) = _$ItemFlingEffectDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemFlingEffectDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemFlingEffectDetail> get serializer => _$ItemFlingEffectDetailSerializer();
}

class _$ItemFlingEffectDetailSerializer implements PrimitiveSerializer<ItemFlingEffectDetail> {
  @override
  final Iterable<Type> types = const [ItemFlingEffectDetail, _$ItemFlingEffectDetail];

  @override
  final String wireName = r'ItemFlingEffectDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemFlingEffectDetail object, {
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
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(ItemFlingEffectEffectText)]),
    );
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemFlingEffectDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemFlingEffectDetailBuilder result,
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
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemFlingEffectEffectText)]),
          ) as BuiltList<ItemFlingEffectEffectText>;
          result.effectEntries.replace(valueDes);
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
          ) as BuiltList<ItemSummary>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemFlingEffectDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemFlingEffectDetailBuilder();
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

