//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_damage_class_description.g.dart';

/// MoveDamageClassDescription
///
/// Properties:
/// * [description] 
/// * [language] 
@BuiltValue()
abstract class MoveDamageClassDescription implements Built<MoveDamageClassDescription, MoveDamageClassDescriptionBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  MoveDamageClassDescription._();

  factory MoveDamageClassDescription([void updates(MoveDamageClassDescriptionBuilder b)]) = _$MoveDamageClassDescription;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDamageClassDescriptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDamageClassDescription> get serializer => _$MoveDamageClassDescriptionSerializer();
}

class _$MoveDamageClassDescriptionSerializer implements PrimitiveSerializer<MoveDamageClassDescription> {
  @override
  final Iterable<Type> types = const [MoveDamageClassDescription, _$MoveDamageClassDescription];

  @override
  final String wireName = r'MoveDamageClassDescription';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDamageClassDescription object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDamageClassDescription object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDamageClassDescriptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LanguageSummary),
          ) as LanguageSummary;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDamageClassDescription deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDamageClassDescriptionBuilder();
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

