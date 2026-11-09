//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_attribute_description.dart';
import 'package:openapi/src/model/item_attribute_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_attribute_detail.g.dart';

/// ItemAttributeDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [descriptions] - The description of this item attribute listed in different languages.
/// * [items] - A list of items that have this attribute.
/// * [names] - The name of this item attribute listed in different languages.
@BuiltValue()
abstract class ItemAttributeDetail implements Built<ItemAttributeDetail, ItemAttributeDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The description of this item attribute listed in different languages.
  @BuiltValueField(wireName: r'descriptions')
  BuiltList<ItemAttributeDescription> get descriptions;

  /// A list of items that have this attribute.
  @BuiltValueField(wireName: r'items')
  BuiltList<ItemSummary> get items;

  /// The name of this item attribute listed in different languages.
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
      specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
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
            specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
          ) as BuiltList<ItemSummary>;
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


