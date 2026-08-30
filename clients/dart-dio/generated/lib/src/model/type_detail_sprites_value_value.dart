//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail_sprites_value_value.g.dart';

/// TypeDetailSpritesValueValue
///
/// Properties:
/// * [nameIcon] 
@BuiltValue()
abstract class TypeDetailSpritesValueValue implements Built<TypeDetailSpritesValueValue, TypeDetailSpritesValueValueBuilder> {
  @BuiltValueField(wireName: r'name-icon')
  String? get nameIcon;

  TypeDetailSpritesValueValue._();

  factory TypeDetailSpritesValueValue([void updates(TypeDetailSpritesValueValueBuilder b)]) = _$TypeDetailSpritesValueValue;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailSpritesValueValueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetailSpritesValueValue> get serializer => _$TypeDetailSpritesValueValueSerializer();
}

class _$TypeDetailSpritesValueValueSerializer implements PrimitiveSerializer<TypeDetailSpritesValueValue> {
  @override
  final Iterable<Type> types = const [TypeDetailSpritesValueValue, _$TypeDetailSpritesValueValue];

  @override
  final String wireName = r'TypeDetailSpritesValueValue';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetailSpritesValueValue object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.nameIcon != null) {
      yield r'name-icon';
      yield serializers.serialize(
        object.nameIcon,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeDetailSpritesValueValue object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailSpritesValueValueBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name-icon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.nameIcon = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeDetailSpritesValueValue deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailSpritesValueValueBuilder();
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

