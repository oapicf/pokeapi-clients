//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_category_summary.dart';
import 'package:openapi/src/model/item_pocket_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_pocket_detail.g.dart';

/// ItemPocketDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [categories] 
/// * [names] 
@BuiltValue()
abstract class ItemPocketDetail implements Built<ItemPocketDetail, ItemPocketDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'categories')
  BuiltList<ItemCategorySummary> get categories;

  @BuiltValueField(wireName: r'names')
  BuiltList<ItemPocketName> get names;

  ItemPocketDetail._();

  factory ItemPocketDetail([void updates(ItemPocketDetailBuilder b)]) = _$ItemPocketDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemPocketDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemPocketDetail> get serializer => _$ItemPocketDetailSerializer();
}

class _$ItemPocketDetailSerializer implements PrimitiveSerializer<ItemPocketDetail> {
  @override
  final Iterable<Type> types = const [ItemPocketDetail, _$ItemPocketDetail];

  @override
  final String wireName = r'ItemPocketDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemPocketDetail object, {
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
    yield r'categories';
    yield serializers.serialize(
      object.categories,
      specifiedType: const FullType(BuiltList, [FullType(ItemCategorySummary)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(ItemPocketName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemPocketDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemPocketDetailBuilder result,
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
        case r'categories':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemCategorySummary)]),
          ) as BuiltList<ItemCategorySummary>;
          result.categories.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemPocketName)]),
          ) as BuiltList<ItemPocketName>;
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
  ItemPocketDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemPocketDetailBuilder();
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

