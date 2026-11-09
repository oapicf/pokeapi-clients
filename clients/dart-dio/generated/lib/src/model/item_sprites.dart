//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_sprites.g.dart';

/// ItemSprites
///
/// Properties:
/// * [default_] - The default depiction of this item.
@BuiltValue()
abstract class ItemSprites implements Built<ItemSprites, ItemSpritesBuilder> {
  /// The default depiction of this item.
  @BuiltValueField(wireName: r'default')
  String? get default_;

  ItemSprites._();

  factory ItemSprites([void updates(ItemSpritesBuilder b)]) = _$ItemSprites;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemSpritesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemSprites> get serializer => _$ItemSpritesSerializer();
}

class _$ItemSpritesSerializer implements PrimitiveSerializer<ItemSprites> {
  @override
  final Iterable<Type> types = const [ItemSprites, _$ItemSprites];

  @override
  final String wireName = r'ItemSprites';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'default';
    yield object.default_ == null ? null : serializers.serialize(
      object.default_,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemSpritesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  ItemSprites deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemSpritesBuilder();
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


