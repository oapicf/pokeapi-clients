//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_meta_category_description.g.dart';

/// MoveMetaCategoryDescription
///
/// Properties:
/// * [description] 
/// * [language] 
@BuiltValue()
abstract class MoveMetaCategoryDescription implements Built<MoveMetaCategoryDescription, MoveMetaCategoryDescriptionBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  MoveMetaCategoryDescription._();

  factory MoveMetaCategoryDescription([void updates(MoveMetaCategoryDescriptionBuilder b)]) = _$MoveMetaCategoryDescription;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveMetaCategoryDescriptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveMetaCategoryDescription> get serializer => _$MoveMetaCategoryDescriptionSerializer();
}

class _$MoveMetaCategoryDescriptionSerializer implements PrimitiveSerializer<MoveMetaCategoryDescription> {
  @override
  final Iterable<Type> types = const [MoveMetaCategoryDescription, _$MoveMetaCategoryDescription];

  @override
  final String wireName = r'MoveMetaCategoryDescription';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveMetaCategoryDescription object, {
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
    MoveMetaCategoryDescription object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveMetaCategoryDescriptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  MoveMetaCategoryDescription deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveMetaCategoryDescriptionBuilder();
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

