//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_target_description.g.dart';

/// MoveTargetDescription
///
/// Properties:
/// * [description] 
/// * [language] 
@BuiltValue()
abstract class MoveTargetDescription implements Built<MoveTargetDescription, MoveTargetDescriptionBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  MoveTargetDescription._();

  factory MoveTargetDescription([void updates(MoveTargetDescriptionBuilder b)]) = _$MoveTargetDescription;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveTargetDescriptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveTargetDescription> get serializer => _$MoveTargetDescriptionSerializer();
}

class _$MoveTargetDescriptionSerializer implements PrimitiveSerializer<MoveTargetDescription> {
  @override
  final Iterable<Type> types = const [MoveTargetDescription, _$MoveTargetDescription];

  @override
  final String wireName = r'MoveTargetDescription';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveTargetDescription object, {
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
    MoveTargetDescription object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveTargetDescriptionBuilder result,
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
  MoveTargetDescription deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveTargetDescriptionBuilder();
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

