//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_pocket_summary.dart';
import 'package:openapi/src/model/item_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_category_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_category_detail.g.dart';

/// ItemCategoryDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [items] 
/// * [names] 
/// * [pocket] 
@BuiltValue()
abstract class ItemCategoryDetail implements Built<ItemCategoryDetail, ItemCategoryDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'items')
  BuiltList<ItemSummary> get items;

  @BuiltValueField(wireName: r'names')
  BuiltList<ItemCategoryName> get names;

  @BuiltValueField(wireName: r'pocket')
  ItemPocketSummary get pocket;

  ItemCategoryDetail._();

  factory ItemCategoryDetail([void updates(ItemCategoryDetailBuilder b)]) = _$ItemCategoryDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemCategoryDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemCategoryDetail> get serializer => _$ItemCategoryDetailSerializer();
}

class _$ItemCategoryDetailSerializer implements PrimitiveSerializer<ItemCategoryDetail> {
  @override
  final Iterable<Type> types = const [ItemCategoryDetail, _$ItemCategoryDetail];

  @override
  final String wireName = r'ItemCategoryDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemCategoryDetail object, {
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
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(ItemCategoryName)]),
    );
    yield r'pocket';
    yield serializers.serialize(
      object.pocket,
      specifiedType: const FullType(ItemPocketSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemCategoryDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemCategoryDetailBuilder result,
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
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
          ) as BuiltList<ItemSummary>;
          result.items.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemCategoryName)]),
          ) as BuiltList<ItemCategoryName>;
          result.names.replace(valueDes);
          break;
        case r'pocket':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemPocketSummary),
          ) as ItemPocketSummary;
          result.pocket.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemCategoryDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemCategoryDetailBuilder();
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

