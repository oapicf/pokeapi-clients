//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'experience.g.dart';

/// Experience
///
/// Properties:
/// * [level] 
/// * [experience] 
@BuiltValue()
abstract class Experience implements Built<Experience, ExperienceBuilder> {
  @BuiltValueField(wireName: r'level')
  int get level;

  @BuiltValueField(wireName: r'experience')
  int get experience;

  Experience._();

  factory Experience([void updates(ExperienceBuilder b)]) = _$Experience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ExperienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Experience> get serializer => _$ExperienceSerializer();
}

class _$ExperienceSerializer implements PrimitiveSerializer<Experience> {
  @override
  final Iterable<Type> types = const [Experience, _$Experience];

  @override
  final String wireName = r'Experience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Experience object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'level';
    yield serializers.serialize(
      object.level,
      specifiedType: const FullType(int),
    );
    yield r'experience';
    yield serializers.serialize(
      object.experience,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Experience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ExperienceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.level = valueDes;
          break;
        case r'experience':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.experience = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Experience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ExperienceBuilder();
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

