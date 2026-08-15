//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_detail_sprites.g.dart';

/// ItemDetailSprites
///
/// Properties:
/// * [default_] 
@BuiltValue()
abstract class ItemDetailSprites implements Built<ItemDetailSprites, ItemDetailSpritesBuilder> {
  @BuiltValueField(wireName: r'default')
  String get default_;

  ItemDetailSprites._();

  factory ItemDetailSprites([void updates(ItemDetailSpritesBuilder b)]) = _$ItemDetailSprites;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDetailSpritesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDetailSprites> get serializer => _$ItemDetailSpritesSerializer();
}

class _$ItemDetailSpritesSerializer implements PrimitiveSerializer<ItemDetailSprites> {
  @override
  final Iterable<Type> types = const [ItemDetailSprites, _$ItemDetailSprites];

  @override
  final String wireName = r'ItemDetailSprites';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDetailSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'default';
    yield serializers.serialize(
      object.default_,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemDetailSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDetailSpritesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.default_ = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemDetailSprites deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDetailSpritesBuilder();
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

