//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_detail_baby_trigger_for.g.dart';

/// ItemDetailBabyTriggerFor
///
/// Properties:
/// * [url] 
@BuiltValue()
abstract class ItemDetailBabyTriggerFor implements Built<ItemDetailBabyTriggerFor, ItemDetailBabyTriggerForBuilder> {
  @BuiltValueField(wireName: r'url')
  String get url;

  ItemDetailBabyTriggerFor._();

  factory ItemDetailBabyTriggerFor([void updates(ItemDetailBabyTriggerForBuilder b)]) = _$ItemDetailBabyTriggerFor;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDetailBabyTriggerForBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDetailBabyTriggerFor> get serializer => _$ItemDetailBabyTriggerForSerializer();
}

class _$ItemDetailBabyTriggerForSerializer implements PrimitiveSerializer<ItemDetailBabyTriggerFor> {
  @override
  final Iterable<Type> types = const [ItemDetailBabyTriggerFor, _$ItemDetailBabyTriggerFor];

  @override
  final String wireName = r'ItemDetailBabyTriggerFor';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDetailBabyTriggerFor object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemDetailBabyTriggerFor object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDetailBabyTriggerForBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemDetailBabyTriggerFor deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDetailBabyTriggerForBuilder();
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

