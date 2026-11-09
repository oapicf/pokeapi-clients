//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_game_sprite.g.dart';

/// TypeGameSprite
///
/// Properties:
/// * [nameIcon] - The URL of the icon displaying the type name in this game, or null if unavailable.
/// * [symbolIcon] - The URL of the type symbol icon in this game, or null if unavailable.
@BuiltValue()
abstract class TypeGameSprite implements Built<TypeGameSprite, TypeGameSpriteBuilder> {
  /// The URL of the icon displaying the type name in this game, or null if unavailable.
  @BuiltValueField(wireName: r'name_icon')
  String? get nameIcon;

  /// The URL of the type symbol icon in this game, or null if unavailable.
  @BuiltValueField(wireName: r'symbol_icon')
  String? get symbolIcon;

  TypeGameSprite._();

  factory TypeGameSprite([void updates(TypeGameSpriteBuilder b)]) = _$TypeGameSprite;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeGameSpriteBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeGameSprite> get serializer => _$TypeGameSpriteSerializer();
}

class _$TypeGameSpriteSerializer implements PrimitiveSerializer<TypeGameSprite> {
  @override
  final Iterable<Type> types = const [TypeGameSprite, _$TypeGameSprite];

  @override
  final String wireName = r'TypeGameSprite';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeGameSprite object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.nameIcon != null) {
      yield r'name_icon';
      yield serializers.serialize(
        object.nameIcon,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.symbolIcon != null) {
      yield r'symbol_icon';
      yield serializers.serialize(
        object.symbolIcon,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeGameSprite object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeGameSpriteBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name_icon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.nameIcon = valueDes;
          break;
        case r'symbol_icon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.symbolIcon = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeGameSprite deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeGameSpriteBuilder();
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


